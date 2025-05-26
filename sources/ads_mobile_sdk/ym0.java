package ads_mobile_sdk;

import a.d3;
import a.m1;
import a.z1;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import ao2.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.g0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ym0 extends WebView {

    /* renamed from: a */
    public final CoroutineContext f14315a;

    /* renamed from: b */
    public final j0 f14316b;

    /* renamed from: c */
    public final j0 f14317c;

    /* renamed from: d */
    public final dz f14318d;

    /* renamed from: e */
    public final a.j3 f14319e;

    /* renamed from: f */
    public final y4 f14320f;

    /* renamed from: g */
    public final a.l4 f14321g;

    /* renamed from: h */
    public final tp0 f14322h;

    /* renamed from: i */
    public final oh0 f14323i;

    /* renamed from: j */
    public final AtomicBoolean f14324j;

    /* renamed from: k */
    public final AtomicBoolean f14325k;

    /* renamed from: l */
    public final AtomicBoolean f14326l;

    /* renamed from: m */
    public d3 f14327m;

    /* renamed from: n */
    public volatile z1 f14328n;

    /* renamed from: o */
    public volatile xz2 f14329o;

    /* renamed from: p */
    public sn0 f14330p;

    /* renamed from: q */
    public l03 f14331q;

    /* renamed from: r */
    public m1 f14332r;

    /* renamed from: s */
    public final cr2 f14333s;

    /* renamed from: t */
    public cr2 f14334t;

    /* renamed from: u */
    public final DisplayMetrics f14335u;

    /* renamed from: v */
    public a.ce f14336v;

    /* renamed from: w */
    public kn0 f14337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(CoroutineContext uiContext, j0 uiScope, j0 backgroundScope, dz dzVar, a.j3 traceLogger, y4 adSpamClient, Context context, String userAgent, l03 size, a.l4 webViewCompatWrapper, tp0 htmlUtil, oh0 flags) {
        super(context);
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(webViewCompatWrapper, "webViewCompatWrapper");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f14315a = uiContext;
        this.f14316b = uiScope;
        this.f14317c = backgroundScope;
        this.f14318d = dzVar;
        this.f14319e = traceLogger;
        this.f14320f = adSpamClient;
        this.f14321g = webViewCompatWrapper;
        this.f14322h = htmlUtil;
        this.f14323i = flags;
        this.f14324j = new AtomicBoolean(false);
        this.f14325k = new AtomicBoolean(false);
        this.f14326l = new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.f14331q = size;
        this.f14333s = (cr2) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new xm0(this, null));
        this.f14335u = kh2.j1.w(context);
        kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new em0(this, null));
        WebSettings settings = getSettings();
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setMixedContentMode(2);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(userAgent);
        if (flags.s()) {
            clearCache(true);
        }
        setWillNotDraw(false);
        setLayerType(0, null);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setBackgroundColor(0);
        if (flags.y()) {
            setSoundEffectsEnabled(false);
        }
    }

    public static /* synthetic */ Object a(ym0 ym0Var, String str, String str2, boolean z13, bl2.c cVar, int i13) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return ym0Var.a(str, str2, "text/html", "UTF-8", z13, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(1:(7:(1:(1:(2:14|15)(3:17|18|19))(1:20))(1:28)|21|22|23|(1:25)|26|27)(13:29|30|31|32|33|34|(2:36|(1:38))|40|22|23|(0)|26|27))(4:91|92|93|94))(4:110|111|112|(5:114|23|(0)|26|27)(6:115|(1:117)|118|119|120|(1:122)(1:123)))|95|96|(1:98)(11:99|32|33|34|(0)|40|22|23|(0)|26|27)))|7|(0)(0)|95|96|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0142, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0146, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0144, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        r0 = ao2.g2.f20157b;
        r7 = new ads_mobile_sdk.qm0(r10, null);
        r2.f11150a = r4;
        r2.f11151b = r11;
        r2.f11152c = r5;
        r2.f11153d = null;
        r2.f11156g = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        if (kotlin.jvm.internal.j.M(r2, r0, r7) == r3) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0188 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:18:0x0046, B:89:0x01b6, B:21:0x0063, B:23:0x0183, B:25:0x0188), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122 A[Catch: all -> 0x0138, TRY_LEAVE, TryCatch #8 {all -> 0x0138, blocks: (B:34:0x011e, B:36:0x0122), top: B:33:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3 A[Catch: all -> 0x01d3, TryCatch #7 {all -> 0x01d3, blocks: (B:44:0x01bc, B:46:0x01c3, B:48:0x01ca, B:50:0x01ce, B:52:0x01d2, B:53:0x01d6, B:54:0x01db, B:55:0x01dc, B:56:0x01e3, B:57:0x01e4, B:58:0x01eb, B:59:0x01ec), top: B:43:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec A[Catch: all -> 0x01d3, TRY_LEAVE, TryCatch #7 {all -> 0x01d3, blocks: (B:44:0x01bc, B:46:0x01c3, B:48:0x01ca, B:50:0x01ce, B:52:0x01d2, B:53:0x01d6, B:54:0x01db, B:55:0x01dc, B:56:0x01e3, B:57:0x01e4, B:58:0x01eb, B:59:0x01ec), top: B:43:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #12 {all -> 0x017d, blocks: (B:83:0x0197, B:85:0x019b, B:73:0x0161, B:75:0x0165), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019b A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #12 {all -> 0x017d, blocks: (B:83:0x0197, B:85:0x019b, B:73:0x0161, B:75:0x0165), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ads_mobile_sdk.cs2, java.io.Closeable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ym0.b(java.lang.String, bl2.c):java.lang.Object");
    }

    public final sn0 c() {
        sn0 sn0Var;
        synchronized (this) {
            sn0Var = this.f14330p;
        }
        return sn0Var;
    }

    public final l03 d() {
        l03 l03Var;
        synchronized (this) {
            l03Var = this.f14331q;
        }
        return l03Var;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f14324j.set(true);
        dz dzVar = this.f14318d;
        if (dzVar != null) {
            j0 j0Var = dzVar.f4517a;
            yy block = new yy(dzVar, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        super.destroy();
    }

    public final AtomicBoolean e() {
        return this.f14326l;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f14324j.get()) {
            setMeasuredDimension(0, 0);
            return;
        }
        l03 d2 = d();
        if (isInEditMode() || d2.a() || this.f14326l.get() || d2.f7599a == k03.f7035d) {
            super.onMeasure(i13, i14);
            return;
        }
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int i16 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size2 : Integer.MAX_VALUE;
        int i17 = d2.f7600b;
        if (i17 > i15 || d2.f7601c > i16) {
            float f13 = this.f14335u.density;
            int i18 = (int) (size / f13);
            int i19 = (int) (size2 / f13);
            StringBuilder t13 = a.a.t("Not enough space to show the full ad. Need ", (int) (i17 / f13), "x", (int) (d2.f7601c / f13), " dp, but only have ");
            t13.append(i18);
            t13.append("x");
            t13.append(i19);
            t13.append(" dp.");
            String sb3 = t13.toString();
            gk0.d(sb3, null);
            if (!this.f14325k.getAndSet(true)) {
                ft2.a(this.f14317c, new tm0(this, sb3, null));
            }
        }
        if (getVisibility() != 8) {
            setVisibility(0);
        }
        setMeasuredDimension(d2.f7600b, d2.f7601c);
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        this.f14321g.getClass();
        Intrinsics.checkNotNullParameter(this, "webView");
        try {
            if (g0.f0("MUTE_AUDIO")) {
                int i13 = ab.e.f1688a;
                if (!bb.k.f22457e.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                bb.l.f22459a.createWebView(this).setAudioMuted(true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        this.f14321g.getClass();
        Intrinsics.checkNotNullParameter(this, "webView");
        try {
            if (g0.f0("MUTE_AUDIO")) {
                int i13 = ab.e.f1688a;
                if (!bb.k.f22457e.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                bb.l.f22459a.createWebView(this).setAudioMuted(false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(event, "event");
        m1 m1Var = this.f14332r;
        if (m1Var != null) {
            ci1.a((a.pf) ((a.z0) m1Var).f196b, event);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f14320f.a(event);
            xz2 xz2Var = this.f14329o;
            if (xz2Var != null) {
                xz2Var.f13901a = event;
            }
        }
        if (this.f14324j.get()) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.wm0
            if (r0 == 0) goto L14
            r0 = r9
            ads_mobile_sdk.wm0 r0 = (ads_mobile_sdk.wm0) r0
            int r1 = r0.f13121c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f13121c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ads_mobile_sdk.wm0 r0 = new ads_mobile_sdk.wm0
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f13119a
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f13121c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ue.c.H(r9)
            goto L5e
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ue.c.H(r9)
            ads_mobile_sdk.cr2 r9 = r7.f14333s
            if (r9 == 0) goto L61
            ads_mobile_sdk.dz r1 = r7.f14318d
            if (r1 == 0) goto L61
            r6.f13121c = r2
            java.lang.String r3 = r9.f4010a
            zn2.a r9 = zn2.b.f142311b
            a.zb r9 = r1.f4519c
            r9.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            zn2.d r9 = zn2.d.MILLISECONDS
            long r4 = dl2.b.Q2(r4, r9)
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r3, r4, r6)
            if (r8 != r0) goto L59
            goto L5b
        L59:
            kotlin.Unit r8 = kotlin.Unit.f80348a
        L5b:
            if (r8 != r0) goto L5e
            return r0
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            goto L62
        L61:
            r8 = 0
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ym0.c(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b0 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #4 {all -> 0x004d, blocks: (B:19:0x0048, B:63:0x01db, B:22:0x0065, B:23:0x01ac, B:25:0x01b0), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #1 {all -> 0x0162, blocks: (B:34:0x0147, B:36:0x014b, B:44:0x018f, B:46:0x0193), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193 A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #1 {all -> 0x0162, blocks: (B:34:0x0147, B:36:0x014b, B:44:0x018f, B:46:0x0193), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #7 {all -> 0x01d7, blocks: (B:56:0x01ba, B:58:0x01be), top: B:55:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea A[Catch: all -> 0x01fa, TryCatch #11 {all -> 0x01fa, blocks: (B:67:0x01e3, B:69:0x01ea, B:71:0x01f1, B:73:0x01f5, B:75:0x01f9, B:76:0x01fd, B:77:0x0202, B:78:0x0203, B:79:0x020a, B:80:0x020b, B:81:0x0212, B:82:0x0213), top: B:66:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0213 A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #11 {all -> 0x01fa, blocks: (B:67:0x01e3, B:69:0x01ea, B:71:0x01f1, B:73:0x01f5, B:75:0x01f9, B:76:0x01fd, B:77:0x0202, B:78:0x0203, B:79:0x020a, B:80:0x020b, B:81:0x0212, B:82:0x0213), top: B:66:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [ads_mobile_sdk.ym0] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [ads_mobile_sdk.ym0] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29, types: [ads_mobile_sdk.ym0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ym0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, java.util.UUID r7, bl2.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.im0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.im0 r0 = (ads_mobile_sdk.im0) r0
            int r1 = r0.f6491d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6491d = r1
            goto L18
        L13:
            ads_mobile_sdk.im0 r0 = new ads_mobile_sdk.im0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f6489b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6491d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f6488a
            ue.c.H(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r8)
            r0.f6488a = r5
            r0.f6491d = r3
            java.lang.Object r8 = r4.a(r5, r6, r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            a.ad r8 = (a.ad) r8
            boolean r6 = r8 instanceof ads_mobile_sdk.jk0
            if (r6 == 0) goto L48
            ads_mobile_sdk.jk0 r8 = (ads_mobile_sdk.jk0) r8
            return r8
        L48:
            java.lang.String r6 = "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>"
            kotlin.jvm.internal.Intrinsics.g(r8, r6)
            ads_mobile_sdk.pk0 r8 = (ads_mobile_sdk.pk0) r8
            java.lang.Object r6 = r8.a()
            nm.u r6 = (nm.u) r6
            if (r6 != 0) goto L63
            ads_mobile_sdk.nk0 r6 = new ads_mobile_sdk.nk0
            java.lang.String r7 = "Null response from "
            java.lang.String r5 = a.a.j(r7, r5)
            r6.<init>(r5)
            return r6
        L63:
            ads_mobile_sdk.pk0 r5 = new ads_mobile_sdk.pk0
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ym0.b(java.lang.String, java.lang.String, java.util.UUID, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r4v10, types: [ao2.v] */
    /* JADX WARN: Type inference failed for: r4v13, types: [ao2.v] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, java.util.UUID r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ym0.a(java.lang.String, java.lang.String, java.util.UUID, bl2.c):java.lang.Object");
    }

    public final a.ce b() {
        a.ce ceVar = this.f14336v;
        if (ceVar != null) {
            return ceVar;
        }
        Intrinsics.r("jsContext");
        throw null;
    }

    public final Object b(nm.u uVar, String str, bl2.c cVar) {
        Object a13 = a(str + "(" + uVar + ");", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.jm0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.jm0 r0 = (ads_mobile_sdk.jm0) r0
            int r1 = r0.f6880d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6880d = r1
            goto L18
        L13:
            ads_mobile_sdk.jm0 r0 = new ads_mobile_sdk.jm0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f6878b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6880d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.ym0 r0 = r0.f6877a
            ue.c.H(r6)     // Catch: java.lang.Throwable -> L29
            goto L5f
        L29:
            r6 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            ue.c.H(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f14324j
            boolean r6 = r6.getAndSet(r3)
            if (r6 == 0) goto L41
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L41:
            kotlin.coroutines.CoroutineContext r6 = r5.f14315a     // Catch: java.lang.Throwable -> L54
            ads_mobile_sdk.km0 r2 = new ads_mobile_sdk.km0     // Catch: java.lang.Throwable -> L54
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L54
            r0.f6877a = r5     // Catch: java.lang.Throwable -> L54
            r0.f6880d = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = kotlin.jvm.internal.j.M(r0, r6, r2)     // Catch: java.lang.Throwable -> L54
            if (r6 != r1) goto L5f
            return r1
        L54:
            r6 = move-exception
            r0 = r5
        L56:
            a.j3 r0 = r0.f14319e
            ads_mobile_sdk.ks2 r0 = (ads_mobile_sdk.ks2) r0
            java.lang.String r1 = "GmaWebView.destroySafe"
            r0.a(r1, r6)
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ym0.a(bl2.c):java.lang.Object");
    }

    public final Object a(nm.u uVar, String str, bl2.c cVar) {
        String str2 = "(window.AFMA_ReceiveMessage || function() {})('" + str + "', " + uVar + ");";
        ok.e0 e0Var = gk0.f5596a;
        gk0.c("Dispatching AFMA event: " + str2, null);
        Object a13 = a(str2, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    public final kn0 a() {
        kn0 kn0Var = this.f14337w;
        if (kn0Var != null) {
            return kn0Var;
        }
        Intrinsics.r("gmaWebViewClient");
        throw null;
    }

    public final Object a(String str, bv0 bv0Var) {
        Object a13 = a("window.inspectorInfo(" + str + ");", (bl2.c) bv0Var);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    public final Object a(String str, bl2.c cVar) {
        if (this.f14324j.get()) {
            return Unit.f80348a;
        }
        if (Looper.getMainLooper().isCurrentThread()) {
            evaluateJavascript(str, null);
            return Unit.f80348a;
        }
        Object M = kotlin.jvm.internal.j.M(cVar, this.f14315a, new mm0(this, str, null));
        return M == cl2.a.COROUTINE_SUSPENDED ? M : Unit.f80348a;
    }

    public final void a(int i13, boolean z13) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        ft2.a(this.f14316b, new um0(this, null));
        ft2.a(this.f14317c, new vm0(this, null));
        String str = "WebView render process gone. Crashed? " + z13 + " Priority? " + i13;
        ((ks2) this.f14319e).a(str, new Exception(str));
    }

    public final void a(l03 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this) {
            this.f14331q = value;
            Unit unit = Unit.f80348a;
        }
        requestLayout();
    }
}
