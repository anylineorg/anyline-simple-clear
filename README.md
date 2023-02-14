这个目录下的每个子目录都是一个独立的项目，可以用IDE等直接打开子目录运行


1.1.anyline-simple-clear-init  
继承spring-boot 添加了web项目中常用的依赖  
如果要明明白白的控制每个依赖就用这个
 
1.2.anyline-simple-clear-start  
与1.1一样、但因为1.1的依赖比较多看上去有点乱，所以继承了anyboot-start,并添加了数据库(mysql)相关依赖  
如果不想关心较低层的一些依赖就有这个  

2.x是在1.x基础上删除了web依赖,实现的在定时器中操作数据库

2.1.anyline-simple-clear-init-noweb  
2.2.anyline-simple-clear-start-noweb  


实际项目中需要的依赖会比较多，正常应该每个公司有几个基础pom  

当前项目只演示入门环境配置，更多语法参考其他模块[【anyline-simple】](https://gitee.com/anyline/anyline-simple)

