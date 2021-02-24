package javaUtil.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {  
    public static void main(String[] args) {
        // Key, Value�� ��� String Ÿ���� HashMap�ν��Ͻ��� ����ϴ�.
        Map<String, String> map = new HashMap<>();

        // key�� value���� put���� �����մϴ�.
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");
        // ���� key�� 2�� ���� �� �����ϴ�. ù��°�� �����ߴ� 001, kim�� 001, kang���� �ٲ��.
        map.put("001", "kang");

        // map�� ����� �ڷ��� ���� �߷��մϴ�. 3�� ��µ˴ϴ�.
        System.out.println(map.size());

        // Ű�� 001, 002, 003�� ���� ���� ����մϴ�.
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));
        System.out.println(map.get("003"));

        // map�� ����� ��� key���� Set�ڷᱸ���� �����ϴ�.
        Set<String> keys = map.keySet();
        // Set�ڷᱸ���� �ִ� ��� key�� ������ ���Ͽ� Iterator�� ���մϴ�.
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            // key�� �����ϴ�.
            String key = iter.next();
            // key�� �ش��ϴ� value�� �����ϴ�.
            String value = map.get(key);
            // key�� value�� ����մϴ�.
            System.out.println(key + " : " + value);
        }
    }
}
