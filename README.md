[TOC]

Practice_HeadFirst-DesignPatterns

随书练习：Head First 设计模式

# 设计模式

## 策略模式

定义了算法簇，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

示例：鸭子、ImageLoader(DiskCache, MemoryCache, DoubleCache, IImageCache)

# 设计原则

1. 找出应用中可能需要的变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。
2. 针对接口编程，而不是针对实现编程。
3. 多用组合，少用继承。
