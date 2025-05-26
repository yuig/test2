package androidx.compose.foundation.lazy.layout;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final r2.d f17321a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f17322b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f17323c = new LinkedHashMap();

    public x(r2.d dVar, q1.o oVar) {
        this.f17321a = dVar;
        this.f17322b = oVar;
    }

    public final Function2 a(int i13, Object obj, Object obj2) {
        q2.h hVar;
        LinkedHashMap linkedHashMap = this.f17323c;
        w wVar = (w) linkedHashMap.get(obj);
        if (wVar != null && wVar.f17315c == i13 && Intrinsics.d(wVar.f17314b, obj2)) {
            Function2 function2 = wVar.f17316d;
            if (function2 != null) {
                return function2;
            }
            v vVar = new v(0, wVar.f17317e, wVar);
            Object obj3 = q2.i.f102113a;
            hVar = new q2.h(vVar, true, 1403994769);
            wVar.f17316d = hVar;
        } else {
            w wVar2 = new w(this, i13, obj, obj2);
            linkedHashMap.put(obj, wVar2);
            Function2 function22 = wVar2.f17316d;
            if (function22 != null) {
                return function22;
            }
            v vVar2 = new v(0, this, wVar2);
            Object obj4 = q2.i.f102113a;
            hVar = new q2.h(vVar2, true, 1403994769);
            wVar2.f17316d = hVar;
        }
        return hVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = (w) this.f17323c.get(obj);
        if (wVar != null) {
            return wVar.f17314b;
        }
        y yVar = (y) this.f17322b.invoke();
        int b13 = yVar.b(obj);
        if (b13 != -1) {
            return yVar.d(b13);
        }
        return null;
    }
}
