package df;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a */
    public final int f54871a;

    /* renamed from: b */
    public final Executor f54872b;

    /* renamed from: c */
    public final ReentrantLock f54873c;

    /* renamed from: d */
    public u1 f54874d;

    /* renamed from: e */
    public u1 f54875e;

    /* renamed from: f */
    public int f54876f;

    public v1(int i13) {
        Executor executor = le.v.d();
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f54871a = i13;
        this.f54872b = executor;
        this.f54873c = new ReentrantLock();
    }

    public static u1 a(v1 v1Var, Runnable callback) {
        v1Var.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        u1 u1Var = new u1(v1Var, callback);
        ReentrantLock reentrantLock = v1Var.f54873c;
        reentrantLock.lock();
        try {
            v1Var.f54874d = u1Var.a(v1Var.f54874d, true);
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
            v1Var.b(null);
            return u1Var;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void b(u1 u1Var) {
        u1 u1Var2;
        ReentrantLock reentrantLock = this.f54873c;
        reentrantLock.lock();
        if (u1Var != null) {
            this.f54875e = u1Var.b(this.f54875e);
            this.f54876f--;
        }
        if (this.f54876f < this.f54871a) {
            u1Var2 = this.f54874d;
            if (u1Var2 != null) {
                this.f54874d = u1Var2.b(u1Var2);
                this.f54875e = u1Var2.a(this.f54875e, false);
                this.f54876f++;
                u1Var2.f54868d = true;
            }
        } else {
            u1Var2 = null;
        }
        reentrantLock.unlock();
        if (u1Var2 != null) {
            this.f54872b.execute(new androidx.media3.ui.z(18, u1Var2, this));
        }
    }
}
