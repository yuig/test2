package s3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final s0 f110916j = new s0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final s0 f110917k = new s0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final s0 f110918l = new s0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final s0 f110919m = new s0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final s0 f110920n = new s0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final s0 f110921o = new s0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final s0 f110922p = new s0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final s0 f110923q = new s0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final s0 f110924r = new s0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final s0 f110925s = new s0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final s0 f110926t = new s0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final s0 f110927u = new s0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final s0 f110928v = new s0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final s0 f110929w = new s0(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i13) {
        super(1);
        this.f110930i = i13;
    }

    public final void b(b bVar) {
        switch (this.f110930i) {
            case 0:
                bVar.c().f110726d = false;
                break;
            case 1:
                bVar.c().f110727e = bVar.c().f110726d;
                break;
            default:
                bVar.c().f110725c = false;
                break;
        }
    }

    public final void e(k0 k0Var) {
        switch (this.f110930i) {
            case 7:
                if (k0Var.G()) {
                    k0Var.W(false);
                    break;
                }
                break;
            case 8:
                if (k0Var.G()) {
                    k0Var.W(false);
                    break;
                }
                break;
            case 9:
                if (k0Var.G()) {
                    k0Var.U(false);
                    break;
                }
                break;
            case 10:
                if (k0Var.G()) {
                    k0Var.U(false);
                    break;
                }
                break;
            case 11:
                if (k0Var.G()) {
                    k0.V(k0Var, false, 7);
                    break;
                }
                break;
            case 12:
                if (k0Var.G()) {
                    k0.Y(k0Var, false, 7);
                    break;
                }
                break;
            default:
                if (k0Var.G()) {
                    k0Var.E();
                    break;
                }
                break;
        }
    }

    public final void f(q1 q1Var) {
        switch (this.f110930i) {
            case 4:
                y1 y1Var = q1Var.E;
                if (y1Var != null) {
                    y1Var.invalidate();
                    break;
                }
                break;
            default:
                if (q1Var.X()) {
                    z zVar = q1Var.A;
                    if (zVar != null) {
                        z zVar2 = q1.H;
                        zVar2.getClass();
                        zVar2.f111003a = zVar.f111003a;
                        zVar2.f111004b = zVar.f111004b;
                        zVar2.f111005c = zVar.f111005c;
                        zVar2.f111006d = zVar.f111006d;
                        zVar2.f111007e = zVar.f111007e;
                        zVar2.f111008f = zVar.f111008f;
                        zVar2.f111009g = zVar.f111009g;
                        zVar2.f111010h = zVar.f111010h;
                        zVar2.f111011i = zVar.f111011i;
                        q1Var.u1(true);
                        if (zVar2.f111003a != zVar.f111003a || zVar2.f111004b != zVar.f111004b || zVar2.f111005c != zVar.f111005c || zVar2.f111006d != zVar.f111006d || zVar2.f111007e != zVar.f111007e || zVar2.f111008f != zVar.f111008f || zVar2.f111009g != zVar.f111009g || zVar2.f111010h != zVar.f111010h || !b3.b1.a(zVar2.f111011i, zVar.f111011i)) {
                            k0 k0Var = q1Var.f110898l;
                            v0 v0Var = k0Var.f110838z;
                            if (v0Var.f110980n > 0) {
                                if (v0Var.f110979m || v0Var.f110978l) {
                                    k0Var.W(false);
                                }
                                v0Var.f110984r.B0();
                            }
                            a2 a2Var = k0Var.f110821i;
                            if (a2Var != null) {
                                t3.c0 c0Var = (t3.c0) a2Var;
                                c0Var.G.f110761e.f110998a.b(k0Var);
                                k0Var.H = true;
                                c0Var.F(null);
                                break;
                            }
                        }
                    } else {
                        q1Var.u1(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110930i) {
            case 0:
                b((b) obj);
                break;
            case 1:
                b((b) obj);
                break;
            case 2:
                b((b) obj);
                break;
            case 3:
                e2 e2Var = (e2) obj;
                if (e2Var.X()) {
                    e2Var.f110772b.z0(e2Var);
                }
                break;
            case 4:
                f((q1) obj);
                break;
            case 5:
                f((q1) obj);
                break;
            case 6:
                v1 v1Var = (v1) obj;
                if (v1Var.X()) {
                    v1Var.f110988a.P();
                }
                break;
            case 7:
                e((k0) obj);
                break;
            case 8:
                e((k0) obj);
                break;
            case 9:
                e((k0) obj);
                break;
            case 10:
                e((k0) obj);
                break;
            case 11:
                e((k0) obj);
                break;
            case 12:
                e((k0) obj);
                break;
            default:
                e((k0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
