import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// 1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2. Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)
// 3. Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
// 4. *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
// 5. **Сравнить время прямого и случайного перебора тысячи элементов словарей.

public class lesson_5 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "white");
        map.put(1, "gray");
        map.put(2, "black");
        System.out.println(map);

        Set<Integer> keySet = map.keySet();
        for (int i : keySet) {
            map.compute(i, (k, v) -> v = v + "!");
        }
        System.out.println(map);

        while (map.size() < 1000) {
            int key = rnd(3, 10000000);
            map.put(key, "value"); 
        }
        System.out.println(map.size());

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "red");
        treeMap.put(2, "yellow");
        treeMap.put(1, "green");
        System.out.println(treeMap);

    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
