package ba;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.adsStlUiLibrary.ui.categories.item.AdsStlCategoryFlashlightView;
import com.pinterest.adsStlUiLibrary.ui.categories.item.AdsStlCategoryView;
import com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewDetailedView;
import com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewFooterView;
import com.pinterest.feature.board.detail.view.BoardExpandedSectionHeaderView;
import com.pinterest.feature.board.detail.view.PublicBoardMoreIdeasListStaticHeader;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.selectPinsLibrary.view.SelectPinsEmptyStateMessageView;
import com.pinterest.ui.components.sections.LegoSectionRep;
import kh2.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.f0;
import rq.j4;
import rq.p2;
import rq.r3;
import rq.w1;
import tq.g0;
import tq.k0;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22289i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f22290j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i13) {
        super(0);
        this.f22289i = i13;
        this.f22290j = context;
    }

    public final EmptyView b() {
        int i13 = this.f22289i;
        Context context = this.f22290j;
        switch (i13) {
            case 17:
                EmptyView emptyView = new EmptyView(context);
                emptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
                return emptyView;
            default:
                EmptyView emptyView2 = new EmptyView(context);
                emptyView2.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
                return emptyView2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AttributeSet attributeSet = null;
        int i13 = 6;
        int i14 = this.f22289i;
        Context context = this.f22290j;
        switch (i14) {
            case 0:
                return j1.A(context);
            case 1:
                return new GestaltSpinner(i13, context, attributeSet);
            case 2:
                switch (i14) {
                    case 2:
                        return new f0(context);
                    default:
                        return new f0(context);
                }
            case 3:
                return new j4(context, false);
            case 4:
                return new PinCloseupFavoriteModule(i13, context, attributeSet);
            case 5:
                return new w1(context);
            case 6:
                return new g0(context);
            case 7:
                return new r3(context);
            case 8:
                Intrinsics.checkNotNullParameter(context, "context");
                k0 k0Var = new k0(context);
                k0Var.inject();
                k0Var.f118889g = new tq.j(k0Var, 2);
                return k0Var;
            case 9:
                switch (i14) {
                    case 2:
                        return new f0(context);
                    default:
                        return new f0(context);
                }
            case 10:
                return new p2(context);
            case 11:
                return Integer.valueOf(hf0.b.g(context));
            case 12:
                return new rq.j1(context);
            case 13:
                return new AdsStlCategoryView(i13, context, attributeSet);
            case 14:
                return new AdsStlCategoryFlashlightView(i13, context, attributeSet);
            case 15:
                return new g60.f(context);
            case 16:
                return new BoardExpandedSectionHeaderView(i13, context, attributeSet);
            case 17:
                return b();
            case 18:
                EmptyStateBannerView emptyStateBannerView = new EmptyStateBannerView(6, context, (AttributeSet) null);
                int W = bs1.c.W(emptyStateBannerView, eo1.c.space_600);
                emptyStateBannerView.setPaddingRelative(W, bs1.c.W(emptyStateBannerView, y60.a.board_empty_state_top_spacing), W, emptyStateBannerView.getPaddingBottom());
                return emptyStateBannerView;
            case 19:
                switch (i14) {
                    case 19:
                        return new BoardIdeasPreviewDetailedView(i13, context, attributeSet);
                    default:
                        return new BoardIdeasPreviewDetailedView(i13, context, attributeSet);
                }
            case 20:
                switch (i14) {
                    case 20:
                        return new BoardIdeasPreviewFooterView(i13, context, attributeSet);
                    default:
                        return new BoardIdeasPreviewFooterView(i13, context, attributeSet);
                }
            case 21:
                return new LegoSectionRep(context);
            case 22:
                return new SelectPinsEmptyStateMessageView(context);
            case 23:
                switch (i14) {
                    case 23:
                        return new PublicBoardMoreIdeasListStaticHeader(i13, context, attributeSet);
                    default:
                        return new PublicBoardMoreIdeasListStaticHeader(i13, context, attributeSet);
                }
            case 24:
                Intrinsics.checkNotNullParameter(context, "context");
                kl0.b0 b0Var = new kl0.b0(context);
                View.inflate(context, d70.e.board_ideas_on_endless_scroll_header, b0Var);
                b0Var.setPaddingRelative(b0Var.getPaddingStart(), bs1.c.W(b0Var, eo1.c.space_400), b0Var.getPaddingEnd(), bs1.c.W(b0Var, eo1.c.space_100));
                return b0Var;
            case 25:
                switch (i14) {
                    case 19:
                        return new BoardIdeasPreviewDetailedView(i13, context, attributeSet);
                    default:
                        return new BoardIdeasPreviewDetailedView(i13, context, attributeSet);
                }
            case 26:
                switch (i14) {
                    case 20:
                        return new BoardIdeasPreviewFooterView(i13, context, attributeSet);
                    default:
                        return new BoardIdeasPreviewFooterView(i13, context, attributeSet);
                }
            case 27:
                switch (i14) {
                    case 23:
                        return new PublicBoardMoreIdeasListStaticHeader(i13, context, attributeSet);
                    default:
                        return new PublicBoardMoreIdeasListStaticHeader(i13, context, attributeSet);
                }
            case 28:
                return b();
            default:
                return new sg1.b(context);
        }
    }
}
