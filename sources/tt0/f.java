package tt0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import com.pinterest.feature.ideaPinCreation.camera.view.CenterCropCameraTextureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om0.m1;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f119108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f119109k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, String str, int i13) {
        super(1);
        this.f119107i = i13;
        this.f119108j = kVar;
        this.f119109k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119107i;
        String str = this.f119109k;
        k kVar = this.f119108j;
        switch (i13) {
            case 0:
                CameraDevice it = (CameraDevice) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                kVar.f119147j = it;
                m1 m1Var = new m1(10, kVar, str);
                CenterCropCameraTextureView centerCropCameraTextureView = kVar.f119139b;
                if (centerCropCameraTextureView.isAvailable()) {
                    m1Var.invoke();
                } else {
                    centerCropCameraTextureView.setSurfaceTextureListener(new h(kVar, m1Var));
                }
                break;
            default:
                CameraCaptureSession it2 = (CameraCaptureSession) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                kVar.f119144g = it2;
                if (kVar.f119147j == null) {
                    kVar.a();
                } else if (!kVar.i(str, false)) {
                    kVar.g();
                }
                break;
        }
        return Unit.f80348a;
    }
}
