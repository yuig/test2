package ug;

import android.util.SparseArray;
import ig.c;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f122122a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f122123b;

    static {
        HashMap hashMap = new HashMap();
        f122123b = hashMap;
        hashMap.put(c.DEFAULT, 0);
        hashMap.put(c.VERY_LOW, 1);
        hashMap.put(c.HIGHEST, 2);
        for (c cVar : hashMap.keySet()) {
            f122122a.append(((Integer) f122123b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f122123b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i13) {
        c cVar = (c) f122122a.get(i13);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(a.a.d("Unknown Priority for value ", i13));
    }
}
