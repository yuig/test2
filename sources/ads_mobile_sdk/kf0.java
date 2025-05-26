package ads_mobile_sdk;

import a.zb;
import android.graphics.Point;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ao2.j0;
import bj.n;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class kf0 extends xf1 {
    public long A;
    public long B;

    /* renamed from: f, reason: collision with root package name */
    public final nm.u f7262f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f7263g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f7264h;

    /* renamed from: i, reason: collision with root package name */
    public final y4 f7265i;

    /* renamed from: j, reason: collision with root package name */
    public final if1 f7266j;

    /* renamed from: k, reason: collision with root package name */
    public final th1 f7267k;

    /* renamed from: l, reason: collision with root package name */
    public final n f7268l;

    /* renamed from: m, reason: collision with root package name */
    public final sb2 f7269m;

    /* renamed from: n, reason: collision with root package name */
    public final ss2 f7270n;

    /* renamed from: o, reason: collision with root package name */
    public final zb f7271o;

    /* renamed from: p, reason: collision with root package name */
    public final a.zc f7272p;

    /* renamed from: q, reason: collision with root package name */
    public final xz2 f7273q;

    /* renamed from: r, reason: collision with root package name */
    public final ws1 f7274r;

    /* renamed from: s, reason: collision with root package name */
    public final f80 f7275s;

    /* renamed from: t, reason: collision with root package name */
    public final ol1 f7276t;

    /* renamed from: u, reason: collision with root package name */
    public final ul1 f7277u;

    /* renamed from: v, reason: collision with root package name */
    public final h92 f7278v;

    /* renamed from: w, reason: collision with root package name */
    public final r0 f7279w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7280x;

    /* renamed from: y, reason: collision with root package name */
    public Point f7281y;

    /* renamed from: z, reason: collision with root package name */
    public Point f7282z;

    public kf0(nm.u nativeAdJson, j0 uiScope, j0 backgroundScope, y4 adSpamClient, if1 nativeAdAssets, th1 nativeAdUtil, n nativeRequest, sb2 rootTraceCreator, ss2 traceMetaSet, zb clock, a.zc nativeJavascriptEngine, xz2 webViewInputEventStore, ws1 omidMonitor, f80 delegatingAdEventListener, x92 urlPinger, n1 adEventEmitter, ol1 nativeOnePointFiveOverlayFactory, ul1 nativePolicyValidatorOverlayFactory, h92 requestType, r0 adConfiguration, boolean z13) {
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        Intrinsics.checkNotNullParameter(webViewInputEventStore, "webViewInputEventStore");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(delegatingAdEventListener, "delegatingAdEventListener");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(nativeOnePointFiveOverlayFactory, "nativeOnePointFiveOverlayFactory");
        Intrinsics.checkNotNullParameter(nativePolicyValidatorOverlayFactory, "nativePolicyValidatorOverlayFactory");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f7262f = nativeAdJson;
        this.f7263g = uiScope;
        this.f7264h = backgroundScope;
        this.f7265i = adSpamClient;
        this.f7266j = nativeAdAssets;
        this.f7267k = nativeAdUtil;
        this.f7268l = nativeRequest;
        this.f7269m = rootTraceCreator;
        this.f7270n = traceMetaSet;
        this.f7271o = clock;
        this.f7272p = nativeJavascriptEngine;
        this.f7273q = webViewInputEventStore;
        this.f7274r = omidMonitor;
        this.f7275s = delegatingAdEventListener;
        this.f7276t = nativeOnePointFiveOverlayFactory;
        this.f7277u = nativePolicyValidatorOverlayFactory;
        this.f7278v = requestType;
        this.f7279w = adConfiguration;
        this.f7280x = z13;
        this.f7281y = new Point();
        this.f7282z = new Point();
        new AtomicBoolean(false);
    }

    public static final String a(kf0 kf0Var, View view, Map map) {
        kf0Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (Intrinsics.d(view, (View) ((WeakReference) entry.getValue()).get())) {
                return str;
            }
        }
        gf1 gf1Var = kf0Var.f7266j.f6369b;
        if (gf1Var != null && a.xc.f186a[gf1Var.ordinal()] == 1) {
            return "3099";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ads_mobile_sdk.kf0 r7, a.pf r8, bl2.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof ads_mobile_sdk.ff0
            if (r0 == 0) goto L16
            r0 = r9
            ads_mobile_sdk.ff0 r0 = (ads_mobile_sdk.ff0) r0
            int r1 = r0.f5138e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f5138e = r1
            goto L1b
        L16:
            ads_mobile_sdk.ff0 r0 = new ads_mobile_sdk.ff0
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f5136c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5138e
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L31
            a.pf r8 = r0.f5135b
            ads_mobile_sdk.kf0 r7 = r0.f5134a
            ue.c.H(r9)
            goto La8
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            ue.c.H(r9)
            ads_mobile_sdk.h92 r9 = r7.f7278v
            ads_mobile_sdk.h92 r2 = ads_mobile_sdk.h92.f5901g
            if (r9 != r2) goto L46
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lc5
        L46:
            nm.u r9 = r7.f7262f
            java.lang.String r2 = "overlay"
            java.lang.String r6 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            if (r9 != 0) goto L52
            goto L57
        L52:
            nm.u r9 = r9.x(r2)     // Catch: java.lang.Exception -> L57
            goto L58
        L57:
            r9 = r4
        L58:
            if (r9 != 0) goto L5d
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lc5
        L5d:
            java.lang.ref.WeakReference r9 = r7.f13641c
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.ym0 r9 = (ads_mobile_sdk.ym0) r9
            if (r9 == 0) goto L74
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.f14324j
            if (r2 == 0) goto L74
            boolean r2 = r2.get()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L75
        L74:
            r2 = r4
        L75:
            if (r9 == 0) goto L82
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r6 == 0) goto L82
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lc5
        L82:
            if (r9 == 0) goto L96
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r2 == 0) goto L96
            ao2.j0 r2 = r7.f7263g
            ads_mobile_sdk.gf0 r6 = new ads_mobile_sdk.gf0
            r6.<init>(r8, r9, r4)
            kotlin.jvm.internal.j.z(r2, r4, r4, r6, r3)
        L96:
            ads_mobile_sdk.ol1 r9 = r7.f7276t
            r0.f5134a = r7
            r0.f5135b = r8
            r0.f5138e = r5
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.ol1.a(r9, r0)
            if (r9 != r1) goto La8
            goto Lc5
        La8:
            ads_mobile_sdk.ym0 r9 = (ads_mobile_sdk.ym0) r9
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r7.getClass()
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r7.f13641c = r0
            ao2.j0 r7 = r7.f7263g
            ads_mobile_sdk.hf0 r0 = new ads_mobile_sdk.hf0
            r0.<init>(r8, r9, r4)
            kotlin.jvm.internal.j.z(r7, r4, r4, r0, r3)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kf0.b(ads_mobile_sdk.kf0, a.pf, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.xf1
    public final boolean c() {
        if (d() == 0) {
            return true;
        }
        return this.f7268l.f();
    }

    @Override // ads_mobile_sdk.xf1
    public final int d() {
        bj.e b13 = this.f7268l.b();
        if (b13 != null) {
            return b13.getValue();
        }
        return 0;
    }

    @Override // ads_mobile_sdk.xf1
    public final boolean i() {
        return (this.f7266j.f6383p.isEmpty() ^ true) && this.f7266j.f6384q != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.kf0 r11, a.pf r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kf0.a(ads_mobile_sdk.kf0, a.pf, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.xf1
    public final void b() {
        kotlin.jvm.internal.j.z(this.f7264h, null, null, new ye0(this, null), 3);
    }

    @Override // ads_mobile_sdk.xf1
    public final nm.u b(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        nm.u uVar = new nm.u();
        uVar.r("nas", a(frameLayout, mediaViewScaleType, assetViews));
        return uVar;
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        a((View) null, (qh1) null, assetName, (nm.u) null, false);
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(View clickedView, FrameLayout frameLayout, LinkedHashMap assetViews, ImageView.ScaleType mediaViewScaleType) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        kotlin.jvm.internal.j.z(this.f7264h, null, null, new ue0(this, frameLayout, assetViews, mediaViewScaleType, clickedView, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, qh1 qh1Var, String str, nm.u uVar, boolean z13) {
        String str2;
        nm.u uVar2 = new nm.u();
        uVar2.r("ad", this.f7262f);
        uVar2.r("asset_view_signal", qh1Var != null ? qh1Var.f10086a : null);
        uVar2.r("ad_view_signal", qh1Var != null ? qh1Var.f10087b : null);
        uVar2.r("click_signal", uVar);
        uVar2.r("scroll_view_signal", qh1Var != null ? qh1Var.f10088c : null);
        uVar2.r("lock_screen_signal", qh1Var != null ? qh1Var.f10089d : null);
        synchronized (this.f7275s) {
        }
        Boolean bool = Boolean.FALSE;
        uVar2.t("has_custom_click_handler", bool);
        nm.u uVar3 = new nm.u();
        uVar3.u("asset_id", str);
        uVar3.s(Integer.valueOf(this.f7266j.f6368a), "template");
        uVar3.t("view_aware_api_used", bool);
        this.f7268l.getClass();
        uVar3.t("custom_mute_requested", bool);
        uVar3.t("custom_mute_enabled", Boolean.valueOf(i()));
        this.f7275s.b();
        uVar3.t("has_custom_click_handler", bool);
        String a13 = k41.a(k41.a(this.f7262f, "tracking_urls_and_actions", new nm.u()), "click_string", "");
        sb2 sb2Var = this.f7269m;
        il0 il0Var = il0.CUI_NAME_CLICK_SIGNALS;
        ss2 ss2Var = this.f7270n;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a14 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                String a15 = this.f7265i.a(view, a13);
                if (a15 instanceof jk0) {
                    ft2.a((jk0) a15);
                }
                dl2.b.J(a14, null);
                str2 = a15;
            } catch (Throwable th3) {
                try {
                    a14.b(th3);
                    if (!(th3 instanceof a.jf)) {
                        a14.a(th3);
                        if (!(th3 instanceof TimeoutCancellationException)) {
                            if (!(th3 instanceof CancellationException)) {
                                if (!(th3 instanceof uk0)) {
                                    throw new dk0(th3);
                                }
                                throw th3;
                            }
                            throw new yj0(th3);
                        }
                        throw new xl0(th3);
                    }
                    throw th3;
                } finally {
                }
            }
        } else {
            cs2 a16 = qs2.a(il0Var, q0Var, true);
            try {
                String a17 = this.f7265i.a(view, a13);
                if (a17 instanceof jk0) {
                    ft2.a((jk0) a17);
                }
                dl2.b.J(a16, null);
                str2 = a17;
            } catch (Throwable th4) {
                try {
                    a16.b(th4);
                    if (!(th4 instanceof a.jf)) {
                        a16.a(th4);
                        if (!(th4 instanceof TimeoutCancellationException)) {
                            if (!(th4 instanceof CancellationException)) {
                                if (!(th4 instanceof uk0)) {
                                    throw new dk0(th4);
                                }
                                throw th4;
                            }
                            throw new yj0(th4);
                        }
                        throw new xl0(th4);
                    }
                    throw th4;
                } finally {
                }
            }
        }
        uVar3.u("click_signals", str2);
        Boolean bool2 = Boolean.TRUE;
        uVar3.t("open_chrome_custom_tab", bool2);
        if (Build.VERSION.SDK_INT >= 30) {
            uVar3.t("try_fallback_for_deep_link", bool2);
            uVar3.t("in_app_link_handling_for_android_11_enabled", bool2);
        }
        if (z13) {
            uVar3.t("is_custom_click_gesture", bool2);
        }
        uVar2.r(SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK, uVar3);
        nm.u uVar4 = new nm.u();
        this.f7271o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        uVar4.s(Long.valueOf(currentTimeMillis - this.A), "time_from_last_touch_down");
        uVar4.s(Long.valueOf(currentTimeMillis - this.B), "time_from_last_touch");
        uVar2.r("touch_signal", uVar4);
        kotlin.jvm.internal.j.z(this.f7263g, null, null, new ve0(this, uVar2, null), 3);
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(FrameLayout nativeAdView, ImageView.ScaleType mediaviewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        kotlin.jvm.internal.j.z(this.f7264h, null, null, new we0(this, nativeAdView, assetViews, mediaviewScaleType, null), 3);
    }

    public final void a(qh1 qh1Var, String str, boolean z13) {
        nm.u uVar = new nm.u();
        uVar.r("ad", this.f7262f);
        uVar.r("asset_view_signal", qh1Var != null ? qh1Var.f10086a : null);
        uVar.r("ad_view_signal", qh1Var != null ? qh1Var.f10087b : null);
        uVar.r("scroll_view_signal", qh1Var != null ? qh1Var.f10088c : null);
        uVar.r("lock_screen_signal", qh1Var != null ? qh1Var.f10089d : null);
        uVar.r("screen", qh1Var != null ? qh1Var.f10090e : null);
        uVar.u("view_signals", str);
        uVar.t("policy_validator_enabled", Boolean.valueOf(z13));
        kotlin.jvm.internal.j.z(this.f7263g, null, null, new xe0(this, uVar, null), 3);
    }

    @Override // ads_mobile_sdk.xf1
    public final nm.u a(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        qh1 j13 = kh2.a1.j(this.f7269m, this.f7270n, this.f7267k, frameLayout, assetViews, mediaViewScaleType);
        nm.u uVar = new nm.u();
        uVar.r("asset_view_signal", j13.f10086a);
        uVar.r("ad_view_signal", j13.f10087b);
        uVar.r("scroll_view_signal", j13.f10088c);
        uVar.r("lock_screen_signal", j13.f10089d);
        return uVar;
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(View view, int i13) {
        kotlin.jvm.internal.j.z(this.f7264h, null, null, new if0(this, view, i13, null), 3);
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(FrameLayout frameLayout, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f7267k.getClass();
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int[] iArr = new int[2];
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(iArr);
        }
        this.f7281y = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f7271o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.B = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f7273q.f13901a = motionEvent;
            this.A = currentTimeMillis;
            this.f7282z = this.f7281y;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f7281y;
        obtain.setLocation(point.x, point.y);
        this.f7265i.a(obtain);
        obtain.recycle();
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(WeakReference nativeAdViewContainer, FrameLayout frameLayout, LinkedHashMap assetViews, View.OnTouchListener touchListener, View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(touchListener, "touchListener");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "<set-?>");
        this.f13640b = nativeAdViewContainer;
        this.f7281y = new Point();
        this.f7282z = new Point();
        if (frameLayout != null) {
            kotlin.jvm.internal.j.z(this.f7264h, null, null, new jf0(this, frameLayout, nativeAdViewContainer, null), 3);
        }
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(touchListener);
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(clickListener);
        }
        Iterator it = assetViews.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (view != null) {
                view.setOnTouchListener(touchListener);
                view.setClickable(true);
                view.setOnClickListener(clickListener);
            }
        }
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(FrameLayout frameLayout, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        WeakReference weakReference = new WeakReference(null);
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f13640b = weakReference;
        WeakReference weakReference2 = new WeakReference(null);
        Intrinsics.checkNotNullParameter(weakReference2, "<set-?>");
        this.f13641c = weakReference2;
        this.f7281y = new Point();
        this.f7282z = new Point();
    }
}
