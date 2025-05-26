package r2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f106042i = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i iVar = (i) obj2;
        LinkedHashMap r13 = z0.r(iVar.f106049a);
        for (h hVar : iVar.f106050b.values()) {
            if (hVar.f106046b) {
                Map c13 = hVar.f106047c.c();
                boolean isEmpty = c13.isEmpty();
                Object obj3 = hVar.f106045a;
                if (isEmpty) {
                    r13.remove(obj3);
                } else {
                    r13.put(obj3, c13);
                }
            }
        }
        if (r13.isEmpty()) {
            return null;
        }
        return r13;
    }
}
