package g51;

import a41.u;
import android.view.View;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.v7;
import com.pinterest.feature.profile.savedtab.view.LegoBoardInviteProfileCell;
import com.pinterest.ui.components.banners.LegoBannerView;
import com.pinterest.ui.components.banners.LegoBoardInviteBannerView;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import x02.x0;
import x02.x2;
import yk1.r;

/* loaded from: classes5.dex */
public final class c extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f63578a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f63579b;

    /* renamed from: c, reason: collision with root package name */
    public final d51.b f63580c;

    /* renamed from: d, reason: collision with root package name */
    public final gi.m f63581d;

    /* renamed from: e, reason: collision with root package name */
    public final g70.h f63582e;

    /* renamed from: f, reason: collision with root package name */
    public k8 f63583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x2 userRepository, x0 boardRepository, uk1.d presenterPinalytics, q networkStateStream, d51.b bVar, gi.m boardInviteUtils, g70.h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f63578a = userRepository;
        this.f63579b = boardRepository;
        this.f63580c = bVar;
        this.f63581d = boardInviteUtils;
        this.f63582e = boardNavigator;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        d51.e view = (d51.e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        k8 k8Var = this.f63583f;
        if (k8Var != null) {
            q3(k8Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [g51.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [g51.a, java.lang.Object] */
    public final void q3(final k8 k8Var) {
        final int i13 = 0;
        final int i14 = 1;
        xj2.c F = q.h(this.f63578a.g0().L(k8Var.f39331a), this.f63579b.S(k8Var.f39332b), new mj.m(20)).F(new u(25, new b(this, i13)), new u(26, new b(this, i14)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        d51.e eVar = (d51.e) getView();
        ?? onClickListener = new View.OnClickListener(this) { // from class: g51.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f63574b;

            {
                this.f63574b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                k8 invite = k8Var;
                c this$0 = this.f63574b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(invite, "$invite");
                        this$0.f63581d.b(invite.f39332b);
                        d51.b bVar = this$0.f63580c;
                        if (bVar != null) {
                            d51.d dVar = bVar.f53686a;
                            if (dVar.a() > 0) {
                                dVar.removeItem(0);
                            }
                        }
                        ((d51.e) this$0.getView()).setVisibility(8);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(invite, "$invite");
                        gi.m mVar = this$0.f63581d;
                        String boardId = invite.f39332b;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(boardId, "boardId");
                        fw.f37821a.getClass();
                        v7 b13 = gw.b(boardId);
                        if (b13 != null) {
                            d0 a13 = sh.f.a();
                            Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                            a13.b0(u0.DECLINE_BUTTON, null, b13.getId(), false);
                            h12.a aVar = (h12.a) mVar.f65093b;
                            String boardId2 = b13.getId();
                            Intrinsics.checkNotNullExpressionValue(boardId2, "getUid(...)");
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(boardId2, "boardId");
                            fk2.c l13 = aVar.f66466a.a(boardId2).h(wj2.c.a()).l(tk2.e.f118017c);
                            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                            nl.b.r(l13, new db.m(b13, 4), null, 2);
                        }
                        d51.b bVar2 = this$0.f63580c;
                        if (bVar2 != null) {
                            d51.d dVar2 = bVar2.f53686a;
                            if (dVar2.a() > 0) {
                                dVar2.removeItem(0);
                            }
                        }
                        ((d51.e) this$0.getView()).setVisibility(8);
                        break;
                }
            }
        };
        LegoBoardInviteProfileCell legoBoardInviteProfileCell = (LegoBoardInviteProfileCell) eVar;
        legoBoardInviteProfileCell.getClass();
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        LegoBannerView legoBannerView = legoBoardInviteProfileCell.f47589h;
        if (legoBannerView != null) {
            j51.n action = new j51.n(onClickListener, legoBoardInviteProfileCell, i13);
            Intrinsics.checkNotNullParameter(action, "action");
            legoBannerView.f52263r = action;
        }
        LegoBoardInviteBannerView legoBoardInviteBannerView = legoBoardInviteProfileCell.f47590i;
        if (legoBoardInviteBannerView != null) {
            j51.n action2 = new j51.n(onClickListener, legoBoardInviteProfileCell, i14);
            Intrinsics.checkNotNullParameter(action2, "action");
            legoBoardInviteBannerView.f52283l = action2;
        }
        d51.e eVar2 = (d51.e) getView();
        ?? onClickListener2 = new View.OnClickListener(this) { // from class: g51.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f63574b;

            {
                this.f63574b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                k8 invite = k8Var;
                c this$0 = this.f63574b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(invite, "$invite");
                        this$0.f63581d.b(invite.f39332b);
                        d51.b bVar = this$0.f63580c;
                        if (bVar != null) {
                            d51.d dVar = bVar.f53686a;
                            if (dVar.a() > 0) {
                                dVar.removeItem(0);
                            }
                        }
                        ((d51.e) this$0.getView()).setVisibility(8);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(invite, "$invite");
                        gi.m mVar = this$0.f63581d;
                        String boardId = invite.f39332b;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(boardId, "boardId");
                        fw.f37821a.getClass();
                        v7 b13 = gw.b(boardId);
                        if (b13 != null) {
                            d0 a13 = sh.f.a();
                            Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                            a13.b0(u0.DECLINE_BUTTON, null, b13.getId(), false);
                            h12.a aVar = (h12.a) mVar.f65093b;
                            String boardId2 = b13.getId();
                            Intrinsics.checkNotNullExpressionValue(boardId2, "getUid(...)");
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(boardId2, "boardId");
                            fk2.c l13 = aVar.f66466a.a(boardId2).h(wj2.c.a()).l(tk2.e.f118017c);
                            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                            nl.b.r(l13, new db.m(b13, 4), null, 2);
                        }
                        d51.b bVar2 = this$0.f63580c;
                        if (bVar2 != null) {
                            d51.d dVar2 = bVar2.f53686a;
                            if (dVar2.a() > 0) {
                                dVar2.removeItem(0);
                            }
                        }
                        ((d51.e) this$0.getView()).setVisibility(8);
                        break;
                }
            }
        };
        LegoBoardInviteProfileCell legoBoardInviteProfileCell2 = (LegoBoardInviteProfileCell) eVar2;
        legoBoardInviteProfileCell2.getClass();
        Intrinsics.checkNotNullParameter(onClickListener2, "onClickListener");
        LegoBannerView legoBannerView2 = legoBoardInviteProfileCell2.f47589h;
        if (legoBannerView2 != null) {
            j51.n action3 = new j51.n(onClickListener2, legoBoardInviteProfileCell2, 2);
            Intrinsics.checkNotNullParameter(action3, "action");
            legoBannerView2.f52264s = action3;
        }
        LegoBoardInviteBannerView legoBoardInviteBannerView2 = legoBoardInviteProfileCell2.f47590i;
        if (legoBoardInviteBannerView2 != null) {
            j51.n action4 = new j51.n(onClickListener2, legoBoardInviteProfileCell2, 3);
            Intrinsics.checkNotNullParameter(action4, "action");
            legoBoardInviteBannerView2.f52284m = action4;
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        d51.e view = (d51.e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        k8 k8Var = this.f63583f;
        if (k8Var != null) {
            q3(k8Var);
        }
    }
}
