package com.pinterest.feature.camera2.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.util.AttributeSet;
import android.view.Surface;
import dp0.a;
import dp0.c;
import ep0.d;
import ep0.e;
import ep0.f;
import java.util.ArrayList;
import java.util.List;
import kh2.k3;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v.j1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0002\r\u000eB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/camera2/view/BasePreviewCameraView;", "Ldp0/c;", "CallbackHandler", "Lcom/pinterest/feature/camera2/view/BaseCameraView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lp2/b", "ep0/d", "cameraLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BasePreviewCameraView<CallbackHandler extends c> extends BaseCameraView<CallbackHandler> {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f45434y = 0;

    /* renamed from: q, reason: collision with root package name */
    public CaptureRequest.Builder f45435q;

    /* renamed from: r, reason: collision with root package name */
    public CameraDevice f45436r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45437s;

    /* renamed from: t, reason: collision with root package name */
    public final int f45438t;

    /* renamed from: u, reason: collision with root package name */
    public d f45439u;

    /* renamed from: v, reason: collision with root package name */
    public final int f45440v;

    /* renamed from: w, reason: collision with root package name */
    public final int f45441w;

    /* renamed from: x, reason: collision with root package name */
    public final f f45442x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePreviewCameraView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void r(BasePreviewCameraView basePreviewCameraView, CaptureRequest.Builder builder) {
        basePreviewCameraView.q(builder, basePreviewCameraView.f45437s ? basePreviewCameraView.f45439u : d.FLASH_MODE_OFF);
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    /* renamed from: h, reason: from getter */
    public final int getF45441w() {
        return this.f45441w;
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    /* renamed from: i, reason: from getter */
    public final int getF45440v() {
        return this.f45440v;
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    /* renamed from: k, reason: from getter */
    public final f getF45442x() {
        return this.f45442x;
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    public void l() {
        CameraDevice cameraDevice = this.f45436r;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f45436r = null;
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    public void m(CameraCharacteristics characteristics) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.f45437s = Intrinsics.d(characteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE);
        ArrayList arrayList = new ArrayList();
        int[] iArr = (int[]) characteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i13 : iArr) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
    }

    public final void q(CaptureRequest.Builder builder, d mode) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (this.f45437s) {
            int i13 = e.f59889a[mode.ordinal()];
            if (i13 == 1) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 1);
                builder.set(CaptureRequest.CONTROL_AWB_MODE, 3);
            } else if (i13 == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
                builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
            } else {
                if (i13 != 3) {
                    return;
                }
                builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                builder.set(CaptureRequest.FLASH_MODE, 1);
                builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
            }
        }
    }

    public List s(Surface hostSurface) {
        Intrinsics.checkNotNullParameter(hostSurface, "hostSurface");
        return e0.b(hostSurface);
    }

    public final void t(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(u()));
        CameraManager cameraManager = this.f45431n;
        if (cameraManager != null) {
            String str = this.f45430m;
            if (str == null) {
                Intrinsics.r("cameraId");
                throw null;
            }
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            if (cameraCharacteristics != null) {
                Intrinsics.checkNotNullParameter(cameraCharacteristics, "<this>");
                CameraCharacteristics.Key CONTROL_AE_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
                Intrinsics.checkNotNullExpressionValue(CONTROL_AE_AVAILABLE_MODES, "CONTROL_AE_AVAILABLE_MODES");
                int i13 = this.f45438t;
                if (k3.u1(cameraCharacteristics, CONTROL_AE_AVAILABLE_MODES, i13)) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(i13));
                }
            }
        }
    }

    public final int u() {
        CameraManager cameraManager = this.f45431n;
        CameraCharacteristics cameraCharacteristics = null;
        if (cameraManager != null) {
            String str = this.f45430m;
            if (str == null) {
                Intrinsics.r("cameraId");
                throw null;
            }
            cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        }
        if (cameraCharacteristics == null) {
            return 1;
        }
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "<this>");
        CameraCharacteristics.Key CONTROL_AF_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AF_AVAILABLE_MODES, "CONTROL_AF_AVAILABLE_MODES");
        return k3.u1(cameraCharacteristics, CONTROL_AF_AVAILABLE_MODES, 4) ? 4 : 1;
    }

    public void v(CaptureRequest.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public boolean w() {
        if (getSurfaceTexture() == null) {
            return false;
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.f45425h;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
            }
            this.f45425h = null;
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(e().getWidth(), e().getHeight());
            }
            Surface surface = new Surface(getSurfaceTexture());
            CameraDevice cameraDevice = this.f45436r;
            if (cameraDevice == null) {
                return false;
            }
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            createCaptureRequest.addTarget(surface);
            t(createCaptureRequest);
            this.f45435q = createCaptureRequest;
            CameraDevice cameraDevice2 = this.f45436r;
            if (cameraDevice2 != null) {
                cameraDevice2.createCaptureSession(s(surface), new j1(this, 3), null);
            }
            return true;
        } catch (CameraAccessException e13) {
            ((m81.d) g()).p3(a.PREVIEW_CREATE, e13);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePreviewCameraView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45438t = 1;
        this.f45439u = d.FLASH_MODE_OFF;
        this.f45440v = 1920;
        this.f45441w = 1080;
        this.f45442x = new f(this);
    }
}
