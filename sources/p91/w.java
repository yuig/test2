package p91;

import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.navigation.Navigation;
import java.util.HashMap;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import okhttp3.internal.Util;
import u50.k0;
import v.f1;
import x02.x2;
import x81.h0;

/* loaded from: classes5.dex */
public final class w extends wk1.q implements l91.h {

    /* renamed from: a, reason: collision with root package name */
    public final m91.o f99333a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f99334b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f99335c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.v f99336d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f99337e;

    /* renamed from: f, reason: collision with root package name */
    public final k22.m f99338f;

    /* renamed from: g, reason: collision with root package name */
    public final m91.l f99339g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f99340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(uk1.d pinalytics, uj2.q networkStateStream, m91.o type, Navigation navigation, x2 userRepository, m60.w eventManager, yk1.a viewResources, b60.b activeUserManager, k22.m userService) {
        super(pinalytics, networkStateStream);
        m91.l aVar;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f99333a = type;
        this.f99334b = userRepository;
        this.f99335c = eventManager;
        this.f99336d = viewResources;
        this.f99337e = activeUserManager;
        this.f99338f = userService;
        int i13 = r.f99321a[type.ordinal()];
        if (i13 == 1) {
            String str = (String) navigation.i0("com.pinterst.EXTRA_SETTINGS_EMAIL");
            aVar = new m91.a(str != null ? str : "", 2);
        } else if (i13 == 2) {
            String str2 = (String) navigation.i0("com.pinterst.EXTRA_SETTINGS_GENDER");
            str2 = str2 == null ? "" : str2;
            String str3 = (String) navigation.i0("com.pinterst.EXTRA_SETTINGS_CUSTOM_GENDER");
            aVar = new m91.m(str2, str3 != null ? str3 : "");
        } else if (i13 == 3) {
            String str4 = (String) navigation.i0("com.pinterst.EXTRA_SETTINGS_BUSINESS_TYPE");
            aVar = new m91.a(str4 != null ? str4 : "", 0);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            String str5 = (String) navigation.i0("com.pinterst.EXTRA_SETTINGS_CONTACT_NAME");
            aVar = new m91.a(str5 != null ? str5 : "", 1);
        }
        this.f99339g = aVar;
        this.f99340h = new HashMap();
    }

    public static void D3(w wVar, String str, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        int i14 = 2;
        int i15 = 0;
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        HashMap hashMap = wVar.f99340h;
        if (str != null) {
            hashMap.put("passcode", str);
        }
        hashMap.put("user_confirm_skip_passcode", String.valueOf(z13));
        hashMap.put("surface_tag", lp1.a.SETTINGS.getValue());
        wVar.f99338f.c("p", Util.B(hashMap)).r(tk2.e.f118017c).l(wj2.c.a()).o(new h0(25, new t(wVar, i15)), new h0(26, new t(wVar, i14)));
    }

