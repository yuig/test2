package r0;

import android.os.SystemClock;
import androidx.camera.core.impl.i2;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class q0 extends androidx.camera.core.impl.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f105625a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f105626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r4.i f105627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2 f105628d;

    public q0(AtomicBoolean atomicBoolean, r4.i iVar, i2 i2Var) {
        this.f105626b = atomicBoolean;
        this.f105627c = iVar;
        this.f105628d = i2Var;
    }

    @Override // androidx.camera.core.impl.n
    public final void b(int i13, androidx.camera.core.impl.z zVar) {
        Object obj;
        if (this.f105625a) {
            this.f105625a = false;
            kh2.m0.p("VideoCapture", "cameraCaptureResult timestampNs = " + zVar.h() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.f105626b;
        if (atomicBoolean.get() || (obj = zVar.f().f16977a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int intValue = ((Integer) obj).intValue();
        r4.i iVar = this.f105627c;
        if (intValue == iVar.hashCode() && iVar.b(null) && !atomicBoolean.getAndSet(true)) {
            l3.c.H0().execute(new l0.e(10, this, this.f105628d));
        }
    }
}
