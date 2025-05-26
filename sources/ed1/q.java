package ed1;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import fd1.b1;
import fd1.f1;
import fd1.z0;
import h32.u0;
import h32.v0;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.w3;
import nx.d1;
import so.c4;
import so.e5;
import so.f5;
import so.oa;
import so.r8;
import so.s8;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class q extends yk1.b {
    public final no1.e A;
    public final qz.a B;
    public final e5 C;
    public final f5 D;
    public final gs1.a E;
    public final c2 F;
    public final e82.h0 G;
    public final lz1.a H;
    public final lb0.q I;

    /* renamed from: J, reason: collision with root package name */
    public final Handler f58672J;
    public f30 K;
    public boolean L;
    public boolean M;
    public i N;
    public i91.c0 O;
    public int P;
    public String Q;
    public final xk2.v R;
    public final p S;
    public final l T;

    /* renamed from: a, reason: collision with root package name */
    public final Context f58673a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f58674b;

    /* renamed from: c, reason: collision with root package name */
    public final p32.c f58675c;

    /* renamed from: d, reason: collision with root package name */
    public final List f58676d;

    /* renamed from: e, reason: collision with root package name */
    public final SendableObject f58677e;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f58678f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f58679g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58680h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58681i;

    /* renamed from: j, reason: collision with root package name */
    public final int f58682j;

    /* renamed from: k, reason: collision with root package name */
    public final i91.a0 f58683k;

    /* renamed from: l, reason: collision with root package name */
    public final i91.b f58684l;

    /* renamed from: m, reason: collision with root package name */
    public final yk1.j f58685m;

    /* renamed from: n, reason: collision with root package name */
    public final w3 f58686n;

    /* renamed from: o, reason: collision with root package name */
    public final m60.w f58687o;

    /* renamed from: p, reason: collision with root package name */
    public final ap.o f58688p;

    /* renamed from: q, reason: collision with root package name */
    public final gi.m f58689q;

    /* renamed from: r, reason: collision with root package name */
    public final i92.k f58690r;

    /* renamed from: s, reason: collision with root package name */
    public final uk1.e f58691s;

    /* renamed from: t, reason: collision with root package name */
    public final wk2.a f58692t;

    /* renamed from: u, reason: collision with root package name */
    public final wk2.a f58693u;

    /* renamed from: v, reason: collision with root package name */
    public final lu1.b f58694v;

    /* renamed from: w, reason: collision with root package name */
    public final u20.d f58695w;

    /* renamed from: x, reason: collision with root package name */
    public final i2 f58696x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f58697y;

    /* renamed from: z, reason: collision with root package name */
    public final d1 f58698z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, nx.j0 pinalytics, p32.c inviteCategory, List shareConfigs, SendableObject sendableObject, b1 surface, z0 sharesheetModalViewOptions, boolean z13, boolean z14, int i13, i91.a0 sendShareState, i91.b boardPreviewState, yk1.j mvpBinder, w3 experiments, m60.w eventManager, ap.o uploadContactsUtil, gi.m boardInviteUtils, i92.k toastUtils, uk1.e presenterPinalyticsFactory, bf2.d networkStateStream, bf2.d chromeTabHelperProvider, lu1.b baseActivityHelper, u20.d shareServiceWrapper, i2 pinRepository, x0 boardRepository, d1 trackingParamAttacher, no1.e conversationRemoteDataSource, qz.a cache, e5 previewSharesheetModalAppListPresenterFactory, f5 shareBoardPreviewPresenterFactory, gs1.a clipboardProvider, c2 sharesheetUtils, e82.h0 socialUtils, lz1.c sendShareUpsellPreferences, lb0.q prefsManagerPersisted) {
        super(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(shareConfigs, "shareConfigs");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(sharesheetModalViewOptions, "sharesheetModalViewOptions");
        Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(chromeTabHelperProvider, "chromeTabHelperProvider");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(shareServiceWrapper, "shareServiceWrapper");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(previewSharesheetModalAppListPresenterFactory, "previewSharesheetModalAppListPresenterFactory");
        Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
        Intrinsics.checkNotNullParameter(clipboardProvider, "clipboardProvider");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f58673a = context;
        this.f58674b = pinalytics;
        this.f58675c = inviteCategory;
        this.f58676d = shareConfigs;
        this.f58677e = sendableObject;
        this.f58678f = surface;
        this.f58679g = sharesheetModalViewOptions;
        this.f58680h = z13;
        this.f58681i = z14;
        this.f58682j = i13;
        this.f58683k = sendShareState;
        this.f58684l = boardPreviewState;
        this.f58685m = mvpBinder;
        this.f58686n = experiments;
        this.f58687o = eventManager;
        this.f58688p = uploadContactsUtil;
        this.f58689q = boardInviteUtils;
        this.f58690r = toastUtils;
        this.f58691s = presenterPinalyticsFactory;
        this.f58692t = networkStateStream;
        this.f58693u = chromeTabHelperProvider;
        this.f58694v = baseActivityHelper;
        this.f58695w = shareServiceWrapper;
        this.f58696x = pinRepository;
        this.f58697y = boardRepository;
        this.f58698z = trackingParamAttacher;
        this.A = conversationRemoteDataSource;
        this.B = cache;
        this.C = previewSharesheetModalAppListPresenterFactory;
        this.D = shareBoardPreviewPresenterFactory;
        this.E = clipboardProvider;
        this.F = sharesheetUtils;
        this.G = socialUtils;
        this.H = sendShareUpsellPreferences;
        this.I = prefsManagerPersisted;
        this.f58672J = new Handler(Looper.getMainLooper());
        this.O = (i91.c0) CollectionsKt.firstOrNull(shareConfigs);
        this.R = xk2.m.b(new p(this, 0));
        this.S = new p(this, 1);
        this.T = new l(this);
    }

    public static final void p3(q qVar, dr.i iVar) {
        SendableObject sendableObject = qVar.f58677e;
        if (sendableObject.g()) {
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            sendableObject.f35137k = qVar.f58698z.c(d2);
        }
        ig1.b.Y0(iVar, sendableObject, qVar.f58690r, qVar.f58687o, qVar.A);
        String A = iVar.f56179a.A();
        if (A != null) {
            qVar.f58683k.f71795a.add(A);
        }
        e0.t.f56753k = true;
        qVar.f58674b.b0(u0.SEND_BUTTON, h32.g0.SEND_SHARE, sendableObject.d(), false);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        nx.d0 d0Var;
        yk1.j jVar;
        uk1.e eVar;
        z70.m mVar;
        uk1.d f13;
        uk1.d f14;
        vd0.a c13;
        cd1.f view = (cd1.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        qz.f0 f0Var = new qz.f0();
        f0Var.c(15, "page_size");
        f0Var.e("add_fields", n00.b.a(n00.c.SEND_SHARE_CONTACT));
        f0Var.e("hide_group_conversations", "false");
        vd0.c a13 = this.B.a(f0Var);
        this.L = (a13 == null || (c13 = a13.c("data")) == null || c13.d() != 0) ? false : true;
        if (q3()) {
            view.U0();
        }
        z0 z0Var = z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL;
        z0 z0Var2 = this.f58679g;
        boolean z13 = z0Var2 == z0Var && this.L;
        i91.c0 c0Var = this.O;
        uk1.e eVar2 = this.f58691s;
        yk1.j jVar2 = this.f58685m;
        nx.d0 d0Var2 = this.f58674b;
        if (c0Var != null) {
            boolean z14 = this.f58680h || z13;
            f14 = ((uk1.a) eVar2).f(d0Var2, "");
            boolean z15 = this.L;
            f1 S2 = view.S2();
            r8 r8Var = this.C.f113400a;
            uj2.q qVar = (uj2.q) r8Var.f114090a.f113947u9.get();
            oa oaVar = r8Var.f114090a;
            i91.n nVar2 = (i91.n) oaVar.X9.get();
            i2 i2Var = (i2) oaVar.F3.get();
            x0 x0Var = (x0) oaVar.f113765k3.get();
            s8 s8Var = r8Var.f114091b;
            d0Var = d0Var2;
            jVar = jVar2;
            boolean z16 = z14;
            eVar = eVar2;
            i iVar = new i(this.f58673a, z16, this.f58681i, this.f58675c, this.f58677e, this.f58678f, f14, this.f58679g, this.f58683k, this.f58684l, this.f58682j, z15, S2, c0Var, qVar, nVar2, i2Var, x0Var, (c4) s8Var.Gc.get(), s8Var.g6(), (i91.z) oaVar.f113742ie.get(), oaVar.b3());
            jVar.d(view.Z0(), iVar);
            this.N = iVar;
        } else {
            d0Var = d0Var2;
            jVar = jVar2;
            eVar = eVar2;
        }
        if (this.L) {
            view.N5();
        }
        if (view.v3() && (mVar = (z70.m) this.f58693u.get()) != null) {
            f13 = ((uk1.a) eVar).f(d0Var, "");
            jVar.d(view.S(), new z(this.f58673a, this.f58688p, this.f58677e, f13, this.f58692t, this.f58682j, this.f58687o, mVar, this.f58694v, this.f58695w, this.f58683k, this.f58686n, this.f58679g, view.S2(), this.F, this.G, this.H));
            view.L4(new pg0.a0(s3(), q3()));
        }
        com.pinterest.feature.sharesheet.view.previewcarousel.k C6 = view.C6();
        if (C6 != null) {
            jVar.d(C6, new l0(this.f58673a, this.f58676d, this.f58685m, this.D, this.I));
            i91.c0 c0Var2 = this.O;
            if (c0Var2 != null) {
                String string = this.f58673a.getString(c0Var2.a());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                view.C0(string);
            }
        }
        this.f58687o.h(this.T);
        p32.c cVar = p32.c.GROUP_BOARD;
        p32.c cVar2 = this.f58675c;
        SendableObject sendableObject = this.f58677e;
        if (cVar2 == cVar) {
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            xj2.c F = this.f58697y.Q(d2).I(1L).F(new g(4, new n(this, 0)), new g(5, c.f58547s), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        }
        if (z0Var2 == z0.CONTACT_LIST_ONLY) {
            d0Var.z(null);
        } else {
            h32.g0 contextLoggingComponentType = z0Var2.getContextLoggingComponentType();
            HashMap hashMap = new HashMap(1);
            p32.i b13 = sendableObject.b();
            hashMap.put("invite_object", String.valueOf(b13 != null ? Integer.valueOf(b13.value()) : null));
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            if (sendableObject.g()) {
                String d13 = sendableObject.d();
                Intrinsics.checkNotNullExpressionValue(d13, "getUid(...)");
                addDisposable(nl.b.o(this.f58696x.M(d13).h(tk2.e.f118017c).e(wj2.c.a()), new aw0.j(this, j0Var, contextLoggingComponentType, hashMap, 16), is1.v.f73649j));
            } else {
                this.f58674b.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.SEND_SHARE_OPEN, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : contextLoggingComponentType, (r18 & 8) != 0 ? null : sendableObject.d(), (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? (v0) j0Var.f80434a : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
        }
        if (sendableObject.e()) {
            i91.b bVar = this.f58684l;
            String str = bVar.f71798a ? bVar.f71799b : null;
            h32.f1 f1Var = h32.f1.VIEW;
            String d14 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d14, "getUid(...)");
            this.f58674b.U(kh2.b0.l0(d14, null), f1Var, null, null, kh2.b0.v0(sendableObject, str), false);
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        r3(false);
        this.f58687o.j(this.T);
        super.onUnbind();
    }

    public final boolean q3() {
        return this.f58676d.size() > 1 && !this.L;
    }

    public final void r3(boolean z13) {
        ClipboardManager clipboardManager;
        xk2.v vVar = this.R;
        if (((ClipboardManager.OnPrimaryClipChangedListener) vVar.getValue()) == null) {
            return;
        }
        Handler handler = this.f58672J;
        if (z13) {
            handler.postDelayed(new p4.a(5, this.S), 10000L);
            return;
        }
        handler.removeCallbacksAndMessages(null);
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = (ClipboardManager.OnPrimaryClipChangedListener) vVar.getValue();
        if (onPrimaryClipChangedListener != null && (clipboardManager = ((gs1.d) this.E).f66080a) != null) {
            clipboardManager.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
        }
        this.Q = null;
    }

    public final boolean s3() {
        i91.c0 c0Var;
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        return (f13 == null || !Intrinsics.d(f13.s4(), Boolean.FALSE)) && !this.L && (c0Var = this.O) != null && c0Var.getContentType().shouldShowContactList();
    }
}
