package zk0;

import ck2.i;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.detail.invite.view.lego.LegoBoardDetailInviteView;
import com.pinterest.ui.components.banners.LegoBannerView;
import df.j1;
import dl1.l;
import dl1.t;
import ha2.j;
import kl0.u;
import kl0.z;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp.m;
import m60.w;
import m60.x0;
import x02.x2;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class e extends yk1.b implements yk0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f142088a;

    /* renamed from: b, reason: collision with root package name */
    public final oc.c f142089b;

    /* renamed from: c, reason: collision with root package name */
    public final t f142090c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f142091d;

    /* renamed from: e, reason: collision with root package name */
    public final v f142092e;

    /* renamed from: f, reason: collision with root package name */
    public final w f142093f;

    /* renamed from: g, reason: collision with root package name */
    public final m f142094g;

    /* renamed from: h, reason: collision with root package name */
    public final gi.m f142095h;

    /* renamed from: i, reason: collision with root package name */
    public final pb0.d f142096i;

    /* renamed from: j, reason: collision with root package name */
    public final b60.b f142097j;

    /* renamed from: k, reason: collision with root package name */
    public v7 f142098k;

    /* renamed from: l, reason: collision with root package name */
    public String f142099l;

    /* renamed from: m, reason: collision with root package name */
    public final c f142100m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String boardId, oc.c apolloClient, t boardRepository, x2 userRepository, v viewResources, w eventManager, m contactRequestUtils, gi.m boardInviteUtils, pb0.d fuzzyDateFormatter, b60.b activeUserManager) {
        super(0);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(contactRequestUtils, "contactRequestUtils");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f142088a = boardId;
        this.f142089b = apolloClient;
        this.f142090c = boardRepository;
        this.f142091d = userRepository;
        this.f142092e = viewResources;
        this.f142093f = eventManager;
        this.f142094g = contactRequestUtils;
        this.f142095h = boardInviteUtils;
        this.f142096i = fuzzyDateFormatter;
        this.f142097j = activeUserManager;
        this.f142100m = new c(this);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        yk0.b view = (yk0.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f142093f.h(this.f142100m);
        LegoBoardDetailInviteView legoBoardDetailInviteView = (LegoBoardDetailInviteView) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        legoBoardDetailInviteView.f45229c = this;
        al0.a action = new al0.a(legoBoardDetailInviteView, 0);
        LegoBannerView legoBannerView = legoBoardDetailInviteView.f45232f;
        legoBannerView.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        legoBannerView.f52263r = action;
        int i13 = 1;
        al0.a action2 = new al0.a(legoBoardDetailInviteView, i13);
        Intrinsics.checkNotNullParameter(action2, "action");
        legoBannerView.f52264s = action2;
        xj2.c F = ((l) this.f142090c).S(this.f142088a).H(tk2.e.f118017c).A(wj2.c.a()).F(new b(0, new a(this, i13)), new b(1, d.f142087i), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f142093f.j(this.f142100m);
        super.onUnbind();
    }

    public final void p3() {
        if (isBound()) {
            LegoBoardDetailInviteView legoBoardDetailInviteView = (LegoBoardDetailInviteView) ((yk0.b) getView());
            bs1.c.X0(legoBoardDetailInviteView.f45232f);
            u uVar = legoBoardDetailInviteView.f45233g;
            if (uVar != null) {
                LegoBoardDetailInviteView this_apply = uVar.f80117b;
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                z.k9(uVar.f80116a, this_apply, false);
            }
        }
    }

    public final void q3(wy0 sender) {
        String Z2;
        Intrinsics.checkNotNullParameter(sender, "sender");
        if (!isBound() || (Z2 = sender.Z2()) == null || Z2.length() == 0) {
            p3();
            return;
        }
        r3(sender.l3());
        ((LegoBoardDetailInviteView) ((yk0.b) getView())).b(((yk1.a) this.f142092e).f139224a.getString(x0.board_inivite_msg_new, sender.Z2()), null, null);
        ((LegoBoardDetailInviteView) ((yk0.b) getView())).g();
    }

    public final void r3(String str) {
        yk0.b bVar = (yk0.b) getView();
        Unit unit = null;
        if (!j1.d1(str)) {
            str = null;
        }
        LegoBannerView legoBannerView = ((LegoBoardDetailInviteView) bVar).f45232f;
        ja2.c imageStyle = ja2.c.Circular;
        legoBannerView.getClass();
        Intrinsics.checkNotNullParameter(imageStyle, "imageStyle");
        if (legoBannerView.f52270y != imageStyle) {
            legoBannerView.f52270y = imageStyle;
            bs1.c.R1(legoBannerView.f52257l, imageStyle == ja2.c.RoundedCorners);
            legoBannerView.f52258m.H2(new j(imageStyle, 1));
            String str2 = legoBannerView.f52271z;
            if (str2 != null) {
                legoBannerView.X(str2);
            }
            legoBannerView.requestLayout();
        }
        if (str != null) {
            legoBannerView.Y(str);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            legoBannerView.D();
        }
    }
}
