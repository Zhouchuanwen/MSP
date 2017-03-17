p1: 集成mysql.mongodb遇到配置问题
    ---->使用springboot自己的解决

p2: 子模块之间相互依赖,其中的一个类在自己模块下注入正常,在依赖的模块中注入失败
    解决方法：
        ---->可能由于在依赖模块中扫描不到被依赖模块的注解导致无法注入
        ---->即使用了@ComponentScan()去扫描依赖的模块的包，注意正确的使用方法，以及enclude filter的使用区别
              在new SpringApplicationBuilder的时候可以通过getBean()方法来检测是否扫描成功.

p3: 彻底解决注入失败的问题:
        ----->在扫描到了包之后，注入还是失败，经过老司机一番查看，在自定义servlet-->AccessTokenEndpoint的时候用了@ComponentScan...
              而在注册servlet的时候是通过new的方式, 导致注入失败... 总结就是不能随意使用注解，在使用的时候就需要考虑在哪里调用！

            或者在servlet初始化的时候autowire
            public void init() throws ServletException {
                 super.init();
                 WebApplicationContextUtils
                         .getWebApplicationContext(getServletContext())
                         .getAutowireCapableBeanFactory().autowireBean(this);
            }










