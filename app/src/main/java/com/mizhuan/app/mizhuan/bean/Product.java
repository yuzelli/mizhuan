package com.mizhuan.app.mizhuan.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gaohailong on 2017/6/23.
 */

public class Product implements Serializable{

    /**
     * current_page : 1
     * data : [{"tradeItemEsc":"1kaxg5e","cid":683,"tradeItemId":613840101,"title":"两件50韩版潮牌BF学院风情侣装卡通印花宽松短袖T恤女夏上衣","shop_seller":"美美潮品","sale":24304,"promotionStartTime":1496246400,"promotionEndTime":1507392000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170425_8b2c9f3d9ii638gj3h4hal555ggaa_640x960.jpg","discountPrice":3500,"cutPrice":200,"commission_it":80,"commissionAmount_it":280000,"campaignStatus":0,"campaignSendNum":137,"campaignResourceMax":30000,"campaignId":700005833354,"campaignEsc":"1hv5msrpo","campaignStartTime":1496246400,"campaignEndTime":1509120000,"couponsurplus":29863,"saleprice":3300,"selectiontags":0},{"tradeItemEsc":"16qmbzc","cid":1160,"tradeItemId":203754488,"title":"【买一送五】 韩国爱丽小屋眉笔眉粉防水防汗不晕染一字眉带眉刷","shop_seller":"棉花糖美妆","sale":23798,"promotionStartTime":1496678400,"promotionEndTime":1499270400,"image":"http://s3.mogucdn.com/mlcdn/c45406/170516_5e70khj66e9193601ic60c7k9glhd_640x960.jpg","discountPrice":1900,"cutPrice":300,"commission_it":200,"commissionAmount_it":380000,"campaignStatus":0,"campaignSendNum":1232,"campaignResourceMax":10000,"campaignId":700005853383,"campaignEsc":"1hv5mtmme","campaignStartTime":1496678400,"campaignEndTime":1499270400,"couponsurplus":8768,"saleprice":1600,"selectiontags":0},{"tradeItemEsc":"1k7z0f8","cid":683,"tradeItemId":611357142,"title":"2017破洞牛仔短裤女夏高腰宽松阔腿裤韩版学生卷边显瘦牛仔裤","shop_seller":"雅诗家","sale":22728,"promotionStartTime":1495508520,"promotionEndTime":1508342400,"image":"http://s3.mogucdn.com/p2/170301/163407610_7g3jj59c5f58ecib63c4igi9fkcc7_640x960.jpg","discountPrice":2990,"cutPrice":200,"commission_it":140,"commissionAmount_it":418600,"campaignStatus":0,"campaignSendNum":543,"campaignResourceMax":300000,"campaignId":700005791999,"campaignEsc":"1hv5mqzw6","campaignStartTime":1495508532,"campaignEndTime":1511020800,"couponsurplus":299457,"saleprice":2790,"selectiontags":0},{"tradeItemEsc":"18f94ls","cid":1089,"tradeItemId":254674732,"title":"宇仔大刀肉辣条后儿时怀旧辣片零食品大礼包约38个麻辣味小吃","shop_seller":"宜城美食专营店","sale":14269,"promotionStartTime":1497242153,"promotionEndTime":1498147200,"image":"http://s3.mogucdn.com/p1/151124/1z86q4_ie3wkn3cg5sgcmbrguzdambqgayde_800x1200.jpg","discountPrice":849,"cutPrice":400,"commission_it":300,"commissionAmount_it":254700,"campaignStatus":0,"campaignSendNum":10881,"campaignResourceMax":20000,"campaignId":700006091960,"campaignEsc":"1hv5n3uso","campaignStartTime":1497542400,"campaignEndTime":1498147200,"couponsurplus":9119,"saleprice":449,"selectiontags":1},{"tradeItemEsc":"17nbe2y","cid":1089,"tradeItemId":231212905,"title":"屈臣氏热销过万！玛贝拉脱毛膏30g 温和无害轻松脱毛！","shop_seller":"菇娘美妆","sale":14071,"promotionStartTime":1496073600,"promotionEndTime":1509465600,"image":"http://s3.mogucdn.com/p1/160719/36434224_ifqwcojqgi4wgolehezdambqgyyde_640x960.jpg","discountPrice":1799,"cutPrice":500,"commission_it":350,"commissionAmount_it":629650,"campaignStatus":0,"campaignSendNum":1377,"campaignResourceMax":2000,"campaignId":700005828350,"campaignEsc":"1hv5msjzo","campaignStartTime":1496073600,"campaignEndTime":1509465600,"couponsurplus":623,"saleprice":1299,"selectiontags":1},{"tradeItemEsc":"1k7i58g","cid":1395,"tradeItemId":610963684,"title":"美背内衣女学生夏季薄款细无肩带文胸百搭吊带背心一片式无钢圈","shop_seller":"甜心内衣","sale":12565,"promotionStartTime":1488729600,"promotionEndTime":1501084800,"image":"http://s3.mogucdn.com/p2/170218/91793345_0jg1k1ig072gi28d5gb0a9h187914_640x960.jpg","discountPrice":3990,"cutPrice":500,"commission_it":150,"commissionAmount_it":598500,"campaignStatus":0,"campaignSendNum":95,"campaignResourceMax":1000,"campaignId":700005155667,"campaignEsc":"1hv5lzpwe","campaignStartTime":1488729600,"campaignEndTime":1501689600,"couponsurplus":905,"saleprice":3490,"selectiontags":0},{"tradeItemEsc":"18q7kra","cid":3856,"tradeItemId":263876431,"title":"【买2送一】跑男冰袖长款韩版冰丝防晒袖套夏季户外护臂防紫外线","shop_seller":"小小哒家居","sale":12301,"promotionStartTime":1493481600,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p2/170301/108758162_01916k7ai6clcehb1i6lcf8d43i5j_640x960.jpg","discountPrice":849,"cutPrice":100,"commission_it":300,"commissionAmount_it":254700,"campaignStatus":0,"campaignSendNum":977,"campaignResourceMax":300000,"campaignId":700005559031,"campaignEsc":"1hv5mh0di","campaignStartTime":1493481600,"campaignEndTime":1504108800,"couponsurplus":299023,"saleprice":749,"selectiontags":0},{"tradeItemEsc":"1kbn0eg","cid":683,"tradeItemId":614436424,"title":"2017夏季韩版小清新简约羽毛刺绣宽松学生纯棉短袖t恤女上衣","shop_seller":"小潘美衣","sale":12062,"promotionStartTime":1495123200,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170506_1aadc9f9b1c3b709794i1kh205edj_640x960.jpg","discountPrice":2590,"cutPrice":300,"commission_it":50,"commissionAmount_it":129500,"campaignStatus":0,"campaignSendNum":376,"campaignResourceMax":500,"campaignId":700005774195,"campaignEsc":"1hv5mq8f2","campaignStartTime":1495123200,"campaignEndTime":1498752000,"couponsurplus":124,"saleprice":2290,"selectiontags":0},{"tradeItemEsc":"18nqgfm","cid":757,"tradeItemId":261797437,"title":"【送双份礼物】袁姗姗明星同款厚底帆布鞋女夏透气学生板鞋小白鞋","shop_seller":"dzk0923","sale":10942,"promotionStartTime":1490544000,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p1/160318/1h49px_ie3wkzlfmeytmmjwg4zdambqgayde_640x960.jpg","discountPrice":5500,"cutPrice":1000,"commission_it":150,"commissionAmount_it":825000,"campaignStatus":0,"campaignSendNum":476,"campaignResourceMax":10000,"campaignId":700005411516,"campaignEsc":"1hv5maoq8","campaignStartTime":1490602955,"campaignEndTime":1498752000,"couponsurplus":9524,"saleprice":4500,"selectiontags":0},{"tradeItemEsc":"18hkmww","cid":1263,"tradeItemId":256622820,"title":"【买2送1】佰薇集 冬瓜荷叶茶 天然花草茶组合 150g包邮","shop_seller":"佰薇集旗舰店","sale":10909,"promotionStartTime":1490716800,"promotionEndTime":1498060800,"image":"http://s17.mogucdn.com/p1/160308/22ne6l_ifqwiy3dgjrdgyzsg4zdambqgyyde_640x960.jpg","discountPrice":2603,"cutPrice":300,"commission_it":300,"commissionAmount_it":780900,"campaignStatus":0,"campaignSendNum":180,"campaignResourceMax":30000,"campaignId":700005417122,"campaignEsc":"1hv5maxdo","campaignStartTime":1490716800,"campaignEndTime":1498060800,"couponsurplus":29820,"saleprice":2303,"selectiontags":0},{"tradeItemEsc":"1k26znk","cid":1160,"tradeItemId":606504420,"title":"第2件1元去黄牙去牙渍去烟渍牙美牙膏口腔护理清新洁白牙齿","shop_seller":"玉玲珑个护美妆店","sale":10737,"promotionStartTime":1496937601,"promotionEndTime":1504108805,"image":"http://s3.mogucdn.com/mlcdn/c45406/170516_6j9lig8fg2icg7gc0hi6fh19ja6e6_640x960.jpg","discountPrice":3900,"cutPrice":1200,"commission_it":310,"commissionAmount_it":1209000,"campaignStatus":0,"campaignSendNum":2226,"campaignResourceMax":99999,"campaignId":700005887568,"campaignEsc":"1hv5mv3dk","campaignStartTime":1496937720,"campaignEndTime":1504126804,"couponsurplus":97773,"saleprice":2700,"selectiontags":0},{"tradeItemEsc":"1k8u0we","cid":1089,"tradeItemId":612080619,"title":"静音卡通可爱迷你电风扇usb学生宿舍桌面水果小风扇4寸6寸","shop_seller":"浦京生活馆","sale":10285,"promotionStartTime":1497542400,"promotionEndTime":1498147200,"image":"http://s3.mogucdn.com/mlcdn/c45406/170322_3gj7h572hk8lh970k4ba80g43c55d_640x960.jpg","discountPrice":915,"cutPrice":300,"commission_it":300,"commissionAmount_it":274500,"campaignStatus":0,"campaignSendNum":16140,"campaignResourceMax":30000,"campaignId":700006129023,"campaignEsc":"1hv5n5fzq","campaignStartTime":1497542400,"campaignEndTime":1498147200,"couponsurplus":13860,"saleprice":615,"selectiontags":1},{"tradeItemEsc":"1k6tl02","cid":683,"tradeItemId":610390701,"title":"纯棉夏季百搭小吊带背心女士修身无袖打底衫内搭短款裹胸上衣露脐","shop_seller":"遇见初心","sale":10048,"promotionStartTime":1495701387,"promotionEndTime":1510475794,"image":"http://s11.mogucdn.com/p2/170109/69724022_39j30051dgk67f3762e2jh1hlbj49_640x960.jpg","discountPrice":1580,"cutPrice":300,"commission_it":100,"commissionAmount_it":158000,"campaignStatus":0,"campaignSendNum":158,"campaignResourceMax":300000,"campaignId":700005804891,"campaignEsc":"1hv5mrjse","campaignStartTime":1495701422,"campaignEndTime":1510475830,"couponsurplus":299842,"saleprice":1280,"selectiontags":0},{"tradeItemEsc":"1kccvv8","cid":1089,"tradeItemId":615040014,"title":"植护 婴儿原木抽纸30包整箱装 抽取式面巾纸卫生纸巾宝宝纸抽","shop_seller":"植护旗舰店","sale":9794,"promotionStartTime":1497542400,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170610_8cbgiga63a9gfb652d0bll3h1k709_640x960.jpg","discountPrice":5990,"cutPrice":3000,"commission_it":200,"commissionAmount_it":1198000,"campaignStatus":0,"campaignSendNum":18397,"campaignResourceMax":30000,"campaignId":700006123911,"campaignEsc":"1hv5n583q","campaignStartTime":1497542400,"campaignEndTime":1498752000,"couponsurplus":11603,"saleprice":2990,"selectiontags":1},{"tradeItemEsc":"1kcd1qu","cid":1417,"tradeItemId":615043823,"title":"可爱多婴儿木糖醇湿巾25片便携随身装清洁湿纸巾6包150抽","shop_seller":"展望母婴用品店","sale":9583,"promotionStartTime":1495641600,"promotionEndTime":1498320000,"image":"http://s11.mogucdn.com/mlcdn/c45406/170518_5g555lfeali41adla88hhi189bc27_800x1200.jpg","discountPrice":1990,"cutPrice":800,"commission_it":200,"commissionAmount_it":398000,"campaignStatus":0,"campaignSendNum":3455,"campaignResourceMax":10000,"campaignId":700005799335,"campaignEsc":"1hv5mrb7q","campaignStartTime":1495641600,"campaignEndTime":1498320000,"couponsurplus":6545,"saleprice":1190,"selectiontags":0},{"tradeItemEsc":"1k140r4","cid":822,"tradeItemId":605595340,"title":"2017新款男士哈伦裤韩版束脚裤运动裤修身小脚裤休闲裤九分裤","shop_seller":"不二潮品男装","sale":9275,"promotionStartTime":1495555200,"promotionEndTime":1503504000,"image":"http://s3.mogucdn.com/p2/160812/140035687_2eb006jiee89jdelgi4k84la8e361_640x960.jpg","discountPrice":5950,"cutPrice":1500,"commission_it":180,"commissionAmount_it":1071000,"campaignStatus":0,"campaignSendNum":128,"campaignResourceMax":100000,"campaignId":700005800397,"campaignEsc":"1hv5mrcuq","campaignStartTime":1495555200,"campaignEndTime":1503590400,"couponsurplus":99872,"saleprice":4450,"selectiontags":0},{"tradeItemEsc":"1juxwk6","cid":1597,"tradeItemId":600413807,"title":"韩国圆扣皮带女休闲复古学生针扣腰带百搭金属圆环装饰连衣裙裤带","shop_seller":"唯优尚品","sale":9259,"promotionStartTime":1497888000,"promotionEndTime":1498492800,"image":"http://s3.mogucdn.com/p1/160705/82264119_ie4dizlbgjswkmjzhezdambqgiyde_640x960.jpg","discountPrice":1560,"cutPrice":600,"commission_it":150,"commissionAmount_it":234000,"campaignStatus":0,"campaignSendNum":8,"campaignResourceMax":10000,"campaignId":700006296120,"campaignEsc":"1hv5ncluw","campaignStartTime":1497888000,"campaignEndTime":1498492800,"couponsurplus":9992,"saleprice":960,"selectiontags":0},{"tradeItemEsc":"18mzv9k","cid":1160,"tradeItemId":261177192,"title":"【带防伪送吸油纸】韩国RECIPE水晶防晒霜喷雾保湿娜扎同款","shop_seller":"棉花糖美妆","sale":8885,"promotionStartTime":1496678400,"promotionEndTime":1499270400,"image":"http://s3.mogucdn.com/mlcdn/c45406/170514_1b07318ifbka1383fkkk2al16j9jg_640x960.jpg","discountPrice":4500,"cutPrice":300,"commission_it":100,"commissionAmount_it":450000,"campaignStatus":0,"campaignSendNum":1232,"campaignResourceMax":10000,"campaignId":700005853383,"campaignEsc":"1hv5mtmme","campaignStartTime":1496678400,"campaignEndTime":1499270400,"couponsurplus":8768,"saleprice":4200,"selectiontags":0},{"tradeItemEsc":"18ke7vi","cid":1263,"tradeItemId":258992531,"title":"【买3送1】木瓜粉+葛根粉天然粉粉组合装 女人要大不可错过","shop_seller":"佰薇集旗舰店","sale":8771,"promotionStartTime":1490716800,"promotionEndTime":1498060800,"image":"http://s3.mogucdn.com/p1/160421/125383053_ifrtiobtguyggzjqhazdambqhayde_640x960.jpg","discountPrice":5537,"cutPrice":300,"commission_it":220,"commissionAmount_it":1218140,"campaignStatus":0,"campaignSendNum":180,"campaignResourceMax":30000,"campaignId":700005417122,"campaignEsc":"1hv5maxdo","campaignStartTime":1490716800,"campaignEndTime":1498060800,"couponsurplus":29820,"saleprice":5237,"selectiontags":0},{"tradeItemEsc":"1jyrc86","cid":1089,"tradeItemId":603619895,"title":"鹿晗唐嫣杨幂同款V字太阳眼镜修脸型方框彩膜墨镜","shop_seller":"style小主角的小店","sale":8450,"promotionStartTime":1497456000,"promotionEndTime":1500134400,"image":"http://s3.mogucdn.com/p1/160705/99710649_ifqtezjxgyzdemjzhezdambqgyyde_640x960.jpg","discountPrice":2660,"cutPrice":1200,"commission_it":300,"commissionAmount_it":798000,"campaignStatus":0,"campaignSendNum":1603,"campaignResourceMax":10000,"campaignId":700006139108,"campaignEsc":"1hv5n5vk0","campaignStartTime":1497456000,"campaignEndTime":1500134400,"couponsurplus":8397,"saleprice":1460,"selectiontags":1},{"tradeItemEsc":"1k8wbue","cid":1597,"tradeItemId":612134367,"title":"帽子女夏天韩版新款M字母复古弯檐帽鸭舌帽棒球帽男女度假遮阳帽","shop_seller":"邦妮咔门","sale":8394,"promotionStartTime":1497974400,"promotionEndTime":1506700800,"image":"http://s3.mogucdn.com/mlcdn/c45406/170322_0fcjc5541aaae81acgd4kc3df41d4_640x960.jpg","discountPrice":2989,"cutPrice":300,"commission_it":150,"commissionAmount_it":448350,"campaignStatus":0,"campaignSendNum":0,"campaignResourceMax":30000,"campaignId":700006305569,"campaignEsc":"1hv5nd0fu","campaignStartTime":1497974400,"campaignEndTime":1506700800,"couponsurplus":30000,"saleprice":2689,"selectiontags":0},{"tradeItemEsc":"1k5udzo","cid":1160,"tradeItemId":609569678,"title":"送喷瓶20片棉雪玲妃薏仁爽肤水化妆水补水保湿500ml薏仁水","shop_seller":"雪玲妃官方店旗舰店","sale":8202,"promotionStartTime":1495382400,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170606_38gfj510bjkb2875d36ih7k1hbc3d_640x960.jpg","discountPrice":2442,"cutPrice":1000,"commission_it":100,"commissionAmount_it":244200,"campaignStatus":0,"campaignSendNum":190,"campaignResourceMax":6000,"campaignId":700005795705,"campaignEsc":"1hv5mr5m2","campaignStartTime":1495382400,"campaignEndTime":1498752000,"couponsurplus":5810,"saleprice":1442,"selectiontags":0},{"tradeItemEsc":"1k99mwc","cid":1089,"tradeItemId":612444794,"title":"第2件1元去黑头撕拉面膜收缩毛孔鼻贴保湿补水深层清洁祛痘印","shop_seller":"玉玲珑个护美妆店","sale":8069,"promotionStartTime":1496937601,"promotionEndTime":1504108805,"image":"http://s3.mogucdn.com/mlcdn/c45406/170509_7g0h8kgj085c87620gc4a2ik4lgha_640x960.jpg","discountPrice":3900,"cutPrice":1200,"commission_it":310,"commissionAmount_it":1209000,"campaignStatus":0,"campaignSendNum":2226,"campaignResourceMax":99999,"campaignId":700005887568,"campaignEsc":"1hv5mv3dk","campaignStartTime":1496937720,"campaignEndTime":1504126804,"couponsurplus":97773,"saleprice":2700,"selectiontags":1},{"tradeItemEsc":"1ka70vk","cid":757,"tradeItemId":613223676,"title":"拖鞋女夏外穿平底防滑凉拖鞋夏季2017新款女鞋韩版学生一字拖","shop_seller":"宝儿女鞋店","sale":7854,"promotionStartTime":1497369600,"promotionEndTime":1498060800,"image":"http://s3.mogucdn.com/mlcdn/c45406/170526_858kfigjibb9jk7cjfd935deb2860_640x960.jpg","discountPrice":1988,"cutPrice":500,"commission_it":300,"commissionAmount_it":596400,"campaignStatus":0,"campaignSendNum":6,"campaignResourceMax":10000,"campaignId":700006123927,"campaignEsc":"1hv5n584m","campaignStartTime":1497369600,"campaignEndTime":1498060800,"couponsurplus":9994,"saleprice":1488,"selectiontags":0},{"tradeItemEsc":"1kcu3q6","cid":757,"tradeItemId":615441683,"title":"【偏小一码】网红款皮带扣凉拖鞋平底一字拖软底沙滩拖鞋女","shop_seller":"公主秀女鞋","sale":7769,"promotionStartTime":1496160000,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170526_23j1c57g6d593h6fdjh0e5j0a18hb_640x960.jpg","discountPrice":1920,"cutPrice":500,"commission_it":300,"commissionAmount_it":576000,"campaignStatus":0,"campaignSendNum":545,"campaignResourceMax":10000,"campaignId":700005826766,"campaignEsc":"1hv5mshjo","campaignStartTime":1496160000,"campaignEndTime":1500048000,"couponsurplus":9455,"saleprice":1420,"selectiontags":0},{"tradeItemEsc":"1k727qy","cid":683,"tradeItemId":610592065,"title":"夏季新款韩版百搭宽松短袖T恤女装复古刺绣大码打底衫休闲上衣女","shop_seller":"小鸽子家","sale":7472,"promotionStartTime":1489939200,"promotionEndTime":1500480000,"image":"http://s3.mogucdn.com/p2/170206/40715826_86j9f21bbkde7c35c1c780d7ja7hg_640x960.png","discountPrice":1990,"cutPrice":300,"commission_it":100,"commissionAmount_it":199000,"campaignStatus":0,"campaignSendNum":2074,"campaignResourceMax":5000,"campaignId":700005385568,"campaignEsc":"1hv5m9koo","campaignStartTime":1489939200,"campaignEndTime":1500566400,"couponsurplus":2926,"saleprice":1690,"selectiontags":0},{"tradeItemEsc":"18hks20","cid":1263,"tradeItemId":256626152,"title":"【买3送1】佰薇集木瓜粉 代餐粉 搭配葛根粉 更好 包邮","shop_seller":"佰薇集旗舰店","sale":7444,"promotionStartTime":1490716800,"promotionEndTime":1498060800,"image":"http://s3.mogucdn.com/p1/160501/125383053_ifrdczbqha2gcmruhazdambqmeyde_640x960.jpg","discountPrice":2692,"cutPrice":300,"commission_it":280,"commissionAmount_it":753760,"campaignStatus":0,"campaignSendNum":180,"campaignResourceMax":30000,"campaignId":700005417122,"campaignEsc":"1hv5maxdo","campaignStartTime":1490716800,"campaignEndTime":1498060800,"couponsurplus":29820,"saleprice":2392,"selectiontags":0},{"tradeItemEsc":"1k7hryo","cid":1160,"tradeItemId":610955084,"title":"欧丽源去狐臭净味水腋下止汗喷雾走珠香体露香体舒耐男女可用正品","shop_seller":"玉玲珑个护美妆店","sale":7430,"promotionStartTime":1496937601,"promotionEndTime":1504108805,"image":"http://s3.mogucdn.com/mlcdn/c45406/170620_4lklj2f34fd76c52illa036ba7dk6_640x960.jpg","discountPrice":3900,"cutPrice":1200,"commission_it":310,"commissionAmount_it":1209000,"campaignStatus":0,"campaignSendNum":2226,"campaignResourceMax":99999,"campaignId":700005887568,"campaignEsc":"1hv5mv3dk","campaignStartTime":1496937720,"campaignEndTime":1504126804,"couponsurplus":97773,"saleprice":2700,"selectiontags":0},{"tradeItemEsc":"1k9rx8o","cid":683,"tradeItemId":612871400,"title":"50元两件刺绣玫瑰花t恤女短袖韩版小清新夏季百搭圆领打底上衣","shop_seller":"I love女装","sale":7423,"promotionStartTime":1497456000,"promotionEndTime":1510675200,"image":"http://s3.mogucdn.com/mlcdn/c45406/170407_6cahh2l2kchd06a0l45aa157ced9g_640x960.jpg","discountPrice":2700,"cutPrice":500,"commission_it":300,"commissionAmount_it":810000,"campaignStatus":0,"campaignSendNum":318,"campaignResourceMax":10000,"campaignId":700006128053,"campaignEsc":"1hv5n5ehu","campaignStartTime":1497456000,"campaignEndTime":1510675200,"couponsurplus":9682,"saleprice":2200,"selectiontags":0},{"tradeItemEsc":"17v3lhm","cid":1089,"tradeItemId":237749545,"title":"热剧同款御泥坊小迷糊玻尿酸明星补水竹炭黑面膜21片保湿缩毛孔","shop_seller":"小迷糊官方旗舰店","sale":7328,"promotionStartTime":1497801600,"promotionEndTime":1498320000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170524_6gac105acbd18eig50b69ha7h3bi8_640x960.jpg","discountPrice":6237,"cutPrice":1300,"commission_it":300,"commissionAmount_it":1871100,"campaignStatus":0,"campaignSendNum":56,"campaignResourceMax":5000,"campaignId":700006294285,"campaignEsc":"1hv5ncj0y","campaignStartTime":1497801600,"campaignEndTime":1498320000,"couponsurplus":4944,"saleprice":4937,"selectiontags":1},{"tradeItemEsc":"1k9tfue","cid":683,"tradeItemId":612906783,"title":"50元两件韩版纯白色宽松bf风短袖t恤女学生大码体恤简约字母","shop_seller":"I love女装","sale":7176,"promotionStartTime":1497456000,"promotionEndTime":1510675200,"image":"http://s3.mogucdn.com/mlcdn/c45406/170408_8fcc5644d162f0kkifg6g21kikf76_640x960.jpg","discountPrice":2800,"cutPrice":500,"commission_it":300,"commissionAmount_it":840000,"campaignStatus":0,"campaignSendNum":318,"campaignResourceMax":10000,"campaignId":700006128053,"campaignEsc":"1hv5n5ehu","campaignStartTime":1497456000,"campaignEndTime":1510675200,"couponsurplus":9682,"saleprice":2300,"selectiontags":0},{"tradeItemEsc":"1jydsaa","cid":683,"tradeItemId":603303709,"title":"卡通字母可乐杯印花宽松短袖T恤女","shop_seller":"悠芙家","sale":7119,"promotionStartTime":1497888513,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p1/160630/104393135_ie4ggyjwg44gcnrxhezdambqgiyde_640x960.jpg","discountPrice":2450,"cutPrice":300,"commission_it":150,"commissionAmount_it":367500,"campaignStatus":0,"campaignSendNum":10,"campaignResourceMax":1000,"campaignId":700006299000,"campaignEsc":"1hv5ncqaw","campaignStartTime":1497888516,"campaignEndTime":1498752000,"couponsurplus":990,"saleprice":2150,"selectiontags":0},{"tradeItemEsc":"18jfgw2","cid":1395,"tradeItemId":258181893,"title":"正品聚拢加厚小胸女学生胸罩套装少女内衣无钢圈一片式无痕调整型","shop_seller":"甜心内衣","sale":6880,"promotionStartTime":1488729600,"promotionEndTime":1501084800,"image":"http://s3.mogucdn.com/p1/160715/91793345_ifrdayjwmnsdkntdhezdambqmeyde_640x960.jpg","discountPrice":4934,"cutPrice":500,"commission_it":150,"commissionAmount_it":740100,"campaignStatus":0,"campaignSendNum":95,"campaignResourceMax":1000,"campaignId":700005155667,"campaignEsc":"1hv5lzpwe","campaignStartTime":1488729600,"campaignEndTime":1501689600,"couponsurplus":905,"saleprice":4434,"selectiontags":0},{"tradeItemEsc":"18io3nc","cid":1263,"tradeItemId":257543456,"title":"【买2送1 】佰薇集柠檬荷叶茶 玫瑰荷叶柠檬片150g","shop_seller":"佰薇集旗舰店","sale":6791,"promotionStartTime":1490716800,"promotionEndTime":1498060800,"image":"http://s3.mogucdn.com/p1/160110/22ne6l_ie4tkmbxmrtgimbqgyzdambqgqyde_640x960.jpg","discountPrice":2640,"cutPrice":300,"commission_it":250,"commissionAmount_it":660000,"campaignStatus":0,"campaignSendNum":180,"campaignResourceMax":30000,"campaignId":700005417122,"campaignEsc":"1hv5maxdo","campaignStartTime":1490716800,"campaignEndTime":1498060800,"couponsurplus":29820,"saleprice":2340,"selectiontags":0},{"tradeItemEsc":"1k8xm5e","cid":683,"tradeItemId":612164373,"title":"2017夏季新款宽松条纹刺绣字母短袖T恤","shop_seller":"悠芙家","sale":6435,"promotionStartTime":1497888513,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170323_2217hib45j9fekhj53i74566i67cg_640x960.jpg","discountPrice":3003,"cutPrice":300,"commission_it":300,"commissionAmount_it":900900,"campaignStatus":0,"campaignSendNum":10,"campaignResourceMax":1000,"campaignId":700006299000,"campaignEsc":"1hv5ncqaw","campaignStartTime":1497888516,"campaignEndTime":1498752000,"couponsurplus":990,"saleprice":2703,"selectiontags":0},{"tradeItemEsc":"1k84ygg","cid":1597,"tradeItemId":611495836,"title":"【送镜盒布】墨镜女韩版明星同款百搭眼镜时尚圆脸瘦脸反光太阳镜","shop_seller":"旅行日记","sale":6309,"promotionStartTime":1495728000,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p2/170306/86812671_48a2gab33ikjd286ecf97g5lgkgg0_640x960.jpg","discountPrice":2520,"cutPrice":1000,"commission_it":300,"commissionAmount_it":756000,"campaignStatus":0,"campaignSendNum":152,"campaignResourceMax":10000,"campaignId":700005813419,"campaignEsc":"1hv5mrwy6","campaignStartTime":1495814400,"campaignEndTime":1501171200,"couponsurplus":9848,"saleprice":1520,"selectiontags":0},{"tradeItemEsc":"1k661mc","cid":1583,"tradeItemId":609841598,"title":"郑爽同款包包2017新款小方包女锁扣包复古链条包迷你相机小包","shop_seller":"包包大人潮流店","sale":6209,"promotionStartTime":1495814400,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p2/161231/61446285_29g5c4ka9lald7d96eajij30f7k11_640x960.jpg","discountPrice":5300,"cutPrice":1000,"commission_it":300,"commissionAmount_it":1590000,"campaignStatus":0,"campaignSendNum":210,"campaignResourceMax":1000,"campaignId":700005813381,"campaignEsc":"1hv5mrww2","campaignStartTime":1495814400,"campaignEndTime":1498752000,"couponsurplus":790,"saleprice":4300,"selectiontags":0},{"tradeItemEsc":"1k5maxm","cid":1160,"tradeItemId":609381073,"title":"洗面奶女补水保湿祛痘控油深层清洁卸妆水慕斯氨基酸洁面乳护肤品","shop_seller":"莱玫店","sale":5976,"promotionStartTime":1497801600,"promotionEndTime":1498752000,"image":"http://s17.mogucdn.com/mlcdn/c45406/170604_3i8jc803g9alb3eelk0j757g251kc_640x960.jpg","discountPrice":2990,"cutPrice":1000,"commission_it":200,"commissionAmount_it":598000,"campaignStatus":0,"campaignSendNum":1,"campaignResourceMax":5000,"campaignId":700006296251,"campaignEsc":"1hv5ncm26","campaignStartTime":1497801600,"campaignEndTime":1498752000,"couponsurplus":4999,"saleprice":1990,"selectiontags":0},{"tradeItemEsc":"16qr2ok","cid":1160,"tradeItemId":203865102,"title":"【送面膜勺】 自然乐园芦荟胶300ml 补水保湿面膜白皙祛痘","shop_seller":"棉花糖美妆","sale":5865,"promotionStartTime":1496678400,"promotionEndTime":1499270400,"image":"http://s11.mogucdn.com/mlcdn/c45406/170514_26a83155bf0e2kfddkgci934eb0f5_640x960.jpg","discountPrice":2300,"cutPrice":300,"commission_it":100,"commissionAmount_it":230000,"campaignStatus":0,"campaignSendNum":1232,"campaignResourceMax":10000,"campaignId":700005853383,"campaignEsc":"1hv5mtmme","campaignStartTime":1496678400,"campaignEndTime":1499270400,"couponsurplus":8768,"saleprice":2000,"selectiontags":0},{"tradeItemEsc":"1kchm5e","cid":1089,"tradeItemId":615150357,"title":"30选3件佰味葫芦麻辣味小米锅巴80gx3包休闲零食礼包包邮","shop_seller":"喜源味食品店","sale":5693,"promotionStartTime":1497542400,"promotionEndTime":1498060800,"image":"http://s3.mogucdn.com/mlcdn/c45406/170525_5gjjaajaikc119dd5elghelajkk32_640x960.jpg","discountPrice":1160,"cutPrice":700,"commission_it":300,"commissionAmount_it":348000,"campaignStatus":0,"campaignSendNum":10421,"campaignResourceMax":15000,"campaignId":700006127843,"campaignEsc":"1hv5n5e66","campaignStartTime":1497542400,"campaignEndTime":1498060800,"couponsurplus":4579,"saleprice":460,"selectiontags":1},{"tradeItemEsc":"1kbtppm","cid":1417,"tradeItemId":614592793,"title":"植护 优真婴儿湿巾纸80抽*2包 RO纯水木糖醇水刺无纺布","shop_seller":"植护母婴店","sale":5555,"promotionStartTime":1494950400,"promotionEndTime":1507478400,"image":"http://s11.mogucdn.com/mlcdn/c45406/170509_652bedbl9ceja34kgdf63ihbc2g1b_640x960.jpg","discountPrice":1490,"cutPrice":300,"commission_it":300,"commissionAmount_it":447000,"campaignStatus":0,"campaignSendNum":655,"campaignResourceMax":10000,"campaignId":700005645131,"campaignEsc":"1hv5mkp8u","campaignStartTime":1494950400,"campaignEndTime":1507564800,"couponsurplus":9345,"saleprice":1190,"selectiontags":0},{"tradeItemEsc":"1k90b3g","cid":683,"tradeItemId":612227194,"title":"2017韩版新款长袖上衣小清新白色雪纺衬衫女宽松喇叭袖防晒衫","shop_seller":"雅诗家","sale":5417,"promotionStartTime":1495508520,"promotionEndTime":1508342400,"image":"http://s3.mogucdn.com/mlcdn/c45406/170325_7kcl95kb7j4faja4jfce57kjgfd16_640x960.jpg","discountPrice":4900,"cutPrice":200,"commission_it":140,"commissionAmount_it":686000,"campaignStatus":0,"campaignSendNum":543,"campaignResourceMax":300000,"campaignId":700005791999,"campaignEsc":"1hv5mqzw6","campaignStartTime":1495508532,"campaignEndTime":1511020800,"couponsurplus":299457,"saleprice":4700,"selectiontags":0},{"tradeItemEsc":"18igl5g","cid":1263,"tradeItemId":257368174,"title":"【强强组合】佰薇集套餐冬瓜荷叶茶+三叶茶+大肚茶花草茶组合装","shop_seller":"佰薇集旗舰店","sale":5410,"promotionStartTime":1490716800,"promotionEndTime":1498060800,"image":"http://s3.mogucdn.com/p1/160308/22ne6l_ie3tqmjvmi4dgyzsg4zdambqgayde_640x960.jpg","discountPrice":7674,"cutPrice":300,"commission_it":220,"commissionAmount_it":1688280,"campaignStatus":0,"campaignSendNum":180,"campaignResourceMax":30000,"campaignId":700005417122,"campaignEsc":"1hv5maxdo","campaignStartTime":1490716800,"campaignEndTime":1498060800,"couponsurplus":29820,"saleprice":7374,"selectiontags":0},{"tradeItemEsc":"1jve6tc","cid":822,"tradeItemId":600793700,"title":"2017夏季新款日系印花短袖T恤韩版修身圆领半袖体恤潮流上衣","shop_seller":"不二潮品男装","sale":5400,"promotionStartTime":1495555200,"promotionEndTime":1503504000,"image":"http://s3.mogucdn.com/mlcdn/c45406/170511_3l0c176gk0k153hjh2e2l75lh55lg_640x960.jpg","discountPrice":4501,"cutPrice":1000,"commission_it":200,"commissionAmount_it":900200,"campaignStatus":0,"campaignSendNum":104,"campaignResourceMax":100000,"campaignId":700005800393,"campaignEsc":"1hv5mrcui","campaignStartTime":1495555200,"campaignEndTime":1503590400,"couponsurplus":99896,"saleprice":3501,"selectiontags":0},{"tradeItemEsc":"17t4chi","cid":822,"tradeItemId":236087423,"title":"简约学院风百搭款哈伦裤韩版纯色棉质日系男士小脚九分裤休闲裤男","shop_seller":"MR.DJ SHOP","sale":5339,"promotionStartTime":1493913600,"promotionEndTime":1504108800,"image":"http://s3.mogucdn.com/p1/160407/90614552_ifqwkolfhe4gin3dg4zdambqgyyde_640x960.jpg","discountPrice":5950,"cutPrice":500,"commission_it":50,"commissionAmount_it":297500,"campaignStatus":0,"campaignSendNum":35,"campaignResourceMax":300000,"campaignId":700005578393,"campaignEsc":"1hv5mhu96","campaignStartTime":1493913600,"campaignEndTime":1504108800,"couponsurplus":299965,"saleprice":5450,"selectiontags":0},{"tradeItemEsc":"1k7z4ic","cid":757,"tradeItemId":611359790,"title":"17春季新款韩版浅口单鞋绑带尖头鞋粗跟鞋时尚高跟鞋工作鞋","shop_seller":"米娅女鞋","sale":5261,"promotionStartTime":1495641600,"promotionEndTime":1511193600,"image":"http://s3.mogucdn.com/p2/170301/112043176_1kcf6lhac1cch6gfi9jl4211ae7hi_640x960.jpg","discountPrice":6930,"cutPrice":300,"commission_it":30,"commissionAmount_it":207900,"campaignStatus":0,"campaignSendNum":16,"campaignResourceMax":100000,"campaignId":700005804442,"campaignEsc":"1hv5mrj3g","campaignStartTime":1495641600,"campaignEndTime":1511193600,"couponsurplus":99984,"saleprice":6630,"selectiontags":0},{"tradeItemEsc":"18otyn0","cid":683,"tradeItemId":262719026,"title":"夏季新款宽松破洞牛仔裤女高腰九分裤韩版大码bf显瘦阔腿裤女潮","shop_seller":"请回答1992","sale":5107,"promotionStartTime":1492617600,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p1/160717/103332247_ifrgimzsga2dazldhezdambqmeyde_640x960.jpg","discountPrice":4900,"cutPrice":1000,"commission_it":110,"commissionAmount_it":539000,"campaignStatus":0,"campaignSendNum":771,"campaignResourceMax":300000,"campaignId":700005522861,"campaignEsc":"1hv5mfgk2","campaignStartTime":1492617600,"campaignEndTime":1498752000,"couponsurplus":299229,"saleprice":3900,"selectiontags":0},{"tradeItemEsc":"18xnauy","cid":1395,"tradeItemId":270121921,"title":"【买就送透明肩带】带胸垫防滑蕾丝抹胸 少女防走光裹胸围胸内衣","shop_seller":"燕丫头时尚屋","sale":5017,"promotionStartTime":1497456000,"promotionEndTime":1498752000,"image":"http://s3.mogucdn.com/p1/160423/104333707_ie4tsnlgmy4tkobrhazdambqgqyde_640x960.jpg","discountPrice":1190,"cutPrice":200,"commission_it":100,"commissionAmount_it":119000,"campaignStatus":0,"campaignSendNum":59,"campaignResourceMax":1000,"campaignId":700006131456,"campaignEsc":"1hv5n5jqw","campaignStartTime":1497456000,"campaignEndTime":1498752000,"couponsurplus":941,"saleprice":990,"selectiontags":0},{"tradeItemEsc":"1k93c6q","cid":683,"tradeItemId":612297885,"title":"实拍 新款时尚甜美系带五分袖衬衫上衣+民族风刺绣牛仔裙子套装","shop_seller":"朵奕女装","sale":4770,"promotionStartTime":1497715200,"promotionEndTime":1510934400,"image":"http://s3.mogucdn.com/mlcdn/c45406/170327_044hb4k631bef024687h8h68gj667_640x960.jpg","discountPrice":6860,"cutPrice":500,"commission_it":150,"commissionAmount_it":1029000,"campaignStatus":0,"campaignSendNum":202,"campaignResourceMax":100000,"campaignId":700006290629,"campaignEsc":"1hv5ncddu","campaignStartTime":1497715200,"campaignEndTime":1510934400,"couponsurplus":99798,"saleprice":6360,"selectiontags":0},{"tradeItemEsc":"17v24w2","cid":1395,"tradeItemId":237715461,"title":"三色堇夏季运动无钢圈内衣女聚拢舒适光面少女调整型薄款文胸","shop_seller":"三色堇内衣","sale":4760,"promotionStartTime":1491494400,"promotionEndTime":1504195200,"image":"http://s11.mogucdn.com/mlcdn/c45406/170406_73b73hfkh6g7e32ckbb5fkdech319_640x960.jpg","discountPrice":2590,"cutPrice":500,"commission_it":80,"commissionAmount_it":207200,"campaignStatus":0,"campaignSendNum":114,"campaignResourceMax":10000,"campaignId":700005450094,"campaignEsc":"1hv5mcc9g","campaignStartTime":1491494400,"campaignEndTime":1504195200,"couponsurplus":9886,"saleprice":2090,"selectiontags":0}]
     * from : 1
     * last_page : 7
     * next_page_url : http://115.159.0.152:8080/good/list?page=2
     * path : http://115.159.0.152:8080/good/list
     * per_page : 50
     * prev_page_url : null
     * to : 50
     * total : 333
     */

