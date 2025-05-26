package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements c3 {

    /* renamed from: a, reason: collision with root package name */
    public final Range f123336a;

    /* renamed from: c, reason: collision with root package name */
    public r4.i f123338c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f123340e;

    /* renamed from: b, reason: collision with root package name */
    public float f123337b = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f123339d = 1.0f;

    public a(w.l lVar) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        boolean z13 = false;
        this.f123340e = false;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f123336a = (Range) lVar.a(key);
        if (Build.VERSION.SDK_INT >= 34) {
            w.h hVar = lVar.f126929b;
            key2 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) ((CameraCharacteristics) hVar.f126926a).get(key2);
            if (iArr != null) {
                int length = iArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    if (iArr[i13] == 1) {
                        z13 = true;
                        break;
                    }
                    i13++;
                }
            }
        }
        this.f123340e = z13;
    }

    @Override // v.c3
    public final void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f13;
        if (this.f123338c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f13 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f13 = (Float) request.get(key);
            }
            if (f13 == null) {
                return;
            }
            if (this.f123339d == f13.floatValue()) {
                this.f123338c.b(null);
                this.f123338c = null;
            }
        }
    }

    @Override // v.c3
    public final float f() {
        return ((Float) this.f123336a.getLower()).floatValue();
    }

    @Override // v.c3
    public final void g(float f13, r4.i iVar) {
        this.f123337b = f13;
        r4.i iVar2 = this.f123338c;
        if (iVar2 != null) {
            iVar2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f123339d = this.f123337b;
        this.f123338c = iVar;
    }

    @Override // v.c3
    public final void k() {
        this.f123337b = 1.0f;
        r4.i iVar = this.f123338c;
        if (iVar != null) {
            iVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f123338c = null;
        }
    }

    @Override // v.c3
    public final float l() {
        return ((Float) this.f123336a.getUpper()).floatValue();
    }

    @Override // v.c3
    public final void m(u.a options) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.f123337b);
        androidx.camera.core.impl.u0 priority = androidx.camera.core.impl.u0.REQUIRED;
        options.g(key, valueOf, priority);
        if (this.f123340e) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(priority, "priority");
            if (Build.VERSION.SDK_INT >= 34) {
                key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                options.g(key2, 1, priority);
            }
        }
    }
}
