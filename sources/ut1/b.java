package ut1;

import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.modiface.MFEMakeupView;
import com.pinterest.modiface.MakeupPhotoView;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f123101b;

    public /* synthetic */ b(FrameLayout frameLayout, int i13) {
        this.f123100a = i13;
        this.f123101b = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f123100a;
        FrameLayout frameLayout = this.f123101b;
        switch (i13) {
            case 0:
                MFEMakeupView._init_$lambda$7((MFEMakeupView) frameLayout, view);
                break;
            default:
                MakeupPhotoView._init_$lambda$10((MakeupPhotoView) frameLayout, view);
                break;
        }
    }
}
