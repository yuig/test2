package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cy2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4064a;

    /* renamed from: b, reason: collision with root package name */
    public final x f4065b;

    public cy2(Context applicationContext, x activityTracker) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.f4064a = applicationContext;
        this.f4065b = activityTracker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r0 = r0.getCurrentWindowMetrics();
     */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r6, java.util.Map r7, bl2.c r8) {
        /*
            r5 = this;
            nm.u r7 = new nm.u
            r7.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r6.getLocationInWindow(r0)
            r1 = 0
            r1 = r0[r1]
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            java.lang.String r1 = "xInPixels"
            r7.s(r2, r1)
            r1 = 1
            r0 = r0[r1]
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "yInPixels"
            r7.s(r1, r0)
            ads_mobile_sdk.x r0 = r5.f4065b
            android.app.Activity r0 = r0.c()
            if (r0 == 0) goto L30
            goto L32
        L30:
            android.content.Context r0 = r5.f4064a
        L32:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            java.lang.Class<android.view.WindowManager> r3 = android.view.WindowManager.class
            if (r1 < r2) goto L5d
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L5a
            android.view.WindowMetrics r0 = a.s0.h(r0)
            if (r0 != 0) goto L49
            goto L5a
        L49:
            android.graphics.Rect r1 = a.s0.f(r0)
            int r1 = r1.width()
            android.graphics.Rect r0 = a.s0.f(r0)
            int r0 = r0.height()
            goto L7f
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L5d:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L6f
            android.view.Display r0 = r0.getDefaultDisplay()
            goto L70
        L6f:
            r0 = 0
        L70:
            if (r0 != 0) goto L75
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L75:
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            int r1 = r1.heightPixels
            r4 = r1
            r1 = r0
            r0 = r4
        L7f:
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            java.lang.String r1 = "windowWidthInPixels"
            r7.s(r2, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "windowHeightInPixels"
            r7.s(r1, r0)
            java.lang.String r0 = "locationReady"
            java.lang.Object r6 = r6.a(r7, r0, r8)
            cl2.a r7 = cl2.a.COROUTINE_SUSPENDED
            if (r6 != r7) goto La0
            return r6
        La0:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cy2.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_VIEW_LOCATION;
    }
}
