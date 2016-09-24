# Java简单练习项目
---
本项目用于Java程序的练习，内含多个Java工程，会时常更新。
**本项目代码均有较强的实用性，详情请见各子目录的README.md文档**

## 1. easyJavaProgram
简单Java算法程序,包括以下内容：

1. squarepattern
给定整数n，以下列方式打印n行：
	```
	1*2*3*4
	9*10*11*12
	13*14*15*16
	5*6*7*8
	```

2. GenPattern
生成图案：
	```
	    *
	   * *
	  * * *
	 * * * *
	```

3. TestPrimeNumber
生成所有的素数

4. ArraySortQuantity
对输入的数组，按照数组中元素出现的次数进行排序，出现次数多的元素排在前面

## 2. dataStructure
数据结构的简单实现

1. lmlLinkedList
独立实现Java链表

2. binarytree
已初始化了一棵二叉树，在控制台输出此二叉树的深度

## 3.ThreadDemo
多线程演示

1. multiThread
简单多线程以及线程组的演示

2. deadlock
synchronized关键词以及线程死锁的演示。

## 4. IO
Java中简单的I/O操作

1. IOoperation.copyText()
简单的从输入流读取数据输出至输出流

2. test
简单的文件复制程序，命令行操作指令：

3. ConsoleInput
控制台输入一组单词或数字，使Java自动识别
```cmd
java test A B
```
*其中：A为源文件地址，B为目标地址
例：java test D:\lml.txt D:\lml2.txt
*

## 5. Database
简单MySQL数据库的操作，已实现“增”、“查”

## 6. DesignPattern
设计模式的简单实现
1. Observer
观察者模式的两种实现：
- ./mydemo: 自行实现
- ./nativeapply: 使用Java接口实现
- 