package xyz.zzlcjj.commons.random;

import jdk.nashorn.internal.parser.JSONParser;
import xyz.zzlcjj.commons.random.enums.MailboxAccountType;
import xyz.zzlcjj.commons.random.enums.PhoneType;

/**
 * 随机数据工具类
 *
 * @author zzl
 * @since 2023/7/29
 */
public class RandomUtils {

    /**
     * 随机姓名, 默认长度为2
     *
     * @return 姓名
     */
    public static String randomChineseName() {
        return randomChineseName(2);
    }

    /**
     * 生成指定名字长度的随机姓名
     *
     * @param length 姓名长度
     * @return 姓名
     */
    public static String randomChineseName(int length) {
        return randomChineseName(null, length);
    }

    /**
     * 生成指定姓氏的随机姓名
     *
     * @param surname 指定姓氏
     * @return 姓名
     */
    public static String randomChineseName(String surname) {
        return randomChineseName(surname, 2);
    }

    /**
     * 生成指定姓氏、名字长度的随机姓名
     *
     * @param surname 指定姓氏
     * @param length  姓名长度
     * @return 姓名
     */
    public static String randomChineseName(String surname, int length) {
        return randomName(surname, length, true);
    }

    /**
     * 随机姓名, 默认长度为2
     *
     * @return 姓名
     */
    public static String randomEnglishName() {
        return randomEnglishName(2);
    }

    /**
     * 生成指定名字长度的随机姓名
     *
     * @param length 姓名长度
     * @return 姓名
     */
    public static String randomEnglishName(int length) {
        return randomEnglishName(null, length);
    }

    /**
     * 生成指定姓氏的随机姓名
     *
     * @param surname 指定姓氏
     * @return 姓名
     */
    public static String randomEnglishName(String surname) {
        return randomEnglishName(surname, 2);
    }

    /**
     * 生成指定姓氏、名字长度的随机姓名
     *
     * @param surname 指定姓氏
     * @param length  姓名长度
     * @return 姓名
     */
    public static String randomEnglishName(String surname, int length) {
        return randomName(surname, length, false);
    }

    /**
     * 生成指定姓氏、名字长度的随机姓名
     *
     * @param surname       指定姓氏
     * @param length        姓名长度
     * @param isChineseName 是否生成中文姓名,否则生成英文名
     * @return 姓名
     */
    public static String randomName(String surname, int length, boolean isChineseName) {
        if (length < 1) {
            throw new IllegalArgumentException("name length must not be less than 1");
        }
        StringBuilder nameBuilder = new StringBuilder();
        if (surname != null) {
            nameBuilder.append(surname);
        } else {
            if (isChineseName) {
                nameBuilder.append(RandomConstant.CHINESE_SURNAMES_CHARACTER[RandomConstant.RANDOM.nextInt(RandomConstant.CHINESE_SURNAMES_CHARACTER.length)]);
            } else {
                nameBuilder.append(RandomConstant.ENGLISH_SURNAMES_WORDS[RandomConstant.RANDOM.nextInt(RandomConstant.ENGLISH_SURNAMES_WORDS.length)]);
            }
        }
        for (int i = 0; i < length; i++) {
            if (isChineseName) {
                nameBuilder.append(RandomConstant.NAME_CHARACTER[RandomConstant.RANDOM.nextInt(RandomConstant.NAME_CHARACTER.length)]);
            } else {
                nameBuilder.append(" ");
                nameBuilder.append(RandomConstant.ENGLISH_NAME_WORDS[RandomConstant.RANDOM.nextInt(RandomConstant.ENGLISH_NAME_WORDS.length)]);
            }
        }
        return nameBuilder.toString();
    }

    /**
     * 随机生成一个邮箱
     *
     * @return 邮箱
     */
    public static String randomEmail() {
        return randomEmail(null);
    }

    /**
     * 随机生成一个指定后缀的邮箱
     *
     * @param suffix 邮箱后缀: 如 @qq.com
     * @return 邮箱
     */
    public static String randomEmail(String suffix) {
        return randomEmail(MailboxAccountType.NUMBERS_AND_LETTERS, suffix);
    }

    /**
     * 随机生成一个指定账号长度的邮箱
     *
     * @param length 账号长度
     * @return 邮箱
     */
    public static String randomEmail(int length) {
        return randomEmail(length, null);
    }

    /**
     * 随机生成一个指定账号长度和后缀的邮箱
     *
     * @param length 账号长度
     * @param suffix 邮箱后缀: 如 @qq.com
     * @return 邮箱
     */
    public static String randomEmail(int length, String suffix) {
        return randomEmail(length, MailboxAccountType.NUMBERS_AND_LETTERS, suffix);
    }

    /**
     * 随机生成一个指定账号类型和后缀的邮箱
     *
     * @param type   邮箱账号类型
     * @param suffix 邮箱后缀: 如 @qq.com
     * @return 邮箱
     */
    public static String randomEmail(MailboxAccountType type, String suffix) {
        return randomEmail(8, type, suffix);
    }

