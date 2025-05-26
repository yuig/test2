package a8;

import androidx.recyclerview.widget.e3;
import androidx.recyclerview.widget.f3;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class t0 implements d, f3 {

    /* renamed from: a, reason: collision with root package name */
    public long f1462a;

    public t0(int i13) {
        if (i13 != 2) {
            return;
        }
        this.f1462a = 0L;
    }

    @Override // a8.d
    public e a(int i13) {
        s0 s0Var = new s0(this.f1462a);
        s0 s0Var2 = new s0(this.f1462a);
        try {
            s0Var.f1458a.d(ph.a.M(0));
            int b13 = s0Var.b();
            boolean z13 = b13 % 2 == 0;
            s0Var2.f1458a.d(ph.a.M(z13 ? b13 + 1 : b13 - 1));
            if (z13) {
                s0Var.f1459b = s0Var2;
                return s0Var;
            }
            s0Var2.f1459b = s0Var;
            return s0Var2;
        } catch (IOException e13) {
            lb.l0.H(s0Var);
            lb.l0.H(s0Var2);
            throw e13;
        }
    }

    @Override // a8.d
    public d b() {
        return new r0(this.f1462a);
    }

    @Override // androidx.recyclerview.widget.f3
    public e3 c() {
        return new sp2.i(this);
    }

    public long d() {
        return Math.max(0L, this.f1462a - System.nanoTime());
    }

    public t0(long j13) {
        this.f1462a = j13;
    }
}
