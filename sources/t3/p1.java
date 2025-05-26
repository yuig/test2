package t3;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class p1 extends ao2.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final xk2.v f116127m = xk2.m.b(e1.f115956p);

    /* renamed from: n, reason: collision with root package name */
    public static final n1 f116128n = new n1(0);

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f116129c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f116130d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f116135i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f116136j;

    /* renamed from: l, reason: collision with root package name */
    public final r1 f116138l;

    /* renamed from: e, reason: collision with root package name */
    public final Object f116131e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.collections.v f116132f = new kotlin.collections.v();

    /* renamed from: g, reason: collision with root package name */
    public List f116133g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public List f116134h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final o1 f116137k = new o1(this);

    public p1(Choreographer choreographer, Handler handler) {
        this.f116129c = choreographer;
        this.f116130d = handler;
        this.f116138l = new r1(choreographer, this);
    }

    public static final void o(p1 p1Var) {
        Runnable runnable;
        boolean z13;
        do {
            synchronized (p1Var.f116131e) {
                kotlin.collections.v vVar = p1Var.f116132f;
                runnable = (Runnable) (vVar.isEmpty() ? null : vVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (p1Var.f116131e) {
                    kotlin.collections.v vVar2 = p1Var.f116132f;
                    runnable = (Runnable) (vVar2.isEmpty() ? null : vVar2.removeFirst());
                }
            }
            synchronized (p1Var.f116131e) {
                if (p1Var.f116132f.isEmpty()) {
                    z13 = false;
                    p1Var.f116135i = false;
                } else {
                    z13 = true;
                }
            }
        } while (z13);
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f116131e) {
            try {
                this.f116132f.addLast(runnable);
                if (!this.f116135i) {
                    this.f116135i = true;
                    this.f116130d.post(this.f116137k);
                    if (!this.f116136j) {
                        this.f116136j = true;
                        this.f116129c.postFrameCallback(this.f116137k);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
