package ey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f60457a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b3 f60458b = new b3(this);

    public final void a(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        List list = (List) this.f60457a.get(e13.getClass());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((v1) it.next()).o(e13);
            }
        }
    }

    public final void b(v1 handler) {
        List list;
        Intrinsics.checkNotNullParameter(handler, "handler");
        for (Class cls : handler.b()) {
            HashMap hashMap = this.f60457a;
            if (hashMap.containsKey(cls)) {
                Object obj = hashMap.get(cls);
                Intrinsics.f(obj);
                list = (List) obj;
            } else {
                ArrayList arrayList = new ArrayList(10);
                hashMap.put(cls, arrayList);
                list = arrayList;
            }
            list.add(handler);
        }
    }
}
