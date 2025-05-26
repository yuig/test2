package y0;

import kh2.m0;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f136354b;

    public /* synthetic */ q(c0 c0Var, int i13) {
        this.f136353a = i13;
        this.f136354b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f136353a;
        int i14 = 0;
        c0 c0Var = this.f136354b;
        switch (i13) {
            case 0:
                switch (c0Var.f136296t.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        c0Var.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        c0Var.i(y.PENDING_RELEASE);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + c0Var.f136296t);
                }
            case 1:
                c0Var.B = true;
                if (c0Var.A) {
                    c0Var.f136281e.stop();
                    c0Var.h();
                    return;
                }
                return;
            case 2:
                g0.m.a(c0Var.a(), new t(c0Var, i14), c0Var.f136284h);
                return;
            case 3:
                c0Var.f136284h.execute(new q(c0Var, 4));
                return;
            case 4:
                if (c0Var.f136299w) {
                    m0.X0(c0Var.f136277a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    c0Var.f136300x = null;
                    c0Var.j();
                    c0Var.f136299w = false;
                    return;
                }
                return;
            default:
                int ordinal = c0Var.f136296t.ordinal();
                if (ordinal == 1) {
                    c0Var.g();
                    return;
                } else {
                    if (ordinal == 6 || ordinal == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
        }
    }
}
