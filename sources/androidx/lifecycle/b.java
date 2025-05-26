package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18584a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f18585b;

    public b(HashMap hashMap) {
        this.f18585b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            q qVar = (q) entry.getValue();
            List list = (List) this.f18584a.get(qVar);
            if (list == null) {
                list = new ArrayList();
                this.f18584a.put(qVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, z zVar, q qVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                cVar.getClass();
                try {
                    int i13 = cVar.f18597a;
                    Method method = cVar.f18598b;
                    if (i13 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i13 == 1) {
                        method.invoke(obj, zVar);
                    } else if (i13 == 2) {
                        method.invoke(obj, zVar, qVar);
                    }
                } catch (IllegalAccessException e13) {
                    throw new RuntimeException(e13);
                } catch (InvocationTargetException e14) {
                    throw new RuntimeException("Failed to call observer method", e14.getCause());
                }
            }
        }
    }
}
