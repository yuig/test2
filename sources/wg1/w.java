package wg1;

import android.view.ViewTreeObserver;
import com.pinterest.video.core.view.PinterestVideoView;

/* loaded from: classes5.dex */
public final class w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f129855b;

    public /* synthetic */ w(PinterestVideoView pinterestVideoView, int i13) {
        this.f129854a = i13;
        this.f129855b = pinterestVideoView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f129854a;
        PinterestVideoView pinterestVideoView = this.f129855b;
        switch (i13) {
            case 0:
                pinterestVideoView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                pinterestVideoView.q0().w();
                break;
            default:
                pinterestVideoView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                pinterestVideoView.q0().w();
                break;
        }
    }
}
