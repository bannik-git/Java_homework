package Homeworks.Seminar_5;

import java.util.*;

public class FindDuplicateFileInSystem {
    public static void main(String[] args) {
        String [] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};
        findDuplicate(paths);
    }
    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        ArrayList<String[]> pathNameContent = new ArrayList<>();
        Map<String, ArrayList<String>> filePathsMap = new HashMap<>();

        for (int i = 0; i < paths.length; i++) {


            pathNameContent.add(paths[i].split(" "));
            for (int j = 1; j < pathNameContent.get(i).length; j++) {
                int startСontent = pathNameContent.get(i)[j].indexOf('(');
                int endContent = pathNameContent.get(i)[j].length() - 1;
                String fileName = pathNameContent.get(i)[j].substring(0, startСontent);
                String fileValue = pathNameContent.get(i)[j].substring(startСontent + 1, endContent);
                filePathsMap.putIfAbsent(fileValue, new ArrayList<String>());
                filePathsMap.get(fileValue).add(pathNameContent.get(i)[0] + '/' + fileName);
            }
        }

        for (String filePath : filePathsMap.keySet()) {
            if (filePathsMap.get(filePath).size() > 1) {
                res.add(filePathsMap.get(filePath));
            }
        }
        return res;
    }
}

