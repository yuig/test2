package rb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.component.avatarpairs.AvatarPairUpdate;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y0;
import h32.d4;
import h32.i0;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.j0;
import so.jb;
import so.oa;
import so.s8;
import x40.ef;
import x40.qd;
import x40.rc;
import x40.tc;
import x40.uc;

/* loaded from: classes4.dex */
public final class i extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f107163x = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f107164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107165b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f107166c;

    /* renamed from: d, reason: collision with root package name */
    public final AvatarPair f107167d;

    /* renamed from: e, reason: collision with root package name */
    public final AvatarPairUpdate f107168e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f107169f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f107170g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f107171h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f107172i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f107173j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f107174k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltButton f107175l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltButton f107176m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewGroup f107177n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f107178o;

    /* renamed from: p, reason: collision with root package name */
    public final m60.w f107179p;

    /* renamed from: q, reason: collision with root package name */
    public final kp.m f107180q;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f107181r;

    /* renamed from: s, reason: collision with root package name */
    public final i92.k f107182s;

    /* renamed from: t, reason: collision with root package name */
    public final b60.b f107183t;

    /* renamed from: u, reason: collision with root package name */
    public final no1.d f107184u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f107185v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f107186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f107165b) {
            this.f107165b = true;
            jb jbVar = (jb) ((j) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f107179p = (m60.w) oaVar.f113885r0.get();
            l10.b.a();
            s8 s8Var = jbVar.f113485c;
            this.f107180q = (kp.m) s8Var.V0.get();
            this.f107181r = (f0) oaVar.f113747j2.get();
            this.f107182s = (i92.k) oaVar.f113921t1.get();
            this.f107183t = (b60.b) oaVar.f113850p0.get();
            this.f107184u = s8Var.p5();
        }
        LayoutInflater.from(context).inflate(nb2.c.list_cell_lego_contact_request_inbox, (ViewGroup) this, true);
        if (z13) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.space_400);
            setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        f0 f0Var = this.f107181r;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        this.f107166c = ((nx.m) f0Var).a(this);
        View findViewById = findViewById(nb2.b.user_avatars);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f107167d = (AvatarPair) findViewById;
        View findViewById2 = findViewById(nb2.b.user_avatars_update);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f107168e = (AvatarPairUpdate) findViewById2;
        View findViewById3 = findViewById(nb2.b.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f107169f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(nb2.b.badge_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f107170g = (ImageView) findViewById4;
        View findViewById5 = findViewById(nb2.b.subtitle_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f107171h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(nb2.b.timestamp_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f107172i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(nb2.b.decline_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f107173j = (GestaltButton) findViewById7;
        View findViewById8 = findViewById(nb2.b.preview_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f107174k = (GestaltButton) findViewById8;
        View findViewById9 = findViewById(nb2.b.block_button);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f107175l = (GestaltButton) findViewById9;
        View findViewById10 = findViewById(nb2.b.report_button);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f107176m = (GestaltButton) findViewById10;
        View findViewById11 = findViewById(nb2.b.decline_preview_buttons_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f107177n = (ViewGroup) findViewById11;
        View findViewById12 = findViewById(nb2.b.block_report_buttons_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f107178o = (ViewGroup) findViewById12;
    }

    public final void a(int i13, z40.f contactRequest) {
        String str;
        String conversationId;
        if (contactRequest == null) {
            return;
        }
        this.f107185v = false;
        ViewGroup viewGroup = this.f107178o;
        k3.R1(viewGroup, false);
        ViewGroup viewGroup2 = this.f107177n;
        k3.R1(viewGroup2, true);
        k3.R1(viewGroup2, true);
        if (viewGroup2.getVisibility() == 8 && viewGroup.getVisibility() == 8) {
            k3.R1(viewGroup2, true);
        }
        uc ucVar = (uc) contactRequest;
        tc tcVar = ucVar.f133472i;
        if (tcVar == null || ucVar.f133471h == null || (str = tcVar.f133373n) == null || str.length() == 0) {
            return;
        }
        k3.R1(this.f107170g, false);
        no1.d dVar = this.f107184u;
        if (dVar == null) {
            Intrinsics.r("contactRequestRemoteDataSource");
            throw null;
        }
        h updateUsersConversation = new h(this, i13);
        Intrinsics.checkNotNullParameter(contactRequest, "contactRequest");
        Intrinsics.checkNotNullParameter(updateUsersConversation, "updateUsersConversation");
        rc rcVar = ucVar.f133471h;
        if (rcVar == null || (conversationId = rcVar.f133183c) == null) {
            conversationId = "";
        }
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        kk2.m k13 = com.bumptech.glide.d.u0(dVar.f91666a.c(new qd(conversationId))).r(tk2.e.f118017c).l(wj2.c.a()).k(new com.pinterest.framework.multisection.datasource.pagedlist.h(21, no1.b.f91658k));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        k13.o(new dl1.c(11, new aw0.j(rcVar, ucVar.f133472i, updateUsersConversation, contactRequest, 25)), new dl1.c(12, no1.b.f91659l));
    }

    public final kp.m b() {
        kp.m mVar = this.f107180q;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("contactRequestUtils");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f107164a == null) {
            this.f107164a = new ye2.o(this);
        }
        return this.f107164a;
    }

    public final void g(int i13, z40.f contactRequest) {
        k3.R1(this.f107170g, false);
        kp.m b13 = b();
        Intrinsics.checkNotNullParameter(contactRequest, "contactRequest");
        uc ucVar = (uc) contactRequest;
        rc rcVar = ucVar.f133471h;
        if (rcVar == null) {
            return;
        }
        String contactRequestId = ucVar.f133465b;
        if (contactRequestId.length() == 0) {
            return;
        }
        m92.b bVar = new m92.b();
        m60.w wVar = b13.f80547b;
        wVar.d(bVar);
        no1.d dVar = b13.f80555j;
        Boolean bool = ucVar.f133468e;
        if (bool != null && !bool.booleanValue()) {
            dVar.getClass();
            Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
            fk2.g i14 = com.bumptech.glide.d.u0(dVar.f91666a.a(new ef(contactRequestId))).r(tk2.e.f118017c).l(wj2.c.a()).i();
            Intrinsics.checkNotNullExpressionValue(i14, "ignoreElement(...)");
            b13.f80557l = i14.i(new kp.b(b13, 0), new jp.d(2, new kp.k(b13, 5)));
        }
        wy0 f13 = ((b60.d) b13.f80554i).f();
        tc tcVar = ucVar.f133472i;
        if (tcVar != null) {
            if (f13 != null) {
                Integer k23 = f13.k2();
                Intrinsics.checkNotNullExpressionValue(k23, "getAgeInYears(...)");
                if (k23.intValue() < 18) {
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) y0.f51578a.getValue());
                    w13.e(contactRequest);
                    w13.y0(tcVar, "sender");
                    w13.y0(Integer.valueOf(i13), "position");
                    wVar.d(w13);
                    return;
                }
            }
            String q13 = bp1.h.q(tcVar);
            fp.b bVar2 = b13.f80550e;
            if (!bVar2.f62754a.isEmpty()) {
                bVar2.a(dVar, null);
            }
            NavigationImpl z03 = Navigation.z0((ScreenLocation) y0.f51579b.getValue(), rcVar.f133183c);
            z03.e(rcVar);
            Boolean bool2 = Boolean.TRUE;
            z03.y0(bool2, "com.pinterest.EXTRA_IS_CONTACT_REQUEST");
            z03.y0(bool2, "com.pinterest.EXTRA_IS_CONTACT_REQUEST_PREVIEW");
            z03.y0(contactRequestId, "com.pinterest.EXTRA_CONTACT_REQUEST_ID");
            z03.y0(q13, "com.pinterest.EXTRA_CONTACT_REQUEST_SENDER");
            z03.y0(Integer.valueOf(i13), "com.pinterest.EXTRA_CONTACT_REQUEST_POSITION");
            wVar.d(z03);
            wVar.d(new m92.b());
            wVar.f(new pg0.q());
        }
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.BOARD, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f107164a == null) {
            this.f107164a = new ye2.o(this);
        }
        return this.f107164a.generatedComponent();
    }
}
