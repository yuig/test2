package ut1;

import android.hardware.Camera;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.pinterest.modiface.MFEMakeupView;
import com.pinterest.modiface.MakeupPhotoView;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback, MFEMakeupEngine.TakePictureCameraParametersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123099a;

    public /* synthetic */ a(int i13) {
        this.f123099a = i13;
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback
    public final void onMFEMakeupFinishedLoadResources() {
        switch (this.f123099a) {
            case 0:
                MFEMakeupView.loadMakeupEngineResourcesAndStartCamera$lambda$9$lambda$8();
                break;
            default:
                MakeupPhotoView.lambda$9$lambda$5$lambda$3();
                break;
        }
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.TakePictureCameraParametersCallback
    public final void onTakePictureFromCameraSetCameraParameters(Camera.Parameters parameters) {
        switch (this.f123099a) {
            case 1:
                MFEMakeupView.takePhoto$lambda$18(parameters);
                break;
            default:
                MakeupPhotoView.takePhoto$lambda$24(parameters);
                break;
        }
    }
}
