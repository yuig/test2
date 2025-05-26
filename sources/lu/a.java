package lu;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f84843j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f84844k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f84845l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f84846m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f84847n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f84848o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f84849p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f84850q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f84851r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f84852s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f84853t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f84854u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f84855v = new a(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a f84856w = new a(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a f84857x = new a(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f84858i = i13;
    }

    public final rm1.d b(rm1.d icon) {
        switch (this.f84858i) {
            case 8:
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(rm1.q.PLAY, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(rm1.q.PAUSE, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f84858i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
        }
    }

    public final void f(Throwable th3) {
        int i13 = this.f84858i;
        m60.f0 f0Var = vb0.j.f125466a;
        switch (i13) {
            case 2:
                Intrinsics.f(th3);
                f0Var.J(th3, tb0.p.CLOSEUP);
                break;
            case 3:
                Intrinsics.f(th3);
                f0Var.J(th3, tb0.p.CLOSEUP);
                break;
            case 7:
                Intrinsics.f(th3);
                f0Var.J(th3, tb0.p.CLOSEUP);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84858i) {
            case 0:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(fm1.c.GONE);
                break;
            case 1:
                break;
            case 2:
                f((Throwable) obj);
                break;
            case 3:
                f((Throwable) obj);
                break;
            case 4:
                f((Throwable) obj);
                break;
            case 5:
                break;
            case 6:
                f((Throwable) obj);
                break;
            case 7:
                f((Throwable) obj);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                f((Throwable) obj);
                break;
            case 13:
                f((Throwable) obj);
                break;
            default:
                f((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
