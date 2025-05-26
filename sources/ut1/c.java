package ut1;

import android.graphics.Bitmap;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.pinterest.modiface.MFEMakeupView;
import com.pinterest.modiface.MakeupPhotoView;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123104c;

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f123102a = i13;
        this.f123103b = obj;
        this.f123104c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f123102a;
        Object obj = this.f123104c;
        Object obj2 = this.f123103b;
        switch (i13) {
            case 0:
                MFEMakeupView.takePhoto$lambda$21$lambda$20((Bitmap) obj2, (MFEMakeupView) obj);
                break;
            default:
                MakeupPhotoView.loadMakeupEngineResourceWithPhoto$lambda$15$lambda$13$lambda$12((MakeupPhotoView) obj2, (MFETrackingData) obj);
                break;
        }
    }
}
