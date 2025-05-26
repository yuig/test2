package t3;

import android.view.Choreographer;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class o1 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f116107a;

    public o1(p1 p1Var) {
        this.f116107a = p1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j13) {
        this.f116107a.f116130d.removeCallbacks(this);
        p1.o(this.f116107a);
        p1 p1Var = this.f116107a;
        synchronized (p1Var.f116131e) {
            if (p1Var.f116136j) {
                p1Var.f116136j = false;
                List list = p1Var.f116133g;
                p1Var.f116133g = p1Var.f116134h;
                p1Var.f116134h = list;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((Choreographer.FrameCallback) list.get(i13)).doFrame(j13);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1.o(this.f116107a);
        p1 p1Var = this.f116107a;
        synchronized (p1Var.f116131e) {
            try {
                if (p1Var.f116133g.isEmpty()) {
                    p1Var.f116129c.removeFrameCallback(this);
                    p1Var.f116136j = false;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
