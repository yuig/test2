package a02;

import a.z0;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import b02.l;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import gr1.j;
import gw1.i;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import hk2.u;
import i32.y0;
import i92.k;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import nx.d0;
import rg0.n;
import rg0.y;
import vy.m;
import x02.x2;
import zz1.h;
import zz1.p;
import zz1.z;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La02/d;", "Lnl1/d;", "", "<init>", "()V", "gi2/b", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f218l0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public ViewPager2 f220d0;

    /* renamed from: e0, reason: collision with root package name */
    public g f221e0;

    /* renamed from: g0, reason: collision with root package name */
    public wy0 f223g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f224h0;

    /* renamed from: i0, reason: collision with root package name */
    public k f225i0;

    /* renamed from: j0, reason: collision with root package name */
    public m f226j0;

    /* renamed from: k0, reason: collision with root package name */
    public n f227k0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f219c0 = d4.MODAL;

    /* renamed from: f0, reason: collision with root package name */
    public String f222f0 = new String();

    public final void Y7(b02.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof b02.a) {
            Z7();
            return;
        }
        if (event instanceof l) {
            l lVar = (l) event;
            String value = lVar.f20785a;
            Intrinsics.checkNotNullParameter(value, "newEmail");
            g0 componentType = lVar.f20786b;
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            x2 A7 = A7();
            wy0 user = this.f223g0;
            if (user == null) {
                Intrinsics.r("user");
                throw null;
            }
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter("email", "fieldApiKey");
            Intrinsics.checkNotNullParameter(value, "value");
            String uid = user.getUid();
            Intrinsics.f(uid);
            uj2.l l03 = A7.l0(user, new k22.g(uid, value));
            l03.getClass();
            u uVar = new u(l03);
            Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
            uVar.i(new xo.c((Object) this, (Object) componentType, value, 16), new yx1.l(20, new i(12, this, componentType)));
            return;
        }
        if (event instanceof b02.b) {
            n nVar = this.f227k0;
            if (nVar == null) {
                Intrinsics.r("experienceValue");
                throw null;
            }
            nVar.c(null, null);
            D5();
            return;
        }
        if (event instanceof b02.g) {
            getAnalyticsApi().a("recovery_v2_back_recovery_password");
            d0.B(s7(), f1.AUTH_COLLECTION_VIEW, g0.CREATE_PASSWORD_MODAL, null, null, 28);
            g gVar = this.f221e0;
            if (gVar == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            l0 l0Var = k0.f80436a;
            Fragment J2 = gVar.J(l0Var.b(p.class));
            if (!(J2 instanceof p)) {
                J2 = null;
            }
            if (J2 != null) {
                p pVar = J2 instanceof p ? (p) J2 : null;
                if (pVar != null) {
                    ViewPager2 viewPager2 = this.f220d0;
                    if (viewPager2 == null) {
                        Intrinsics.r("viewPager");
                        throw null;
                    }
                    pVar.f143233j0 = viewPager2.f19924d;
                }
            }
            ViewPager2 viewPager22 = this.f220d0;
            if (viewPager22 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            g gVar2 = this.f221e0;
            if (gVar2 != null) {
                viewPager22.i(gVar2.K(l0Var.b(p.class)), false);
                return;
            } else {
                Intrinsics.r("adapter");
                throw null;
            }
        }
        if (event instanceof b02.e) {
            getAnalyticsApi().a("recovery_v2_fb_click_change_email");
            d0.B(s7(), f1.AUTH_COLLECTION_VIEW, g0.EMAIL_UPDATE_MODAL, null, null, 28);
            g gVar3 = this.f221e0;
            if (gVar3 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            l0 l0Var2 = k0.f80436a;
            Fragment J3 = gVar3.J(l0Var2.b(h.class));
            h hVar = J3 instanceof h ? (h) J3 : null;
            if (hVar != null) {
                hVar.a8(this.f222f0);
            }
            ViewPager2 viewPager23 = this.f220d0;
            if (viewPager23 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            g gVar4 = this.f221e0;
            if (gVar4 != null) {
                viewPager23.i(gVar4.K(l0Var2.b(h.class)), false);
                return;
            } else {
                Intrinsics.r("adapter");
                throw null;
            }
        }
        if (event instanceof b02.f) {
            getAnalyticsApi().a("recovery_v2_fb_gplus_connected");
            if (!this.f224h0 && Intrinsics.d(((b02.f) event).f20776a, this.f222f0)) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_SUCCESS, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : g0.LINK_GOOGLE_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Z7();
                return;
            }
            g gVar5 = this.f221e0;
            if (gVar5 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            l0 l0Var3 = k0.f80436a;
            Fragment J4 = gVar5.J(l0Var3.b(zz1.l.class));
            zz1.l lVar2 = J4 instanceof zz1.l ? (zz1.l) J4 : null;
            if (lVar2 != null) {
                boolean z13 = this.f222f0.length() == 0;
                String googleEmail = ((b02.f) event).f20776a;
                String currentMail = this.f222f0;
                Intrinsics.checkNotNullParameter(googleEmail, "googleEmail");
                Intrinsics.checkNotNullParameter(currentMail, "currentMail");
                lVar2.f143212h0 = z13;
                lVar2.f143213i0 = googleEmail;
                lVar2.f143214j0 = currentMail;
                lVar2.c8();
            }
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_SUCCESS, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            ViewPager2 viewPager24 = this.f220d0;
            if (viewPager24 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            g gVar6 = this.f221e0;
            if (gVar6 != null) {
                viewPager24.i(gVar6.K(l0Var3.b(zz1.l.class)), false);
                return;
            } else {
                Intrinsics.r("adapter");
                throw null;
            }
        }
        if (event instanceof b02.i) {
            d0.B(s7(), f1.AUTH_COLLECTION_VIEW, g0.LINK_GOOGLE_MODAL, null, null, 28);
            ViewPager2 viewPager25 = this.f220d0;
            if (viewPager25 != null) {
                viewPager25.i(((b02.i) event).f20780a, false);
                return;
            } else {
                Intrinsics.r("viewPager");
                throw null;
            }
        }
        if (event instanceof b02.k) {
            b02.k kVar = (b02.k) event;
            boolean z14 = kVar.f20782a;
            j jVar = kVar.f20784c;
            qr1.a aVar = kVar.f20783b;
            if (z14) {
                Y7(new b02.h(aVar, jVar));
                return;
            } else {
                Y7(new b02.c(aVar, jVar));
                return;
            }
        }
        if (event instanceof b02.c) {
            b02.c cVar = (b02.c) event;
            qr1.a accountAlreadyLinkedData = cVar.f20772a;
            s7().U(new i0(d4.ACCOUNT_RECOVERY_RESILIENCE, a4.ACCOUNT_ALREADY_LINKED, null, g0.MOVE_GOOGLE_LOGIN, null, null), f1.VIEW, null, null, bs1.c.o(new Pair("force_recommended", String.valueOf(accountAlreadyLinkedData.getForceRecommended()))), false);
            g gVar7 = this.f221e0;
            if (gVar7 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            l0 l0Var4 = k0.f80436a;
            Fragment J5 = gVar7.J(l0Var4.b(zz1.b.class));
            if (J5 != null) {
                zz1.b bVar = J5 instanceof zz1.b ? (zz1.b) J5 : null;
                if (bVar != null) {
                    Intrinsics.checkNotNullParameter(accountAlreadyLinkedData, "accountAlreadyLinkedData");
                    bVar.f143162h0 = accountAlreadyLinkedData;
                    bVar.b8(cVar.f20773b);
                }
            }
            ViewPager2 viewPager26 = this.f220d0;
            if (viewPager26 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            g gVar8 = this.f221e0;
            if (gVar8 != null) {
                viewPager26.i(gVar8.K(l0Var4.b(zz1.b.class)), false);
                return;
            } else {
                Intrinsics.r("adapter");
                throw null;
            }
        }
        if (event instanceof b02.h) {
            b02.h hVar2 = (b02.h) event;
            qr1.a accountAlreadyLinkedData2 = hVar2.f20778a;
            s7().U(new i0(d4.ACCOUNT_RECOVERY_RESILIENCE, a4.CONFIRM_MOVE_GOOGLE_LOGIN, null, g0.MOVE_GOOGLE_LOGIN, null, null), f1.VIEW, null, null, bs1.c.o(new Pair("force_recommended", String.valueOf(accountAlreadyLinkedData2.getForceRecommended()))), false);
            g gVar9 = this.f221e0;
            if (gVar9 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            l0 l0Var5 = k0.f80436a;
            Fragment J6 = gVar9.J(l0Var5.b(z.class));
            if (J6 != null) {
                z zVar = J6 instanceof z ? (z) J6 : null;
                if (zVar != null) {
                    Intrinsics.checkNotNullParameter(accountAlreadyLinkedData2, "accountAlreadyLinkedData");
                    zVar.f143267l0 = accountAlreadyLinkedData2;
                    zVar.b8(hVar2.f20779b);
                }
            }
            ViewPager2 viewPager27 = this.f220d0;
            if (viewPager27 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            g gVar10 = this.f221e0;
            if (gVar10 != null) {
                viewPager27.i(gVar10.K(l0Var5.b(z.class)), false);
                return;
            } else {
                Intrinsics.r("adapter");
                throw null;
            }
        }
        if (!(event instanceof b02.d)) {
            if (event instanceof b02.j) {
                View view = ((b02.j) event).f20781a;
                ViewPager2 viewPager28 = this.f220d0;
                if (viewPager28 != null) {
                    view.post(new a11.p(24, view, viewPager28));
                    return;
                } else {
                    Intrinsics.r("viewPager");
                    throw null;
                }
            }
            return;
        }
        s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_SUCCESS, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : g0.LINK_GOOGLE_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        g gVar11 = this.f221e0;
        if (gVar11 == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        l0 l0Var6 = k0.f80436a;
        Fragment J7 = gVar11.J(l0Var6.b(zz1.e.class));
        if (J7 != null && (J7 instanceof zz1.e)) {
        }
        ViewPager2 viewPager29 = this.f220d0;
        if (viewPager29 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        g gVar12 = this.f221e0;
        if (gVar12 != null) {
            viewPager29.i(gVar12.K(l0Var6.b(zz1.e.class)), false);
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    public final void Z7() {
        getAnalyticsApi().a("recovery_v2_fb_completed_success");
        n nVar = this.f227k0;
        if (nVar == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        nVar.a(null, null);
        D5();
    }

    public final void a8(String currentEmail) {
        Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
        this.f222f0 = currentEmail;
        boolean z13 = false;
        g0 g0Var = StringsKt.E(currentEmail, "gmail.com", false) ? g0.LINK_GOOGLE_MODAL : g0.CREATE_PASSWORD_MODAL;
        wy0 wy0Var = this.f223g0;
        if (wy0Var == null) {
            Intrinsics.r("user");
            throw null;
        }
        this.f224h0 = Intrinsics.d(wy0Var.O2(), "bounced");
        n nVar = this.f227k0;
        if (nVar == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        ag2.e eVar = nVar.f108068j;
        rg0.g gVar = eVar instanceof rg0.g ? (rg0.g) eVar : null;
        boolean z14 = gVar != null ? gVar.f108022r : false;
        d0 s73 = s7();
        f1 f1Var = f1.AUTH_COLLECTION_VIEW;
        HashMap hashMap = new HashMap();
        hashMap.put("is_blocking", String.valueOf(z14));
        Unit unit = Unit.f80348a;
        d0.B(s73, f1Var, g0Var, null, hashMap, 20);
        Object[] objArr = new Object[7];
        zz1.d0 d0Var = new zz1.d0();
        boolean z15 = !z14;
        d0Var.d8(z15);
        d0Var.a8(new c(this, 0));
        d0Var.c8(StringsKt.E(currentEmail, "gmail.com", false));
        n nVar2 = this.f227k0;
        if (nVar2 == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        d0Var.b8(nVar2);
        objArr[0] = d0Var;
        zz1.b bVar = new zz1.b();
        bVar.a8(z15);
        bVar.Z7(new c(this, 1));
        objArr[1] = bVar;
        z zVar = new z();
        zVar.a8(z15);
        zVar.Z7(new c(this, 2));
        objArr[2] = zVar;
        p pVar = new p();
        if (this.f227k0 == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        pVar.c8(new c(this, 3));
        pVar.e8(currentEmail);
        pVar.d8(this.f224h0);
        objArr[3] = pVar;
        zz1.l lVar = new zz1.l();
        lVar.a8(new c(this, 4));
        if (!this.f224h0 && !z14) {
            z13 = true;
        }
        lVar.Z7(z13);
        lVar.b8(this.f224h0);
        objArr[4] = lVar;
        h hVar = new h();
        hVar.b8(new c(this, 5));
        hVar.a8(currentEmail);
        hVar.Z7(z15);
        objArr[5] = hVar;
        zz1.e eVar2 = new zz1.e();
        eVar2.a8(new c(this, 6));
        eVar2.Z7(currentEmail);
        objArr[6] = eVar2;
        ArrayList l13 = f0.l(objArr);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        g gVar2 = new g(requireActivity, l13);
        this.f221e0 = gVar2;
        ViewPager2 viewPager2 = this.f220d0;
        if (viewPager2 != null) {
            viewPager2.h(gVar2);
        } else {
            Intrinsics.r("viewPager");
            throw null;
        }
    }

    public final m getAnalyticsApi() {
        m mVar = this.f226j0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("analyticsApi");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF219c0() {
        return this.f219c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = yz1.b.gestalt_recovery_modal_v2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        n nVar = this.f227k0;
        if (nVar != null) {
            if (nVar == null) {
                Intrinsics.r("experienceValue");
                throw null;
            }
            outState.putString("EXPERIENCE_VALUE", String.valueOf(nVar.f108072n));
        }
        super.onSaveInstanceState(outState);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        n b13 = ((dh0.d) y.a()).b(y0.ANDROID_APP_TAKEOVER);
        if (b13 == null) {
            D5();
            return;
        }
        this.f227k0 = b13;
        b13.g();
        if (this.f227k0 == null && bundle != null) {
            String string = bundle.getString("EXPERIENCE_VALUE");
            if (string == null || string.length() == 0) {
                D5();
                return;
            }
            this.f227k0 = new n(new vd0.c(string));
        }
        View findViewById = view.findViewById(yz1.a.vPager);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        this.f220d0 = viewPager2;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        int i13 = 0;
        viewPager2.m(false);
        getAnalyticsApi().a("recovery_v2_fb_login");
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        int i14 = 1;
        if (f13 != null) {
            this.f223g0 = f13;
            String N2 = f13.N2();
            if (N2 == null) {
                N2 = "";
            }
            a8(N2);
        } else {
            A7().d0().Q("me").H(tk2.e.f118017c).A(wj2.c.a()).s().o(new yx1.l(18, new b(this, i13)), new yx1.l(19, new b(this, i14)));
        }
        ViewPager2 viewPager22 = this.f220d0;
        if (viewPager22 != null) {
            viewPager22.l(new z0(this, 1));
        } else {
            Intrinsics.r("viewPager");
            throw null;
        }
    }
}
