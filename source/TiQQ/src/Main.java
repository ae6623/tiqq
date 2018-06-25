import com.qq.decrypt.util.NearbyURLSafeUtil;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* {
        "fromNick": "一个认识7年的女生",
                "fromEncodeUin": "*S1*7iCF7i-qNK45",
                "group": 0,
                "fromFaceUrl": "woman.png",
                "fromGender": 1,
                "toUin": 394263788,
                "toNick": "",
                "topicId": 36,
                "topicName": "吃海底捞加加辣",
                "timestamp": 1524543195
        },{
            "fromNick": "一个双鱼座的男生",
            "fromEncodeUin": "*S1*oKvPoK6kow65oe4sNenANeEz",
            "group": 0,
            "fromFaceUrl": "man.png",
            "fromGender": 0,
            "toUin": 394263788,
            "toNick": "",
            "topicId": 10890,
            "topicName": "从来不为钱发愁",
            "timestamp": 1529489633
        }
        */

        List<String> qqs = Arrays.asList("*S1*7iCF7i-qNK45", "*S1*oKvPoK6kow65oe4sNenANeEz");

        qqs.forEach( qq -> System.out.println("qq:" + NearbyURLSafeUtil.decrypt(qq)));


    }
}