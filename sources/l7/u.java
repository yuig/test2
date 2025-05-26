package l7;

import a7.k1;
import a7.l1;
import a7.m1;
import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class u implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81880c;

    public u(boolean z13, boolean z14, boolean z15) {
        this.f81878a = z13;
        this.f81879b = z14;
        this.f81880c = z15;
    }

    @Override // a7.k1
    public final m1 a(final Context context, final a7.l lVar, final a7.j jVar, final boolean z13, final com.google.common.util.concurrent.r rVar, final c0.x0 x0Var) {
        int i13 = d7.n0.f53866a;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new h6.a("Effect:DefaultVideoFrameProcessor:GlThread", 1));
        final z0 z0Var = new z0(newSingleThreadExecutor, new n(x0Var, 2));
        final sp2.i iVar = new sp2.i(13, (Object) null);
        try {
            return (w) newSingleThreadExecutor.submit(new Callable() { // from class: l7.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Pair create;
                    sp2.i iVar2 = iVar;
                    u uVar = u.this;
                    uVar.getClass();
                    int i14 = w.f81892u;
                    EGLDisplay o13 = d7.n.o();
                    a7.j jVar2 = jVar;
                    int[] iArr = a7.j.g(jVar2) ? d7.n.f53862b : d7.n.f53861a;
                    try {
                        EGLContext i15 = d7.n.i((EGLContext) iVar2.f114928b, o13, 3, iArr);
                        ((List) iVar2.f114929c).add(i15);
                        create = Pair.create(i15, d7.n.j(i15, o13));
                    } catch (GlUtil$GlException unused) {
                        EGLContext i16 = d7.n.i((EGLContext) iVar2.f114928b, o13, 2, iArr);
                        ((List) iVar2.f114929c).add(i16);
                        create = Pair.create(i16, d7.n.j(i16, o13));
                    }
                    Pair pair = create;
                    k5.a a13 = jVar2.a();
                    a13.f78309c = 1;
                    a13.f78312f = null;
                    a7.j a14 = a7.j.g(jVar2) ? a13.a() : jVar2;
                    l1 l1Var = x0Var;
                    Objects.requireNonNull(l1Var);
                    n nVar = new n(l1Var, 0);
                    boolean z14 = uVar.f81879b;
                    boolean z15 = uVar.f81880c;
                    Context context2 = context;
                    z0 z0Var2 = z0Var;
                    Executor executor = rVar;
                    l0 l0Var = new l0(context2, a14, iVar2, z0Var2, executor, nVar, uVar.f81878a, z14, z15);
                    EGLContext eGLContext = (EGLContext) pair.first;
                    EGLSurface eGLSurface = (EGLSurface) pair.second;
                    boolean z16 = z13;
                    return new w(context2, iVar2, o13, l0Var, z0Var2, l1Var, executor, new c0(context2, o13, eGLContext, eGLSurface, jVar2, z0Var2, executor, l1Var, z16), z16, jVar2, lVar);
                }
            }).get();
        } catch (InterruptedException e13) {
            Thread.currentThread().interrupt();
            throw new VideoFrameProcessingException(e13);
        } catch (ExecutionException e14) {
            throw new VideoFrameProcessingException(e14);
        }
    }
}