    /**
     * 随机生成一个指定账号类型和后缀的邮箱
     *
     * @param type   邮箱账号类型
     * @param length 账号长度
     * @return 邮箱
     */
    public static String randomEmail(MailboxAccountType type, int length) {
        return randomEmail(length, type, null);
    }

    /**
     * 随机邮箱
     *
     * @param length 账号长度
     * @param type   账号类型
     * @param suffix 邮箱后缀: 如 @qq.com
     * @return 随机邮箱
     */
    public static String randomEmail(int length, MailboxAccountType type, String suffix) {
        if (length < 1) {
            throw new IllegalArgumentException("email account length must not be less than 1");
        }
        if (suffix == null) {
            suffix = RandomConstant.MAILBOX_SUFFIX[RandomConstant.RANDOM.nextInt(RandomConstant.MAILBOX_SUFFIX.length)];
        }
        StringBuilder emailBuilder = new StringBuilder().append(generateRandomString(length, type));
        if (!RandomConstant.MAILBOX_CONNECTORS.equals(suffix.charAt(0))) {
            emailBuilder.append(RandomConstant.MAILBOX_CONNECTORS);
        }
        emailBuilder.append(suffix);
        return emailBuilder.toString();
    }

    /**
     * 随机返回一个号码
     *
     * @return 手机号码
     */
    public static String randomMobile() {
        return randomMobile(null);
    }

    /**
     * 返回指定运营商的手机号码
     *
     * @param type 运营商
     * @return 手机号码
     */
    public static String randomMobile(PhoneType type) {
        int index = RandomConstant.RANDOM.nextInt(4);
        if (type == null) {
            switch (index) {
                case 0:
                    type = PhoneType.UNICOM;
                    break;
                case 1:
                    type = PhoneType.TELECOM;
                    break;
                case 2:
                    type = PhoneType.OTHER;
                    break;
                default:
                    type = PhoneType.MOBILE;
                    break;
            }
        }
        String prefix;
        if (PhoneType.MOBILE.equals(type)) {
            prefix = RandomConstant.PHONE_PREFIX_MOBILE[RandomConstant.RANDOM.nextInt(RandomConstant.PHONE_PREFIX_MOBILE.length)];
        } else if (PhoneType.UNICOM.equals(type)) {
            prefix = RandomConstant.PHONE_PREFIX_UNICOM[RandomConstant.RANDOM.nextInt(RandomConstant.PHONE_PREFIX_UNICOM.length)];
        } else if (PhoneType.TELECOM.equals(type)) {
            prefix = RandomConstant.PHONE_PREFIX_TELECOM[RandomConstant.RANDOM.nextInt(RandomConstant.PHONE_PREFIX_TELECOM.length)];
        } else {
            prefix = RandomConstant.PHONE_PREFIX_OTHER[RandomConstant.RANDOM.nextInt(RandomConstant.PHONE_PREFIX_OTHER.length)];
        }
        return prefix + generateRandomString(8, MailboxAccountType.NUMERAL);
    }

    public static String randomIdCard() {
        return ";";
    }

    /**
     * 随机字符串
     *
     * @param length 长度
     * @param type   类型
     * @return 随机字符串
     */
    private static String generateRandomString(int length, MailboxAccountType type) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            // 纯字母
            if (MailboxAccountType.CHARACTER_MOTHER.equals(type)) {
                sb.append(characters.charAt(RandomConstant.RANDOM.nextInt(characters.length() - 10)));
            } else if (MailboxAccountType.NUMERAL.equals(type)) {
                // 第一位最好不要0吧?再说吧0有什么不行?
                sb.append(characters.charAt(characters.length() - (RandomConstant.RANDOM.nextInt(10) + 1)));
            } else {
                sb.append(characters.charAt(RandomConstant.RANDOM.nextInt(characters.length())));
            }
        }
        return sb.toString();
    }

    /**
     * 计算身份证的校验码
     *
     * @return 得到身份证的校验码
     */
    private static char calculateCheckDigit(String idCard) {
        if (idCard == null || idCard.length() < 17 || idCard.length() > 18) {
            throw new IllegalArgumentException("idCard length must be 17 or 18 characters");
        }
        int sum = 0;
        for (int i = 0; i < 17; i++) {
            sum += Character.getNumericValue(idCard.charAt(i)) * RandomConstant.ID_CARD_CHECK_NUM_CALCULATE_THE_FACTOR[i];
        }
        int mod = sum % 11;
        return RandomConstant.ID_CARD_CHECK_NUM_MAPPING[mod];
    }

    /**
     * 计算年份是否为闰年
     *
     * @param year 年份
     * @return 是否为闰年
     */
    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            // 年份能被4整除的是可能的闰年
            return false;
        } else {
            // 年份能被100整除但不能被400整除的不是闰年
            // 年份能被400整除的是闰年
            if (year % 100 != 0) {
                // 年份能被4整除但不能被100整除的是闰年
                return true;
            } else {
                return year % 400 == 0;
            }
        }
    }
}
