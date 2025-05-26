package ads_mobile_sdk;

import a.l2;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import ao2.j0;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kd1 {

    /* renamed from: a, reason: collision with root package name */
    public final ub1 f7235a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f7236b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f7237c;

    /* renamed from: d, reason: collision with root package name */
    public final ce1 f7238d;

    /* renamed from: e, reason: collision with root package name */
    public final x f7239e;

    /* renamed from: f, reason: collision with root package name */
    public final a.n5 f7240f;

    /* renamed from: g, reason: collision with root package name */
    public final ln0 f7241g;

    /* renamed from: h, reason: collision with root package name */
    public final ym0 f7242h;

    /* renamed from: i, reason: collision with root package name */
    public final mo2.a f7243i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow f7244j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f7245k;

    /* renamed from: l, reason: collision with root package name */
    public ViewGroup.LayoutParams f7246l;

    /* renamed from: m, reason: collision with root package name */
    public l03 f7247m;

    /* renamed from: n, reason: collision with root package name */
    public ViewGroup f7248n;

    public kd1(ub1 mraidAfmaDispatcher, j0 uiScope, j0 backgroundScope, ce1 mraidViewabilityEventListener, Optional optionalGmaWebViewContainer, x activityTracker, a.n5 mraidEventEmitter) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(mraidViewabilityEventListener, "mraidViewabilityEventListener");
        Intrinsics.checkNotNullParameter(optionalGmaWebViewContainer, "optionalGmaWebViewContainer");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(mraidEventEmitter, "mraidEventEmitter");
        this.f7235a = mraidAfmaDispatcher;
        this.f7236b = uiScope;
        this.f7237c = backgroundScope;
        this.f7238d = mraidViewabilityEventListener;
        this.f7239e = activityTracker;
        this.f7240f = mraidEventEmitter;
        ln0 ln0Var = (ln0) m2.U0(optionalGmaWebViewContainer);
        this.f7241g = ln0Var;
        this.f7242h = ln0Var != null ? ln0Var.a() : null;
        this.f7243i = mo2.d.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.kd1 r27, java.util.Map r28, bl2.c r29) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kd1.a(ads_mobile_sdk.kd1, java.util.Map, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(1:(1:(7:12|13|14|15|16|17|18)(2:39|40))(7:41|42|43|44|45|46|(1:48)(5:49|15|16|17|18)))(1:60))(2:83|(1:85)(1:86))|61|(5:63|64|65|66|(4:68|16|17|18)(1:69))|72|(1:74)|75|76|77|(1:79)(4:80|45|46|(0)(0))))|89|6|7|(0)(0)|61|(0)|72|(0)|75|76|77|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ca, code lost:
    
        r0 = (android.view.ViewGroup) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d0, code lost:
    
        r0.removeView(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d7, code lost:
    
        r0.removeView(r15.f7245k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e0, code lost:
    
        r0.addView(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e7, code lost:
    
        r13.a(r0);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ae, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ca A[Catch: all -> 0x010d, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d0 A[Catch: all -> 0x010d, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d7 A[Catch: all -> 0x010d, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e0 A[Catch: all -> 0x010d, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e7 A[Catch: all -> 0x010d, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0 A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125 A[Catch: all -> 0x010d, TryCatch #5 {all -> 0x010d, blocks: (B:14:0x0042, B:15:0x01a4, B:16:0x01ea, B:24:0x01af, B:26:0x01ca, B:28:0x01d0, B:29:0x01d3, B:31:0x01d7, B:32:0x01dc, B:34:0x01e0, B:35:0x01e3, B:37:0x01e7, B:46:0x0187, B:61:0x00cc, B:63:0x00d0, B:65:0x00e5, B:66:0x00f3, B:68:0x0113, B:69:0x011a, B:72:0x011e, B:74:0x0125, B:75:0x0128, B:77:0x0130), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.ViewGroup r19, ads_mobile_sdk.k92 r20, android.app.Activity r21, android.view.Window r22, ads_mobile_sdk.ym0 r23, ads_mobile_sdk.ln0 r24, bl2.c r25) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kd1.a(android.view.ViewGroup, ads_mobile_sdk.k92, android.app.Activity, android.view.Window, ads_mobile_sdk.ym0, ads_mobile_sdk.ln0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x005d, code lost:
    
        if (r9.f(null, r0) == r1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:15:0x00d3, B:32:0x0061, B:34:0x0065, B:37:0x006b, B:40:0x0071, B:42:0x0078, B:44:0x007c, B:46:0x0089, B:48:0x0092, B:49:0x0097, B:51:0x009b, B:52:0x00a0, B:55:0x00ae), top: B:31:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:15:0x00d3, B:32:0x0061, B:34:0x0065, B:37:0x006b, B:40:0x0071, B:42:0x0078, B:44:0x007c, B:46:0x0089, B:48:0x0092, B:49:0x0097, B:51:0x009b, B:52:0x00a0, B:55:0x00ae), top: B:31:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:15:0x00d3, B:32:0x0061, B:34:0x0065, B:37:0x006b, B:40:0x0071, B:42:0x0078, B:44:0x007c, B:46:0x0089, B:48:0x0092, B:49:0x0097, B:51:0x009b, B:52:0x00a0, B:55:0x00ae), top: B:31:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:15:0x00d3, B:32:0x0061, B:34:0x0065, B:37:0x006b, B:40:0x0071, B:42:0x0078, B:44:0x007c, B:46:0x0089, B:48:0x0092, B:49:0x0097, B:51:0x009b, B:52:0x00a0, B:55:0x00ae), top: B:31:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v12, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r7v15, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.kd1 r7, boolean r8, bl2.c r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kd1.a(ads_mobile_sdk.kd1, boolean, bl2.c):java.lang.Object");
    }

    public final void a(boolean z13) {
        kotlin.jvm.internal.j.z(this.f7236b, null, null, new cd1(this, z13, null), 3);
    }

    public final PopupWindow a(k92 k92Var, Activity activity, ym0 ym0Var) {
        String str;
        int i13 = k92Var.f7173a;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int i14 = 1;
        int applyDimension = (int) TypedValue.applyDimension(1, i13, displayMetrics);
        int i15 = k92Var.f7174b;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int applyDimension2 = (int) TypedValue.applyDimension(1, i15, displayMetrics2);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(applyDimension, applyDimension2));
        relativeLayout.addView(this.f7241g, -1, -1);
        ym0Var.a(new l03(k03.f7033b, applyDimension, applyDimension2, 8));
        LinearLayout linearLayout = new LinearLayout(activity);
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics3 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        int applyDimension3 = (int) TypedValue.applyDimension(1, 50, displayMetrics3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension3, applyDimension3);
        Iterator<E> it = k92Var.f7178f.f14839a.iterator();
        while (it.hasNext()) {
            layoutParams.addRule(((Number) it.next()).intValue());
        }
        linearLayout.setOnClickListener(new l2(this, i14));
        Resources resources = activity.getResources();
        if (resources == null || (str = resources.getString(ui.a.close_button)) == null) {
            str = "Close button";
        }
        linearLayout.setContentDescription(str);
        relativeLayout.addView(linearLayout, layoutParams);
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, applyDimension, applyDimension2, false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(!k92Var.f7177e);
        return popupWindow;
    }

    public static final void a(kd1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    public final void a(ym0 ym0Var, String str) {
        kotlin.jvm.internal.j.z(this.f7236b, null, null, new fd1(str, this, ym0Var, null), 3);
    }

    public final Object a(Map map, kc1 kc1Var) {
        return a(this, map, kc1Var);
    }
}