    private int current_page;
    private int from;
    private int last_page;
    private String next_page_url;
    private String path;
    private int per_page;
    private String prev_page_url;
    private int to;
    private int total;
    /**
     * tradeItemEsc : 1kaxg5e
     * cid : 683
     * tradeItemId : 613840101
     * title : 两件50韩版潮牌BF学院风情侣装卡通印花宽松短袖T恤女夏上衣
     * shop_seller : 美美潮品
     * sale : 24304
     * promotionStartTime : 1496246400
     * promotionEndTime : 1507392000
     * image : http://s3.mogucdn.com/mlcdn/c45406/170425_8b2c9f3d9ii638gj3h4hal555ggaa_640x960.jpg
     * discountPrice : 3500
     * cutPrice : 200
     * commission_it : 80
     * commissionAmount_it : 280000
     * campaignStatus : 0
     * campaignSendNum : 137
     * campaignResourceMax : 30000
     * campaignId : 700005833354
     * campaignEsc : 1hv5msrpo
     * campaignStartTime : 1496246400
     * campaignEndTime : 1509120000
     * couponsurplus : 29863
     * saleprice : 3300
     * selectiontags : 0
     */

    private List<DataBean> data;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public String getNext_page_url() {
        return next_page_url;
    }

    public void setNext_page_url(String next_page_url) {
        this.next_page_url = next_page_url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public String getPrev_page_url() {
        return prev_page_url;
    }

    public void setPrev_page_url(String prev_page_url) {
        this.prev_page_url = prev_page_url;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        private String tradeItemEsc;
        private int cid;
        private int tradeItemId;
        private String title;
        private String shop_seller;
        private int sale;
        private int promotionStartTime;
        private int promotionEndTime;
        private String image;
        private int discountPrice;
        private int cutPrice;
        private int commission_it;
        private int commissionAmount_it;
        private int campaignStatus;
        private int campaignSendNum;
        private int campaignResourceMax;
        private long campaignId;
        private String campaignEsc;
        private int campaignStartTime;
        private int campaignEndTime;
        private int couponsurplus;
        private int saleprice;
        private int selectiontags;

        public String getTradeItemEsc() {
            return tradeItemEsc;
        }

        public void setTradeItemEsc(String tradeItemEsc) {
            this.tradeItemEsc = tradeItemEsc;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public int getTradeItemId() {
            return tradeItemId;
        }

        public void setTradeItemId(int tradeItemId) {
            this.tradeItemId = tradeItemId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getShop_seller() {
            return shop_seller;
        }

        public void setShop_seller(String shop_seller) {
            this.shop_seller = shop_seller;
        }

        public int getSale() {
            return sale;
        }

        public void setSale(int sale) {
            this.sale = sale;
        }

        public int getPromotionStartTime() {
            return promotionStartTime;
        }

        public void setPromotionStartTime(int promotionStartTime) {
            this.promotionStartTime = promotionStartTime;
        }

        public int getPromotionEndTime() {
            return promotionEndTime;
        }

        public void setPromotionEndTime(int promotionEndTime) {
            this.promotionEndTime = promotionEndTime;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getDiscountPrice() {
            return discountPrice;
        }

        public void setDiscountPrice(int discountPrice) {
            this.discountPrice = discountPrice;
        }

        public int getCutPrice() {
            return cutPrice;
        }

        public void setCutPrice(int cutPrice) {
            this.cutPrice = cutPrice;
        }

        public int getCommission_it() {
            return commission_it;
        }

        public void setCommission_it(int commission_it) {
            this.commission_it = commission_it;
        }

        public int getCommissionAmount_it() {
            return commissionAmount_it;
        }

        public void setCommissionAmount_it(int commissionAmount_it) {
            this.commissionAmount_it = commissionAmount_it;
        }

        public int getCampaignStatus() {
            return campaignStatus;
        }

        public void setCampaignStatus(int campaignStatus) {
            this.campaignStatus = campaignStatus;
        }

        public int getCampaignSendNum() {
            return campaignSendNum;
        }

        public void setCampaignSendNum(int campaignSendNum) {
            this.campaignSendNum = campaignSendNum;
        }

        public int getCampaignResourceMax() {
            return campaignResourceMax;
        }

        public void setCampaignResourceMax(int campaignResourceMax) {
            this.campaignResourceMax = campaignResourceMax;
        }

        public long getCampaignId() {
            return campaignId;
        }

        public void setCampaignId(long campaignId) {
            this.campaignId = campaignId;
        }

        public String getCampaignEsc() {
            return campaignEsc;
        }

        public void setCampaignEsc(String campaignEsc) {
            this.campaignEsc = campaignEsc;
        }

        public int getCampaignStartTime() {
            return campaignStartTime;
        }

        public void setCampaignStartTime(int campaignStartTime) {
            this.campaignStartTime = campaignStartTime;
        }

        public int getCampaignEndTime() {
            return campaignEndTime;
        }

        public void setCampaignEndTime(int campaignEndTime) {
            this.campaignEndTime = campaignEndTime;
        }

        public int getCouponsurplus() {
            return couponsurplus;
        }

        public void setCouponsurplus(int couponsurplus) {
            this.couponsurplus = couponsurplus;
        }

        public int getSaleprice() {
            return saleprice;
        }

        public void setSaleprice(int saleprice) {
            this.saleprice = saleprice;
        }

        public int getSelectiontags() {
            return selectiontags;
        }

        public void setSelectiontags(int selectiontags) {
            this.selectiontags = selectiontags;
        }
    }
}
