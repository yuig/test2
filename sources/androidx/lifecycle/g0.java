package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18621a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18622b;

    /* renamed from: c, reason: collision with root package name */
    public int f18623c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f18624d;

    public g0(h0 h0Var, m0 m0Var) {
        this.f18624d = h0Var;
        this.f18621a = m0Var;
    }

    public final void a(boolean z13) {
        if (z13 == this.f18622b) {
            return;
        }
        this.f18622b = z13;
        int i13 = z13 ? 1 : -1;
        h0 h0Var = this.f18624d;
        int i14 = h0Var.f18633c;
        h0Var.f18633c = i13 + i14;
        if (!h0Var.f18634d) {
            h0Var.f18634d = true;
            while (true) {
                try {
                    int i15 = h0Var.f18633c;
                    if (i14 == i15) {
                        break;
                    }
                    boolean z14 = i14 == 0 && i15 > 0;
                    boolean z15 = i14 > 0 && i15 == 0;
                    if (z14) {
                        h0Var.g();
                    } else if (z15) {
                        h0Var.h();
                    }
                    i14 = i15;
                } catch (Throwable th3) {
                    h0Var.f18634d = false;
                    throw th3;
                }
            }
            h0Var.f18634d = false;
        }
        if (this.f18622b) {
            h0Var.c(this);
        }
    }

    public void b() {
    }

    public boolean d(z zVar) {
        return false;
    }

    public abstract boolean e();
}
