package t3;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q1 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f116169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f116170b;

    public q1(ao2.o oVar, r1 r1Var, Function1 function1) {
        this.f116169a = oVar;
        this.f116170b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j13) {
        Object m13;
        Function1 function1 = this.f116170b;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = function1.invoke(Long.valueOf(j13));
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        this.f116169a.resumeWith(m13);
    }
}
