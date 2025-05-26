package s3;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f110723a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f110725c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f110726d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f110728f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110729g;

    /* renamed from: h, reason: collision with root package name */
    public b f110730h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f110724b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f110731i = new HashMap();

    public a(b bVar) {
        this.f110723a = bVar;
    }

    public static final void a(a aVar, q3.a aVar2, int i13, q1 q1Var) {
        aVar.getClass();
        float f13 = i13;
        long d2 = com.bumptech.glide.c.d(f13, f13);
        while (true) {
            d2 = aVar.b(q1Var, d2);
            q1Var = q1Var.f110901o;
            Intrinsics.f(q1Var);
            if (Intrinsics.d(q1Var, aVar.f110723a.F())) {
                break;
            } else if (aVar.c(q1Var).containsKey(aVar2)) {
                float d13 = aVar.d(q1Var, aVar2);
                d2 = com.bumptech.glide.c.d(d13, d13);
            }
        }
        int round = Math.round(aVar2 instanceof q3.q ? a3.c.e(d2) : a3.c.d(d2));
        HashMap hashMap = aVar.f110731i;
        if (hashMap.containsKey(aVar2)) {
            round = q3.d.a(aVar2, ((Number) kotlin.collections.z0.e(aVar2, hashMap)).intValue(), round);
        }
        hashMap.put(aVar2, Integer.valueOf(round));
    }

    public abstract long b(q1 q1Var, long j13);

    public abstract Map c(q1 q1Var);

    public abstract int d(q1 q1Var, q3.a aVar);

    public final boolean e() {
        return this.f110725c || this.f110727e || this.f110728f || this.f110729g;
    }

    public final boolean f() {
        i();
        return this.f110730h != null;
    }

    public final void g() {
        this.f110724b = true;
        b bVar = this.f110723a;
        b f13 = bVar.f();
        if (f13 == null) {
            return;
        }
        if (this.f110725c) {
            f13.d0();
        } else if (this.f110727e || this.f110726d) {
            f13.requestLayout();
        }
        if (this.f110728f) {
            bVar.d0();
        }
        if (this.f110729g) {
            bVar.requestLayout();
        }
        f13.c().g();
    }

    public final void h() {
        HashMap hashMap = this.f110731i;
        hashMap.clear();
        q0.e eVar = new q0.e(this, 27);
        b bVar = this.f110723a;
        bVar.Z(eVar);
        hashMap.putAll(c(bVar.F()));
        this.f110724b = false;
    }

    public final void i() {
        a c13;
        a c14;
        boolean e13 = e();
        b bVar = this.f110723a;
        if (!e13) {
            b f13 = bVar.f();
            if (f13 == null) {
                return;
            }
            bVar = f13.c().f110730h;
            if (bVar == null || !bVar.c().e()) {
                b bVar2 = this.f110730h;
                if (bVar2 == null || bVar2.c().e()) {
                    return;
                }
                b f14 = bVar2.f();
                if (f14 != null && (c14 = f14.c()) != null) {
                    c14.i();
                }
                b f15 = bVar2.f();
                bVar = (f15 == null || (c13 = f15.c()) == null) ? null : c13.f110730h;
            }
        }
        this.f110730h = bVar;
    }
}
