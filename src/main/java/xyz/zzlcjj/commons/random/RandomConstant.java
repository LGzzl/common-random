package xyz.zzlcjj.commons.random;

import xyz.zzlcjj.commons.random.entity.Address;
import xyz.zzlcjj.commons.random.entity.Area;
import xyz.zzlcjj.commons.random.entity.City;
import xyz.zzlcjj.commons.random.entity.Province;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * 随机数据的常量
 *
 * @author zzl
 * @since 2023/7/29
 */
public class RandomConstant {

    /**
     * 随机数类
     */
    protected static final Random RANDOM = new Random();

    /**
     * 中国常见姓氏大全, 按照人口数量排序
     */
    protected static final String[] CHINESE_SURNAMES_CHARACTER = {"李", "王", "张", "刘", "陈", "杨", "赵", "黄", "周", "吴", "徐", "孙", "胡", "朱", "高", "林", "何", "郭", "马", "罗", "梁", "宋", "郑", "谢", "韩", "唐", "冯", "于", "董", "萧", "程", "曹", "袁", "邓", "许", "傅", "沈", "曾", "彭", "吕", "苏", "卢", "蒋", "蔡", "贾", "丁", "魏", "薛", "叶", "阎", "余", "潘", "杜", "戴", "夏", "钟", "汪", "田", "任", "姜", "范", "方", "石", "姚", "谭", "廖", "邹", "熊", "金", "陆", "郝", "孔", "白", "崔", "康", "毛", "邱", "秦", "江", "史", "顾", "侯", "邵", "孟", "龙", "万", "段", "雷", "钱", "汤", "尹", "黎", "易", "常", "武", "乔", "贺", "赖", "龚", "文", "庞", "樊", "兰", "殷", "施", "陶", "洪", "翟", "安", "颜", "倪", "严", "牛", "温", "芦", "季", "俞", "章", "鲁", "葛", "伍", "韦", "申", "尤", "毕", "聂", "丛", "焦", "向", "柳", "邢", "路", "岳", "齐", "沿", "梅", "莫", "庄", "辛", "管", "祝", "左", "涂", "谷", "祁", "时", "舒", "耿", "牟", "卜", "肖", "詹", "关", "苗", "凌", "费", "纪", "靳", "盛", "童", "欧", "甄", "项", "曲", "成", "游", "阳", "裴", "席", "卫", "查", "屈", "鲍", "位", "覃", "霍", "翁", "隋", "植", "甘", "景", "薄", "单", "包", "司", "柏", "宁", "柯", "阮", "桂", "闵欧阳", "解", "强", "柴", "华", "车", "冉", "房", "边", "净", "阴", "闫", "佘", "练", "骆", "付", "代", "麦", "容", "悲", "初", "瞿", "褚", "班", "全", "名", "井", "米", "谈", "宫", "虞", "奚", "佟", "符", "蒲", "穆", "漆", "卞", "东", "储", "党", "从", "艾", "苻", "厉", "岑", "燕", "吉", "冷", "仇", "伊", "首", "郁", "娄", "楚", "邝", "历", "狄", "简", "胥", "连", "帅", "封", "危", "支", "原", "滕", "苑", "信", "索", "栗", "官", "沙", "池", "藏", "师", "国", "巩", "刁", "茅", "杭", "巫", "居", "窦", "皮", "戈", "麻", "饶", "习", "巴", "旷", "宗", "荆", "荣", "孝", "蔺", "廉", "员", "西", "寇", "刃", "见", "底", "区", "郦", "卓", "琚", "续", "朴", "蒙", "敖", "花", "应", "喻", "冀", "尚", "顿", "菅", "嵇", "雒", "弓", "忻", "权", "谌", "卿", "扈", "海", "冼", "伦", "鹿", "宿", "山", "桑", "裘", "达", "么", "宣", "智", "尉迟", "东方", "幺", "郎", "农", "戚", "屠", "楼", "步", "鞠", "仲", "尉", "蓝", "招", "攀", "栾", "籍", "寿", "邬", "荚", "税", "逄", "加", "勾", "由", "福", "缑", "鲜于", "但", "邸", "逢", "况", "鄢", "古", "乐", "斯", "钮", "盖", "旦", "毅", "邰", "哈", "鄂", "商", "英", "迟", "仝", "亓", "玄", "黑", "腾", "晏", "禹", "诸", "苟", "湛", "殳", "亢", "奉", "占", "闻", "粟", "种", "匡", "宾", "申屠", "伏", "过", "水", "真", "宇", "巢", "计", "羌", "相", "辜", "展", "丑", "银", "丰", "矫", "上", "昝", "绳", "臧", "舍", "郅", "布", "糜", "乌", "衣", "来", "恒", "那", "满", "司徒", "司马", "皋", "旺", "公", "言", "藤", "释", "尧", "缪", "干", "阚", "靖", "渠", "契", "晋", "六", "束", "良", "鹗", "贝", "邴", "沃", "竺", "扬", "励", "上官", "荃", "焉", "多", "都", "果", "郜", "诸葛", "令狐", "慕", "礼", "祖", "翦", "力", "朗", "撖", "修", "呼", "富", "明", "站", "虢", "冶", "茹", "禚", "笪", "云", "肇", "平", "弋", "盘", "候", "尔", "姬", "宝", "畅", "冒", "邾", "延", "禅", "浦", "敬", "颉", "南", "巍", "补"};

