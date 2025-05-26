package oo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh2.g2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.t0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;
import ql2.s;
import qo2.w0;
import xk2.v;

/* loaded from: classes4.dex */
public final class h implements g, qo2.k {

    /* renamed from: a, reason: collision with root package name */
    public final String f96883a;

    /* renamed from: b, reason: collision with root package name */
    public final n f96884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96885c;

    /* renamed from: d, reason: collision with root package name */
    public final List f96886d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f96887e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f96888f;

    /* renamed from: g, reason: collision with root package name */
    public final g[] f96889g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f96890h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f96891i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f96892j;

    /* renamed from: k, reason: collision with root package name */
    public final g[] f96893k;

    /* renamed from: l, reason: collision with root package name */
    public final v f96894l;

    public h(String serialName, n kind, int i13, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f96883a = serialName;
        this.f96884b = kind;
        this.f96885c = i13;
        this.f96886d = builder.f96863b;
        ArrayList arrayList = builder.f96864c;
        this.f96887e = CollectionsKt.D0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f96888f = strArr;
        this.f96889g = w0.b(builder.f96866e);
        this.f96890h = (List[]) builder.f96867f.toArray(new List[0]);
        this.f96891i = CollectionsKt.A0(builder.f96868g);
        t0 g03 = c0.g0(strArr);
        ArrayList arrayList2 = new ArrayList(g0.q(g03, 10));
        Iterator it = g03.iterator();
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                this.f96892j = z0.m(arrayList2);
                this.f96893k = w0.b(typeParameters);
                this.f96894l = xk2.m.b(new g2(this, 24));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) x0Var.next();
            arrayList2.add(new Pair(indexedValue.f80350b, Integer.valueOf(indexedValue.f80349a)));
        }
    }

    @Override // qo2.k
    public final Set a() {
        return this.f96887e;
    }

    @Override // oo2.g
    public final boolean b() {
        return false;
    }

    @Override // oo2.g
    public final n c() {
        return this.f96884b;
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f96892j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // oo2.g
    public final int e() {
        return this.f96885c;
    }

    public final boolean equals(Object obj) {
        int i13;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            g gVar = (g) obj;
            if (Intrinsics.d(i(), gVar.i()) && Arrays.equals(this.f96893k, ((h) obj).f96893k) && e() == gVar.e()) {
                int e13 = e();
                for (0; i13 < e13; i13 + 1) {
                    i13 = (Intrinsics.d(h(i13).i(), gVar.h(i13).i()) && Intrinsics.d(h(i13).c(), gVar.h(i13).c())) ? i13 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // oo2.g
    public final String f(int i13) {
        return this.f96888f[i13];
    }

    @Override // oo2.g
    public final List g(int i13) {
        return this.f96890h[i13];
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return this.f96886d;
    }

    @Override // oo2.g
    public final g h(int i13) {
        return this.f96889g[i13];
    }

    public final int hashCode() {
        return ((Number) this.f96894l.getValue()).intValue();
    }

    @Override // oo2.g
    public final String i() {
        return this.f96883a;
    }

    @Override // oo2.g
    public final boolean isInline() {
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        return this.f96891i[i13];
    }

    public final String toString() {
        return CollectionsKt.Z(s.q(0, this.f96885c), ", ", ep.b.k(new StringBuilder(), this.f96883a, '('), ")", 0, null, new cd2.n(this, 18), 24);
    }
}
