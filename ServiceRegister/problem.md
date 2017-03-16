p1:集成mysql.mongodb遇到配置问题
    ---->使用springboot自己的解决

p2:子模块之间相互依赖,其中的一个类在自己模块下注入正常,在依赖的模块中注入失败
    解决方法：
        ---->可能由于在依赖模块中扫描不到被依赖模块的注解导致无法注入
        ---->即使用了@ComponentScan()去扫描依赖的模块的包，注意正确的使用方法，以及enclude filter的使用区别
              在new SpringApplicationBuilder的时候可以通过getBean()方法来检测是否扫描成功.


p3:rest接口出现404和Whitelabel Error Page

    原因:扫描了book这个包...
    @ComponentScan(basePackages = {"com.alan.book"})




