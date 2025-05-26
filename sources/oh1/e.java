package oh1;

import android.animation.ObjectAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import com.pinterest.ui.components.banners.LegoBannerView;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94503i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f94486j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f94487k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f94488l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f94489m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f94490n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f94491o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f94492p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f94493q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f94494r = new e(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e f94495s = new e(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e f94496t = new e(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e f94497u = new e(11);

    /* renamed from: v, reason: collision with root package name */
    public static final e f94498v = new e(12);

    /* renamed from: w, reason: collision with root package name */
    public static final e f94499w = new e(13);

    /* renamed from: x, reason: collision with root package name */
    public static final e f94500x = new e(14);

    /* renamed from: y, reason: collision with root package name */
    public static final e f94501y = new e(15);

    /* renamed from: z, reason: collision with root package name */
    public static final e f94502z = new e(16);
    public static final e A = new e(17);
    public static final e B = new e(18);
    public static final e C = new e(19);
    public static final e D = new e(20);
    public static final e E = new e(21);
    public static final e F = new e(22);
    public static final e G = new e(23);
    public static final e H = new e(24);
    public static final e I = new e(25);

    /* renamed from: J, reason: collision with root package name */
    public static final e f94485J = new e(26);
    public static final e K = new e(27);
    public static final e L = new e(28);
    public static final e M = new e(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f94503i = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(com.pinterest.feature.unifiedcomments.d view) {
        switch (this.f94503i) {
            case 4:
                Intrinsics.checkNotNullParameter(view, "view");
                PinCommentReactionHeaderView pinCommentReactionHeaderView = ((rh1.k) view).I0;
                if (pinCommentReactionHeaderView == null) {
                    Intrinsics.r("communityInsightCommentHeaderView");
                    throw null;
                }
                pinCommentReactionHeaderView.setAlpha(0.0f);
                pinCommentReactionHeaderView.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pinCommentReactionHeaderView, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            case 5:
                Intrinsics.checkNotNullParameter(view, "view");
                PinCommentReactionHeaderView pinCommentReactionHeaderView2 = ((rh1.k) view).I0;
                if (pinCommentReactionHeaderView2 == null) {
                    Intrinsics.r("communityInsightCommentHeaderView");
                    throw null;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pinCommentReactionHeaderView2, "alpha", 1.0f, 0.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.start();
                ofFloat2.addListener(new gq.e(pinCommentReactionHeaderView2, 3));
                return;
            case 6:
                Intrinsics.checkNotNullParameter(view, "view");
                rh1.k kVar = (rh1.k) view;
                kVar.V8();
                kVar.d9();
                kVar.P7();
                return;
            case 7:
                Intrinsics.checkNotNullParameter(view, "view");
                RecyclerView recyclerView = ((rh1.k) view).V0;
                if (recyclerView == null) {
                    Intrinsics.r("commentRecyclerView");
                    throw null;
                }
                l2 l2Var = recyclerView.f19242n;
                if (l2Var != null) {
                    l2Var.M0(0);
                    return;
                }
                return;
            case 8:
                Intrinsics.checkNotNullParameter(view, "view");
                RecyclerView recyclerView2 = ((rh1.k) view).V0;
                if (recyclerView2 == null) {
                    Intrinsics.r("commentRecyclerView");
                    throw null;
                }
                l2 l2Var2 = recyclerView2.f19242n;
                if (l2Var2 != null) {
                    l2Var2.M0(0);
                    return;
                }
                return;
            case 9:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).U8();
                return;
            case 10:
                Intrinsics.checkNotNullParameter(view, "view");
                ((yq0.t) view).setLoadState(yk1.i.LOADING);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(view, "view");
                rh1.k kVar2 = (rh1.k) view;
                LegoEmptyStateView W8 = kVar2.W8();
                W8.p("");
                String string = kVar2.getString(ob2.f.comments_turned_off_for_pin);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                W8.e(string);
                W8.g(vn1.g.BODY_300);
                rh1.k.j9(kVar2, W8);
                return;
            case 12:
                Intrinsics.checkNotNullParameter(view, "view");
                bs1.c.U1(((rh1.k) view).X8());
                return;
            case 14:
                Intrinsics.checkNotNullParameter(view, "view");
                PinterestEmptyStateLayout pinterestEmptyStateLayout = ((rh1.k) view).f139733g0;
                if (pinterestEmptyStateLayout != null) {
                    pinterestEmptyStateLayout.f(true);
                    return;
                }
                return;
            case 15:
                Intrinsics.checkNotNullParameter(view, "view");
                PinterestEmptyStateLayout pinterestEmptyStateLayout2 = ((rh1.k) view).f139733g0;
                if (pinterestEmptyStateLayout2 != null) {
                    pinterestEmptyStateLayout2.f(true);
                    return;
                }
                return;
            case 16:
                Intrinsics.checkNotNullParameter(view, "view");
                PinterestEmptyStateLayout pinterestEmptyStateLayout3 = ((rh1.k) view).f139733g0;
                if (pinterestEmptyStateLayout3 != null) {
                    pinterestEmptyStateLayout3.f(true);
                    return;
                }
                return;
            case 17:
                Intrinsics.checkNotNullParameter(view, "view");
                LegoBannerView legoBannerView = ((rh1.k) view).L0;
                if (legoBannerView == null) {
                    Intrinsics.r("highlightEducationBanner");
                    throw null;
                }
                legoBannerView.D();
                String string2 = legoBannerView.getResources().getString(ob2.f.unified_comments_highlight_comment_education);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                legoBannerView.Z(string2);
                String string3 = legoBannerView.getResources().getString(x0.got_it);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                legoBannerView.g0(string3);
                ee1.d action = new ee1.d(legoBannerView, 17);
                Intrinsics.checkNotNullParameter(action, "action");
                legoBannerView.f52264s = action;
                legoBannerView.L();
                bs1.c.U1(legoBannerView);
                return;
            case 18:
                Intrinsics.checkNotNullParameter(view, "view");
                rh1.k kVar3 = (rh1.k) view;
                kVar3.getClass();
                ur0.g.d(y0.ANDROID_COMMENT_FEED_TAKEOVER, kVar3, null);
                return;
            case 19:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).V8();
                return;
            case 20:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).V8();
                return;
            case 21:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).V8();
                return;
            case 22:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).V8();
                return;
            case 23:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).h9(true, false);
                return;
            case 24:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).U0.p(true, false);
                return;
            case 25:
                Intrinsics.checkNotNullParameter(view, "view");
                view.n0();
                return;
            case 26:
                Intrinsics.checkNotNullParameter(view, "view");
                rh1.k kVar4 = (rh1.k) view;
                kVar4.getClass();
                ur0.g.d(y0.ANDROID_COMMENT_FEED_TAKEOVER_AFTER_COMMENT_SUBMISSION, kVar4, null);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f94503i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 5:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 6:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 7:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 8:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 9:
                break;
            case 10:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 11:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 12:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 13:
                break;
            case 14:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 15:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 16:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 17:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 18:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 19:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 20:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 21:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 22:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 23:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 24:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 25:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 26:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 27:
                b((com.pinterest.feature.unifiedcomments.d) obj);
                break;
            case 28:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
