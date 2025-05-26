package ip;

import android.view.animation.Animation;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotifsOptInUpsellBannerView f73357b;

    public /* synthetic */ b(NotifsOptInUpsellBannerView notifsOptInUpsellBannerView, int i13) {
        this.f73356a = i13;
        this.f73357b = notifsOptInUpsellBannerView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i13 = this.f73356a;
        NotifsOptInUpsellBannerView notifsOptInUpsellBannerView = this.f73357b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                notifsOptInUpsellBannerView.setVisibility(0);
                notifsOptInUpsellBannerView.getLayoutParams().height = -2;
                notifsOptInUpsellBannerView.requestLayout();
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                notifsOptInUpsellBannerView.setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.f73356a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f73356a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }
}
