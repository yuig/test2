package wr0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentsQuickReplies;
import com.pinterest.feature.engagementtab.FloatingCommentView;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import so.o7;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwr0/j;", "Lrh1/k;", "Lwr0/g;", "<init>", "()V", "engagementTab_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends c0 implements g {

    /* renamed from: l1, reason: collision with root package name */
    public o7 f130895l1;

    /* renamed from: m1, reason: collision with root package name */
    public q11.a f130896m1;

    /* renamed from: n1, reason: collision with root package name */
    public r f130897n1;

    /* renamed from: o1, reason: collision with root package name */
    public FloatingCommentView f130898o1;

    /* renamed from: p1, reason: collision with root package name */
    public final AlphaAnimation f130899p1;

    /* renamed from: q1, reason: collision with root package name */
    public final AlphaAnimation f130900q1;

    /* renamed from: r1, reason: collision with root package name */
    public final d4 f130901r1;

    public j() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new h(this, 1));
        this.f130899p1 = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new h(this, 0));
        this.f130900q1 = alphaAnimation2;
        this.f130901r1 = d4.SOCIAL_MANAGER;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ((GestaltToolbarImpl) toolbar).b0(getResources().getString(mg0.c.engagement_tab_title));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        o7 o7Var = this.f130895l1;
        if (o7Var == null) {
            Intrinsics.r("engagementTabDetailsPresenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        String str = f49940b == null ? "" : f49940b;
        String pinUid = getPinUid();
        String b93 = b9();
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_COMMENT_TYPE") : null;
        String str2 = v03 == null ? "" : v03;
        Navigation navigation3 = this.I;
        String v04 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_ENGAGEMENT_PARENT_COMMENT_UID") : null;
        r a13 = o7Var.a(new nh1.a(pinUid, str, null, null, null, null, null, null, null, null, null, false, false, null, b93, str2, v04 == null ? "" : v04, null, null, 3211260));
        this.f130897n1 = a13;
        return a13;
    }

    @Override // rh1.k, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF123885d0() {
        return this.f130901r1;
    }

    public final FloatingCommentView l9() {
        FloatingCommentView floatingCommentView = this.f130898o1;
        if (floatingCommentView != null) {
            return floatingCommentView;
        }
        Intrinsics.r("floatingCommentView");
        throw null;
    }

    public final void m9() {
        RecyclerView g83 = g8();
        l2 l2Var = g83 != null ? g83.f19242n : null;
        LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
        if (linearLayoutManager != null) {
            int l13 = linearLayoutManager.l1();
            r rVar = this.f130897n1;
            if (rVar != null) {
                rVar.t4(l13);
            } else {
                Intrinsics.r("engagementTabDetailsViewListener");
                throw null;
            }
        }
    }

    @Override // rh1.k, com.pinterest.feature.unifiedcomments.d
    public final void n0() {
        CommentComposerView.T(Y8());
    }

    @Override // rh1.k, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ob2.c.floating_comment_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FloatingCommentView floatingCommentView = (FloatingCommentView) findViewById;
        Intrinsics.checkNotNullParameter(floatingCommentView, "<set-?>");
        this.f130898o1 = floatingCommentView;
        return onCreateView;
    }

    @Override // rh1.k, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        fo1.a i73 = i7();
        if (i73 != null) {
            rm1.q qVar = rm1.q.ARROW_BACK;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
            gestaltToolbarImpl.o();
            gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, x0.cancel);
            gestaltToolbarImpl.m();
        }
        HorizontalScrollView horizontalScrollView = this.N0;
        if (horizontalScrollView == null) {
            Intrinsics.r("commentStarterHscroll");
            throw null;
        }
        bs1.c.X0(horizontalScrollView);
        CommentsQuickReplies commentsQuickReplies = this.O0;
        if (commentsQuickReplies == null) {
            Intrinsics.r("commentStarters");
            throw null;
        }
        bs1.c.X0(commentsQuickReplies);
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext3);
        String string = legoEmptyStateView.getResources().getString(ob2.f.comment_empty_state_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoEmptyStateView.e(string);
        legoEmptyStateView.g(vn1.g.BODY_300);
        O8(legoEmptyStateView, 49);
        b8(new androidx.recyclerview.widget.c0(new i(this, 0)));
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(ob2.c.toolbar);
    }
}
