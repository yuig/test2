package so2;

import kh2.j1;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends p2 implements ro2.t {

    /* renamed from: k, reason: collision with root package name */
    public final g f114776k;

    /* renamed from: l, reason: collision with root package name */
    public final ro2.c f114777l;

    /* renamed from: m, reason: collision with root package name */
    public final i0 f114778m;

    /* renamed from: n, reason: collision with root package name */
    public final ro2.t[] f114779n;

    /* renamed from: o, reason: collision with root package name */
    public final to2.d f114780o;

    /* renamed from: p, reason: collision with root package name */
    public final ro2.k f114781p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f114782q;

    /* renamed from: r, reason: collision with root package name */
    public String f114783r;

    public e0(g composer, ro2.c json, i0 mode, ro2.t[] tVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f114776k = composer;
        this.f114777l = json;
        this.f114778m = mode;
        this.f114779n = tVarArr;
        this.f114780o = json.f108977b;
        this.f114781p = json.f108976a;
        int ordinal = mode.ordinal();
        if (tVarArr != null) {
            ro2.t tVar = tVarArr[ordinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[ordinal] = this;
        }
    }

    @Override // kh2.p2, po2.b
    public final void A(oo2.g descriptor, int i13, no2.b serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f114781p.f109017f) {
            super.A(descriptor, i13, serializer, obj);
        }
    }

    @Override // kh2.p2, po2.d
    public final void C(int i13) {
        if (this.f114782q) {
            F(String.valueOf(i13));
        } else {
            this.f114776k.f(i13);
        }
    }

    @Override // kh2.p2, po2.d
    public final void F(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f114776k.j(value);
    }

    @Override // kh2.p2
    public final void Z(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i14 = d0.f114774a[this.f114778m.ordinal()];
        boolean z13 = true;
        g gVar = this.f114776k;
        if (i14 == 1) {
            if (!gVar.f114788b) {
                gVar.e(',');
            }
            gVar.b();
            return;
        }
        if (i14 == 2) {
            if (gVar.f114788b) {
                this.f114782q = true;
                gVar.b();
                return;
            }
            if (i13 % 2 == 0) {
                gVar.e(',');
                gVar.b();
            } else {
                gVar.e(':');
                gVar.k();
                z13 = false;
            }
            this.f114782q = z13;
            return;
        }
        if (i14 == 3) {
            if (i13 == 0) {
                this.f114782q = true;
            }
            if (i13 == 1) {
                gVar.e(',');
                gVar.k();
                this.f114782q = false;
                return;
            }
            return;
        }
        if (!gVar.f114788b) {
            gVar.e(',');
        }
        gVar.b();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        ro2.c json = this.f114777l;
        Intrinsics.checkNotNullParameter(json, "json");
        n.d(descriptor, json);
        F(descriptor.f(i13));
        gVar.e(':');
        gVar.k();
    }

    @Override // kh2.p2, po2.b
    public final void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        i0 i0Var = this.f114778m;
        if (i0Var.end != 0) {
            g gVar = this.f114776k;
            gVar.l();
            gVar.c();
            gVar.e(i0Var.end);
        }
    }

    @Override // kh2.p2, po2.d
    public final po2.b b(oo2.g descriptor) {
        ro2.t tVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ro2.c cVar = this.f114777l;
        i0 o03 = f0.h.o0(descriptor, cVar);
        char c13 = o03.begin;
        g gVar = this.f114776k;
        if (c13 != 0) {
            gVar.e(c13);
            gVar.a();
        }
        if (this.f114783r != null) {
            gVar.b();
            String str = this.f114783r;
            Intrinsics.f(str);
            F(str);
            gVar.e(':');
            gVar.k();
            F(descriptor.i());
            this.f114783r = null;
        }
        if (this.f114778m == o03) {
            return this;
        }
        ro2.t[] tVarArr = this.f114779n;
        return (tVarArr == null || (tVar = tVarArr[o03.ordinal()]) == null) ? new e0(gVar, cVar, o03, tVarArr) : tVar;
    }

    @Override // po2.d
    public final to2.d c() {
        return this.f114780o;
    }

    @Override // ro2.t
    public final ro2.c d() {
        return this.f114777l;
    }

    @Override // ro2.t
    public final void e(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        k(ro2.r.f109037a, element);
    }

    @Override // kh2.p2, po2.d
    public final void f(double d2) {
        boolean z13 = this.f114782q;
        g gVar = this.f114776k;
        if (z13) {
            F(String.valueOf(d2));
        } else {
            gVar.f114787a.c(String.valueOf(d2));
        }
        if (this.f114781p.f109022k) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw j1.e(Double.valueOf(d2), gVar.f114787a.toString());
        }
    }

    @Override // kh2.p2, po2.d
    public final void g(byte b13) {
        if (this.f114782q) {
            F(String.valueOf((int) b13));
        } else {
            this.f114776k.d(b13);
        }
    }

    @Override // kh2.p2, po2.b
    public final boolean j(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f114781p.f109012a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1, oo2.o.f96906d) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r1.f109026o != ro2.a.NONE) goto L20;
     */
    @Override // kh2.p2, po2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(no2.h r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            ro2.c r0 = r4.f114777l
            ro2.k r1 = r0.f108976a
            boolean r2 = r1.f109020i
            if (r2 == 0) goto L12
            r5.c(r4, r6)
            goto L9d
        L12:
            boolean r2 = r5 instanceof qo2.b
            if (r2 == 0) goto L1d
            ro2.a r1 = r1.f109026o
            ro2.a r3 = ro2.a.NONE
            if (r1 == r3) goto L57
            goto L48
        L1d:
            ro2.a r1 = r1.f109026o
            int[] r3 = so2.z.f114839a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L57
            r3 = 2
            if (r1 == r3) goto L57
            r3 = 3
            if (r1 != r3) goto L51
            oo2.g r1 = r5.a()
            oo2.n r1 = r1.c()
            oo2.o r3 = oo2.o.f96903a
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r3 != 0) goto L48
            oo2.o r3 = oo2.o.f96906d
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r1 == 0) goto L57
        L48:
            oo2.g r1 = r5.a()
            java.lang.String r0 = kh2.r.w(r1, r0)
            goto L58
        L51:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L57:
            r0 = 0
        L58:
            if (r2 == 0) goto L96
            r1 = r5
            qo2.b r1 = (qo2.b) r1
            if (r6 == 0) goto L75
            no2.h r1 = kh2.r.G(r1, r4, r6)
            if (r0 == 0) goto L68
            kh2.r.i(r5, r1, r0)
        L68:
            oo2.g r5 = r1.a()
            oo2.n r5 = r5.c()
            kh2.r.v(r5)
            r5 = r1
            goto L96
        L75:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            oo2.g r5 = r5.a()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L96:
            if (r0 == 0) goto L9a
            r4.f114783r = r0
        L9a:
            r5.c(r4, r6)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.e0.k(no2.h, java.lang.Object):void");
    }

    @Override // kh2.p2, po2.d
    public final po2.d l(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean a13 = f0.a(descriptor);
        i0 i0Var = this.f114778m;
        ro2.c cVar = this.f114777l;
        g gVar = this.f114776k;
        if (a13) {
            if (!(gVar instanceof i)) {
                gVar = new i(gVar.f114787a, this.f114782q);
            }
            return new e0(gVar, cVar, i0Var, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (!descriptor.isInline() || !Intrinsics.d(descriptor, ro2.o.f109027a)) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return this;
        }
        if (!(gVar instanceof h)) {
            gVar = new h(gVar.f114787a, this.f114782q);
        }
        return new e0(gVar, cVar, i0Var, null);
    }

    @Override // kh2.p2, po2.d
    public final void n(oo2.g enumDescriptor, int i13) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.f(i13));
    }

    @Override // kh2.p2, po2.d
    public final void q(long j13) {
        if (this.f114782q) {
            F(String.valueOf(j13));
        } else {
            this.f114776k.g(j13);
        }
    }

    @Override // kh2.p2, po2.d
    public final void s() {
        this.f114776k.h("null");
    }

    @Override // kh2.p2, po2.d
    public final void t(short s13) {
        if (this.f114782q) {
            F(String.valueOf((int) s13));
        } else {
            this.f114776k.i(s13);
        }
    }

    @Override // kh2.p2, po2.d
    public final void w(boolean z13) {
        if (this.f114782q) {
            F(String.valueOf(z13));
        } else {
            this.f114776k.f114787a.c(String.valueOf(z13));
        }
    }

    @Override // kh2.p2, po2.d
    public final void x(float f13) {
        boolean z13 = this.f114782q;
        g gVar = this.f114776k;
        if (z13) {
            F(String.valueOf(f13));
        } else {
            gVar.f114787a.c(String.valueOf(f13));
        }
        if (this.f114781p.f109022k) {
            return;
        }
        if (Float.isInfinite(f13) || Float.isNaN(f13)) {
            throw j1.e(Float.valueOf(f13), gVar.f114787a.toString());
        }
    }

    @Override // kh2.p2, po2.d
    public final void z(char c13) {
        F(String.valueOf(c13));
    }
}
