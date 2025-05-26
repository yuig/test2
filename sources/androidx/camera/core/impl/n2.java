package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class n2 extends h2 {

    /* renamed from: j, reason: collision with root package name */
    public final q8.m0 f16924j = new q8.m0(4);

    /* renamed from: k, reason: collision with root package name */
    public boolean f16925k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16926l = false;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f16927m = new ArrayList();

    public final void a(o2 o2Var) {
        Map map;
        Object obj;
        s0 s0Var = o2Var.f16937g;
        int i13 = s0Var.f16969c;
        v.c1 c1Var = this.f16863b;
        if (i13 != -1) {
            this.f16926l = true;
            int i14 = c1Var.f123384a;
            Integer valueOf = Integer.valueOf(i13);
            List list = o2.f16930j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i14))) {
                i13 = i14;
            }
            c1Var.f123384a = i13;
        }
        c cVar = s0.f16966k;
        Range range = k.f16892f;
        v0 v0Var = s0Var.f16968b;
        Range range2 = (Range) v0Var.j(cVar, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            v1 v1Var = (v1) ((p1) c1Var.f123388e);
            v1Var.getClass();
            try {
                obj = v1Var.f(cVar);
            } catch (IllegalArgumentException unused) {
                obj = range;
            }
            if (((Range) obj).equals(range)) {
                ((q1) ((p1) c1Var.f123388e)).s(s0.f16966k, range2);
            } else {
                v0 v0Var2 = (p1) c1Var.f123388e;
                c cVar2 = s0.f16966k;
                Object obj2 = k.f16892f;
                v1 v1Var2 = (v1) v0Var2;
                v1Var2.getClass();
                try {
                    obj2 = v1Var2.f(cVar2);
                } catch (IllegalArgumentException unused2) {
                }
                if (!((Range) obj2).equals(range2)) {
                    this.f16925k = false;
                    kh2.m0.p("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }
        int b13 = s0Var.b();
        if (b13 != 0) {
            c1Var.getClass();
            if (b13 != 0) {
                ((q1) ((p1) c1Var.f123388e)).s(z2.f17025wn, Integer.valueOf(b13));
            }
        }
        int c13 = s0Var.c();
        if (c13 != 0) {
            c1Var.getClass();
            if (c13 != 0) {
                ((q1) ((p1) c1Var.f123388e)).s(z2.f17026xn, Integer.valueOf(c13));
            }
        }
        s0 s0Var2 = o2Var.f16937g;
        u2 u2Var = s0Var2.f16973g;
        Map map2 = ((s1) c1Var.f123390g).f16977a;
        if (map2 != null && (map = u2Var.f16977a) != null) {
            map2.putAll(map);
        }
        this.f16864c.addAll(o2Var.f16933c);
        this.f16865d.addAll(o2Var.f16934d);
        c1Var.a(s0Var2.f16971e);
        this.f16866e.addAll(o2Var.f16935e);
        k2 k2Var = o2Var.f16936f;
        if (k2Var != null) {
            this.f16927m.add(k2Var);
        }
        InputConfiguration inputConfiguration = o2Var.f16939i;
        if (inputConfiguration != null) {
            this.f16868g = inputConfiguration;
        }
        LinkedHashSet<h> linkedHashSet = this.f16862a;
        linkedHashSet.addAll(o2Var.f16931a);
        Object obj3 = c1Var.f123387d;
        ((Set) obj3).addAll(Collections.unmodifiableList(s0Var.f16967a));
        ArrayList arrayList = new ArrayList();
        for (h hVar : linkedHashSet) {
            arrayList.add(hVar.f16844a);
            Iterator it = hVar.f16845b.iterator();
            while (it.hasNext()) {
                arrayList.add((z0) it.next());
            }
        }
        if (!arrayList.containsAll((Set) obj3)) {
            kh2.m0.p("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f16925k = false;
        }
        int i15 = this.f16869h;
        int i16 = o2Var.f16938h;
        if (i16 != i15 && i16 != 0 && i15 != 0) {
            kh2.m0.p("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.f16925k = false;
        } else if (i16 != 0) {
            this.f16869h = i16;
        }
        h hVar2 = o2Var.f16932b;
        if (hVar2 != null) {
            h hVar3 = this.f16870i;
            if (hVar3 == hVar2 || hVar3 == null) {
                this.f16870i = hVar2;
            } else {
                kh2.m0.p("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.f16925k = false;
            }
        }
        c1Var.c(v0Var);
    }

    public final o2 b() {
        if (!this.f16925k) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.f16862a);
        q8.m0 m0Var = this.f16924j;
        if (m0Var.f102963a) {
            Collections.sort(arrayList, new j0.a(m0Var, 0));
        }
        return new o2(arrayList, new ArrayList(this.f16864c), new ArrayList(this.f16865d), new ArrayList(this.f16866e), this.f16863b.e(), !this.f16927m.isEmpty() ? new v.i2(this, 3) : null, this.f16868g, this.f16869h, this.f16870i);
    }
}
