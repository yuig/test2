package l7;

import a7.l1;
import a7.m1;
import android.content.Context;
import android.opengl.EGLDisplay;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class w implements m1 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f81892u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f81893a;

    /* renamed from: b, reason: collision with root package name */
    public final sp2.i f81894b;

    /* renamed from: d, reason: collision with root package name */
    public final EGLDisplay f81896d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f81897e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f81898f;

    /* renamed from: g, reason: collision with root package name */
    public final l1 f81899g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f81900h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f81901i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f81902j;

    /* renamed from: l, reason: collision with root package name */
    public final a7.o f81904l;

    /* renamed from: m, reason: collision with root package name */
    public v f81905m;

    /* renamed from: n, reason: collision with root package name */
    public v f81906n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f81907o;

    /* renamed from: r, reason: collision with root package name */
    public final a7.j f81910r;

    /* renamed from: s, reason: collision with root package name */
    public final a7.l f81911s;

    /* renamed from: t, reason: collision with root package name */
    public volatile a7.s f81912t;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81895c = true;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f81908p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final Object f81909q = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f81903k = new ArrayList();

    static {
        a7.j0.a("media3.effect");
    }

    public w(Context context, sp2.i iVar, EGLDisplay eGLDisplay, l0 l0Var, z0 z0Var, l1 l1Var, Executor executor, c0 c0Var, boolean z13, a7.j jVar, a7.l lVar) {
        this.f81893a = context;
        this.f81894b = iVar;
        this.f81896d = eGLDisplay;
        this.f81897e = l0Var;
        this.f81898f = z0Var;
        this.f81899g = l1Var;
        this.f81900h = executor;
        this.f81901i = z13;
        this.f81910r = jVar;
        this.f81911s = lVar;
        this.f81902j = c0Var;
        a7.o oVar = new a7.o(1);
        this.f81904l = oVar;
        oVar.h();
        r rVar = new r(this, executor, l1Var);
        c0Var.f81747h.g();
        c0Var.f81760u = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0363  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final l7.v r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.w.a(l7.v, boolean):void");
    }

    public final void b(a7.x0 x0Var) {
        c0 c0Var = this.f81902j;
        c0Var.getClass();
        try {
            z0 z0Var = c0Var.f81747h;
            d dVar = new d(2, c0Var, x0Var);
            if (z0Var.c()) {
                try {
                    dVar.run();
                } catch (Exception e13) {
                    z0Var.b(e13);
                }
            } else {
                try {
                    z0Var.f81919b.submit(new w2.c(13, z0Var, dVar)).get(500L, TimeUnit.MILLISECONDS);
                } catch (RuntimeException | ExecutionException | TimeoutException e14) {
                    z0Var.b(e14);
                }
            }
        } catch (InterruptedException e15) {
            Thread.currentThread().interrupt();
            c0Var.f81748i.execute(new w2.c(9, c0Var, e15));
        }
    }

    public final void c() {
        synchronized (this.f81909q) {
            try {
                v vVar = this.f81906n;
                if (vVar != null) {
                    this.f81898f.e(new o(this, vVar, 1), true);
                    this.f81906n = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
