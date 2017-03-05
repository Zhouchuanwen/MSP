package com.bean;

/**
 * Created by alan on 17/3/4.
 */
public enum Tag {

    WenXue_lilun(100,"文学理论"),
    WenXue_pinglun(101,"文学评论与鉴赏"),
    WenXue_lishi(102,"文学史"),
    WenXue_xinshang(103,"名家作品及欣赏"),
    WenXue_set(104,"作品集"),
    WenXue_Suibi(105,"散文随笔"),
    WenXue_yingshi(106,"影视文学"),
    WenXue_ciqu(107,"诗歌词曲"),
    WenXue_jishi(108,"纪实文学"),
    WenXue_xiju(109,"戏剧与曲艺"),
    WenXue_minjian(110,"民间文学"),
    WenXue_zazhi(111,"期刊杂志"),
    WenXue_daodu(112,"文学作品导读"),



    XiaoShuo_zhentan(200,"侦探、推理、悬疑小说"),
    XiaoShuo_mohuan(201,"魔幻/奇幻/玄幻小说"),
    XiaoShuo_kongbu(202,"恐怖/惊悚小说"),
    XiaoShuo_kehuan(203,"科幻小说"),
    XiaoShuo_aiqing(204,"爱情小说"),
    XiaoShuo_qingchun(205,"青春小说"),
    XiaoShuo_wuxia(206,"武侠小说"),
    XiaoShuo_lishi(207,"历史小说"),




    B(2,"b");

    private int code;
    private String name;

    Tag(int code,String name){
        this.code=code;
        this.name=name;
    }

}
