package xo;

import a.cb;
import a.l2;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.f0;
import nx.j0;
import so.jb;
import so.oa;
import x02.a2;
import x02.x0;

/* loaded from: classes3.dex */
public final class i extends jc0.b implements bp.f, nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135511a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f135512b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f135513c;

    /* renamed from: d, reason: collision with root package name */
    public final ap.o f135514d;

    /* renamed from: e, reason: collision with root package name */
    public final gi.m f135515e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f135516f;

    /* renamed from: g, reason: collision with root package name */
    public final x92.b f135517g;

    /* renamed from: h, reason: collision with root package name */
    public final c2 f135518h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f135519i;

    /* renamed from: j, reason: collision with root package name */
    public final xj2.b f135520j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.t f135521k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f135522l;

    public i(v7 board, x0 boardRepository, ap.o uploadContactsUtil, f0 pinalyticsFactory, m60.w eventManager, gi.m boardInviteUtils, x92.b graphQLBoardCollaboratorRemoteDataSource, c2 sharesheetUtils, int i13) {
        this.f135511a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(board, "board");
            Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
            Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
            Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
            Intrinsics.checkNotNullParameter(graphQLBoardCollaboratorRemoteDataSource, "graphQLBoardCollaboratorRemoteDataSource");
            Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
            this.f135512b = board;
            this.f135513c = boardRepository;
            this.f135514d = uploadContactsUtil;
            this.f135515e = boardInviteUtils;
            this.f135516f = true;
            this.f135517g = graphQLBoardCollaboratorRemoteDataSource;
            this.f135518h = sharesheetUtils;
            this.f135519i = ((nx.m) pinalyticsFactory).a(this);
            this.f135520j = new xj2.b();
            this.f135521k = new h(this, eventManager);
            return;
        }
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(graphQLBoardCollaboratorRemoteDataSource, "graphQLBoardCollaboratorRemoteDataSource");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f135512b = board;
        this.f135513c = boardRepository;
        this.f135514d = uploadContactsUtil;
        this.f135515e = boardInviteUtils;
        this.f135516f = true;
        this.f135517g = graphQLBoardCollaboratorRemoteDataSource;
        this.f135518h = sharesheetUtils;
        this.f135519i = ((nx.m) pinalyticsFactory).a(this);
        this.f135520j = new xj2.b();
        this.f135521k = new z(this, eventManager);
    }

    @Override // jc0.b
    public final void applyInsetMode(yf0.h insetMode, ViewGroup modalViewWrapper) {
        switch (this.f135511a) {
            case 0:
                Intrinsics.checkNotNullParameter(insetMode, "insetMode");
                Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
                c3.m((BaseModalViewWrapper) modalViewWrapper, true);
                break;
            default:
                Intrinsics.checkNotNullParameter(insetMode, "insetMode");
                Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
                c3.m((BaseModalViewWrapper) modalViewWrapper, true);
                break;
        }
    }

    public final void b(wy0 invitedUser) {
        int i13 = this.f135511a;
        int i14 = 1;
        j0 j0Var = this.f135519i;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(invitedUser, "invitedUser");
                if (((b60.d) com.bumptech.glide.d.E()).f() != null) {
                    wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                    if (Intrinsics.d(f13 != null ? f13.getUid() : null, invitedUser.getUid())) {
                        j0Var.F(g0.USER_FEED, u0.BOARD_LEAVE_BUTTON);
                        int i15 = d70.g.leave_board__title;
                        int i16 = d70.g.leave_board_check;
                        int i17 = d70.g.leave_board;
                        Context context = getModalViewWrapper().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        yb0.n nVar = new yb0.n(context);
                        Resources resources = getModalViewWrapper().getResources();
                        String string = resources.getString(i15);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        nVar.w(string);
                        nVar.u(resources.getString(i16));
                        String string2 = resources.getString(i17);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        nVar.q(string2);
                        String string3 = resources.getString(m60.x0.cancel);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        nVar.m(string3);
                        nVar.f138513j = new l2(this, 11);
                        cb.x(nVar, m60.u.f85943a);
                        break;
                    }
                }
                j0Var.F(g0.USER_FEED, u0.REMOVE_BUTTON);
                if (invitedUser.Z2() != null && (!kotlin.text.z.j(r0))) {
                    Resources resources2 = getModalViewWrapper().getResources();
                    Context context2 = getModalViewWrapper().getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    yb0.n nVar2 = new yb0.n(context2);
                    String string4 = resources2.getString(d70.g.remove_board_collaborator_confirmation, invitedUser.Z2());
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    nVar2.w(string4);
                    String string5 = resources2.getString(m60.x0.remove);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    nVar2.q(string5);
                    String string6 = resources2.getString(m60.x0.cancel);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    nVar2.m(string6);
                    nVar2.f138513j = new co.a(i14, this, invitedUser);
                    cb.x(nVar2, m60.u.f85943a);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(invitedUser, "invitedUser");
                if (((b60.d) com.bumptech.glide.d.E()).f() != null) {
                    wy0 f14 = ((b60.d) com.bumptech.glide.d.E()).f();
                    if (Intrinsics.d(f14 != null ? f14.getUid() : null, invitedUser.getUid())) {
                        j0Var.F(g0.USER_FEED, u0.BOARD_LEAVE_BUTTON);
                        int i18 = d70.g.leave_board__title;
                        int i19 = d70.g.leave_board_check;
                        int i23 = d70.g.leave_board;
                        Context context3 = getModalViewWrapper().getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        yb0.n nVar3 = new yb0.n(context3);
                        Resources resources3 = getModalViewWrapper().getResources();
                        String string7 = resources3.getString(i18);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        nVar3.w(string7);
                        nVar3.u(resources3.getString(i19));
                        String string8 = resources3.getString(i23);
                        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        nVar3.q(string8);
                        String string9 = resources3.getString(m60.x0.cancel);
                        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                        nVar3.m(string9);
                        nVar3.f138513j = new l2(this, 12);
                        cb.x(nVar3, m60.u.f85943a);
                        break;
                    }
                }
                j0Var.F(g0.USER_FEED, u0.REMOVE_BUTTON);
                if (invitedUser.Z2() != null && (!kotlin.text.z.j(r0))) {
                    Resources resources4 = getModalViewWrapper().getResources();
                    Context context4 = getModalViewWrapper().getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    yb0.n nVar4 = new yb0.n(context4);
                    String string10 = resources4.getString(d70.g.remove_board_collaborator_confirmation, invitedUser.Z2());
                    Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                    nVar4.w(string10);
                    String string11 = resources4.getString(m60.x0.remove);
                    Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                    nVar4.q(string11);
                    String string12 = resources4.getString(m60.x0.cancel);
                    Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                    nVar4.m(string12);
                    nVar4.f138513j = new co.a(3, this, invitedUser);
                    cb.x(nVar4, m60.u.f85943a);
                    break;
                }
                break;
        }
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        int i13 = this.f135511a;
        boolean z13 = this.f135516f;
        v7 board = this.f135512b;
        xj2.b bVar = this.f135520j;
        int i14 = 1;
        x0 x0Var = this.f135513c;
        m60.t tVar = this.f135521k;
        int i15 = 0;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context, false);
                modalViewWrapper.j(g.f135506j);
                m60.u.f85943a.h(tVar);
                bVar.a(x0Var.B().F(new vo.a(2, new e(this, i14)), a2Var, cVar, a2Var));
                Boolean valueOf = Boolean.valueOf(z13);
                q qVar = new q(context, null, 0);
                if (!qVar.f135533b) {
                    qVar.f135533b = true;
                    jb jbVar = (jb) ((r) qVar.generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    qVar.f135541j = (x0) oaVar.f113765k3.get();
                    qVar.f135542k = jbVar.f113485c.x5();
                    qVar.f135543l = (m60.w) oaVar.f113885r0.get();
                    qVar.f135544m = oa.x0(oaVar);
                    qVar.f135545n = oa.T1(oaVar);
                    qVar.f135546o = oaVar.q2();
                    qVar.f135547p = (f12.a) oaVar.H6.get();
                    qVar.f135548q = (b60.b) oaVar.f113850p0.get();
                }
                View.inflate(qVar.getContext(), d70.e.view_board_collaborators_modal, qVar);
                qVar.setOrientation(1);
                qVar.f135534c = (PinterestSwipeRefreshLayout) qVar.findViewById(d70.d.swipe_container);
                qVar.f135535d = (RecyclerView) qVar.findViewById(d70.d.recycler_view);
                GestaltText gestaltText = (GestaltText) qVar.findViewById(d70.d.add_btn_bottom);
                qVar.f135536e = gestaltText;
                qVar.f135537f = (LinearLayout) qVar.findViewById(j70.a.board_permission_setting_cell_container);
                qVar.f135538g = (GestaltText) qVar.findViewById(j70.a.board_permission_setting_cell_header);
                qVar.f135539h = (BoardPermissionSettingCell) qVar.findViewById(j70.a.board_permission_setting_cell);
                qVar.f135540i = (RelativeLayout) qVar.findViewById(d70.d.disallowed_add_collaborator_container);
                gestaltText.j(new k(qVar, i15));
                qVar.setLayoutTransition(new LayoutTransition());
                qVar.f135550s = board;
                qVar.f135552u = this;
                qVar.f135553v = valueOf;
                this.f135522l = qVar;
                modalViewWrapper.t(qVar);
                modalViewWrapper.l(d70.g.board_collaborators_short);
                return modalViewWrapper;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper2 = new ModalViewWrapper(context, false);
                modalViewWrapper2.j(g.f135507k);
                m60.u.f85943a.h(tVar);
                bVar.a(x0Var.B().F(new vo.a(7, new y(this, i14)), a2Var, cVar, a2Var));
                int i16 = d0.f135473x;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(this, "itemClickListener");
                d0 d0Var = new d0(context, null, 0, 0);
                View.inflate(d0Var.getContext(), d70.e.view_manage_board_collaborators_modal, d0Var);
                d0Var.setOrientation(1);
                View findViewById = d0Var.findViewById(d70.d.swipe_container);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                d0Var.f135474d = (PinterestSwipeRefreshLayout) findViewById;
                View findViewById2 = d0Var.findViewById(d70.d.recycler_view);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                d0Var.f135475e = (RecyclerView) findViewById2;
                View findViewById3 = d0Var.findViewById(d70.d.recycler_view_2);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                d0Var.f135476f = (PinterestRecyclerView) findViewById3;
                View findViewById4 = d0Var.findViewById(j70.a.board_permission_setting_cell_container);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                d0Var.f135477g = (LinearLayout) findViewById4;
                View findViewById5 = d0Var.findViewById(j70.a.board_permission_setting_cell_header);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                d0Var.f135478h = (GestaltText) findViewById5;
                View findViewById6 = d0Var.findViewById(j70.a.board_permission_setting_cell);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                d0Var.f135479i = (BoardPermissionSettingCell) findViewById6;
                View findViewById7 = d0Var.findViewById(d70.d.board_invite_friends_container);
                Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
                ((LinearLayout) findViewById7).setOnClickListener(new l2(d0Var, 13));
                View findViewById8 = d0Var.findViewById(d70.d.invite_people);
                Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
                pk.a0.v((GestaltText) findViewById8);
                d0Var.setLayoutTransition(new LayoutTransition());
                d0Var.f135489s = board;
                d0Var.f135490t = this;
                d0Var.f135493w = Boolean.valueOf(z13);
                this.f135522l = d0Var;
                modalViewWrapper2.t(d0Var);
                modalViewWrapper2.l(d70.g.manage_collaborators);
                GestaltText gestaltText2 = modalViewWrapper2.f44750b;
                if (gestaltText2 != null) {
                    gestaltText2.i(f.f135499m);
                }
                GestaltText gestaltText3 = modalViewWrapper2.f44750b;
                if (gestaltText3 != null) {
                    gestaltText3.setPaddingRelative(0, 0, context.getResources().getDimensionPixelSize(r0.margin_triple), 0);
                }
                return modalViewWrapper2;
        }
    }

    public final void g(wy0 invitedUser) {
        switch (this.f135511a) {
            case 0:
                Intrinsics.checkNotNullParameter(invitedUser, "invitedUser");
                r41.k kVar = r41.k.f106176a;
                String uid = invitedUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                kVar.d(uid, r41.b.CollaboratorModal);
                m60.u.f85943a.d(new jc0.q(true));
                break;
            default:
                Intrinsics.checkNotNullParameter(invitedUser, "invitedUser");
                r41.k kVar2 = r41.k.f106176a;
                String uid2 = invitedUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                kVar2.d(uid2, r41.b.CollaboratorModal);
                m60.u.f85943a.d(new jc0.q(true));
                break;
        }
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        switch (this.f135511a) {
        }
        return new i0(d4.BOARD, null, null, null, null, null);
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        switch (this.f135511a) {
            case 0:
                m60.u.f85943a.j(this.f135521k);
                if (!this.f135520j.f135163b) {
                    this.f135520j.dispose();
                }
                this.f135519i.onDestroy();
                break;
            default:
                m60.u.f85943a.j(this.f135521k);
                if (!this.f135520j.f135163b) {
                    this.f135520j.dispose();
                }
                this.f135519i.onDestroy();
                break;
        }
    }
}