    /**
     * 常见名字常量
     */
    protected static final String[] NAME_CHARACTER = {"退", "老", "送", "考", "者", "而", "倍", "耐", "倒", "怕", "耕", "倘", "耘", "倚", "倜", "思", "借", "怠", "怡", "急", "性", "倩", "倪", "耳", "耶", "耻", "值", "耿", "假", "恍", "偏", "恒", "恕", "偕", "聘", "做", "停", "恢", "健", "恩", "火", "恫", "恬", "恭", "灯", "息", "灰", "恰", "灶", "偶", "悄", "肄", "傅", "肉", "炉", "悉", "炊", "悌", "傍", "炎", "邑", "肖", "炙", "肚", "炜", "肝", "悟", "悠", "股", "邢", "那", "患", "肥", "悦", "邦", "肩", "肪", "催", "炭", "炮", "肯", "邯", "育", "炳", "邵", "炷", "炸", "肺", "郁", "胃", "烈", "背", "峻.准", "胖", "烙", "胞", "烟", "惟", "惠", "胡", "胤", "烦", "想", "惶", "烽", "脉", "意", "焕", "感", "焦", "焰", "焱", "然", "儿", "允", "元", "兄", "充", "兆", "先", "光", "酉", "酊", "克", "酌", "免", "配", "腑", "酒", "兔", "煜", "酣", "煤", "入", "煦", "全", "酩", "八", "公", "煮", "共", "兵", "其", "具", "典", "兹", "兼", "兽", "内", "冈", "冉", "再", "冒", "冕", "熙", "军", "冠", "冬", "冰", "冲", "决", "况", "冶", "冷", "冽", "净", "准", "采", "里", "凌", "重", "野", "量", "金", "凑", "几", "凡", "臣", "自", "凯", "凰", "至", "致", "凸", "凹", "出", "臼", "函", "刀", "切", "刊", "戊", "戌", "舌", "舍", "成", "刑", "我", "或", "列", "则", "刚", "初", "舟", "判", "利", "航", "别", "般", "到", "爱", "舵", "制", "舶", "户", "刷", "舷", "爷", "券", "刹", "爹", "船", "刺", "刻", "爽", "房", "所", "片", "仙.兄", "版", "扉", "手", "牌", "才", "前", "打", "托", "牙", "牛", "牟", "牡", "扣", "牧", "执", "物", "剪", "扬", "艮", "扮", "良", "副", "色", "牲", "艳", "扶", "特", "艾", "承", "技", "犀", "抑", "抒", "投", "抗", "芙", "力", "芝", "加", "务", "劣", "加.占", "报", "动", "助", "芩", "努", "劬", "劭", "抱", "花", "励", "劲", "芳", "劳", "状", "芸", "犹", "押", "芽", "势", "勃", "勇", "拈", "拉", "勉", "苑", "拒", "拓", "苓", "拔", "秋.穿", "苗", "勘", "拙", "招", "募", "勤", "若", "苦", "狩", "拭", "拯", "拱", "英", "拳", "苹", "勺", "勾", "勿", "拿", "匀", "持", "挂", "范", "茄", "包", "茅", "指", "挈", "按", "匍", "茎", "挑", "化", "北", "茗", "匙", "匝", "匠", "匡", "挥", "匮", "振", "匹", "挺", "区", "十", "升", "午", "卉", "捉", "半", "协", "捐", "卒", "卓", "荔", "捕", "单", "南", "博", "卞", "占", "卡", "换", "卦", "卧", "卯", "印", "即", "却", "卷", "捷", "荷", "卿", "玄", "莅", "玉", "莉", "王", "掌", "莎", "掏", "排", "莒", "厘", "掘", "厚", "厝", "莞", "原", "莠", "探", "接", "厦", "掩", "玫", "莫", "现", "玲", "玳", "获", "莹", "去", "玻", "参", "揆", "又", "及", "珊", "友", "双", "反", "珍", "珏", "描", "提", "发", "取", "受", "叙", "叛", "叟", "珠", "握", "口", "古", "句", "另", "珩", "只", "叫", "召", "班", "叮", "可", "台", "史", "右", "援", "号", "司", "吃", "各", "理", "合", "吉", "吊", "同", "名", "后", "吏", "向", "君", "琛", "吝", "吞", "吟", "琥", "琦", "琨", "琪", "含", "启", "琰", "琳", "吴", "琴", "吵", "琶", "吸", "吹", "吻", "琼", "吾", "呆", "呈", "告", "呗", "员", "呢", "周", "味", "命", "针", "钉", "和", "咏", "钏", "钓", "钜", "钠", "钧", "咨", "钮", "钰", "咱", "咸", "哀", "品", "铃", "铅", "哇", "哈", "哉", "瓜", "哥", "瓦", "哲", "瓶", "瓻", "唐", "甘", "甚", "甜", "生", "甩", "甫", "售", "支", "唯", "田", "由", "唱", "甲", "申", "电", "收", "男", "甸", "改", "町", "攻", "画", "放", "政", "故", "商", "效", "界", "畏", "敏", "救", "畔", "敖", "留", "教", "畜", "敢", "略", "敦", "番", "敬", "畲", "整", "长", "文", "疋", "喋", "斌", "斑", "斗", "料", "斟", "斤", "喧", "薪", "新", "方", "喻", "於", "施", "旁", "旃", "旅", "旋", "族", "痔", "嗣", "日", "旦", "旨", "门", "早", "闪", "旬", "旭", "闭", "问", "旱", "间", "闵", "旺", "昀", "昂", "昆", "昌", "明", "昏", "易", "昔", "阜", "星", "映", "阡", "春", "昨", "阪", "昭", "阮", "是", "昱", "防", "阻", "阿", "陀", "晃", "附", "晋", "虎", "晏", "晒", "虔", "晕", "晚", "虞", "晟", "晨", "虫", "普", "景", "拾.时", "晶", "癸", "虹", "智", "白", "百", "皂", "的", "暄", "皆", "皇", "皈", "蚊", "皋", "皎", "皓", "暖", "皮", "皿", "雀", "雁", "盅", "雅", "盆", "集", "盈", "益", "雌", "雍", "盒", "四", "回", "蛟", "盟", "因", "雪", "园", "目", "雯", "曲", "盲", "更", "直", "围", "囵", "雷", "相", "曹", "固", "曼", "国", "蛾", "替", "蜀", "省", "蜂", "圃", "圆", "月", "眈", "有", "眉", "圉", "朋", "看", "服", "朔", "朕", "朗", "朝", "土", "真", "眠", "圣", "木", "在", "眨", "未", "末", "本", "圭", "术", "地", "朱", "圳", "朴", "朵", "眷", "机", "眼", "坂", "杆", "均", "杉", "坊", "坎", "李", "杏", "坐", "材", "村", "青", "杖", "靖", "块", "坚", "杜", "杞", "非", "束", "坡", "条", "睡", "面", "坤", "来", "坦", "睦", "杨", "革", "坪", "杭", "杯", "杰", "杳", "杷", "坼", "杼", "松", "板", "极", "垂", "枇", "型", "册.加", "析", "枕", "林", "枚", "果", "枝", "枫", "枰", "架", "埃", "柄", "埋", "城", "柏", "某", "柑", "染", "柔", "埔", "柚", "矛", "埠", "知", "查", "韦", "矩", "柯", "柱", "石", "柳", "音", "柴", "培", "基", "砂", "堂", "栅", "堆", "栈", "砍", "研", "栗", "砚", "校", "堡", "堤", "砧", "株", "弋旦", "破", "堵", "根", "格", "栽", "血", "桂", "桃", "案", "行", "桌", "衍", "桐", "桑", "桓", "桔", "塔", "街", "塘", "衙", "塞", "桢", "衣", "补", "表", "页", "顶", "桶", "顷", "顿", "袁", "梁", "颁", "颂", "梃", "预", "梅", "殿汤", "互.分", "袍", "碑", "袖", "梗", "碗", "梧", "梨", "被", "梯", "械", "装", "棉", "风", "棒", "裔", "裕", "裙", "棚", "飞", "食", "裟", "棠", "士", "壮", "壶", "棺", "处", "椅", "复", "植", "夏", "椒", "夕", "外", "夙", "夜", "够", "大", "天", "太", "夫", "央", "椰", "夷", "夸", "示", "社", "椿", "奂", "奇", "奈", "祈", "奉", "祉", "奎", "奏", "奔", "奕", "祖", "套", "奚", "楚", "祜", "祝", "神", "祠", "奠", "楠", "楣", "祥", "奥", "票", "祭", "饭", "饮", "女", "奴", "奶", "楷", "奸", "楸", "她", "祺", "好", "西", "禀", "要", "如", "妃", "妆", "榆", "妇", "妊", "妓", "首", "香", "妞", "妮", "妲", "禹", "妻", "禾", "妾", "秀", "见", "私", "规", "觅", "始", "姐", "姑", "科", "角", "姒", "秒", "姓", "委", "姗", "秘", "姚", "姜", "姝", "租", "姣", "解", "秤", "秦", "秧", "姨", "秩", "姬", "姹", "姻", "移", "姿", "言", "威", "娃", "娄", "稔", "娘", "娜", "娟", "稠", "娩", "娱", "娶", "婆", "婉", "婚", "婧", "马", "驰", "穴", "究", "婷", "詹", "空", "婺", "突", "媒", "窕", "媚", "媛", "嫁", "围茵", "立", "高", "站", "竟", "竹", "竺", "笙", "次", "欣", "符", "第", "欲", "款", "椅推", "子", "筐", "孔", "字", "存", "孙", "孚", "孝", "孟", "筠", "止", "正", "季", "此", "步", "武", "孩", "筮", "孰", "筵", "宅", "宇", "守", "殊", "宋", "完", "宏", "宕", "殖", "宗", "官", "宙", "定", "宛", "宜", "计", "订", "客", "宣", "室", "宦", "讨", "宫", "讫", "训", "记", "宰", "害", "宴", "段", "宵", "宸", "容", "设", "宿", "访", "殿", "诀", "寄", "评", "寅", "密", "寇", "诊", "富", "母", "每", "诒", "寒", "寓", "比", "毕", "试", "诗", "毛", "话", "诠", "询", "诣", "该", "详", "诩", "毫", "寸", "寺", "封", "射", "将", "尉", "小", "氏", "少", "民", "气", "尖", "尚", "尤", "谦", "就", "水", "谷", "永", "尹", "尺", "尼", "尾", "汀", "局", "求", "居", "豆", "汇", "屈", "屉", "届", "屋", "豌", "屏", "汐", "汕", "展", "汛", "汜", "汝", "江", "池", "屠", "汤", "汪", "农.贮", "屯", "汰", "山", "鱼", "汾", "沁", "岁", "沃", "沅", "沈", "粉", "岐", "沐", "岑", "沓", "岗", "沙", "岚", "沛", "刁二", "岩", "岫", "岭", "岱", "沱", "粲", "岳", "河", "岸", "油", "治", "沿", "泉", "泌", "泓", "法", "峙", "泛", "泡", "峡", "峥", "注", "峨", "峪", "峰", "泳", "系", "崃", "崇", "洋", "崎", "崔", "洛", "份米", "贝", "贞", "洞", "负", "素", "贡", "索", "财", "津", "崧", "货", "贩", "洪", "紫", "贯", "洲", "贴", "贵", "贷", "贸", "洹", "费", "贺", "活", "贻", "洽", "派", "贾", "流", "资", "嵋", "测", "浏", "浑", "浙", "浣", "赤", "赦", "浩", "嵩", "浪", "赴", "浴", "起", "海", "讼.责", "嶂", "涂", "消", "越", "涌", "涣", "涯", "液", "足", "涵", "趾", "彭徨", "淘", "川", "州", "淞", "巡", "淡", "巢", "工", "左", "淦", "巧", "巨", "巫", "差", "淮", "路", "己", "巳", "巴", "巷", "混", "添", "淼", "巾", "一", "丁", "市", "七", "布", "安.屹", "帅", "帆", "丈", "师", "三", "上", "渊", "下", "希", "不", "帏", "帐", "丑", "专", "且", "丕", "世", "帖", "丘", "丙", "业", "渚", "帛", "东", "帜", "帝", "渝", "丞", "鸟", "渡", "两", "渥", "带", "帧", "个", "中", "席", "渭", "帮", "港", "丰", "帷", "丸", "常", "游", "丹", "为", "渺", "主", "帽", "乃", "幄", "久", "幅", "义", "之", "湍", "乎", "乏", "幕", "湖", "乘", "湘", "乙", "九", "乞", "也", "习", "书", "买", "干", "平", "乳", "年", "并", "幸", "幻", "幼", "幽", "乾", "庄", "了", "庇", "争", "床", "事", "于", "序", "云", "库", "五", "应", "井", "底", "店", "庚", "亚", "些", "府", "亟", "纠", "亢", "红", "纣", "交", "亥", "亦", "度", "约", "麦", "级", "座", "亩", "纪", "身", "享", "京", "亭", "庭", "亮", "纯", "纱", "纳", "庶", "康", "纸", "庸", "纹", "人", "纺", "麻", "纽", "纾", "什", "仁", "组", "黄", "绅", "仅", "仆", "细", "仇", "终", "今", "廊", "介", "仍", "绍", "从", "经", "黑", "仓", "仔", "仕", "他", "仗", "付", "给", "仞", "绢", "代", "绣", "令", "以", "们", "仰", "件", "价", "廷", "建", "任", "开", "企", "异", "弄", "伉", "伊", "伍", "伎", "鼎", "伏", "式", "伐", "休", "弓", "鼓", "引", "弗", "弘", "弟", "伟", "张", "传", "弦", "伦", "伯", "估", "伴", "伶", "伸", "伺", "强", "弼", "伽", "佃", "位", "低", "住", "佐", "体", "当", "何", "佘", "余", "佛", "作", "佟", "你", "形", "彤", "车", "彦", "轨", "佩", "轩", "彩", "彪", "佬", "彬", "佯", "佰", "佳", "轶", "轸", "役", "佻", "彼", "轼", "载", "使", "往", "征", "侃", "侄", "径", "待", "徇", "侈", "羊", "例", "律", "侍", "美", "侏", "徐", "侑", "徒", "输", "徕", "侗", "得", "供", "辜", "依", "羞", "侠", "侣", "群", "侦", "侯", "辰", "侵", "便", "翁", "心", "促", "俄", "必", "迅", "俊", "翌", "忍", "翎", "迎", "俏", "俐", "近", "返", "志", "俗", "忘", "忙", "忝", "保", "俞", "俟", "忠", "信", "迢", "迦", "俩", "迪", "快", "迫", "修", "俯", "俱", "念", "俸", "迹", "忽"};

