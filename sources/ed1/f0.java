package ed1;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import fd1.b1;
import fd1.f1;
import fd1.z0;
import h32.u0;
import h32.v0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.w3;
import nx.d1;
import so.c4;
import so.f5;
import so.i5;
import so.oa;
import so.r8;
import so.s8;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class f0 extends yk1.b {
    public final qz.a A;
    public final i5 B;
    public final f5 C;
    public final gs1.a D;
    public final c2 E;
    public final e82.h0 F;
    public final lz1.a G;
    public final Handler H;
    public f30 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f58579J;
    public String K;
    public final xk2.v L;
    public final e0 M;
    public final c0 N;

    /* renamed from: a, reason: collision with root package name */
    public final Context f58580a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f58581b;

    /* renamed from: c, reason: collision with root package name */
    public final p32.c f58582c;

    /* renamed from: d, reason: collision with root package name */
    public final SendableObject f58583d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f58584e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f58585f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58586g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58587h;

    /* renamed from: i, reason: collision with root package name */
    public final int f58588i;

    /* renamed from: j, reason: collision with root package name */
    public final i91.a0 f58589j;

    /* renamed from: k, reason: collision with root package name */
    public final i91.b f58590k;

    /* renamed from: l, reason: collision with root package name */
    public final yk1.j f58591l;

    /* renamed from: m, reason: collision with root package name */
    public final w3 f58592m;

    /* renamed from: n, reason: collision with root package name */
    public final m60.w f58593n;

    /* renamed from: o, reason: collision with root package name */
    public final ap.o f58594o;

    /* renamed from: p, reason: collision with root package name */
    public final gi.m f58595p;

    /* renamed from: q, reason: collision with root package name */
    public final i92.k f58596q;

    /* renamed from: r, reason: collision with root package name */
    public final uk1.e f58597r;

    /* renamed from: s, reason: collision with root package name */
    public final wk2.a f58598s;

    /* renamed from: t, reason: collision with root package name */
    public final wk2.a f58599t;

    /* renamed from: u, reason: collision with root package name */
    public final lu1.b f58600u;

    /* renamed from: v, reason: collision with root package name */
    public final u20.d f58601v;

    /* renamed from: w, reason: collision with root package name */
    public final i2 f58602w;

    /* renamed from: x, reason: collision with root package name */
    public final x0 f58603x;

    /* renamed from: y, reason: collision with root package name */
    public final d1 f58604y;

    /* renamed from: z, reason: collision with root package name */
    public final no1.e f58605z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, nx.d0 pinalytics, p32.c inviteCategory, SendableObject sendableObject, b1 surface, z0 sharesheetModalViewOptions, boolean z13, boolean z14, int i13, i91.a0 sendShareState, i91.b boardPreviewState, yk1.j mvpBinder, w3 experiments, m60.w eventManager, ap.o uploadContactsUtil, gi.m boardInviteUtils, i92.k toastUtils, uk1.e presenterPinalyticsFactory, bf2.d networkStateStream, bf2.d chromeTabHelperProvider, lu1.b baseActivityHelper, u20.d shareServiceWrapper, i2 pinRepository, x0 boardRepository, d1 trackingParamAttacher, no1.e conversationRemoteDataSource, qz.a cache, i5 sharesheetModalAppListPresenterFactory, f5 shareBoardPreviewPresenterFactory, gs1.a clipboardProvider, c2 sharesheetUtils, e82.h0 socialUtils, lz1.c sendShareUpsellPreferences) {
        super(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
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
        Intrinsics.checkNotNullParameter(sharesheetModalAppListPresenterFactory, "sharesheetModalAppListPresenterFactory");
        Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
        Intrinsics.checkNotNullParameter(clipboardProvider, "clipboardProvider");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        this.f58580a = context;
        this.f58581b = pinalytics;
        this.f58582c = inviteCategory;
        this.f58583d = sendableObject;
        this.f58584e = surface;
        this.f58585f = sharesheetModalViewOptions;
        this.f58586g = z13;
        this.f58587h = z14;
        this.f58588i = i13;
        this.f58589j = sendShareState;
        this.f58590k = boardPreviewState;
        this.f58591l = mvpBinder;
        this.f58592m = experiments;
        this.f58593n = eventManager;
        this.f58594o = uploadContactsUtil;
        this.f58595p = boardInviteUtils;
        this.f58596q = toastUtils;
        this.f58597r = presenterPinalyticsFactory;
        this.f58598s = networkStateStream;
        this.f58599t = chromeTabHelperProvider;
        this.f58600u = baseActivityHelper;
        this.f58601v = shareServiceWrapper;
        this.f58602w = pinRepository;
        this.f58603x = boardRepository;
        this.f58604y = trackingParamAttacher;
        this.f58605z = conversationRemoteDataSource;
        this.A = cache;
        this.B = sharesheetModalAppListPresenterFactory;
        this.C = shareBoardPreviewPresenterFactory;
        this.D = clipboardProvider;
        this.E = sharesheetUtils;
        this.F = socialUtils;
        this.G = sendShareUpsellPreferences;
        this.H = new Handler(Looper.getMainLooper());
        this.L = xk2.m.b(new e0(this, 0));
        this.M = new e0(this, 1);
        this.N = new c0(this);
    }

    public static final void p3(f0 f0Var, dr.i iVar) {
        SendableObject sendableObject = f0Var.f58583d;
        if (sendableObject.g()) {
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            sendableObject.f35137k = f0Var.f58604y.c(d2);
        }
        ig1.b.Y0(iVar, sendableObject, f0Var.f58596q, f0Var.f58593n, f0Var.f58605z);
        String A = iVar.f56179a.A();
        if (A != null) {
            f0Var.f58589j.f71795a.add(A);
        }
        e0.t.f56753k = true;
        f0Var.f58581b.b0(u0.SEND_BUTTON, h32.g0.SEND_SHARE, sendableObject.d(), false);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        uk1.d f13;
        z70.m mVar;
        vd0.a c13;
        cd1.f view = (cd1.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        qz.f0 f0Var = new qz.f0();
        f0Var.c(15, "page_size");
        f0Var.e("add_fields", n00.b.a(n00.c.SEND_SHARE_CONTACT));
        f0Var.e("hide_group_conversations", "false");
        vd0.c a13 = this.A.a(f0Var);
        int i13 = 0;
        boolean z13 = (a13 == null || (c13 = a13.c("data")) == null || c13.d() != 0) ? false : true;
        if (!z13) {
            view.U0();
        }
        z0 z0Var = z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL;
        z0 z0Var2 = this.f58585f;
        boolean z14 = this.f58586g || (z0Var2 == z0Var && z13);
        uk1.e eVar = this.f58597r;
        nx.d0 d0Var = this.f58581b;
        f13 = ((uk1.a) eVar).f(d0Var, "");
        f1 S2 = view.S2();
        r8 r8Var = this.B.f113460a;
        uj2.q qVar = (uj2.q) r8Var.f114090a.f113947u9.get();
        oa oaVar = r8Var.f114090a;
        i91.n nVar2 = (i91.n) oaVar.X9.get();
        i2 i2Var = (i2) oaVar.F3.get();
        x0 x0Var = (x0) oaVar.f113765k3.get();
        s8 s8Var = r8Var.f114091b;
        x xVar = new x(this.f58580a, z14, this.f58587h, this.f58582c, this.f58583d, this.f58584e, f13, this.f58585f, this.f58589j, this.f58590k, this.f58588i, z13, S2, qVar, nVar2, i2Var, x0Var, (c4) s8Var.Gc.get(), s8Var.g6(), (i91.z) oaVar.f113742ie.get(), oaVar.b3());
        SharesheetModalAppListView Z0 = view.Z0();
        yk1.j jVar = this.f58591l;
        jVar.d(Z0, xVar);
        if (z13) {
            view.N5();
        }
        if (view.v3() && (mVar = (z70.m) this.f58599t.get()) != null) {
            jVar.d(view.S(), new z(this.f58580a, this.f58594o, this.f58583d, ((uk1.a) eVar).f(d0Var, ""), this.f58598s, this.f58588i, this.f58593n, mVar, this.f58600u, this.f58601v, this.f58589j, this.f58592m, this.f58585f, view.S2(), this.E, this.F, this.G));
        }
        this.f58593n.h(this.N);
        p32.c cVar = p32.c.GROUP_BOARD;
        p32.c cVar2 = this.f58582c;
        SendableObject sendableObject = this.f58583d;
        if (cVar2 == cVar) {
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            xj2.c F = this.f58603x.Q(d2).I(1L).F(new g(18, new d0(this, i13)), new g(19, c.f58554z), ck2.i.f27923c, ck2.i.f27924d);
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
                addDisposable(nl.b.o(this.f58602w.M(d13).h(tk2.e.f118017c).e(wj2.c.a()), new aw0.j(this, j0Var, contextLoggingComponentType, hashMap, 17), is1.v.f73649j));
            } else {
                this.f58581b.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.SEND_SHARE_OPEN, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : contextLoggingComponentType, (r18 & 8) != 0 ? null : sendableObject.d(), (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? (v0) j0Var.f80434a : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
        }
        i91.b bVar = this.f58590k;
        if (bVar.f71798a) {
            String d14 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d14, "getUid(...)");
            jVar.d(view.y0(), this.C.a(d14, bVar));
        }
        if (sendableObject.e()) {
            String str = bVar.f71798a ? bVar.f71799b : null;
            h32.f1 f1Var = h32.f1.VIEW;
            String d15 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d15, "getUid(...)");
            this.f58581b.U(kh2.b0.l0(d15, null), f1Var, null, null, kh2.b0.v0(sendableObject, str), false);
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        q3(false);
        this.f58593n.j(this.N);
        super.onUnbind();
    }

    public final void q3(boolean z13) {
        ClipboardManager clipboardManager;
        xk2.v vVar = this.L;
        if (((ClipboardManager.OnPrimaryClipChangedListener) vVar.getValue()) == null) {
            return;
        }
        Handler handler = this.H;
        if (z13) {
            handler.postDelayed(new p4.a(6, this.M), 10000L);
            return;
        }
        handler.removeCallbacksAndMessages(null);
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = (ClipboardManager.OnPrimaryClipChangedListener) vVar.getValue();
        if (onPrimaryClipChangedListener != null && (clipboardManager = ((gs1.d) this.D).f66080a) != null) {
            clipboardManager.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
        }
        this.K = null;
    }
}
