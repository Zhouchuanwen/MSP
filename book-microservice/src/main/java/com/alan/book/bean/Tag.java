package com.alan.book.bean;

/**
 * Created by alan on 17/3/4.
 */
public class Tag {


    public enum WENXUE{
        WENXUELILUN (0,"文学理论 "),
        WENXUEPINGLUNYUJIANSHANG (1," 文学评论与鉴赏 "),
        WENXUESHI (2," 文学史 "),
        MINGJIAZUOPINJIXINSHANG (3," 名家作品及欣赏 "),
        ZUOPINJI (4," 作品集 "),
        SANWENSUIBI (5," 散文随笔 "),
        YINGSHIWENXUE (6," 影视文学 "),
        SHIGECIQU (7," 诗歌词曲 "),
        JISHIWENXUE (8," 纪实文学 "),
        XIJUYUQUYI (9," 戏剧与曲艺 "),
        MINJIANWENXUE (10," 民间文学 "),
        QIKANZAZHI (11," 期刊杂志 "),
        WENXUEZUOPINDAODU(12," 文学作品导读");
        private int code;
        private String name;
        WENXUE(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum YUNCHANYUER{
        YUNCHANYUER (0,"孕产育儿 "),
        YUNCHANHULI (1," 孕产护理 "),
        YINGYOUERYANGYU (2," 婴幼儿养育 "),
        ZINVQIMING (3," 子女起名 "),
        ERTONGCHENGZHANGANQUAN (4," 儿童成长安全 "),
        YUNCHANFUSHIPU (5," 孕产妇食谱 "),
        YINGYOUERSHIPU (6," 婴幼儿食谱 ");
        private int code;
        private String name;
        YUNCHANYUER(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum XIAOSHUO{
        ZHENTAN(0,"侦探、推理、悬疑小说 "),
        MOHUAN(1," 魔幻/奇幻/玄幻小说 "),
        KONGBU(2," 恐怖/惊悚小说 "),
        KEHUANXIAOSHUO (3," 科幻小说 "),
        AIQINGXIAOSHUO (4," 爱情小说 "),
        QINGCHUNXIAOSHUO (5," 青春小说 "),
        WUXIAXIAOSHUO (6," 武侠小说 "),
        LISHIXIAOSHUO (7," 历史小说 "),
        GUANCHANGXIAOSHUO (8," 官场小说 "),
        ZHICHANGSHANGZHANXIAOSHUO (9," 职场商战小说 "),
        JUNSHIZHANZHENGXIAOSHUO (10," 军事战争小说 "),
        SHIJIEMINGZHUO (11," 世界名著 "),
        ZHONGGUOGUDIANXIAOSHUO (12," 中国古典小说 "),
        QITAXIANDANGDAIXIAOSHUO (13," 其他现当代小说 "),
        XIAOSHUOHEJI(14," 小说合集");
        private int code;
        private String name;
        XIAOSHUO(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum JIATINGJIAOYU{
        JIATINGJIAOYU (0,"家庭教育 "),
        JIAJIAOLILUN (1," 家教理论 "),
        JIAJIAOFANGANFANGFA (2," 家教方案方法 "),
        SUZHIJIAOYU (3," 素质教育 "),
        QINGCHUNQIJIAOYU (4," 青春期教育 "),
        JIAJIAOANLI (5," 家教案例 "),
        XUEQIANJIAOYU (6," 学前教育 "),
        ERTONGXINLI (7," 儿童心理 ");
        private int code;
        private String name;
        JIATINGJIAOYU(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum ZHUANJI{
        CAIJINGRENWU (0,"财经人物 "),
        LIDAIDIWANG (1," 历代帝王 "),
        LINGXIUSHOUNAO (2," 领袖首脑 "),
        JUNSHIRENWU (3," 军事人物 "),
        ZHENGZHIRENWU (4," 政治人物 "),
        ZONGJIAORENWU (5," 宗教人物 "),
        NVXINGRENWU (6," 女性人物 "),
        YULEMINGXING (7," 娱乐明星 "),
        TIYUMINGXING (8," 体育明星 "),
        KEXUEJIA (9," 科学家 "),
        YISHUJIA (10," 艺术家 "),
        WENXUEJIA (11," 文学家 "),
        XUEZHE (12," 学者 "),
        RENWUHEJI (13," 人物合集 "),
        JIAZU (14," 家族研究/谱系 "),
        GONGJUSHU(15," 参考工具书");
        private int code;
        private String name;
        ZHUANJI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum JIANSHENYUBAOJIAN{
        JIANSHENYUBAOJIAN (0,"健身与保健 "),
        YANGSHENG (1," 养生 "),
        CHANGJIANBINGYUFANGJIZHILIAO (2," 常见病预防及治疗 "),
        KOUQIANGHULI (3," 口腔护理 "),
        YANJINGHULI (4," 眼睛护理 "),
        SHANGBANZUBAOJIAN (5," 上班族保健 "),
        JIATINGBAOJIAN (6," 家庭保健 "),
        LIANGXINGJIANKANG (7," 两性健康 "),
        XINLIJIANKANG (8," 心理健康 "),
        JIJIUCHANGSHI (9," 急救常识 "),
        YUNDONGJIANSHEN (10," 运动健身 "),
        YUJIA (11," 瑜伽 ");
        private int code;
        private String name;
        JIANSHENYUBAOJIAN(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum LISHI{
        ZHONGGUOSHI (0,"中国史 "),
        SHIJIEZONGSHI (1," 世界总史 "),
        OUZHOUSHI (2," 欧洲史 "),
        MEIZHOUSHI (3," 美洲史 "),
        YAZHOUSHI (4," 亚洲史 "),
        FEIZHOUSHI (5," 非洲史 "),
        DAYANGZHOUSHI (6," 大洋洲史 "),
        DIFANGSHIZHI (7," 地方史志 "),
        WENHUASHI (8," 文化史 "),
        FENGSUXIGUAN (9," 风俗习惯 "),
        WENWUKAOGU (10," 文物考古 "),
        PUJIDUWU (11," 普及读物 "),
        SHIXUELILUN (12," 史学理论 "),
        JINGDIANZHUOZUO (13," 经典著作 ");
        private int code;
        private String name;
        LISHI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum JIAJUXIUXIAN{
        JIAJUXIUXIAN (0,"家居休闲 "),
        JIAJUZHUANGXIU (1," 家居装修 "),
        SHIPINYUZHUANGSHI (2," 饰品与装饰 "),
        SHOUNA (3," 收纳 "),
        JIATINGYUANYI (4," 家庭园艺 "),
        SHOUGONGDIY (5," 手工DIY "),
        SIJIACHE (6," 私家车 "),
        JIAJUFENGSHUI (7," 家居风水 "),
        SHOUCANG(8," 收藏、鉴赏 "),
        XIAOQIANYOUXI (9," 消遣游戏 "),
        CHONGWU (10," 宠物 "),
        WEIXIU (11," 家具家电选购维修 "),
        SHENGHUOZHINAN (12," 家居生活指南 "),
        WANNIANLI (13," 万年历 ");
        private int code;
        private String name;
        JIAJUXIUXIAN(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum GUOXUE{
        JINGBU (0,"经部 "),
        SHIBU (1," 史部 "),
        ZIBU (2," 子部 "),
        JIBU (3," 集部 "),
        GUOXUEMINGJIA (4," 国学名家 "),
        SIKUQUANSHU (5," 四库全书 "),
        GUOXUEPUJIDUWU (6," 国学普及读物 "),
        SHUMUCIDIAN (7," 书目辞典 "),
        GUJI(8," 古籍善本影印本 ");
        private int code;
        private String name;
        GUOXUE(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum LVYOUYUDITU{
        LVYOUSUIBI (0,"旅游随笔 "),
        GUONEIYOU (1," 国内游 "),
        GUOWAIYOU (2," 国外游 "),
        ZIZHUYOU (3," 自助游 "),
        HUWAITANXIAN (4," 户外探险 "),
        LVYOUSHEYING (5," 旅游摄影 "),
        LVYOUCHANGSHI (6," 旅游常识 "),
        LVYOUYUYAN (7," 旅游语言 "),
        LVYOU (8," 旅游理论与实务 "),
        DAOYOUBIBEI (9," 导游必备 "),
        MINGXINPIAN (10," 明信片 "),
        DITU (11," 地图 "),
        DIQIUYI (12," 地球仪 "),
        LVYOUQIKAN (13," 旅游期刊 ");
        private int code;
        private String name;
        LVYOUYUDITU(int code,String name){
            this.code=code;
            this.name=name;
        }
        }



    public enum SHEHUIKEXUE{
        SHEHUIXUE (0,"社会学 "),
        YUYANWENZI (1," 语言文字 "),
        WENHUA (2," 文化 "),
        JIAOYU (3," 教育 "),
        XINWEN(4," 新闻出版、图书馆、档案学 ");
        private int code;
        private String name;
        SHEHUIKEXUE(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum DONGMANYUHUIBEN{
        MANHUA (0,"漫画 "),
        HUIBEN (1," 绘本 "),
        LIANHUANHUA (2," 连环画 "),
        KATONGHUA (3," 卡通画 "),
        CHAHUA (4," 插画/插图本 "),
        MINGJIA (5," 名家名作 "),
        KATONG(6," 卡通漫画技法 "),
        WAIYU(7," 外语漫画绘本 ");
        private int code;
        private String name;
        DONGMANYUHUIBEN(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum ZHEXUEYUZONGJIAO{
        ZHZHEXUE (0,"中国哲学 "),
        DFZHEXUE (1," 东方哲学 "),
        XFZHEXUE (2," 西方哲学 "),
        ZHEXUELILUN(3," 哲学理论与流派 "),
        ZHEXUESHI (4," 哲学史 "),
        MAKESIZHEXUE (5," 马克思哲学 "),
        LUOJIXUE (6," 逻辑学 "),
        LUNLIXUE (7," 伦理学 "),
        MEIXUE (8," 美学 "),
        SIWEIKEXUE (9," 思维科学 "),
        ZONGJIAO (10," 宗教与术数 "),
        ZHEXUE (11," 哲学工具书 ");
        private int code;
        private String name;
        ZHEXUEYUZONGJIAO(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum PENGRENMEISHIYUJIU{
        YINSHIWENHUA (0,"饮食文化 "),
        GESHICAIPU (1," 各式菜谱 "),
        ZHUSHISHIPU (2," 主食食谱 "),
        HONGBEISHIPIN (3," 烘焙食品 "),
        FENGWEIXIAOCHI (4," 风味小吃 "),
        YANGSHENGYUMEIRONG (5," 养生与美容 "),
        YAOSHANSHILIAO (6," 药膳食疗 "),
        CHAJIUYINPIN (7," 茶酒饮品 "),
        ZHONGHUACAIXI (8," 中华菜系 "),
        CHUFANGMIJI (9," 厨房秘笈 "),
        TEDINGRENQUNSHIPU (10," 特定人群食谱 "),
        PINWEIXICAN (11," 品味西餐 "),
        RIHANLIAOLI (12," 日韩料理 "),
        SHIPUHEJI (13," 食谱合集 "),
        MEISHIDITU (14," 美食地图 "),
        CHUSHIZHUANYONG (15," 厨师专用 "),
        YINSHIZAZHI (16," 饮食杂志 ");
        private int code;
        private String name;
        PENGRENMEISHIYUJIU(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum FALV{
        LILUNFAXUE (0,"理论法学 "),
        FALVSHI (1," 法律史 "),
        XIANFA (2," 国家法、宪法 "),
        XINGZHENGFA (3," 行政法 "),
        MINFA (4," 民法 "),
        XINGFA (5," 刑法 "),
        SHANGFA (6," 商法 "),
        JINGJIFA (7," 经济法 "),
        SUSONGFA (8," 诉讼法 "),
        WANGLUOFA (9," 网络法 "),
        SIFAZHIDU (10," 司法制度 "),
        FALVFAGUI (11," 法律法规 "),
        WAIGUOFALVYUGANGAOTAIFALV (12," 外国法律与港澳台法律 "),
        SIFAANLI (13," 司法案例 "),
        SIFAJIESHI (14," 司法解释 "),
        FALVGONGJUSHU (15," 法律工具书 "),
        SIFAKAOSHI (16," 司法考试 "),
        FALVJIAOCAIYUFALVKAOSHI (17," 法律教材与法律考试 "),
        FALVWENSHUXIEZUO (18," 法律文书写作 "),
        FAXUEWENJI (19," 法学文集 ");
        private int code;
        private String name;
        FALV(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum HUNLIANYULIANGXING{
        LIANAI (0,"恋爱 "),
        HUNYIN (1," 婚姻 "),
        XINGZHISHI (2," 性知识 "),
        TONGXINGLIAN (3," 同性恋 ");
        private int code;
        private String name;
        HUNLIANYULIANGXING(int code,String name){
            this.code=code;
            this.name=name;
        }
        }



    public enum JISUANJI{
        JISUANJIKEXUELILUN (0,"计算机科学理论 "),
        JIATINGYUJISUANJI (1," 家庭与计算机 "),
        BANGONGYUJISUANJI (2," 办公与计算机 "),
        KAOSHIYURENZHENG (3," 考试与认证 "),
        TUXINGTUXIANG(4," 图形图像、动画、多媒体与网页开发 "),
        CAOZUOXITONG (5," 操作系统 "),
        CHENGXUYUYAN (6," 程序语言与软件开发 "),
        SHUJUKU (7," 数据库 "),
        RUANJIANGONGCHENG (8," 软件工程及软件方法学 "),
        WANGLUOYUTONGXUN (9," 网络与通讯 "),
        JISUANJIFUZHU (10," 计算机辅助 "),
        YINGJIAN (11," 硬件、嵌入式开发 "),
        ANQUANYUJIAMI (12," 安全与加密 "),
        ZHUANYONGRUANJIAN (13," 专用软件 "),
        XINXIXITONG (14," 信息系统 "),
        RENGONGZHINENG (15," 计算机控制仿真与人工智能 "),
        DIANZISHANGWU (16," 电子商务 "),
        ITCHANYEYUWENHUA (17," IT产业与文化 "),
        JISUANJIQIKANZAZHI (18," 计算机期刊杂志 "),
        JISUANJIYINGYINBAN (19," 计算机影印版 "),
        JIAOCAI (20," 教材 ");
        private int code;
        private String name;
        JISUANJI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum ZHENGZHI{
        ZHENGZHILILUN (0,"政治理论 "),
        GONGCHANDANG (1," 中国共产党 "),
        ZHONGGUOZHENGZHI (2," 中国政治 "),
        SHIJIEZHENGZHI (3," 世界政治 "),
        JUNSHI (4," 军事 "),
        WAIJIAO (5," 外交、国际关系 "),
        MAKESI (6," 马克思主义理论 "),
        JIAOCAI (7," 教材 "),
        DANGZHENGDUWU (8," 党政读物 ");
        private int code;
        private String name;
        ZHENGZHI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum YIXUE{
        JICHULILUN (0,"基础理论 "),
        YUFANGYIXUE (1," 预防医学、卫生学 "),
        ZHONGYIXUE (2," 中医学 "),
        JICHUYIXUE (3," 基础医学 "),
        LINCHUANGYIXUE (4," 临床医学 "),
        HULIXUE (5," 护理学 "),
        NEIKEXUE (6," 内科学 "),
        WAIKEXUE (7," 外科学 "),
        MAZUIXUE (8," 麻醉学 "),
        FUCHANKEXUE (9," 妇产科学 "),
        ERKEXUE (10," 儿科学 "),
        ZHONGLIUXUE (11," 肿瘤学 "),
        SHENJINGBING (12," 神经病和精神病学 "),
        PIFUBING (13," 皮肤病学与性病学 "),
        ERBIYANHOU (14," 耳鼻咽喉科学 "),
        YANKEXUE (15," 眼科学 "),
        KOUQIANG (16," 口腔科学 "),
        QUANKEYIXUE (17," 全科医学 "),
        MINZUYIXUE (18," 民族医学 "),
        TEZHONGYIXUE (19," 特种医学 ");
        private int code;
        private String name;
        YIXUE(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum XINLIXUE{
        ZHUOZUO (0,"心理学经典著作 "),
        LILUN (1," 心理学理论 "),
        YANJIUFANGFA (2," 心理学研究方法 "),
        XINLIZHUANGTAI (3," 心理过程与心理状态 "),
        ERTONGXINLIJIANKANG (4," 儿童心理健康 "),
        SHAONIANXINLIJIANKANG (5," 青少年心理健康 "),
        LAONIANXINLIJIANKANG (6," 老年心理健康 "),
        NVXINGXINLIXUE (7," 女性心理学 "),
        NANXINGXINLIXUE (8," 男性心理学 "),
        BIANTAI (9," 变态、病态心理学 "),
        SHENGLI (10," 生理心理学 "),
        RENGE (11," 人格心理学 "),
        YINGYONG (12," 应用心理学 "),
        FUDAO (13," 心理咨询与辅导 "),
        CESHI (14," 心理自助与测试 "),
        TONGSUDUWU (15," 心理学通俗读物 ");
        private int code;
        private String name;
        XINLIXUE(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum YISHUYUSHEYING{
        YISHULILUNYUPINGLUN (0,"艺术理论与评论 "),
        YISHUSHI (1," 艺术史 "),
        SHIJIEGEGUO (2," 世界各国艺术概况 "),
        SHOUCANG (3," 鉴赏收藏 "),
        HUIHUA (4," 绘画 "),
        SHUFA (5," 书法 "),
        ZHUANKE (6," 篆刻 "),
        SHEJI (7," 设计 "),
        YINGSHI (8," 影视 "),
        DONGHUA (9," 动画 "),
        XIJU (10," 戏剧 "),
        SHEYING (11," 摄影 "),
        DIAOSU (12," 雕塑 "),
        JIANZHU (13," 建筑 "),
        YINYUE (14," 音乐 "),
        WUDAO (15," 舞蹈 "),
        GONGYIMEISHU (16," 工艺美术 "),
        ZHUANJI (17," 传记 "),
        YISHUPINPAIMAI (18," 艺术品拍卖 "),
        GONGJUSHU (19," 艺术辞典与工具书 ");
        private int code;
        private String name;
        YISHUYUSHEYING(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum KEXUEYUZIRAN{
        KEPUDUWU (0,"科普读物 "),
        ZIRANKEXUEZONGLUN (1," 自然科学总论 "),
        XITONGXUE (2," 系统学 "),
        SHUXUE (3," 数学 "),
        LIXUE (4," 力学 "),
        WULIXUE (5," 物理学 "),
        HUAXUE (6," 化学 "),
        JINGTIXUE (7," 晶体学 "),
        TIANWENXUE(8," 天文学 地球科学 "),
        DILIXUE (9," 地理学 "),
        SHENGWUKEXUE (10," 生物科学 "),
        TONGJIXUE (11," 统计学 "),
        HANGTIAN (12," 航空与航天 "),
        HUANJINGKEXUE (13," 环境科学 "),
        ANQUANKEXUE (14," 安全科学 "),
        KEXUEYUKEXUEYANJIU (15," 科学与科学研究 "),
        SHIYAN (16," 实验、仪器与测量 "),
        CONGSHU (17," 丛书与文集 "),
        GONGJUSHU (18," 工具书 ");
        private int code;
        private String name;
        KEXUEYUZIRAN(int code,String name){
            this.code=code;
            this.name=name;
        }
    }


    public enum SHAOER{
        SHAOER (0,"少儿 "),
	    TWOSUI (1," 0-2岁 "),
	    SIXSUI (2," 3-6岁 "),
	    TENSUI (3," 7-10岁 "),
	    FOUTEENSUI (4," 11-14岁 "),
        YOUERQIMENG (5," 幼儿启蒙 "),
        ERTONGWENXUE (6," 儿童文学 "),
        MANHUA (7," 漫画绘本与图画书 "),
        KEPUBAIKE (8," 科普百科 "),
        SHAOERYINGYU (9," 少儿英语 "),
        GUOXUEQIMENG (10," 国学启蒙 "),
        YINYUEWUDAO (11," 音乐舞蹈 "),
        HUIHUASHUFA (12," 绘画书法 "),
        ERTONGSHOUGONG (13," 儿童手工 "),
        ZHILIYOUXI (14," 智力游戏 "),
        LIZHI (15," 励志与成长 "),
        CHANGSHI (16," 生活常识 "),
        LITISHU (17," 立体书 ");
        private int code;
        private String name;
        SHAOER(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum KEJI{
        SHEYINGJISHU (0,"摄影技术 "),
        JIANZHU (1," 建筑 "),
        DIANZIYUTONGXIN (2," 电子与通信 "),
        DIANGONGJISHU (3," 电工技术 "),
        QINGGONGYE (4," 轻工业、手工业 "),
        NONGYELINYE (5," 农业林业 "),
        HUAXUEGONGYE (6," 化学工业 "),
        YEJINGONGYE (7," 冶金工业 "),
        ZIDONGHUAJISHU (8," 自动化技术 "),
        JINSHUXUEYUJINSHUGONGYI (9," 金属学与金属工艺 "),
        JIXIE (10," 机械、仪表工业 "),
        SHIYOU (11," 石油、天然气工业 "),
        SHUILIGONGCHENG (12," 水利工程 "),
        KUANGYEGONGCHENG (13," 矿业工程 "),
        NENGYUANYUDONGLIGONGCHENG (14," 能源与动力工程 "),
        YUANZINENGJISHU (15," 原子能技术 "),
        WUQIGONGYE (16," 武器工业 "),
        QINGBAOXUEYUQINGBAOGONGZUO (17," 情报学与情报工作 "),
        QICHEYUJIAOTONGYUNSHU (18," 汽车与交通运输 "),
        GONGYEJINGJI (19," 工业经济 "),
        GONGYEJISHULILUN (20," 工业技术理论 "),
        CANKAOGONGJUSHU (21," 参考工具书 "),
        YIBANGONGYEJISHU (22," 一般工业技术 ");
        private int code;
        private String name;
        KEJI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum JIAOCAI{
        YANJIUSHENGJIAOCAI (0,"研究生教材 "),
        DAXUEJIAOCAI (1," 大学教材 "),
        CHENGRENJIAOYU (2," 成人教育 "),
        GAOZHIGAOZHUAN (3," 高职高专 "),
        ZHONGZHIZHONGZHUAN (4," 中职中专 "),
        JIAOSHIYONGSHU (5," 教师用书 "),
        SHEHUI (6," 社会/职业培训 "),
        JIAOCAI(7," 自学教程/教材");
        private int code;
        private String name;
        JIAOCAI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum TIYU{
        TIYULILUN (0,"体育理论 "),
        TIYUSHIYE (1," 体育事业 "),
        AOYUNBAIKE (2," 奥运百科 "),
        TIANJING (3," 田径运动 "),
        TICAO (4," 体操运动 "),
        QIULEI (5," 球类运动 "),
        JIXIAN (6," 极限运动 "),
        SHUISHANG (7," 水上运动 "),
        BINGSHANG (8," 冰上运动 "),
        XUESHANG (9," 雪上运动 "),
        SAICHE (10," 赛车运动 "),
        WUSHU (11," 武术及民族形式体育 "),
        QITA (12," 其他体育运动 "),
        WENTIHUODONG (13," 文体活动 "),
        TITANZHIXING (14," 体坛之星 ");
        private int code;
        private String name;
        TIYU(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum JIAOFU{
        XIAOXUE (0,"小学 "),
        CHUZHONG (1," 初中 "),
        GAOZHONG (2," 高中 "),
        ZHONGXIAOXUEZUOWENFUDAO (3," 中小学作文辅导 "),
        ZHONGXIAOXUEKEWAIDUWU (4," 中小学课外读物 "),
        ZHONGXIAOXUEGONGJUSHU (5," 中小学工具书 "),
        ZHONGXIAOXUEYINGYU(6," 中小学英语");
        private int code;
        private String name;
        JIAOFU(int code,String name){
            this.code=code;
            this.name=name;
        }
        }



    public enum QIKANZAZHI{
        QIKANHEDINGBEN (0,"期刊合订本 "),
        SHEHUIWANXIANG (1," 社会万象 "),
        JIANKANGTIYU (2," 健康体育 "),
        GUANLICAIJING (3," 管理财经 "),
        FUSHIMEIRONG (4," 服饰美容 "),
        SHISHANGSHENGHUO (5," 时尚生活 "),
        YISHUSHEYING (6," 艺术摄影 "),
        YINGSHIYULE (7," 影视娱乐 "),
        LVYOU (8," 旅游 "),
        QICHE (9," 汽车 "),
        YUER (10," 育儿 "),
        WENXUE (11," 文学 "),
        WENHUA (12," 文化 "),
        DIANNAOYUWANGLUO (13," 电脑与网络 "),
        FALV (14," 法律 "),
        ZHENGZHIJUNSHI (15," 政治军事 "),
        XINGYEZHUANYEKANWU (16," 行业专业刊物 "),
        YUYANYUJIAOXUE (17," 语言与教学 ");
        private int code;
        private String name;
        QIKANZAZHI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum KAOSHI{
        KAOYAN (0,"考研 "),
        GONGWUYUAN (1," 公务员考试 "),
        GONGZHILEI (2," 公职类考试 "),
        SHENGZHISHIYEDANWEIZHAOPIN (3," 省直事业单位招聘考试 "),
        ZHENGFAGANJINGZHAOLU (4," 政法干警招录 "),
        JIAOSHILEI (5," 教师类考试 "),
        WAIYUKAOSHICHUGUOLIUXUE (6," 外语考试出国留学考试 "),
        HANYULEI (8," 汉语类考试 "),
        GAOKAO (9," 高考 "),
        XIAOKAO (10," 小考 "),
        HUIKAO (11," 会考 "),
        ZHONGKAO (12," 中考 "),
        CAIJING (13," 财经与管理类考试 "),
        KUAIJIJISHU (14," 会计技术资格 "),
        KUAIJICONGYE (15," 会计从业资格 "),
        ZHENGQUANCONGYE (16," 证券从业资格 "),
        YINHANGCONGYE (17," 银行从业资格 "),
        JIANZAOGONGCHENGLEI (18," 建造工程类考试 "),
        JISUANJI (19," 计算机考试 "),
        YIYAOWEISHENGLEI (20," 医药卫生类考试 "),
        FALVLEI (21," 法律类考试 "),
        ZIXUE (22," 自学考试 "),
        CHENGRENGAOKAO (23," 成人高考 "),
        YISHULEI (24," 艺术类考试 "),
        JINGSAI (25," 竞赛 "),
        QITA(26," 其它考试");
        private int code;
        private String name;
        KAOSHI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum TAOZHUANGSHU{
        XIAOSHUO (0,"小说 "),
        WENXUE (1," 文学 "),
        YISHU (2," 艺术 "),
        JINGJIYUGUANLI (3," 经济与管理 "),
        SHAOER (4," 少儿 "),
        YUER (5," 育儿 "),
        JIATINGJIAOYU (6," 家庭教育 "),
        KAOSHI (7," 考试 "),
        ZHONGXIAOXUEJIAOFU (8," 中小学教辅 "),
        DAZHONGZHUAN (9," 大中专教材教辅 "),
        YINGYU (10," 英语与其他外语 "),
        DONGMANHUIBEN (11," 动漫与绘本 "),
        PENGRENYINSHI (12," 烹饪饮食与酒 "),
        YULE (13," 娱乐 "),
        SHISHANG (14," 时尚 "),
        LIZHI(15," 励志与成功 "),
        JIANSHEN (16," 健身与保健 "),
        ZHUANJI (17," 传记 "),
        LVYOUYUDITU (18," 旅游与地图 "),
        JIAJUXIUXIAN (19," 家居休闲 "),
        HULIANWANG (20," 计算机与互联网 ");
        private int code;
        private String name;
        TAOZHUANGSHU(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum WAIYU{
        INGSHUODUXIE (0,"英语听说读写 "),
        PINPAI (1," 特色/品牌英语 "),
        ZHIYE(2," 职业/行业英语 "),
        SHENGHUO (3," 生活/实用英语 "),
        DUWU (4," 英语读物 "),
        CIDIAN (5," 词典与工具书 "),
        DAXUEYINGYU (6," 大学英语 "),
        YINGYUKAOSHI (7," 英语考试 "),
        YANJIUSHENG (8,"	研究生英语 "),
        ZHONGZHIZHONGZHUAN (9," 中职中专英语 "),
        GAOZHIGAOZHUAN (10," 高职高专英语 "),
        CHENGRENGAODENG (11," 成人高等教育英语 "),
        ZHONGXUE (12," 中学英语 "),
        XIAOXUE (13," 小学英语 "),
        ERTONG (14," 儿童英语 "),
        RIYU (15," 日语 "),
        DEYU (16," 德语 "),
        FAYU (17," 法语 "),
        EYU (18," 俄语 "),
        HANYU (19," 韩语 "),
        TAIYU (20," 泰语 "),
        ALABOYU (21," 阿拉伯语 "),
        YIDALIYU (22," 意大利语 "),
        XIBANYAYU (23," 西班牙语 "),
        YUENANYU (24," 越南语 "),
        QITAXIAOYUZHONG (25," 其他小语种 "),
        WAIYUJIAOXUE (26," 外语教学 "),
        WAIGUORENXUEHANYU (27," 外国人学汉语 "),
        WAIYUQIKAN (28," 外语期刊 "),
        XINDONGFANG(29," 新东方英语学习软件");
        private int code;
        private String name;
        WAIYU(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum CIDIANYUGONGJUSHU{
        BAIKEQUANSHU (0,"百科全书 "),
        HANYUYUYAN (1," 汉语语言 "),
        WAIGUOYU (2," 外国语 "),
        JINGJIGUANLI (3," 经济管理 "),
        WENXUE (4," 文学 "),
        YISHUCIDIAN (5," 艺术辞典 "),
        ZHEXUEZONGJIAO (6," 哲学宗教 "),
        LISHIDILI (7," 历史地理 "),
        ZHENGZHIJUNSHI (8," 政治军事 "),
        KEXUEYUZIRAN (9," 科学与自然 "),
        WENHUASHEKEJIAOYU (10," 文化社科教育 "),
        YIXUE (11," 医学 "),
        GONGYEJISHU (12," 工业技术 "),
        JISUANJI (13," 计算机 "),
        HUANJINGYUANQUAN (14," 环境与安全 "),
        FALV (15," 法律 "),
        WENTIHUODONG (16," 文体活动 "),
        SHUMU (17," 目录、书目 "),
        WENZHAISUOYIN (18," 文摘索引 "),
        NIANKAN (19," 年鉴、年刊 "),
        NIANPU (20," 年谱、年表 "),
        MINGLU (21," 名录与黄白页 "),
        YANGBEN (22," 产品目录与样本 "),
        BIAOZHUN (23," 标准 "),
        WANNIANLI (24," 万年历 ");
        private int code;
        private String name;
        CIDIANYUGONGJUSHU(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum LIZHIYUCHENGGONG{
        LIZHIYUCHENGGONG (0,"励志与成功 "),
        XINLIXUE (1," 心理学 "),
        CHENGGONGXUE (2," 成功学 "),
        WEIRENCHUSHI (3," 为人处世 "),
        XINLINGDUWU (4," 心灵读物 "),
        GERENXIUYANG (5," 个人修养 "),
        GERENXINGXIANG (6," 个人形象 "),
        QIUZHIMIANSHI (7," 求职面试 "),
        XINGGEYUXIGUAN (8," 性格与习惯 "),
        SIWEIYUZHISHANG (9," 思维与智商 "),
        QINGSHANGYUQINGXU (10," 情商与情绪 "),
        CAISHANGYUCAIFUZHIHUI (11," 财商与财富智慧 "),
        RENJIYUSHEJIAO (12," 人际与社交 "),
        WENMINGLIYI (13," 文明礼仪 "),
        YANJIANGYUKOUCAI (14," 演讲与口才 "),
        RENZAIZHICHANG (15," 人在职场 "),
        CHUANGYEBIXIU (16," 创业必修 "),
        SHIJIANGUANLI (17," 时间管理 "),
        XIAOSHOUJIQIAO (18," 销售技巧 "),
        MINGYANGEYAN (19," 名言格言 "),
        LIZHIXIAOGUSHI (20," 励志小故事 "),
        NVXINGLIZHI (21," 女性励志 "),
        NANXINGLIZHI (22," 男性励志 "),
        QINGSHAONIANLIZHI(23," 青少年励志");
        private int code;
        private String name;
        LIZHIYUCHENGGONG(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum JINGJIGUANLI{
        JINGJIGUANLI (0,"经济管理 "),
        JINGJIXUELILUNYUDUWU (1," 经济学理论与读物 "),
        GUANLIXUE (2," 管理学 "),
        QIYEJINGYINGYUGUANLI (3," 企业经营与管理 "),
        TOUZILICAI (4," 投资理财 "),
        KUAIJISHENJI (5," 会计审计 "),
        XINGYEJINGJI (6," 行业经济 "),
        SHICHANGYINGXIAO (7," 市场营销 "),
        MAOYIJINGJI (8," 贸易经济 "),
        CAIZHENGSHUISHOU (9," 财政税收 "),
        JINRONGYINHANGYUHUOBI (10," 金融银行与货币 "),
        SHIJIEJIGEGUOJINGJIGAIKUANG (11," 世界及各国经济概况 "),
        SHANGWUSHIWU (12," 商务实务 "),
        TANPANXUE (13," 谈判学 "),
        TONGJIXUE (14," 统计学 "),
        LINGDAOXUE (15," 领导学 "),
        TONGSUDUWU (16," 通俗读物 "),
        GONGJUSHUYUCANKAOSHU (17," 工具书与参考书 "),
        YINGYINBAN (18," 影印版及英文版 ");
        private int code;
        private String name;
        JINGJIGUANLI(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum SHISHANG{
        FASHION (0,"时尚 "),
        MEIRONGHUAZHUANG (1," 美容化妆 "),
        MEIFA (2," 美发 "),
        MEIJIA (3," 美甲 "),
        MEITI (4," 美体、塑身 "),
        MEIRONG (5," 美容瘦身饮食 "),
        FUSHI (6," 服装服饰 "),
        SHECHIPIN (7," 品牌与奢侈品 "),
        XINGXIANG (8," 形象设计 "),
        SHISHANG (9," 时尚女人 "),
        NANREN (10," 男人时尚 "),
        XINGZUOXIEXING (11," 星座血型 "),
        SHISHANGSHENGHUO (12," 时尚生活 "),
        SHISHANGQIKAN (13," 时尚期刊 ");
        private int code;
        private String name;
        SHISHANG(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



    public enum YULE{
        YULE (0,"娱乐 "),
        MANHUAYINGSHI (1," 漫话影视 "),
        OUXIANG (2," 偶像、明星 "),
        XIAOQIANYOUXI (3," 消遣游戏 "),
        SHOUGONGDIY (4," 手工DIY "),
        FENGSHUIZHANBU (5," 风水占卜 "),
        XINGZUOXIEXING (6," 星座血型 "),
        QUWEICESHI (7," 趣味测试 "),
        YOUMOYUQUWEI (8," 幽默与趣味 ");
        private int code;
        private String name;
        YULE(int code,String name){
            this.code=code;
            this.name=name;
        }
    }



}
