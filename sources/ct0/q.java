package ct0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.pinterest.ui.grid.ImageInterestFollowButton;
import com.pinterest.ui.grid.TopicGridCell;
import kh2.u2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53166i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f53167j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i13) {
        super(0);
        this.f53166i = i13;
        this.f53167j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f53166i;
        s sVar = this.f53167j;
        switch (i13) {
            case 0:
                Context requireContext = sVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                TopicGridCell topicGridCell = new TopicGridCell(requireContext);
                pk.a0.k0(topicGridCell.f52540a);
                pk.a0.w1(topicGridCell.f52543d);
                b20.c cVar = sVar.M0;
                if (cVar == null) {
                    Intrinsics.r("experimentV2Helper");
                    throw null;
                }
                if (cVar.r(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                    ht0.u.c(topicGridCell);
                }
                Drawable followingDrawable = sVar.Q0;
                if (followingDrawable == null) {
                    Intrinsics.r("followDrawable");
                    throw null;
                }
                Drawable notFollowingDrawable = sVar.R0;
                if (notFollowingDrawable == null) {
                    Intrinsics.r("notFollowingDrawable");
                    throw null;
                }
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
                Drawable drawable = sVar.Q0;
                if (drawable == null) {
                    Intrinsics.r("followDrawable");
                    throw null;
                }
                FrameLayout.LayoutParams params = ht0.u.b(resources, drawable);
                Intrinsics.checkNotNullParameter(params, "params");
                topicGridCell.f52544e.updateViewLayout(topicGridCell.f52545f, params);
                return topicGridCell;
            case 1:
                uk1.e eVar = sVar.L0;
                if (eVar != null) {
                    return ((uk1.a) eVar).f(sVar.s7(), "");
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            default:
                u6.c defaultViewModelCreationExtras = sVar.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return u2.f1(defaultViewModelCreationExtras, new p(sVar, 1));
        }
    }
}
