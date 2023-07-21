# JNA-Android
Android 平台开发可直接使用的 JNA 依赖库。





### 1. JNA 简介

JNA = Java Native Access， 是基于 JNI 且为了降低 JNI 开发复杂性的一个 Java 框架。它可以直接通过 Java 代码直接调用 c/c++ 开发的动态库，不需要像 JNI 那样使用得定义原生链接层。因为并不是每个 Java 开发都精通这一部分，所以通过 JNA 可以大大降低调用原生  C 代码的复杂性。



开源地址：https://github.com/java-native-access/jna

文档地址：https://github.com/java-native-access/jna/blob/master/www/GettingStarted.md



相关的使用可以自行查阅相关资料，这里不再作过多介绍。



------



### 2. JNA-Android

JNA 官方开源库提供了 jar 包的使用方式，若直接使用在项目中调用原生代码会报 `libjnidispatch.so`  没有找到的错误，这个动态库针对不同的平台需要单独进行引入，同时还必须得保持与 JNA 版本一致。



所以对于 Android 平台开发，也需要引入适配不同指令集的 `libjnidispatch.so`， 为了避免在 Android  项目中引入 JNA  过于麻烦的问题，因此可以使用本库直接依赖进行开发。



------



### 3. Gradle 引入

- 添加仓库地址

  在项目根目录中的 `build.gradle` 或 `settings.gradle` 中添加如下仓库地址：

  ```groovy
  repositories {
      ...
      maven { url 'https://jitpack.io' }
  }
  ```

  

- 引入依赖

  在需要使用 JNA 的 Module 中添加如下依赖：

  ```groovy
  dependencies {
          implementation "com.github.Heart-Beats:JNA-Android:$Tag"
  }
  ```

  <center>Tag：<a href ="https://jitpack.io/#Heart-Beats/JNA-Android"><image src ="https://jitpack.io/v/Heart-Beats/JNA-Android.svg" alt="Release"/> </a></center>

