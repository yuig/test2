package kg1;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture.OnFrameAvailableListener f79404a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTexture f79405b;

    public c(int i13, Handler handler, boolean z13) {
        Unit unit;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i13, z13);
        this.f79405b = surfaceTexture;
        if (handler != null) {
            surfaceTexture.setOnFrameAvailableListener(this, handler);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            surfaceTexture.setOnFrameAvailableListener(this);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f79404a;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(this.f79405b);
        }
    }
}
