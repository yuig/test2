package y3;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import ao2.g2;
import ao2.k2;
import java.util.function.Consumer;
import kh2.n3;
import y1.s;
import z3.q;

/* loaded from: classes2.dex */
public final class g implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final q f136712a;

    /* renamed from: b, reason: collision with root package name */
    public final n4.i f136713b;

    /* renamed from: c, reason: collision with root package name */
    public final a f136714c;

    /* renamed from: d, reason: collision with root package name */
    public final ho2.c f136715d;

    /* renamed from: e, reason: collision with root package name */
    public final k f136716e;

    public g(q qVar, n4.i iVar, ho2.c cVar, a aVar) {
        this.f136712a = qVar;
        this.f136713b = iVar;
        this.f136714c = aVar;
        this.f136715d = new ho2.c(cVar.getCoroutineContext().plus(i.f136719a));
        this.f136716e = new k(iVar.f89185d - iVar.f89183b, new f(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(y3.g r10, android.view.ScrollCaptureSession r11, n4.i r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.g.a(y3.g, android.view.ScrollCaptureSession, n4.i, bl2.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        kotlin.jvm.internal.j.z(this.f136715d, g2.f20157b, null, new b(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        k2 z13 = kotlin.jvm.internal.j.z(this.f136715d, null, null, new c(this, scrollCaptureSession, rect, consumer, null), 3);
        z13.invokeOnCompletion(new h(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new s(z13, 2));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(n3.M0(this.f136713b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f136716e.f136726c = 0.0f;
        m mVar = (m) this.f136714c;
        mVar.f136728a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
