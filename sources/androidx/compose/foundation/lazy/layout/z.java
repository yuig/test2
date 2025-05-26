package androidx.compose.foundation.lazy.layout;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import q3.p1;
import q3.q1;

/* loaded from: classes2.dex */
public final class z implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final x f17332a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f17333b = new LinkedHashMap();

    public z(x xVar) {
        this.f17332a = xVar;
    }

    @Override // q3.q1
    public final boolean a(Object obj, Object obj2) {
        x xVar = this.f17332a;
        return Intrinsics.d(xVar.b(obj), xVar.b(obj2));
    }

    @Override // q3.q1
    public final void b(p1 p1Var) {
        LinkedHashMap linkedHashMap = this.f17333b;
        linkedHashMap.clear();
        Iterator it = p1Var.f102263a.iterator();
        while (it.hasNext()) {
            Object b13 = this.f17332a.b(it.next());
            Integer num = (Integer) linkedHashMap.get(b13);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b13, Integer.valueOf(intValue + 1));
            }
        }
    }
}
