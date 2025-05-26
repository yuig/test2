package sf2;

import kh2.a0;
import kh2.b3;
import kh2.d0;
import kh2.d1;
import kh2.d3;
import kh2.h3;
import kh2.i1;
import kh2.j2;
import kh2.l3;
import kh2.m;
import kh2.o;
import kh2.o0;
import kh2.r0;
import kh2.v;
import kh2.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112805i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f112806j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j2 j2Var, int i13) {
        super(0);
        this.f112805i = i13;
        this.f112806j = j2Var;
    }

    public final di2.c b() {
        int i13 = this.f112805i;
        j2 j2Var = this.f112806j;
        switch (i13) {
            case 1:
                break;
            case 5:
                break;
            case 13:
                break;
            case 16:
                break;
            case 20:
                break;
        }
        return ((b3) j2Var.l()).a();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f112805i;
        j2 j2Var = this.f112806j;
        switch (i13) {
            case 0:
                z0 z0Var = (z0) j2Var.h();
                return z0Var.f79767c.b(z0.f79764n[1]);
            case 1:
                return b();
            case 2:
                a0 a0Var = (a0) j2Var.e();
                return (jg2.a) a0Var.f79423e.a(a0Var, a0.f79418i[4]);
            case 3:
                a0 a0Var2 = (a0) j2Var.e();
                return (zf2.e) a0Var2.f79425g.a(a0Var2, a0.f79418i[6]);
            case 4:
                switch (i13) {
                    case 4:
                        return ((m) j2Var.c()).b();
                    default:
                        return ((m) j2Var.c()).b();
                }
            case 5:
                return b();
            case 6:
                z0 z0Var2 = (z0) j2Var.h();
                return (dg2.m) z0Var2.f79771g.b(z0.f79764n[5]).f122121f;
            case 7:
                a0 a0Var3 = (a0) j2Var.e();
                return (ng2.e) a0Var3.f79419a.a(a0Var3, a0.f79418i[0]);
            case 8:
                i1 i1Var = (i1) j2Var.i();
                return (nh2.e) i1Var.f79538g.a(i1Var, i1.f79531h[6]);
            case 9:
                return ((i1) j2Var.i()).a();
            case 10:
                return ((d1) j2Var.f79550b).f79456b;
            case 11:
                z0 z0Var3 = (z0) j2Var.h();
                return (dg2.e) z0Var3.f79769e.b(z0.f79764n[3]).f122121f;
            case 12:
                return ((d1) j2Var.f79550b).a();
            case 13:
                return b();
            case 14:
                switch (i13) {
                    case 4:
                        return ((m) j2Var.c()).b();
                    default:
                        return ((m) j2Var.c()).b();
                }
            case 15:
                i1 i1Var2 = (i1) j2Var.i();
                return (rh2.j) i1Var2.f79535d.a(i1Var2, i1.f79531h[3]);
            case 16:
                return b();
            case 17:
                kh2.s sVar = j2Var.L;
                if (sVar == null) {
                    Intrinsics.r("crashModule");
                    throw null;
                }
                v vVar = (v) sVar;
                return (xg2.c) vVar.f79722c.a(vVar, v.f79719d[2]);
            case 18:
                return ((kh2.c) j2Var.a()).a();
            case 19:
                return ((r0) j2Var.g()).e();
            case 20:
                return b();
            case 21:
                return ((r0) j2Var.g()).f();
            case 22:
                r0 r0Var = (r0) j2Var.g();
                return (mg2.b) r0Var.f79673e.a(r0Var, r0.f79668m[2]);
            case 23:
                return ((sg2.b) ((m) j2Var.c()).b()).f112890o;
            case 24:
                return j2Var.h();
            case 25:
                return b();
            case 26:
                kl2.a aVar = j2Var.f79558j;
                kh2.k c13 = j2Var.c();
                o d2 = j2Var.d();
                l3 m13 = j2Var.m();
                h3 h3Var = j2Var.f79573y;
                if (h3Var == null) {
                    Intrinsics.r("systemServiceModule");
                    throw null;
                }
                kh2.a a13 = j2Var.a();
                d3 d3Var = j2Var.A;
                if (d3Var == null) {
                    Intrinsics.r("storageModule");
                    throw null;
                }
                return (o0) aVar.q(j2Var.f79550b, c13, j2Var.f79551c, d2, m13, h3Var, a13, d3Var, kh2.g.f79501o, kh2.g.f79502p);
            case 27:
                return ((r0) j2Var.g()).d();
            case 28:
                return (kh2.e) j2Var.f79563o.invoke(j2Var.f79550b, ((m) j2Var.c()).b(), j2Var.m());
            default:
                return (d0) j2Var.f79560l.invoke(j2Var.f79550b, j2Var.m());
        }
    }
}
