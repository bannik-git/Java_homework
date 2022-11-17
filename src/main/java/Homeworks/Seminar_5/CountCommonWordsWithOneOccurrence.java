package Homeworks.Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"ibxyatvglhltxngewrcrqbbnew", "towokpjpkccmob", "kdmtwngzpebwpnvlazhdcmtwpjh", "muh", "fzzlmacbbvoqdueutjqoutwd",
                "ylluspdftxxqbwadivfdzulghq", "hioiacezaiptpsvcojzckhxz", "nzcjhjomaupevyekennyrfwyd", "tdwtuinstwsfyjnfkxkbnsptisuifo",
                "wrdwoxzsczzlnwjugopohxh", "p", "jkez", "drisymx", "fsva", "myqc", "aovjoxzpkylpecltwtottzidq", "wqspbhpberqjabockesc", "f",
                "qostobxgfliil", "gsekmhjpuedeivioudx", "tzelzowtgnvjsxgbw", "zgmpazgnioprk", "fucybddarjcve", "ldacfviysy", "yxyjairoxtvbkljaokca",
                "vxpiohhvjuwcpiceafcdzobalgpz", "wyflbpmkfwftndgtnftajgla", "xbxvvk", "bnrwyshimjamltmlugeiviu", "wsgqysmuakedrrmjk",
                "ppqmgibqljkwgmiwi", "fly", "uf", "tvvttzrsjbojve", "ztxtnmljdhyz", "vxonvloufeksfvg", "wql", "kotdenqjrdlgofubocb", "wlaqceczd",
                "mtmhtgvqwr", "aymzxpfvbqxydmilafyqvapuxtnqe", "ig", "atetjlhdcigunmmit", "enkdcxqnw", "gtlcmkxwvdhumgfurxkesmekmnhjo",
                "hurihasxncgtzleerslvwxkz", "zked", "xiaqvclhuhggcgoouzjgi", "mzejuubgyhvlfbecpmggddby", "boyotuukuiprtlvktypxboosw", "vwfceei",
                "gopsxsihawzhtlmdyiggljzggrhqr", "bckuuqszgncdhkeghudflczm", "e", "yvhwysrunkxsppbqjf", "lo", "bze", "kuzoqvgugnrpfkelktfg",
                "ntjtlwwmuevtsqujpxswgx", "zkdwtpdlvrfkbyktqsellmghaxj", "u", "rpmpq", "ajhlzwfrbysqloduofr", "gyfmhcskcrjepgeplbbj", "fe",
                "zyolvtetrdffy", "apbkyczsuvde", "fnkqf", "qwwxpwbr", "krkbnww", "zkvqkugfpziawiokdzlpjomfarkor", "jg", "l", "srbvxsnuhyqzmycvavmmakh",
                "dhkgzjrstir", "smaaptkzpwhukebwboysbnawgzgot"};
        String[] words2 = {"p", "towokpjpkccmob", "vflbjyecpzxnuay", "fzas", "fzzlmacbbvoqdueutjqoutwd", "bwjjzw", "va", "manrvuldjzrdnwihzct",
                "tdwtuinstwsfyjnfkxkbnsptisuifo", "wrdwoxzsczzlnwjugopohxh", "p", "tylcyihdjruhaayzcwxrynnkch", "uojzddpgyvqslha", "fsva",
                "rucvbjzfewjlhddxefhf", "tfihr", "wqspbhpberqjabockesc", "f", "bmfo", "zsjbzjmbloaybdofsrqvzwoizz", "tzelzowtgnvjsxgbw", "tproznqma",
                "lmryjiyvkgsxsaylkdmmxeub", "ldacfviysy", "xpamoswlugwjxyny", "rmfvgm", "wm", "xbxvvk", "ubawz", "jbrabb", "rgegpb", "fly",
                "aofydpklgjqmxhvxuhq", "tvvttzrsjbojve", "wj", "vxonvloufeksfvg", "wql", "vu", "nhuxqdfyftrbbodztyydb", "mtmhtgvqwr",
                "aymzxpfvbqxydmilafyqvapuxtnqe", "fqksatpfo", "ylzkfvvzdsryl", "enkdcxqnw", "gtlcmkxwvdhumgfurxkesmekmnhjo", "nccwybkxuawwdqyhrhmbt",
                "zked", "eyzwtvsjt", "qy", "boyotuukuiprtlvktypxboosw"};

        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {

        if (words1.length < words2.length) {
            return countWords(words2, words1);
        }

        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            wordsMap.putIfAbsent(words1[i], 0);
            wordsMap.put(words1[i], wordsMap.get(words1[i]) + 1);
        }
        for (int i = 0; i < words2.length; i++) {
            if (wordsMap.get(words2[i]) != null && wordsMap.get(words2[i]) <= 1) {
                wordsMap.put(words2[i], wordsMap.get(words2[i]) - 1);
            }
        }
        int result = 0;
        for (String key : wordsMap.keySet()) {
            if (wordsMap.get(key) == 0) {
                result++;
            }
        }
        return result;
    }
}