    /**
     * 英文名常见姓氏大全
     */
    protected static final String[] ENGLISH_SURNAMES_WORDS = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West", "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "Mcdonald", "Cruz", "Marshall", "Ortiz", "Gomez", "Murray", "Freeman", "Wells", "Webb", "Simpson", "Stevens", "Tucker", "Porter", "Hunter", "Hicks", "Crawford", "Henry", "Boyd", "Mason", "Morales", "Kennedy", "Warren", "Dixon", "Ramos", "Reyes", "Burns", "Gordon", "Shaw", "Holmes", "Rice", "Robertson", "Hunt", "Black", "Daniels", "Palmer", "Mills", "Nichols", "Grant", "Knight", "Ferguson", "Rose", "Stone", "Hawkins", "Dunn", "Perkins", "Hudson", "Spencer", "Gardner", "Stephens", "Payne", "Pierce", "Berry", "Matthews", "Arnold", "Wagner", "Willis", "Ray", "Watkins", "Olson", "Carroll", "Duncan", "Snyder", "Hart", "Cunningham", "Bradley", "Lane", "Andrews", "Ruiz", "Harper", "Fox", "Riley", "Armstrong", "Carpenter", "Weaver", "Greene", "Lawrence", "Elliott", "Chavez", "Sims", "Austin", "Peters", "Kelley", "Franklin", "Lawson", "Fields", "Gutierrez", "Ryan", "Schmidt", "Carr", "Vasquez", "Castillo", "Wheeler", "Chapman", "Oliver", "Montgomery", "Richards", "Williamson", "Johnston", "Banks", "Meyer", "Bishop", "Mccoy", "Howell", "Alvarez", "Morrison", "Hansen", "Fernandez", "Garza", "Harvey", "Little", "Burton", "Stanley", "Nguyen", "George", "Jacobs", "Reid", "Kim", "Fuller", "Lynch", "Dean", "Gilbert", "Garrett", "Romero", "Welch", "Larson", "Frazier", "Burke", "Hanson", "Day", "Mendoza", "Moreno", "Bowman", "Medina", "Fowler", "Brewer", "Hoffman", "Carlson", "Silva", "Pearson", "Holland", "Douglas", "Fleming", "Jensen", "Vargas", "Byrd", "Davidson", "Hopkins", "May", "Terry", "Herrera", "Wade", "Soto", "Walters", "Curtis", "Neal", "Caldwell", "Lowe", "Jennings", "Barnett", "Graves", "Jimenez", "Horton", "Shelton", "Barrett", "Obrien", "Castro", "Sutton", "Gregory", "Mckinney", "Lucas", "Miles", "Craig", "Rodriquez", "Chambers", "Holt", "Lambert", "Fletcher", "Watts", "Bates", "Hale", "Rhodes", "Pena", "Beck", "Newman", "Haynes", "Mcdaniel", "Mendez", "Bush", "Vaughn", "Parks", "Dawson", "Santiago", "Norris", "Hardy", "Love", "Steele", "Curry", "Powers", "Schultz", "Barker", "Guzman", "Page", "Munoz", "Ball", "Keller", "Chandler", "Weber", "Leonard", "Walsh", "Lyons", "Ramsey", "Wolfe", "Schneider", "Mullins", "Benson", "Sharp", "Bowen", "Daniel", "Barber", "Cummings", "Hines", "Baldwin", "Griffith", "Valdez", "Hubbard", "Salazar", "Reeves", "Warner", "Stevenson", "Burgess", "Santos", "Tate", "Cross", "Garner", "Mann", "Mack", "Moss", "Thornton", "Dennis", "Mcgee", "Farmer", "Delgado", "Aguilar", "Vega", "Glover", "Manning", "Cohen", "Harmon", "Rodgers", "Robbins", "Newton", "Todd", "Blair", "Higgins", "Reese", "Cannon", "Strickland", "Townsend", "Potter", "Goodwin", "Walton", "Rowe", "Hampton", "Ortega", "Patton", "Swanson", "Joseph", "Francis", "Goodman", "Maldonado", "Yates", "Becker", "Erickson", "Hodges", "Rios", "Conner", "Adkins", "Webster", "Norman", "Malone", "Hammond", "Flowers", "Cobb", "Moody", "Quinn", "Blake", "Pope", "Lynn", "Briggs", "Charles", "Boone", "Banks", "Whitley", "Carson", "Sawyer", "Morse", "Leon", "Bauer", "Norton", "Pope", "Flynn", "Hogan", "Robles", "Salinas", "Yates", "Lindsay", "Lloyd", "Shelton", "Bentley", "Peck", "Key", "Salas", "Rollins", "Gamble", "Dickson", "Battle", "Santana", "Cabrera", "Cervantes", "Howe", "Hinton", "Hurley", "Spence", "Zamora", "Yang", "Mcneil", "Suarez", "Case", "Petty", "Gould", "Mcfarland", "Sampson", "Carver", "Bray", "Rosario", "Macdonald", "Stout", "Hester", "Melendez", "Dillon", "Farley", "Hopper", "Galloway", "Potts", "Bernard", "Joyner", "Stein", "Aguirre", "Osborne", "Mercer", "Bender", "Franco", "Rowland", "Sykes", "Benjamin", "Travis", "Pickett", "Crane", "Sears", "Mayo", "Dunlap", "Hayden", "Wilder", "Mckay", "Coffey", "Mccarty", "Ewing", "Cooley", "Vaughan", "Bonner", "Cotton", "Holder", "Stark", "Ferrell", "Cantrell", "Fulton", "Lynn", "Lott", "Calderon", "Rosa", "Pollard", "Hooper", "Burch", "Mullen"};

    /**
     * 英文名常见名字大全
     */
    protected static final String[] ENGLISH_NAME_WORDS = {"Marcelino", "Rafael", "Jacques", "Lynn", "Austin", "Kirk", "Michael", "Charlie", "Bryan", "Dooley", "Shelton", "Marty", "Daniel", "Julius", "Chester", "Malik", "Kevin", "Bill", "Ira", "Andreas", "Trevor", "Efrain", "Al", "Elmer", "Paul", "Glen", "Emery", "Jordan", "Doug", "Harris", "Gerard", "Orlando", "Freeman", "Leland", "Fernando", "Tim", "Jerome", "Earnest", "Maximiliano", "Eli", "Rex", "Brad", "Miguel", "Cameron", "Laurence", "Perry", "Jody", "Vito", "Benny", "Benjamin", "Dean", "Keith", "Ed", "Dewey", "Michale", "Gregory", "Edward", "Guillermo", "Danial", "Larry", "Jimmie", "Merle", "Gary", "Micah", "Brett", "Kent", "Luke", "Alfonso", "Brandon", "Sergio", "Joel", "Myron", "Ryan", "Casey", "Lowell", "Maurice", "Gavin", "Wilford", "Joey", "Rufus", "Darrick", "Jacob", "Raul", "John", "Hubert", "Julio", "Alonzo", "Emmett", "George", "Kelvin", "Sammy", "Floyd", "Johnnie", "Pablo", "Nelson", "Forrest", "Gus", "Guy", "Spencer", "Ulysses", "Clayton", "Troy", "Theodore", "Tom", "Mack", "Leslie", "Barrett", "Branden", "Preston", "Rupert", "Jarod", "Ellsworth", "Rodolfo", "Horace", "Rolland", "Richard", "Denver", "Vern", "Dion", "Alfredo", "Coy", "Archie", "Palmer", "Lorenzo", "Garrett", "Hollis", "Angelo", "Maxwell", "Denny", "Charles", "Hershel", "Brent", "Charley", "Ron", "Eddy", "Norberto", "Roy", "Dirk", "Drew", "Otis", "Rigoberto", "Lyndon", "Darwin", "Kurtis", "Sherman", "Christopher", "Dominic", "Ricardo", "Dwayne", "Noah", "Edmund", "Leo", "Leroy", "Houston", "Aloysius", "Franklin", "Cody", "Jay", "Johnathan", "Stanton", "Landon", "Francisco", "Sanford", "Karl", "Thanh", "Odell", "Woodrow", "Rudy", "Arnulfo", "Byron", "Gilberto", "Hunter", "Christoper", "Brendon", "Kerry", "Logan", "Joseph", "Sean", "Enrique", "Sydney", "Edgar", "Art", "Nicolas", "Dante", "Aaron", "Royal", "Josh", "Kirby", "Dallas", "Claud", "Lawrence", "Martin", "Noel", "Issac", "Clyde", "Carroll", "Stephan", "Sonny", "Scott", "Arthur", "Everett", "Adolfo", "Ismael", "Micheal", "Armando", "Andres", "Daryl", "Andrew", "Erick", "Noe", "Allan", "Fred", "Willard", "Kenny", "Miles", "Barry", "Edison", "Stefan", "Jerry", "Randall", "Ernesto", "Theodoric", "Darrell", "Marc", "Sterling", "Dennis", "Mark", "Galen", "Warren", "Emory", "Clark", "Geoffrey", "Cecil", "Mary", "Vincent", "Barney", "Herman", "Oliver", "Garry", "Wilbur", "Jean", "Ramon", "Vicente", "Alton", "Jim", "Reinaldo", "Jeremy", "Wm", "Marion", "Stephen", "Lonnie", "Blake", "Gregg", "Gerald", "Giuseppe", "Danilo", "Matt", "Tyree", "Caleb", "Gerardo", "Chuck", "Dwight", "Luther", "Roderick", "Cole", "Clifford", "Amos", "Dylan", "Wally", "Aurelio", "Robt", "Jonathan", "Carlton", "Keneth", "Jessie", "Kelly", "Dan", "Weldon", "Blair", "Marcos", "Homer", "Bobby", "Irving", "Garland", "Armand", "Shane", "Booker", "Dillon", "Ellis", "Delbert", "Robert", "Jarvis", "Joe", "Javier", "Kyle", "Nick", "Jon", "Marshall", "Derrick", "Arnold", "Derek", "Sam", "Merlin", "Raymond", "Sylvester", "Genaro", "Adrian", "Loyd", "Cleveland", "Michele", "Victor", "Virgil", "Conrad", "Rodrick", "Jack", "Oscar", "Gordon", "Anthony", "Carlo", "Horacio", "Patrick", "Cory", "Lewis", "Pedro", "Trenton", "Rosendo", "Haywood", "Robby", "Carter", "Rickey", "Simon", "Darrin", "Ignacio", "Bryant", "Angel", "Hector", "Dave", "Ervin", "Brian", "Wayne", "Quinton", "Alvin", "Devin", "Tomas", "Sheldon", "Seth", "Quincy", "Federico", "Delmar", "Donnie", "Randy", "Neal", "Ben", "Duane", "Ronald", "Loren", "Israel", "Milton", "Ronnie", "Nestor", "Kenneth", "Lester", "Darren", "Owen", "Eddie", "Jason", "Randolph", "Evan", "Felipe", "Johnny", "Taylor", "Leonel", "Marcus", "Dario", "Alexander", "Wade", "Malcolm", "Stewart", "Jake", "Reginald", "Terrance", "Doyle", "Jess", "Rick", "Nathaniel", "Henry", "Grant", "Zachary", "Shaun", "Buford", "Jonathon", "Frankie", "Jame", "Jorge", "Wiley", "Leon", "Lincoln", "Neil", "Mohamed", "Don", "Clint", "Mathew", "Arturo", "Freddie", "Santiago", "Daren", "Douglas", "Gabriel", "Robin", "Max", "Edwin", "Gilbert", "Gaston", "Bruno", "Linwood", "Felix", "Trent", "Ross", "Colin", "James", "Harold", "Rudolph", "Kurt", "Brock", "Reuben", "Peter", "Frank", "Alberto", "Salvador", "Tyler", "Aidan", "Davis", "Wilmer", "Collin", "Bob", "Morris", "Albert", "Alan", "Nicholas", "Sidney", "Clinton", "Truman", "David", "Cedric", "Andy", "Fredrick", "Desmond", "Dudley", "Dustin", "Donnell", "Irwin", "Philip", "Connie", "Jamie", "Wendell", "Jonah", "Donny", "Johnathon", "Boycey", "Wilson", "Lucas", "Heriberto", "Tracy", "Andre", "Pasquale", "Norbert", "Christian", "Odis", "Monty", "Ralph", "Elvin", "Clement", "Ivan", "Joshua", "Alex", "Levi", "Lane", "Mariano", "Russell", "Ken", "Ian", "Matthew", "Bernard", "Benito", "Roscoe", "Abraham", "Marco", "Guadalupe", "Eduardo", "Tristan", "Humberto", "Emmanuel", "Lionel", "Colby", "Mitchell", "Thomas", "Stacey", "Jasper", "Calvin", "Erling", "Lloyd", "Wesley", "Isaac", "Eric", "Gustavo", "Jesse", "Omar", "Tommy", "Mario", "Erik", "Carmelo", "Jackie", "Theron", "Damon", "Rudolf", "Jeremiah", "Clifton", "Wilfred", "William", "Kim", "Ward", "Julian", "Carson", "Timothy", "Terry", "Lamont", "Greg", "Cleo", "Kristopher", "Billy", "Willie", "Darryl", "Lucio", "Tyrone", "Hugh", "Romeo", "Bruce", "Willis", "Hugo", "Claudio", "Harvey", "Fletcher", "Juan", "Sebastian", "Raymundo", "Gene", "Jermaine", "Hezekiah", "Amado", "Carl", "Orland", "Steven", "Reynaldo", "Lindsay", "Jaime", "German", "Nathan", "Cruz", "Roger", "Pete", "Ethan", "Domenic", "Terrence", "Benton", "Orville", "Rene", "Eliseo", "Corey", "Alejandro", "Jayson", "Donn", "Shannon", "Winfred", "Octavio", "Jared", "Roosevelt", "Merritt", "Silas", "Louie", "Adan", "Adam", "Roberto", "Frederic", "Wallace", "Keven", "Eugene", "Gail", "Louis", "Lyle", "Efren", "Lance", "Beau", "Claude", "Donald", "Chet", "Justin", "Bennie", "Jeffrey", "Walter", "Quintin", "Dick", "Ricky", "Mohammad", "Ruben", "Ted", "Roland", "Stuart", "Wilbert", "Isidro", "Jacinto", "Cesar", "Abram"};

    /**
     * 邮箱连接符
     */
    protected static final Character MAILBOX_CONNECTORS = '@';

    /**
     * 常见邮箱后缀
     */
    protected static final String[] MAILBOX_SUFFIX = {"gmail.com", "yahoo.com", "hotmail.com", "aol.com", "msn.com", "icloud.com", "live.com", "163.com", "outlook.com", "sina.com", "qq.com", "sohu.com", "zoho.com", "mail.com", "yahoo.co.uk", "hotmail.co.uk", "protonmail.com", "gmx.com", "fastmail.com", "yandex.com"};

    /**
     * 中国移动号码前缀
     */
    protected static final String[] PHONE_PREFIX_MOBILE = {"139", "138", "137", "136", "134", "135", "147", "150", "151", "152", "157", "158", "159", "172", "178", "182", "183", "184", "187", "188", "195", "197", "198"};

    /**
     * 中国联通号码前缀
     */
    protected static final String[] PHONE_PREFIX_UNICOM = {"130", "131", "132", "140", "145", "146", "155", "156", "166", "185", "186", "175", "176", "196"};

    /**
     * 中国电信号码前缀
     */
    protected static final String[] PHONE_PREFIX_TELECOM = {"133", "149", "153", "177", "173", "180", "181", "189", "190", "191", "193", "199"};

    /**
     * 广电\虚拟运营商号码前缀
     */
    protected static final String[] PHONE_PREFIX_OTHER = {"192", "162", "165", "167", "170", "171"};

    /**
     * 身份证校验码计算系数
     */
    protected static final int[] ID_CARD_CHECK_NUM_CALCULATE_THE_FACTOR = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    /**
     * 身份证校验因子余数映射
     */
    protected static final char[] ID_CARD_CHECK_NUM_MAPPING = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

    /**
     * 全国各省份和地级市的map, key为code;value为名字
     */
    protected static final HashMap<String, String> ADDRESS_PROVINCE_CITY_MAP = new HashMap<>(500);

    /**
     * 全国各区县数组
     */
    protected static final ArrayList<Area> ADDRESS_AREAS = new ArrayList<>();

    /**
     * 获取省市信息
     *
     * @param code code
     * @return 省市信息
     */
    public static Address getAddress(String code) {
        String name = ADDRESS_PROVINCE_CITY_MAP.get(code);
        if (name != null) {
            if (code.length() == 2) {
                return new Province(code, name);
            } else {
                return new City(code, name);
            }
        }
        return null;
    }

    static {
        final String areaFlag = "areas";
        InputStream inputStream = RandomConstant.class.getClassLoader().getResourceAsStream("address.txt");
        if (inputStream == null) {
            throw new RuntimeException("address file is not found");
        }
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String line = reader.readLine();
            boolean isAreas = false;
            while (line != null) {
                if (areaFlag.equals(line)) {
                    isAreas = true;
                }
                if (line.contains(",")) {
                    String[] addressInfo = line.split(",");
                    if (isAreas) {
                        ADDRESS_AREAS.add(new Area(addressInfo[0], addressInfo[1]));
                    } else {
                        ADDRESS_PROVINCE_CITY_MAP.put(addressInfo[0], addressInfo[1]);
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("address file load error", e);
        }
    }
}
