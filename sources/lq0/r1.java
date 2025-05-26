package lq0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.g7;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llq0/r1;", "Lwk1/k;", "Ldl1/s;", "", "Lnr0/j;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r1 extends o1<dl1.s> {

    /* renamed from: d1, reason: collision with root package name */
    public static final /* synthetic */ int f84415d1 = 0;
    public g7 R0;
    public i2 S0;
    public androidx.appcompat.widget.x T0;
    public lh0.p0 U0;
    public rg0.s V0;
    public r20.a W0;
    public yk1.j X0;
    public View Y0;
    public NotifsOptInUpsellBannerView Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final d4 f84416a1 = d4.CONVERSATION;

    /* renamed from: b1, reason: collision with root package name */
    public final a4 f84417b1 = a4.CONVERSATION_MESSAGES_AND_CONTACTS_INBOX;

    /* renamed from: c1, reason: collision with root package name */
    public final p1 f84418c1 = new p1(this);

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().h(this.f84418c1);
        androidx.appcompat.widget.x xVar = this.T0;
        if (xVar == null) {
            Intrinsics.r("inboxBadgeManager");
            throw null;
        }
        xVar.k();
        rg0.s sVar = this.V0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n c13 = ((dh0.d) sVar).c(i32.y0.ANDROID_INBOX_TAKEOVER);
        if (c13 != null) {
            if (c13.f108060b == i32.l.ANDROID_INBOX_MESSAGE_NOTIFS_OPT_IN_BANNER.value()) {
                r20.a aVar = this.W0;
                if (aVar == null) {
                    Intrinsics.r("notificationSettingsService");
                    throw null;
                }
                hp.d dVar = new hp.d(c13, s7(), aVar);
                NotifsOptInUpsellBannerView notifsOptInUpsellBannerView = this.Z0;
                if (notifsOptInUpsellBannerView != null) {
                    yk1.j jVar = this.X0;
                    if (jVar == null) {
                        Intrinsics.r("mvpBinder");
                        throw null;
                    }
                    jVar.d(notifsOptInUpsellBannerView, dVar);
                }
                k3.R1(this.Z0, true);
                c13.g();
                nx.d0 s73 = s7();
                h32.f1 f1Var = h32.f1.VIEW;
                h32.g0 g0Var = h32.g0.INBOX_NOTIFS_OPT_IN_BANNER_VIEW_UPSELL;
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                s73.N(f1Var, null, g0Var, f13 != null ? f13.getUid() : null, false);
                return;
            }
        }
        k3.R1(this.Z0, false);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        rg0.s sVar = this.V0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        if (((dh0.d) sVar).b(i32.y0.ANDROID_INBOX_TAKEOVER) == null) {
            k3.R1(this.Z0, false);
        }
        super.L7();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(3, new q1(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER, new q1(this, 1));
        adapter.G(22, new q1(this, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER, new q1(this, 3));
        lh0.p0 p0Var = this.U0;
        if (p0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (p0Var.c()) {
            adapter.G(23, new q1(this, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sq0.e, nl1.d
    public final void S7(fo1.a gestaltToolbar) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(gestaltToolbar, "gestaltToolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) gestaltToolbar;
        gestaltToolbarImpl.Y(xc0.i.messages);
        lh0.p0 p0Var = this.U0;
        AttributeSet attributeSet = null;
        if (p0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (!p0Var.c()) {
            gestaltToolbarImpl.m();
            return;
        }
        if (this.Y0 == null) {
            lh0.p0 p0Var2 = this.U0;
            if (p0Var2 == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            if (p0Var2.f()) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltIconButton gestaltIconButton = new GestaltIconButton(6, requireContext, attributeSet);
                gestaltIconButton.t(n0.f84373m);
                imageView = gestaltIconButton;
            } else {
                ImageView imageView2 = new ImageView(requireContext());
                imageView2.setImageResource(nb2.a.unified_inbox_compose_icon);
                int dimensionPixelSize = imageView2.getResources().getDimensionPixelSize(eo1.c.space_300);
                imageView2.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                imageView = imageView2;
            }
            imageView.setContentDescription(imageView.getResources().getString(xc0.i.new_message));
            imageView.setOnClickListener(new lj0.a(this, 20));
            gestaltToolbarImpl.c(imageView);
            this.Y0 = imageView;
        }
    }

    @Override // yq0.t, se0.k
    public final void V1() {
        androidx.appcompat.widget.x xVar = this.T0;
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
        i2 i2Var = this.S0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        g7 g7Var = this.R0;
        if (g7Var != null) {
            return g7Var.a(a13);
        }
        Intrinsics.r("graphQLInboxMessagesAndContactsPresenterFactory");
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
        return this.f84417b1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF121078j2() {
        return this.f84416a1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(xc0.f.fragment_inbox_swipe_refresh, xc0.e.inbox_recycler_view);
        eVar.c(xc0.e.swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View view = getView();
        if (view != null) {
            k3.R1(view.findViewById(xc0.e.inbox_recycler_view), true);
        }
        this.Z0 = (NotifsOptInUpsellBannerView) v13.findViewById(xc0.e.notifs_optin_upsell_container);
    }
}
