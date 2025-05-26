package i2;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class k0 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f71144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f71145b;

    public k0(ao2.o oVar, Function1 function1) {
        this.f71144a = oVar;
        this.f71145b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j13) {
        Object m13;
        l0 l0Var = l0.f71154a;
        Function1 function1 = this.f71145b;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = function1.invoke(Long.valueOf(j13));
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        this.f71144a.resumeWith(m13);
    }
}
