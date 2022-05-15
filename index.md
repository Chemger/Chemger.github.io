## CHEMGER STUDIO
You can use the [editor on GitHub](https://github.com/Chemger/Chemger.github.io/edit/master/index.md) to maintain and preview the content for your website in Markdown files.

Whenever you commit to this repository, GitHub Pages will run [Jekyll](https://jekyllrb.com/) to rebuild the pages in your site, from the content in your Markdown files.

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/Chemger/Chemger.github.io/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.

# 23种设计模式

## 1 概述

### 1.1 **设计模式的重要性**

1. 软件工程中，**设计模式**（design pattern）是对**软件设计中普遍存在（反复出现）**的各种问题，所提出的**解决方案**。这个术语是由埃里希·伽玛（Erich Gamma）等人在1990年代从建筑设计领域引入到计算机科学的
2. 大厦 VS 简易房的区别
3. 当一个项目开发完后，如果客户提出增新功能，怎么办?
4. 如果项目开发完后，原来程序员离职，你接手维护该项目怎么办? (维护性[可读性、 规范性])
5. 目前程序员门槛越来越高，一线IT公司(大厂)，都会问你在实际项目中使用过什么 设计模式，怎样使用的，解决了什么问题
6. 设计模式在软件中哪里？面向对象(oo)=>功能模块[设计模式+算法(数据结构)]=>框架[使用到多种设计模式]=>架构 [服务器集群]
7. 如果想成为合格软件**工程师**，那就花时间来研究下设计模式是非常必要的



### 1.2 设计模式的目的

编写软件过程中，程序员面临着来自 耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性 等多方面的挑战，设计模式是为了让**程序**(**软件**)，具有更好的：

1. 代码重用性

2. 可读性

3. 可扩展性

4. 可靠性

5. 使程序呈现**高内聚，低耦合**的特性



*设计模式包含了面向对象的精髓，“懂了设计模式，你就懂了面向对象分析和设计（OOA/D）的精要”*



## 2 设计模式七大原则

设计模式原则，其实就是程序员在编程时，应当遵守的原则，也是各种设计模

式的基础(即：**设计模式为什么这样设计的依据**)

**设计模式常用的七大原则有**:

1) 单一职责原则

2) 接口隔离原则

3) 依赖倒转(倒置)原则

4) 里氏替换原则

5) 开闭原则

6) 迪米特法则

**7)** **合成复用原则**



### 2.1 单一职责原则

#### 基本原则

对类来说的，即一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2。当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2

#### **单一职责原则注意事项和细节**

1) 降低类的复杂度，一个类只负责一项职责。

2) 提高类的可读性，可维护性

3) 降低变更引起的风险

4) 通常情况下，**我们应当遵守单一职责原则**，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则



### 2.2 接口隔离原则

(Interface Segregation Principle)

#### 基本介绍

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在**最小的接口**上

### 2.3 依赖倒转原则

#### 基本介绍

(Dependence Inversion Principle)

1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象
2. 抽象不应该依赖细节，细节应该依赖抽象
3. 依赖倒转(倒置)的中心思想是面向接口编程
4. 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类
5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成



### 2.4 里氏替换原则

#### OO中的继承性的思考和说明

1. 继承包含这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个继承体系造成破坏。
2. 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其他的类所继承，则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到子类的功能都有可能产生故障
3. 问题提出：在编程中，如何正确的使用继承? => **里氏替换原则**

#### 基本介绍

1. 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里的女士提出的。
2. 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，**所有引用基类的地方必须能透明地使用其子类的对象**。
3. 在使用继承时，遵循里氏替换原则，**在子类中尽量不要重写父类的方法**
4. 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖 来解决问题。

#### 解决办法

通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等关系代替



### 2.5 开闭原则

#### 基本介绍

1. 开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则
2. 一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用方)。用抽象构建框架，用实现扩展细节。
3. 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
4. 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。



### 2.6 迪米特法则

#### 基本介绍

1. 一个对象应该对其他对象保持最少的了解
2. 类与类关系越密切，耦合度越大
3. 迪米特法则(Demeter Principle)又叫**最少知道原则**，即一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public 方法，不对外泄露任何信息
4. 迪米特法则还有个更简单的定义：只与直接的朋友通信
5. **直接的朋友**：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现**成员变量，方法参数，方法返回值**中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部



### 2.7 合成复用原则

#### 基本介绍

原则是尽量使用**合成/聚合**的方式，而不是继承


