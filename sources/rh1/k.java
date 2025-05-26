package rh1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentsQuickReplies;
import com.pinterest.api.model.f30;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.engagementtab.EngagementDetailsHeaderView;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import com.pinterest.feature.unifiedcomments.view.PinTitleHeaderView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.components.banners.LegoBannerView;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j4;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrh1/k;", "Lyq0/b0;", "", "Lcom/pinterest/feature/unifiedcomments/d;", "<init>", "()V", "g4/u", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class k extends w0<Object> implements com.pinterest.feature.unifiedcomments.d {

    /* renamed from: h1, reason: collision with root package name */
    public static final /* synthetic */ int f108194h1 = 0;
    public up0.l A0;
    public lh0.m0 B0;
    public d21.a C0;
    public x02.i2 D0;
    public qh1.e E0;
    public j4 F0;
    public lb0.r G0;
    public PinCommentReactionHeaderView H0;
    public PinCommentReactionHeaderView I0;
    public PinTitleHeaderView J0;
    public GestaltText K0;
    public LegoBannerView L0;
    public LinearLayout M0;
    public HorizontalScrollView N0;
    public CommentsQuickReplies O0;
    public ConstraintLayout P0;
    public WebImageView Q0;
    public CommentComposerView R0;
    public EngagementDetailsHeaderView S0;
    public RelativeLayout T0;
    public RecyclerView V0;
    public f30 X0;
    public boolean Y0;
    public com.pinterest.feature.unifiedcomments.c Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final ArrayList f108195a1;

    /* renamed from: b1, reason: collision with root package name */
    public final b f108196b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f108197c1;

    /* renamed from: d1, reason: collision with root package name */
    public final List f108198d1;

    /* renamed from: e1, reason: collision with root package name */
    public final List f108199e1;

    /* renamed from: f1, reason: collision with root package name */
    public final s81.g f108200f1;

    /* renamed from: g1, reason: collision with root package name */
    public final d4 f108201g1;

    /* renamed from: z0, reason: collision with root package name */
    public pb0.d f108202z0;
    public final tq0.h U0 = vb0.i.f();
    public final xk2.v W0 = xk2.m.b(new d(this, 0));

    public k() {
        xk2.m.b(new d(this, 3));
        xk2.m.b(new d(this, 4));
        xk2.m.b(new d(this, 5));
        this.f108195a1 = new ArrayList();
        this.f108196b1 = new b(this);
        this.f108198d1 = kotlin.collections.f0.j(Integer.valueOf(ob2.f.sort_by_top), Integer.valueOf(ob2.f.sort_by_newest));
        this.f108199e1 = kotlin.collections.f0.j(Integer.valueOf(ob2.f.subtitle_sort_by_top), Integer.valueOf(ob2.f.subtitle_sort_by_newest));
        this.f108200f1 = new s81.g(this, 9);
        this.f108201g1 = d4.PIN_COMMENTS;
    }

    public static void j9(k kVar, LegoEmptyStateView legoEmptyStateView) {
        kVar.O8(legoEmptyStateView, 49);
        PinterestEmptyStateLayout pinterestEmptyStateLayout = kVar.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.g();
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        x02.i2 i2Var = this.D0;
        if (i2Var != null) {
            i2Var.P(getPinUid()).F(new oh1.a(23, new oh1.u(1, adapter, this)), new oh1.a(24, j.f108172j), ck2.i.f27923c, ck2.i.f27924d);
        } else {
            Intrinsics.r("pinRepository");
            throw null;
        }
    }

    public final void U8() {
        CommentComposerView Y8 = Y8();
        Y8.d();
        CommentComposerView.T(Y8);
    }

    public final void V8() {
        CommentComposerView.T(Y8());
    }

    public final LegoEmptyStateView W8() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext);
        if (!hf0.b.q()) {
            String string = legoEmptyStateView.getResources().getString(ob2.f.comment_empty_state_title_community_feed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            legoEmptyStateView.e(string);
        } else {
            String string2 = legoEmptyStateView.getResources().getString(ob2.f.comment_empty_state_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            legoEmptyStateView.e(string2);
        }
        View findViewById = legoEmptyStateView.findViewById(m60.t0.empty_state_action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        pk.a0.l0((GestaltButton) findViewById);
        return legoEmptyStateView;
    }

    public final LinearLayout X8() {
        LinearLayout linearLayout = this.M0;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("commentBottomBar");
        throw null;
    }

    public final CommentComposerView Y8() {
        CommentComposerView commentComposerView = this.R0;
        if (commentComposerView != null) {
            return commentComposerView;
        }
        Intrinsics.r("commentComposer");
        throw null;
    }

    public final PinCommentReactionHeaderView Z8() {
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.H0;
        if (pinCommentReactionHeaderView != null) {
            return pinCommentReactionHeaderView;
        }
        Intrinsics.r("commentReactionsHeaderView");
        throw null;
    }

    public final qh1.e a9() {
        qh1.e eVar = this.E0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("commentUtils");
        throw null;
    }

    public final String b9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_ID") : null;
        return v03 == null ? "" : v03;
    }

    public final j4 c9() {
        j4 j4Var = this.F0;
        if (j4Var != null) {
            return j4Var;
        }
        Intrinsics.r("unifiedCommentExperiments");
        throw null;
    }

    public final void d9() {
        bs1.c.X0(X8());
    }

    public void e9(String commentId, String commentType, boolean z13) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(commentType, "commentType");
    }

    public final void f9(boolean z13) {
        CommentsQuickReplies commentsQuickReplies = this.O0;
        if (commentsQuickReplies == null) {
            Intrinsics.r("commentStarters");
            throw null;
        }
        x02.i2 i2Var = this.D0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        nl.b.s(i2Var.P(getPinUid()), new qf1.f0(z13, commentsQuickReplies, 2), null, null, 6);
        commentsQuickReplies.k(new f(this, 1));
    }

    public final void g9(boolean z13) {
        HorizontalScrollView horizontalScrollView = this.N0;
        if (horizontalScrollView == null) {
            Intrinsics.r("commentStarterHscroll");
            throw null;
        }
        bs1.c.R1(horizontalScrollView, z13);
        RecyclerView recyclerView = this.V0;
        if (recyclerView != null) {
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), bs1.c.W(recyclerView, z13 ? ob2.a.comment_feed_margin_bottom_tall : ob2.a.comment_feed_margin_bottom_short));
        } else {
            Intrinsics.r("commentRecyclerView");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF50445f() {
        String v03;
        h32.g0 valueOf;
        Navigation navigation = this.I;
        if (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_COMPONENT")) == null || (valueOf = h32.g0.valueOf(v03)) == null) {
            return null;
        }
        return valueOf;
    }

    public final String getPinUid() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        return v03 == null ? "" : v03;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF143270o0() {
        String v03;
        a4 valueOf;
        Navigation navigation = this.I;
        if (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER")) == null || (valueOf = a4.valueOf(v03)) == null) {
            return null;
        }
        return valueOf;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public d4 getN0() {
        return this.f108201g1;
    }

    public final void h9(boolean z13, boolean z14) {
        boolean z15 = !z13;
        bs1.c.R1(Y8(), z15);
        if (z14) {
            g9(z15);
        }
    }

    public final void i9(boolean z13) {
        GestaltText gestaltText = this.K0;
        if (gestaltText == null) {
            Intrinsics.r("commentSortLabel");
            throw null;
        }
        if (!z13) {
            pk.a0.k0(gestaltText);
            return;
        }
        pk.a0.p(gestaltText, getString(ob2.f.comments_sort_by) + getString(this.f108197c1));
        pk.a0.w1(gestaltText);
    }

    @Override // yq0.t
    public final androidx.recyclerview.widget.g2 l8() {
        return new androidx.recyclerview.widget.s();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(ob2.d.fragment_unified_comment_feed, ob2.c.p_recycler_view);
        eVar.f979c = ob2.c.empty_state_container;
        eVar.b(ob2.c.loading_container);
        return eVar;
    }

    @Override // com.pinterest.feature.unifiedcomments.d
    public void n0() {
        Y8().g0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    @Override // yk1.k, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.k.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108197c1 = c9().a(lh0.a4.f83297a) ? ob2.f.sort_by_newest : ob2.f.sort_by_top;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(nl1.e.recycler_adapter_view);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), bs1.c.W(recyclerView, ob2.a.comment_feed_margin_bottom_tall));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.V0 = recyclerView;
        View findViewById2 = onCreateView.findViewById(ob2.c.comment_feed_animation_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.T0 = (RelativeLayout) findViewById2;
        View findViewById3 = onCreateView.findViewById(ob2.c.comments_feed);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = onCreateView.findViewById(ob2.c.comment_reaction_header);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        PinCommentReactionHeaderView pinCommentReactionHeaderView = (PinCommentReactionHeaderView) findViewById4;
        Intrinsics.checkNotNullParameter(pinCommentReactionHeaderView, "<set-?>");
        this.H0 = pinCommentReactionHeaderView;
        View findViewById5 = onCreateView.findViewById(ob2.c.community_insight_comment_header);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.I0 = (PinCommentReactionHeaderView) findViewById5;
        View findViewById6 = onCreateView.findViewById(ob2.c.pin_title_header);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.J0 = (PinTitleHeaderView) findViewById6;
        View findViewById7 = onCreateView.findViewById(ob2.c.sort_by);
        GestaltText gestaltText = (GestaltText) findViewById7;
        int i13 = 0;
        gestaltText.j(new a(this, i13));
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.K0 = gestaltText;
        View findViewById8 = onCreateView.findViewById(ob2.c.highlight_education_banner);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.L0 = (LegoBannerView) findViewById8;
        View findViewById9 = onCreateView.findViewById(ob2.c.comment_bottom_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById9;
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.M0 = linearLayout;
        View findViewById10 = onCreateView.findViewById(ob2.c.comment_starters_hscroll);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.N0 = (HorizontalScrollView) findViewById10;
        View findViewById11 = onCreateView.findViewById(ob2.c.comment_starters);
        CommentsQuickReplies commentsQuickReplies = (CommentsQuickReplies) findViewById11;
        commentsQuickReplies.l(getF143270o0());
        commentsQuickReplies.m(getN0());
        commentsQuickReplies.i(b7(), getPinUid());
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.O0 = commentsQuickReplies;
        View findViewById12 = onCreateView.findViewById(ob2.c.engagement_details_header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        EngagementDetailsHeaderView engagementDetailsHeaderView = (EngagementDetailsHeaderView) findViewById12;
        Intrinsics.checkNotNullParameter(engagementDetailsHeaderView, "<set-?>");
        this.S0 = engagementDetailsHeaderView;
        View findViewById13 = onCreateView.findViewById(ob2.c.comment_composer);
        CommentComposerView commentComposerView = (CommentComposerView) findViewById13;
        commentComposerView.Y0();
        commentComposerView.r0(new f(this, i13));
        commentComposerView.L0(new g(this));
        commentComposerView.K0(new h(this));
        commentComposerView.t0(h32.g0.COMMENT_FEED);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "apply(...)");
        Intrinsics.checkNotNullParameter(commentComposerView, "<set-?>");
        this.R0 = commentComposerView;
        View findViewById14 = onCreateView.findViewById(ob2.c.photo_detail_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById14;
        int i14 = 1;
        if (!hf0.b.q()) {
            constraintLayout.setBackgroundResource(ob2.b.comment_thread_image_detail_full_height_background);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById14, "apply(...)");
        this.P0 = constraintLayout;
        View findViewById15 = onCreateView.findViewById(ob2.c.photo_detail_close);
        ((GestaltIconButton) findViewById15).u(new a(this, i14));
        Intrinsics.checkNotNullExpressionValue(findViewById15, "apply(...)");
        View findViewById16 = onCreateView.findViewById(ob2.c.photo_detail_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.Q0 = (WebImageView) findViewById16;
        f9(false);
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Iterator it = this.f108195a1.iterator();
        while (it.hasNext()) {
            xj2.c cVar = (xj2.c) it.next();
            if (!cVar.isDisposed()) {
                cVar.dispose();
            }
        }
        super.onDestroyView();
    }

    @Override // yq0.t, sq0.b0
    public final void onLoadMoreComplete() {
        if (!this.Y0) {
            RecyclerView g83 = g8();
            if (g83 != null) {
                g83.post(this.f108200f1);
            }
            this.Y0 = true;
        }
        super.onLoadMoreComplete();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onPause() {
        f7().j(this.f108196b1);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f7().h(this.f108196b1);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        v8();
        zy.m[] mVarArr = {new tq0.g(s7(), z7().c(getPinUid()))};
        tq0.h hVar = this.U0;
        hVar.n(mVarArr);
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
        super.onViewCreated(v13, bundle);
    }
}
