package v;

import a.ig;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class s1 extends s2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123659a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123660b;

    public s1(CameraCaptureSession.StateCallback stateCallback) {
        this.f123659a = 1;
        this.f123660b = stateCallback;
    }

    @Override // v.s2
    public final void a(v2 v2Var) {
        int i13 = this.f123659a;
        Object obj = this.f123660b;
        switch (i13) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onActive(v2Var.q().a());
                break;
            case 2:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).a(v2Var);
                }
                break;
        }
    }

    @Override // v.s2
    public final void b(v2 v2Var) {
        int i13 = this.f123659a;
        Object obj = this.f123660b;
        switch (i13) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onCaptureQueueEmpty(v2Var.q().a());
                break;
            case 2:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).b(v2Var);
                }
                break;
        }
    }

    @Override // v.s2
    public final void c(v2 v2Var) {
        int i13 = this.f123659a;
        Object obj = this.f123660b;
        switch (i13) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onClosed(v2Var.q().a());
                break;
            case 2:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).c(v2Var);
                }
                break;
        }
    }

    @Override // v.s2
    public final void d(v2 v2Var) {
        switch (this.f123659a) {
            case 0:
                synchronized (((t1) this.f123660b).f123661a) {
                    try {
                        switch (((t1) this.f123660b).f123669i) {
                            case UNINITIALIZED:
                            case INITIALIZED:
                            case GET_SURFACE:
                            case OPENED:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((t1) this.f123660b).f123669i);
                            case OPENING:
                            case CLOSED:
                            case RELEASING:
                                ((t1) this.f123660b).c();
                                break;
                            case RELEASED:
                                kh2.m0.p("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        kh2.m0.s("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((t1) this.f123660b).f123669i);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f123660b).onConfigureFailed(v2Var.q().a());
                return;
            default:
                Iterator it = ((List) this.f123660b).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).d(v2Var);
                }
                return;
        }
    }

    @Override // v.s2
    public final void e(v2 v2Var) {
        switch (this.f123659a) {
            case 0:
                synchronized (((t1) this.f123660b).f123661a) {
                    try {
                        switch (((t1) this.f123660b).f123669i) {
                            case UNINITIALIZED:
                            case INITIALIZED:
                            case GET_SURFACE:
                            case OPENED:
                            case RELEASED:
                                throw new IllegalStateException("onConfigured() should not be possible in state: " + ((t1) this.f123660b).f123669i);
                            case OPENING:
                                Object obj = this.f123660b;
                                ((t1) obj).f123669i = r1.OPENED;
                                ((t1) obj).f123665e = v2Var;
                                kh2.m0.p("CaptureSession", "Attempting to send capture request onConfigured");
                                Object obj2 = this.f123660b;
                                ((t1) obj2).i(((t1) obj2).f123666f);
                                t1 t1Var = (t1) this.f123660b;
                                t1Var.f123675o.g().d(new ig(t1Var, 10), l3.c.s());
                                break;
                            case CLOSED:
                                ((t1) this.f123660b).f123665e = v2Var;
                                break;
                            case RELEASING:
                                v2Var.j();
                                break;
                        }
                        kh2.m0.p("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + ((t1) this.f123660b).f123669i);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f123660b).onConfigured(v2Var.q().a());
                return;
            default:
                Iterator it = ((List) this.f123660b).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).e(v2Var);
                }
                return;
        }
    }

    @Override // v.s2
    public final void f(v2 v2Var) {
        switch (this.f123659a) {
            case 0:
                synchronized (((t1) this.f123660b).f123661a) {
                    try {
                        if (((t1) this.f123660b).f123669i.ordinal() == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: " + ((t1) this.f123660b).f123669i);
                        }
                        kh2.m0.p("CaptureSession", "CameraCaptureSession.onReady() " + ((t1) this.f123660b).f123669i);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f123660b).onReady(v2Var.q().a());
                return;
            default:
                Iterator it = ((List) this.f123660b).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).f(v2Var);
                }
                return;
        }
    }

    @Override // v.s2
    public final void g(v2 v2Var) {
        switch (this.f123659a) {
            case 0:
                synchronized (((t1) this.f123660b).f123661a) {
                    try {
                        if (((t1) this.f123660b).f123669i == r1.UNINITIALIZED) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((t1) this.f123660b).f123669i);
                        }
                        kh2.m0.p("CaptureSession", "onSessionFinished()");
                        ((t1) this.f123660b).c();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((List) this.f123660b).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).g(v2Var);
                }
                return;
        }
    }

    @Override // v.s2
    public final void h(v2 v2Var, Surface surface) {
        int i13 = this.f123659a;
        Object obj = this.f123660b;
        switch (i13) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onSurfacePrepared(v2Var.q().a(), surface);
                break;
            case 2:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((s2) it.next()).h(v2Var, surface);
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s1(java.util.List r2, int r3) {
        /*
            r1 = this;
            r1.f123659a = r3
            r0 = 2
            if (r3 == r0) goto L2a
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L11
            v.k1 r2 = new v.k1
            r2.<init>()
            goto L26
        L11:
            int r3 = r2.size()
            r0 = 1
            if (r3 != r0) goto L20
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r2
            goto L26
        L20:
            v.j1 r3 = new v.j1
            r3.<init>(r2)
            r2 = r3
        L26:
            r1.<init>(r2)
            return
        L2a:
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f123660b = r3
            r3.addAll(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s1.<init>(java.util.List, int):void");
    }

    public s1(t1 t1Var) {
        this.f123659a = 0;
        this.f123660b = t1Var;
    }
}
