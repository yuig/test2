package rq;

import android.view.View;
import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutDetailsView;
import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutImageView;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubStatsRow;
import com.pinterest.creatorHub.feature.hub.view.components.ToolButtonView;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.feature.board.common.newideas.view.BoardMoreIdeasHeaderView;
import com.pinterest.feature.conversation.view.ConversationSystemMessageBoardPinItemView;
import com.pinterest.feature.creationmenu.view.ActionButton;
import com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView;
import com.pinterest.feature.pin.edit.view.AttributeCoverImagePreviewView;
import com.pinterest.feature.profile.boardsoftdeletion.SoftDeletionModule;
import com.pinterest.feature.search.visual.lens.view.RoomRepaintInfoView;
import com.pinterest.feature.settings.notifications.expandablesection.ExpandableSectionView;
import com.pinterest.feature.storypin.closeup.view.AdsIdeaPinHorizontalActionBarView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f109550b;

    public /* synthetic */ t0(int i13, Function0 function0) {
        this.f109549a = i13;
        this.f109550b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f109549a;
        Function0 onTap = this.f109550b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(onTap, "$onTap");
                onTap.invoke();
                break;
            case 1:
                int i14 = HeroCollagesCarouselCutoutDetailsView.f35457i;
                Intrinsics.f(view);
                kh2.k3.K(view);
                if (onTap != null) {
                    onTap.invoke();
                    break;
                }
                break;
            case 2:
                int i15 = HeroCollagesCarouselCutoutImageView.f35466j;
                Intrinsics.f(view);
                kh2.k3.K(view);
                if (onTap != null) {
                    onTap.invoke();
                    break;
                }
                break;
            case 3:
                int i16 = yb0.n.f138503p;
                Intrinsics.checkNotNullParameter(onTap, "$action");
                onTap.invoke();
                break;
            case 4:
                int i17 = yb0.n.f138503p;
                Intrinsics.checkNotNullParameter(onTap, "$action");
                onTap.invoke();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(onTap, "$confirmButtonAction");
                onTap.invoke();
                break;
            case 6:
                Intrinsics.checkNotNullParameter(onTap, "$cancelButtonAction");
                onTap.invoke();
                break;
            case 7:
                int i18 = CreatorHubStatsRow.f44814h;
                onTap.invoke();
                break;
            case 8:
                int i19 = ToolButtonView.f44822d;
                if (onTap != null) {
                    onTap.invoke();
                    break;
                }
                break;
            case 9:
                int i23 = PinterestToolTip.f44898p;
                Intrinsics.checkNotNullParameter(onTap, "$onClickListener");
                onTap.invoke();
                break;
            case 10:
                Intrinsics.checkNotNullParameter(onTap, "$onClickAction");
                onTap.invoke();
                break;
            case 11:
                int i24 = BoardMoreIdeasHeaderView.f45125k;
                Intrinsics.checkNotNullParameter(onTap, "$onClickAction");
                onTap.invoke();
                break;
            case 12:
                int i25 = ConversationSystemMessageBoardPinItemView.f45621c;
                Intrinsics.checkNotNullParameter(onTap, "$navigateToBoard");
                onTap.invoke();
                break;
            case 13:
                int i26 = ActionButton.f45646d;
                Intrinsics.checkNotNullParameter(onTap, "$action");
                onTap.invoke();
                break;
            case 14:
                int i27 = ActionButton.f45646d;
                Intrinsics.checkNotNullParameter(onTap, "$action");
                onTap.invoke();
                break;
            case 15:
                int i28 = IdeaPinProductTagsItemView.f46551k;
                Intrinsics.checkNotNullParameter(onTap, "$clickAction");
                onTap.invoke();
                break;
            case 16:
                Intrinsics.checkNotNullParameter(onTap, "$confirmCallback");
                onTap.invoke();
                break;
            case 17:
                int i29 = vy0.a.f126884i;
                Intrinsics.checkNotNullParameter(onTap, "$onClick");
                onTap.invoke();
                break;
            case 18:
                int i33 = b01.d.f20726g;
                Intrinsics.checkNotNullParameter(onTap, "$actionClick");
                onTap.invoke();
                break;
            case 19:
                int i34 = h01.h.f66438a;
                Intrinsics.checkNotNullParameter(onTap, "$onTapAction");
                onTap.invoke();
                break;
            case 20:
                int i35 = AttributeCoverImagePreviewView.f47188g;
                Intrinsics.checkNotNullParameter(onTap, "$tapHandler");
                onTap.invoke();
                break;
            case 21:
                int i36 = SoftDeletionModule.f47501d;
                Intrinsics.checkNotNullParameter(onTap, "$ctaTapAction");
                onTap.invoke();
                break;
            case 22:
                Intrinsics.checkNotNullParameter(onTap, "$onConfirmAction");
                onTap.invoke();
                break;
            case 23:
                Intrinsics.checkNotNullParameter(onTap, "$onCancel");
                onTap.invoke();
                break;
            case 24:
                int i37 = a41.r.P1;
                Intrinsics.checkNotNullParameter(onTap, "$onClick");
                onTap.invoke();
                break;
            case 25:
                Intrinsics.checkNotNullParameter(onTap, "$onClickListener");
                onTap.invoke();
                break;
            case 26:
                int i38 = RoomRepaintInfoView.f48054e;
                Intrinsics.checkNotNullParameter(onTap, "$onRetry");
                onTap.invoke();
                break;
            case 27:
                int i39 = ExpandableSectionView.f48177i;
                Intrinsics.checkNotNullParameter(onTap, "$onClick");
                onTap.invoke();
                break;
            case 28:
                int i43 = AdsIdeaPinHorizontalActionBarView.f48539o;
                Intrinsics.checkNotNullParameter(onTap, "$action");
                onTap.invoke();
                break;
            default:
                int i44 = AdsIdeaPinHorizontalActionBarView.f48539o;
                Intrinsics.checkNotNullParameter(onTap, "$action");
                onTap.invoke();
                break;
        }
    }
}