    public static void F3(final w wVar, wy0 wy0Var, boolean z13, String str, boolean z14, int i13) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        final int i14 = 0;
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        final int i15 = 1;
        if (!z13) {
            ((q91.u) ((l91.i) wVar.getView())).X8(true);
            return;
        }
        HashMap hashMap = wVar.f99340h;
        if (str != null) {
            hashMap.put("passcode", str);
        }
        hashMap.put("user_confirm_skip_passcode", String.valueOf(z14));
        ek2.f i16 = new fk2.l(wVar.f99334b.j0(wy0Var, hashMap), new ak2.a(wVar) { // from class: p91.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f99320b;

            {
                this.f99320b = wVar;
            }

            @Override // ak2.a
            public final void run() {
                int i17 = i14;
                w this$0 = this.f99320b;
                switch (i17) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((q91.u) ((l91.i) this$0.getView())).X8(true);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        HashMap hashMap2 = this$0.f99340h;
                        bd1.b bVar = bd1.b.CUSTOM_GENDER_FIELD;
                        boolean containsKey = hashMap2.containsKey(bVar.getValue());
                        HashMap hashMap3 = this$0.f99340h;
                        m60.w wVar2 = this$0.f99335c;
                        if (containsKey) {
                            wVar2.d(new k(bVar, (String) z0.e(bVar.getValue(), hashMap3)));
                            yk1.n view = this$0.getView();
                            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                            ((q91.u) ((l91.i) view)).W8(b52.c.edit_gender_success, false);
                        }
                        bd1.b bVar2 = bd1.b.AGE_FIELD;
                        if (hashMap3.containsKey(bVar2.getValue())) {
                            wVar2.d(new k(bVar2, (String) z0.e(bVar2.getValue(), hashMap3)));
                            yk1.n view2 = this$0.getView();
                            Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                            ((q91.u) ((l91.i) view2)).W8(b52.c.edit_age_success, false);
                        }
                        bd1.b bVar3 = bd1.b.CONTACT_NAME_FIELD;
                        if (hashMap3.containsKey(bVar3.getValue())) {
                            wVar2.d(new k(bVar3, (String) z0.e(bVar3.getValue(), hashMap3)));
                            yk1.n view3 = this$0.getView();
                            Intrinsics.checkNotNullExpressionValue(view3, "<get-view>(...)");
                            ((q91.u) ((l91.i) view3)).W8(b52.c.edit_contact_name_success, false);
                        }
                        q91.u uVar = (q91.u) ((l91.i) this$0.getView());
                        hf0.b.l(uVar.requireActivity());
                        uVar.D5();
                        break;
                }
            }
        }, 0).i(new ak2.a(wVar) { // from class: p91.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f99320b;

            {
                this.f99320b = wVar;
            }

            @Override // ak2.a
            public final void run() {
                int i17 = i15;
                w this$0 = this.f99320b;
                switch (i17) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((q91.u) ((l91.i) this$0.getView())).X8(true);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        HashMap hashMap2 = this$0.f99340h;
                        bd1.b bVar = bd1.b.CUSTOM_GENDER_FIELD;
                        boolean containsKey = hashMap2.containsKey(bVar.getValue());
                        HashMap hashMap3 = this$0.f99340h;
                        m60.w wVar2 = this$0.f99335c;
                        if (containsKey) {
                            wVar2.d(new k(bVar, (String) z0.e(bVar.getValue(), hashMap3)));
                            yk1.n view = this$0.getView();
                            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                            ((q91.u) ((l91.i) view)).W8(b52.c.edit_gender_success, false);
                        }
                        bd1.b bVar2 = bd1.b.AGE_FIELD;
                        if (hashMap3.containsKey(bVar2.getValue())) {
                            wVar2.d(new k(bVar2, (String) z0.e(bVar2.getValue(), hashMap3)));
                            yk1.n view2 = this$0.getView();
                            Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                            ((q91.u) ((l91.i) view2)).W8(b52.c.edit_age_success, false);
                        }
                        bd1.b bVar3 = bd1.b.CONTACT_NAME_FIELD;
                        if (hashMap3.containsKey(bVar3.getValue())) {
                            wVar2.d(new k(bVar3, (String) z0.e(bVar3.getValue(), hashMap3)));
                            yk1.n view3 = this$0.getView();
                            Intrinsics.checkNotNullExpressionValue(view3, "<get-view>(...)");
                            ((q91.u) ((l91.i) view3)).W8(b52.c.edit_contact_name_success, false);
                        }
                        q91.u uVar = (q91.u) ((l91.i) this$0.getView());
                        hf0.b.l(uVar.requireActivity());
                        uVar.D5();
                        break;
                }
            }
        }, new h0(27, new u(wVar, wy0Var, i15)));
        Intrinsics.checkNotNullExpressionValue(i16, "subscribe(...)");
        wVar.addDisposable(i16);
    }

    public static final void t3(w wVar, Throwable th3) {
        qz.d M;
        qz.d M2;
        wVar.getClass();
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        f1 f1Var = networkResponseError != null ? networkResponseError.f45043a : null;
        if (f1Var != null && f1Var.f123449b == 409 && (M2 = k3.M(f1Var)) != null && M2.f105387g == 117) {
            q91.u uVar = (q91.u) ((l91.i) wVar.getView());
            hf0.b.l(uVar.requireActivity());
            uVar.f7().d(new yb0.f(new k0(vb2.c.deleted_account_error_title), new k0(vb2.c.deleted_account_error_detail), new k0(x0.got_it_simple), (k0) null, new androidx.appcompat.widget.q(uVar, 0), 40));
            return;
        }
        l91.i iVar = (l91.i) wVar.getView();
        String message = (f1Var == null || (M = k3.M(f1Var)) == null) ? null : M.e();
        if (message == null) {
            message = ((yk1.a) wVar.f99336d).f139224a.getString(b52.c.edit_account_settings_error);
        }
        q91.u uVar2 = (q91.u) iVar;
        uVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        hf0.b.l(uVar2.requireActivity());
        i92.k kVar = uVar2.f103174z0;
        if (kVar != null) {
            kVar.i(message);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    public final void B3(boolean z13) {
        int i13 = 0;
        for (Object obj : this.f99339g.d()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            m91.k kVar = (m91.k) obj;
            if (((kVar instanceof m91.j) && ((m91.j) kVar).f86735d == bd1.b.CUSTOM_GENDER_FIELD) || ((kVar instanceof m91.g) && ((m91.g) kVar).f86731d == bd1.b.CUSTOM_GENDER_FIELD)) {
                kVar.f86740c = z13;
                yq0.m mVar = ((yq0.t) ((l91.i) getView())).f139732f0;
                if (mVar != null) {
                    mVar.i(i13);
                }
            }
            i13 = i14;
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f99339g);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((q91.u) ((l91.i) getView())).F0 = null;
        super.onUnbind();
    }

    public final void u3() {
        if (this.f99340h.isEmpty()) {
            q91.u uVar = (q91.u) ((l91.i) getView());
            hf0.b.l(uVar.requireActivity());
            uVar.D5();
        } else {
            q91.u uVar2 = (q91.u) ((l91.i) getView());
            hf0.b.l(uVar2.requireActivity());
            uVar2.f7().d(new jc0.v(new zp.t(uVar2.I0), false, 0L, 30));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v3() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p91.w.v3():void");
    }

    @Override // wk1.q, yk1.p
    /* renamed from: w3, reason: merged with bridge method [inline-methods] */
    public final void r3(l91.i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        q91.u uVar = (q91.u) view;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        uVar.F0 = this;
    }

    public final void x3(int i13, uv0.f onErrorAction) {
        wy0 f13;
        Intrinsics.checkNotNullParameter(onErrorAction, "onErrorAction");
        m91.l lVar = this.f99339g;
        final int i14 = 0;
        Object obj = lVar.d().get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.account.model.EditAccountSettingsItem.AccountSettingsRadioGroup");
        final m91.g gVar = (m91.g) ((m91.h) obj).f86734d.get(i13);
        bd1.b bVar = gVar.f86731d;
        bd1.b bVar2 = bd1.b.GENDER_FIELD;
        final int i15 = 1;
        x2 x2Var = this.f99334b;
        b60.b bVar3 = this.f99337e;
        String str = gVar.f86732e;
        if (bVar != bVar2 || !Intrinsics.d(str, "unspecified")) {
            wy0 f14 = ((b60.d) bVar3).f();
            if (f14 != null) {
                x2Var.j0(f14, z0.g(new Pair("surface_tag", lp1.a.SETTINGS.getValue()), new Pair(bVar.getValue(), str))).i(new ak2.a(this) { // from class: p91.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ w f99317b;

                    {
                        this.f99317b = this;
                    }

                    @Override // ak2.a
                    public final void run() {
                        int i16 = i14;
                        m91.g item = gVar;
                        w this$0 = this.f99317b;
                        switch (i16) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(item, "$item");
                                if (this$0.isBound()) {
                                    this$0.f99335c.d(new k(item.f86731d, item.f86732e));
                                    bd1.b bVar4 = bd1.b.GENDER_FIELD;
                                    bd1.b bVar5 = item.f86731d;
                                    if (bVar5 != bVar4) {
                                        if (bVar5 == bd1.b.BUSINESS_TYPE_FIELD) {
                                            yk1.n view = this$0.getView();
                                            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                                            ((q91.u) ((l91.i) view)).W8(b52.c.edit_business_type_success, false);
                                            break;
                                        }
                                    } else {
                                        this$0.B3(false);
                                        this$0.f99340h.remove(bd1.b.CUSTOM_GENDER_FIELD.getValue());
                                        ((q91.u) ((l91.i) this$0.getView())).X8(false);
                                        yk1.n view2 = this$0.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        ((q91.u) ((l91.i) view2)).W8(b52.c.edit_gender_success, false);
                                        ((q91.u) ((l91.i) this$0.getView())).V8(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(item, "$item");
                                if (this$0.isBound()) {
                                    this$0.f99335c.d(new k(item.f86731d, item.f86732e));
                                    yk1.n view3 = this$0.getView();
                                    Intrinsics.checkNotNullExpressionValue(view3, "<get-view>(...)");
                                    ((q91.u) ((l91.i) view3)).W8(b52.c.edit_gender_success, false);
                                    break;
                                }
                                break;
                        }
                    }
                }, new h0(24, new s(this, onErrorAction, 1)));
                return;
            }
            return;
        }
        B3(true);
        ((q91.u) ((l91.i) getView())).V8(true);
        ((q91.u) ((l91.i) getView())).X8(this.f99340h.containsKey(bd1.b.CUSTOM_GENDER_FIELD.getValue()));
        int i16 = 0;
        for (Object obj2 : lVar.d()) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                f0.p();
                throw null;
            }
            m91.k kVar = (m91.k) obj2;
            if (kVar instanceof m91.j) {
                m91.j jVar = (m91.j) kVar;
                if (jVar.f86735d == bd1.b.CUSTOM_GENDER_FIELD && jVar.f86737f.length() != 0 && (f13 = ((b60.d) bVar3).f()) != null) {
                    x2Var.j0(f13, z0.g(new Pair("surface_tag", lp1.a.SETTINGS.getValue()), new Pair(bVar.getValue(), str))).i(new ak2.a(this) { // from class: p91.p

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ w f99317b;

                        {
                            this.f99317b = this;
                        }

                        @Override // ak2.a
                        public final void run() {
                            int i162 = i15;
                            m91.g item = gVar;
                            w this$0 = this.f99317b;
                            switch (i162) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(item, "$item");
                                    if (this$0.isBound()) {
                                        this$0.f99335c.d(new k(item.f86731d, item.f86732e));
                                        bd1.b bVar4 = bd1.b.GENDER_FIELD;
                                        bd1.b bVar5 = item.f86731d;
                                        if (bVar5 != bVar4) {
                                            if (bVar5 == bd1.b.BUSINESS_TYPE_FIELD) {
                                                yk1.n view = this$0.getView();
                                                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                                                ((q91.u) ((l91.i) view)).W8(b52.c.edit_business_type_success, false);
                                                break;
                                            }
                                        } else {
                                            this$0.B3(false);
                                            this$0.f99340h.remove(bd1.b.CUSTOM_GENDER_FIELD.getValue());
                                            ((q91.u) ((l91.i) this$0.getView())).X8(false);
                                            yk1.n view2 = this$0.getView();
                                            Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                            ((q91.u) ((l91.i) view2)).W8(b52.c.edit_gender_success, false);
                                            ((q91.u) ((l91.i) this$0.getView())).V8(false);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(item, "$item");
                                    if (this$0.isBound()) {
                                        this$0.f99335c.d(new k(item.f86731d, item.f86732e));
                                        yk1.n view3 = this$0.getView();
                                        Intrinsics.checkNotNullExpressionValue(view3, "<get-view>(...)");
                                        ((q91.u) ((l91.i) view3)).W8(b52.c.edit_gender_success, false);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, new h0(28, new s(this, onErrorAction, i14)));
                }
            }
            i16 = i17;
            i15 = 1;
        }
    }

    public final void z3(yc1.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z13 = action instanceof yc1.c;
        HashMap hashMap = this.f99340h;
        if (z13) {
            yc1.c cVar = (yc1.c) action;
            hashMap.put(cVar.f138701a.getValue(), cVar.f138700b);
            ((q91.u) ((l91.i) getView())).X8(true);
            ((q91.u) ((l91.i) getView())).V8(true);
            return;
        }
        if (action instanceof yc1.b) {
            hashMap.remove(((yc1.b) action).f138701a.getValue());
            if (hashMap.isEmpty()) {
                ((q91.u) ((l91.i) getView())).X8(false);
            }
        }
    }
}
