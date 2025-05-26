package tt0;

import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f119100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f119101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f119102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f119103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f119104e;

    public e(k kVar, String str, yq0.k kVar2, f fVar, g gVar) {
        this.f119100a = fVar;
        this.f119101b = kVar2;
        this.f119102c = kVar;
        this.f119103d = str;
        this.f119104e = gVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f119101b.invoke();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f119102c.a();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        RuntimeException runtimeException = new RuntimeException("createCaptureSession() configuration failed");
        Log.e("CameraController", runtimeException.getMessage(), runtimeException);
        k kVar = this.f119102c;
        kVar.f(this.f119103d);
        kVar.f119138a.q(runtimeException, "createCaptureSession() session configuration failed", tb0.p.IDEA_PINS_CREATION);
        this.f119104e.invoke(runtimeException);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f119100a.invoke(session);
    }
}
