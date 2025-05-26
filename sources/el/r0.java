package el;

import il.l4;
import il.u4;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f59524a;

    /* renamed from: b, reason: collision with root package name */
    public final List f59525b;

    /* renamed from: c, reason: collision with root package name */
    public s0 f59526c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f59527d;

    /* renamed from: e, reason: collision with root package name */
    public v f59528e;

    public r0(Map map, List list, s0 s0Var, v vVar, Class cls) {
        this.f59524a = map;
        this.f59525b = list;
        this.f59526c = s0Var;
        this.f59527d = cls;
        this.f59528e = vVar;
    }

    public final void a(Object obj, u4 u4Var, boolean z13) {
        byte[] b13;
        if (this.f59524a == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (u4Var.H() != l4.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int i13 = uk.b.f122356a[u4Var.G().ordinal()];
        if (i13 == 1 || i13 == 2) {
            b13 = i0.a(u4Var.F()).b();
        } else if (i13 == 3) {
            b13 = i0.b(u4Var.F()).b();
        } else {
            if (i13 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            b13 = uk.c.f122357a;
        }
        ml.a a13 = ml.a.a(b13);
        s0 s0Var = new s0(obj, a13, u4Var.H(), u4Var.G(), u4Var.F(), u4Var.E().F());
        Map map = this.f59524a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(s0Var);
        List list = (List) map.put(a13, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(s0Var);
            map.put(a13, Collections.unmodifiableList(arrayList2));
        }
        this.f59525b.add(s0Var);
        if (z13) {
            if (this.f59526c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f59526c = s0Var;
        }
    }

    public final List b(byte[] bArr) {
        List list = (List) this.f59524a.get(ml.a.a(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean c() {
        return !this.f59528e.f59544a.isEmpty();
    }

    public r0(Class cls) {
        this.f59524a = new HashMap();
        this.f59525b = new ArrayList();
        this.f59527d = cls;
        this.f59528e = v.f59543b;
    }
}
