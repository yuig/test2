package qo2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class y0 implements oo2.g, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f104656a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f104657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104658c;

    /* renamed from: d, reason: collision with root package name */
    public int f104659d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f104660e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f104661f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f104662g;

    /* renamed from: h, reason: collision with root package name */
    public Map f104663h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.k f104664i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.k f104665j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.k f104666k;

    public y0(String serialName, a0 a0Var, int i13) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f104656a = serialName;
        this.f104657b = a0Var;
        this.f104658c = i13;
        this.f104659d = -1;
        String[] strArr = new String[i13];
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            strArr[i15] = "[UNINITIALIZED]";
        }
        this.f104660e = strArr;
        int i16 = this.f104658c;
        this.f104661f = new List[i16];
        this.f104662g = new boolean[i16];
        this.f104663h = kotlin.collections.z0.d();
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f104664i = xk2.m.a(nVar, new x0(this, 1));
        this.f104665j = xk2.m.a(nVar, new x0(this, 2));
        this.f104666k = xk2.m.a(nVar, new x0(this, i14));
    }

    @Override // qo2.k
    public final Set a() {
        return this.f104663h.keySet();
    }

    @Override // oo2.g
    public final boolean b() {
        return false;
    }

    @Override // oo2.g
    public oo2.n c() {
        return oo2.o.f96903a;
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f104663h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // oo2.g
    public final int e() {
        return this.f104658c;
    }

    public boolean equals(Object obj) {
        int i13;
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            oo2.g gVar = (oo2.g) obj;
            if (Intrinsics.d(this.f104656a, gVar.i()) && Arrays.equals((oo2.g[]) this.f104665j.getValue(), (oo2.g[]) ((y0) obj).f104665j.getValue())) {
                int e13 = gVar.e();
                int i14 = this.f104658c;
                if (i14 == e13) {
                    for (0; i13 < i14; i13 + 1) {
                        i13 = (Intrinsics.d(h(i13).i(), gVar.h(i13).i()) && Intrinsics.d(h(i13).c(), gVar.h(i13).c())) ? i13 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oo2.g
    public final String f(int i13) {
        return this.f104660e[i13];
    }

    @Override // oo2.g
    public final List g(int i13) {
        List list = this.f104661f[i13];
        return list == null ? kotlin.collections.q0.f80391a : list;
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // oo2.g
    public oo2.g h(int i13) {
        return ((no2.b[]) this.f104664i.getValue())[i13].a();
    }

    public int hashCode() {
        return ((Number) this.f104666k.getValue()).intValue();
    }

    @Override // oo2.g
    public final String i() {
        return this.f104656a;
    }

    @Override // oo2.g
    public boolean isInline() {
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        return this.f104662g[i13];
    }

    public final void k(String name, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i13 = this.f104659d + 1;
        this.f104659d = i13;
        String[] strArr = this.f104660e;
        strArr[i13] = name;
        this.f104662g[i13] = z13;
        this.f104661f[i13] = null;
        if (i13 == this.f104658c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                hashMap.put(strArr[i14], Integer.valueOf(i14));
            }
            this.f104663h = hashMap;
        }
    }

    public String toString() {
        return CollectionsKt.Z(ql2.s.q(0, this.f104658c), ", ", ep.b.k(new StringBuilder(), this.f104656a, '('), ")", 0, null, new cd2.n(this, 20), 24);
    }
}
