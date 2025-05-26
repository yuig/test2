package cp;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import i32.y0;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import so.w6;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcp/u;", "Lwk1/k;", "Ldl1/s;", "Lrb2/p;", "Lnr0/j;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class u extends e0<dl1.s> implements rb2.p {

    /* renamed from: h1, reason: collision with root package name */
    public static final /* synthetic */ int f52973h1 = 0;
    public xj2.b R0;
    public rb2.q S0;
    public NotifsOptInUpsellBannerView T0;
    public rg0.s U0;
    public w6 V0;
    public i2 W0;
    public fp.b X0;
    public r20.a Y0;
    public yk1.j Z0;

    /* renamed from: a1, reason: collision with root package name */
    public androidx.appcompat.widget.x f52974a1;

    /* renamed from: b1, reason: collision with root package name */
    public no1.d f52975b1;

    /* renamed from: c1, reason: collision with root package name */
    public lb0.q f52976c1;

    /* renamed from: d1, reason: collision with root package name */
    public final d4 f52977d1 = d4.CONVERSATION;

    /* renamed from: e1, reason: collision with root package name */
    public final a4 f52978e1 = a4.CONVERSATION_INBOX;

    /* renamed from: f1, reason: collision with root package name */
    public final q f52979f1 = new q(this);

    /* renamed from: g1, reason: collision with root package name */
    public final p f52980g1 = new p(this);

    @Override // nl1.d
    public final void I7() {
        nx.d0.v(s7(), f1.CONVERSATION_INBOX_VIEWED, null, false, 12);
        super.I7();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().h(this.f52980g1);
        f7().h(this.f52979f1);
        androidx.appcompat.widget.x xVar = this.f52974a1;
        if (xVar == null) {
            Intrinsics.r("inboxBadgeManager");
            throw null;
        }
        xVar.k();
        rg0.s sVar = this.U0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n c13 = ((dh0.d) sVar).c(y0.ANDROID_INBOX_TAKEOVER);
        if (c13 != null) {
            if (c13.f108060b == i32.l.ANDROID_INBOX_MESSAGE_NOTIFS_OPT_IN_BANNER.value()) {
                r20.a aVar = this.Y0;
                if (aVar == null) {
                    Intrinsics.r("notificationSettingsService");
                    throw null;
                }
                hp.d dVar = new hp.d(c13, s7(), aVar);
                NotifsOptInUpsellBannerView notifsOptInUpsellBannerView = this.T0;
                if (notifsOptInUpsellBannerView != null) {
                    yk1.j jVar = this.Z0;
                    if (jVar == null) {
                        Intrinsics.r("mvpBinder");
                        throw null;
                    }
                    jVar.d(notifsOptInUpsellBannerView, dVar);
                }
                k3.R1(this.T0, true);
                c13.g();
                s7().N(f1.VIEW, null, g0.INBOX_NOTIFS_OPT_IN_BANNER_VIEW_UPSELL, com.bumptech.glide.d.Q(getActiveUserManager()).getUid(), false);
                return;
            }
        }
        k3.R1(this.T0, false);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        rg0.s sVar = this.U0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        if (((dh0.d) sVar).b(y0.ANDROID_INBOX_TAKEOVER) == null) {
            k3.R1(this.T0, false);
        }
        j9();
        super.L7();
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(3, new r(this, 5));
        adapter.G(18, new r(this, 6));
        adapter.G(5, new r(this, 7));
        adapter.G(4, new r(this, 8));
        adapter.G(0, new r(this, 9));
        adapter.G(1, new r(this, 10));
        adapter.G(23, new r(this, 11));
        adapter.G(17, new r(this, 12));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER, new r(this, 13));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER, new r(this, 1));
        adapter.G(20, new r(this, 2));
        adapter.G(22, new r(this, 3));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER, new r(this, 4));
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a gestaltToolbar) {
        Intrinsics.checkNotNullParameter(gestaltToolbar, "gestaltToolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) gestaltToolbar;
        gestaltToolbarImpl.G();
        gestaltToolbarImpl.Y(xc0.i.messages);
        gestaltToolbarImpl.m();
    }

    @Override // yq0.t, se0.k
    public final void V1() {
        j9();
        androidx.appcompat.widget.x xVar = this.f52974a1;
        if (xVar == null) {
            Intrinsics.r("inboxBadgeManager");
            throw null;
        }
        xVar.k();
        super.V1();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        i2 i2Var = this.W0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        w6 w6Var = this.V0;
        if (w6Var != null) {
            return w6Var.a(a13);
        }
        Intrinsics.r("graphQLConversationPresenterFactory");
        throw null;
    }

    @Override // sq0.e
    public final int X8() {
        return (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getR0() {
        return this.f52978e1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF121078j2() {
        return this.f52977d1;
    }

    public final void j9() {
        fp.b bVar = this.X0;
        if (bVar == null) {
            Intrinsics.r("declinedContactRequests");
            throw null;
        }
        if (bVar.c()) {
            return;
        }
        fp.b bVar2 = this.X0;
        if (bVar2 == null) {
            Intrinsics.r("declinedContactRequests");
            throw null;
        }
        no1.d dVar = this.f52975b1;
        if (dVar != null) {
            bVar2.a(dVar, new r(this, 0));
        } else {
            Intrinsics.r("contactRequestRemoteDataSource");
            throw null;
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(xc0.f.fragment_inbox_swipe_refresh, xc0.e.inbox_recycler_view);
        eVar.c(xc0.e.swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().j(this.f52980g1);
        f7().j(this.f52979f1);
        xj2.b bVar = this.R0;
        if (bVar != null) {
            bVar.dispose();
            this.R0 = null;
        }
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        fo1.a i73;
        Intrinsics.checkNotNullParameter(v13, "v");
        this.R0 = new xj2.b();
        super.onViewCreated(v13, bundle);
        this.T0 = (NotifsOptInUpsellBannerView) v13.findViewById(xc0.e.notifs_optin_upsell_container);
        Navigation navigation = this.I;
        if ((navigation == null || !navigation.S("com.pinterest.EXTRA_IS_DEEPLINK", false)) && (i73 = i7()) != null) {
            ((GestaltToolbarImpl) i73).B();
        }
        View view = getView();
        if (view != null) {
            k3.R1(view.findViewById(xc0.e.inbox_recycler_view), true);
        }
    }
}
