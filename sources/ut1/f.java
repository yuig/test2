package ut1;

import android.graphics.Bitmap;
import com.pinterest.modiface.MakeupPhotoView;

/* loaded from: classes7.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f123107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MakeupPhotoView f123108c;

    public /* synthetic */ f(Bitmap bitmap, MakeupPhotoView makeupPhotoView, int i13) {
        this.f123106a = i13;
        this.f123107b = bitmap;
        this.f123108c = makeupPhotoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f123106a;
        MakeupPhotoView makeupPhotoView = this.f123108c;
        Bitmap bitmap = this.f123107b;
        switch (i13) {
            case 0:
                MakeupPhotoView.takePhoto$lambda$27$lambda$26(bitmap, makeupPhotoView);
                break;
            default:
                MakeupPhotoView.takePhoto$lambda$30$lambda$29(bitmap, makeupPhotoView);
                break;
        }
    }
}
