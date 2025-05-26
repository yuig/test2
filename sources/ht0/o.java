package ht0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.ui.grid.ImageInterestFollowButton;
import com.pinterest.ui.grid.TopicGridCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;
import pk.a0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70130i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f70131j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, int i13) {
        super(0);
        this.f70130i = i13;
        this.f70131j = rVar;
    }

    public final Drawable b() {
        int i13 = this.f70130i;
        r rVar = this.f70131j;
        switch (i13) {
            case 0:
                Drawable I = com.bumptech.glide.c.I(rVar.requireContext(), eo1.d.ic_one_tap_saved_success_nonpds);
                Intrinsics.f(I);
                u.d(I);
                return I;
            default:
                Drawable I2 = com.bumptech.glide.c.I(rVar.requireContext(), le0.c.ic_one_tap_save_lego_nonpds);
                Intrinsics.f(I2);
                u.d(I2);
                return I2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f70130i;
        r rVar = this.f70131j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return new EmptyView(rVar.requireContext());
            default:
                Context requireContext = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                TopicGridCell topicGridCell = new TopicGridCell(requireContext);
                a0.k0(topicGridCell.f52540a);
                a0.w1(topicGridCell.f52543d);
                b20.c cVar = rVar.B0;
                if (cVar == null) {
                    Intrinsics.r("homeFeedTunerEntrypointV2ExperimentHelper");
                    throw null;
                }
                if (cVar.r(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                    u.c(topicGridCell);
                }
                xk2.v vVar = rVar.C0;
                Drawable followingDrawable = (Drawable) vVar.getValue();
                Intrinsics.checkNotNullExpressionValue(followingDrawable, "access$getFollowDrawable(...)");
                Drawable notFollowingDrawable = (Drawable) rVar.D0.getValue();
                Intrinsics.checkNotNullExpressionValue(notFollowingDrawable, "access$getNotFollowingDrawable(...)");
                Intrinsics.checkNotNullParameter(followingDrawable, "followingDrawable");
                Intrinsics.checkNotNullParameter(notFollowingDrawable, "notFollowingDrawable");
                ImageInterestFollowButton imageInterestFollowButton = topicGridCell.f52545f;
                if (imageInterestFollowButton != null) {
                    Intrinsics.checkNotNullParameter(followingDrawable, "followingDrawable");
                    Intrinsics.checkNotNullParameter(notFollowingDrawable, "notFollowingDrawable");
                    imageInterestFollowButton.f52385e = followingDrawable;
                    imageInterestFollowButton.f52386f = notFollowingDrawable;
                }
                Resources resources = topicGridCell.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Drawable drawable = (Drawable) vVar.getValue();
                Intrinsics.checkNotNullExpressionValue(drawable, "access$getFollowDrawable(...)");
                FrameLayout.LayoutParams params = u.b(resources, drawable);
                Intrinsics.checkNotNullParameter(params, "params");
                topicGridCell.f52544e.updateViewLayout(topicGridCell.f52545f, params);
                return topicGridCell;
        }
    }
}
