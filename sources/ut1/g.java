package ut1;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.pinterest.modiface.MFEMakeupView;
import com.pinterest.modiface.MakeupPhotoView;

/* loaded from: classes7.dex */
public final /* synthetic */ class g implements MFEMakeupEngine.TakePictureFromCameraCompletionHandler, MFEMakeupEngine.ApplyMakeupToPhotoCompletionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f123110b;

    public /* synthetic */ g(FrameLayout frameLayout, int i13) {
        this.f123109a = i13;
        this.f123110b = frameLayout;
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.ApplyMakeupToPhotoCompletionHandler
    public final void onMakeupAppliedToPhoto(Bitmap bitmap, Bitmap bitmap2, Throwable th3) {
        MakeupPhotoView.takePhoto$lambda$30((MakeupPhotoView) this.f123110b, bitmap, bitmap2, th3);
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.TakePictureFromCameraCompletionHandler
    public final void onTakePictureFromCameraDone(Bitmap bitmap, Bitmap bitmap2, Throwable th3) {
        int i13 = this.f123109a;
        FrameLayout frameLayout = this.f123110b;
        switch (i13) {
            case 0:
                MakeupPhotoView.takePhoto$lambda$27((MakeupPhotoView) frameLayout, bitmap, bitmap2, th3);
                break;
            default:
                MFEMakeupView.takePhoto$lambda$21((MFEMakeupView) frameLayout, bitmap, bitmap2, th3);
                break;
        }
    }
}
