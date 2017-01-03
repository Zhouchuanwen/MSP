###api网关服务


###说明:
    本服务主要提供服务注册和发现的功能，方便api管理


###特点:
    1.能够自动发现服务,并且注册
    2.请求负载均衡，同一个api服务可以多机部署，请求平均分布
    3.服务路由(工具调用的api自动路由到相应的服务器)、容错(断路器模式)


###系统概览

**本系统主要由以下几个服务构成:**

    1.api网关服务
        基础服务

        其它业务划分如下，读者服务和书籍服务之间不存在相互依赖的关系，他们的数据库独立,尽量使用不同的数据库
    解决数据业务上的依赖方案如下:

        reader微服务采用mysql数据库，因为需要事务性的稍强,数据可靠性最为重要,所以打算使用mysql,读者的附属
    属性都使用mysql

        book微服务采用MongoDB数据库，因为主要数据是图书数据,所以体现在查询需求比较大的情况，并且数据关系性
    弱，所以个人觉得MongoDB在这里再适合不过.

    这里的数据依赖问题:
        (reader->borrow book) ==> (reader->add data{
                "stuId":"1305110090",
                "ISBN":"1238897223",
                "borrow_date":"2017-09-01",
                "return_date":"xxxx-xx-xx"
            }
        });

    打算把用户看过的书籍存在mysql中,

    可以看到,用户可以通过自己的stuId去查询自己看过的书籍,并且整个系统的主要业务都集中在了MongoDB上,这可以利
    用MongoDB查询上的优点,但是在MongoDB上的业务无法知道reader的信息，唯一关联的只有reader的stuId。
    如果要查询这本书籍有哪些人看过,最后只能拿到用户的stuId,然后需要去mysql中查询(这个属于recommendation服务):
        (book->select stuId) => (reader->stuId{
            readers:{
                reader:[
                    {
                        "stuId":"xxxxx",
                        "...":"...",
                        ...
                    },
                    {
                        "stuId":"xxxxx",
                        "...":"...",
                        ...
                    },
                    {
                        "stuId":"xxxxx",
                        "...":"...",
                        ...
                    }
                ]
            }
        });

    问题最后集中在了recommendation服务上面,如果book服务或者reader服务挂掉了,那么recommendation就不能使用了,
    也就是3个服务最差只能保证一个服务正常运行。

        reader                     book                    recommendation
        |                           |                        |
        |                           |          1.stuId       |
        |         2.reader          |----------------------->|
        |--------------------------------------------------->|





    2.读者微服务:
        mysql
    3.书籍微服务
        mongodb
    4.管理员微服务
        mysql





