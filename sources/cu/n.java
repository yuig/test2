package cu;

import android.view.View;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.feature.pincarouselads.view.a0;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseAdsScrollingModule f53242b;

    public /* synthetic */ n(BaseAdsScrollingModule baseAdsScrollingModule, int i13) {
        this.f53241a = i13;
        this.f53242b = baseAdsScrollingModule;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PinterestVideoView pinterestVideoView;
        int i13 = this.f53241a;
        BaseAdsScrollingModule this$0 = this.f53242b;
        switch (i13) {
            case 0:
                int i14 = BaseAdsScrollingModule.D0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.z1() || !this$0.y1()) {
                    this$0.K1();
                    break;
                } else {
                    a0 b13 = this$0.n1().b();
                    if (b13 != null && (pinterestVideoView = b13.f47367l) != null) {
                        pinterestVideoView.performClick();
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.K1();
                break;
        }
    }
}
