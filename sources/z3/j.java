package z3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements y, Iterable, ll2.a {

    /* renamed from: a */
    public final LinkedHashMap f140700a = new LinkedHashMap();

    /* renamed from: b */
    public boolean f140701b;

    /* renamed from: c */
    public boolean f140702c;

    public final j b() {
        j jVar = new j();
        jVar.f140701b = this.f140701b;
        jVar.f140702c = this.f140702c;
        jVar.f140700a.putAll(this.f140700a);
        return jVar;
    }

    public final Object c(x xVar) {
        Object obj = this.f140700a.get(xVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + xVar + " - consider getOrElse or getOrNull");
    }

    public final Object d(x xVar, Function0 function0) {
        Object obj = this.f140700a.get(xVar);
        return obj == null ? function0.invoke() : obj;
    }

    public final void e(x xVar, Object obj) {
        boolean z13 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f140700a;
        if (!z13 || !linkedHashMap.containsKey(xVar)) {
            linkedHashMap.put(xVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(xVar);
        Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String b13 = aVar2.b();
        if (b13 == null) {
            b13 = aVar.b();
        }
        xk2.g a13 = aVar2.a();
        if (a13 == null) {
            a13 = aVar.a();
        }
        linkedHashMap.put(xVar, new a(b13, a13));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f140700a, jVar.f140700a) && this.f140701b == jVar.f140701b && this.f140702c == jVar.f140702c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140702c) + ep.b.e(this.f140701b, this.f140700a.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f140700a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        if (this.f140701b) {
            sb3.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f140702c) {
            sb3.append(str);
            sb3.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f140700a.entrySet()) {
            x xVar = (x) entry.getKey();
            Object value = entry.getValue();
            sb3.append(str);
            sb3.append(xVar.f140761a);
            sb3.append(" : ");
            sb3.append(value);
            str = ", ";
        }
        return androidx.compose.ui.platform.a.i(this) + "{ " + ((Object) sb3) + " }";
    }
}
