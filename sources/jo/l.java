package jo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class l implements Iterable {
    public static Set b(HashMap hashMap, Iterator it, LinkedHashSet linkedHashSet) {
        if (!it.hasNext()) {
            return linkedHashSet;
        }
        Character ch3 = (Character) it.next();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Character ch4 : (List) hashMap.get(ch3)) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                List list = (List) it2.next();
                int i13 = 0;
                while (true) {
                    if (i13 >= list.size()) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.add(String.valueOf(new char[]{ch4.charValue(), ch3.charValue()}));
                        linkedHashSet2.add(arrayList);
                        break;
                    }
                    if (((String) list.get(i13)).charAt(0) == ch4.charValue()) {
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.remove(i13);
                        arrayList2.add(String.valueOf(new char[]{ch4.charValue(), ch3.charValue()}));
                        linkedHashSet2.add(list);
                        linkedHashSet2.add(arrayList2);
                        break;
                    }
                    i13++;
                }
            }
        }
        return b(hashMap, it, linkedHashSet2);
    }
}
