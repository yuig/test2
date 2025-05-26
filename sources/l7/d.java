package l7;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81767c;

    public /* synthetic */ d(int i13, Object obj, Object obj2) {
        this.f81765a = i13;
        this.f81766b = obj;
        this.f81767c = obj2;
    }

    @Override // l7.y0
    public final void run() {
        switch (this.f81765a) {
            case 0:
                ((f) this.f81766b).f81775a.f((a7.t) this.f81767c);
                return;
            case 1:
                a0 a0Var = (a0) this.f81766b;
                i0 i0Var = (i0) this.f81767c;
                a0Var.f81721m = 0;
                a0Var.f81713e = (x) i0Var;
                return;
            case 2:
                c0 c0Var = (c0) this.f81766b;
                a7.x0 x0Var = (a7.x0) this.f81767c;
                if (Objects.equals(c0Var.f81763x, x0Var)) {
                    return;
                }
                a7.x0 x0Var2 = c0Var.f81763x;
                if (x0Var2 != null && (x0Var == null || !x0Var2.f1240a.equals(x0Var.f1240a))) {
                    EGLDisplay eGLDisplay = c0Var.f81743d;
                    if (c0Var.f81764y != null) {
                        try {
                            try {
                                EGLContext eGLContext = c0Var.f81744e;
                                EGLSurface eGLSurface = c0Var.f81745f;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                                d7.n.c("Error making context current");
                                d7.n.n(0, 1, 1);
                                d7.n.m(eGLDisplay, c0Var.f81764y);
                            } catch (GlUtil$GlException e13) {
                                c0Var.f81748i.execute(new w2.c(10, c0Var, e13));
                            }
                        } finally {
                            c0Var.f81764y = null;
                        }
                    }
                }
                a7.x0 x0Var3 = c0Var.f81763x;
                c0Var.f81762w = x0Var3 == null || x0Var == null || x0Var3.f1241b != x0Var.f1241b || x0Var3.f1242c != x0Var.f1242c;
                c0Var.f81763x = x0Var;
                return;
            case 3:
                d0 d0Var = (d0) this.f81766b;
                Pair pair = (Pair) this.f81767c;
                d0Var.getClass();
                d0Var.f81769b.b(d0Var.f81768a, (a7.t) pair.first, ((Long) pair.second).longValue());
                return;
            case 4:
                ((t0) this.f81766b).getClass();
                throw null;
            default:
                z0 z0Var = (z0) this.f81766b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f81767c;
                synchronized (z0Var.f81922e) {
                    z0Var.f81924g = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
