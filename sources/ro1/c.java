package ro1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import nx.d1;
import ps0.y;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final y f108967f = new y(26, 0);

    /* renamed from: a, reason: collision with root package name */
    public final d1 f108968a;

    /* renamed from: b, reason: collision with root package name */
    public final c82.d f108969b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f108970c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f108971d;

    /* renamed from: e, reason: collision with root package name */
    public final vr.a f108972e;

    public c(d1 trackingParamAttacher, c82.d siteApi, b0 pinAuxHelper, es.a adFormats, vr.a adsCommonAnalytics) {
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        this.f108968a = trackingParamAttacher;
        this.f108969b = siteApi;
        this.f108970c = pinAuxHelper;
        this.f108971d = adFormats;
        this.f108972e = adsCommonAnalytics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0173, code lost:
    
        if (r2 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(ro1.c r36, com.pinterest.api.model.f30 r37, android.content.Context r38, j80.b r39, java.lang.String r40, h32.c1 r41, java.lang.String r42, java.util.HashMap r43, boolean r44, boolean r45, int r46) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ro1.c.a(ro1.c, com.pinterest.api.model.f30, android.content.Context, j80.b, java.lang.String, h32.c1, java.lang.String, java.util.HashMap, boolean, boolean, int):boolean");
    }

    public static Intent c(String promotedDeepLink) {
        Intrinsics.checkNotNullParameter(promotedDeepLink, "promotedDeepLink");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(promotedDeepLink));
        intent.setFlags(268468224);
        intent.addFlags(1024);
        return intent;
    }

    public static boolean d(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = queryIntentActivities;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        Set J0 = CollectionsKt.J0(arrayList);
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities2, "queryIntentActivities(...)");
        List<ResolveInfo> list2 = queryIntentActivities2;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (!J0.contains(((ResolveInfo) it2.next()).activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        if ((r2 != null ? r2.l() : null) != null) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(ro1.c r24, com.pinterest.api.model.f30 r25, boolean r26, java.lang.String r27, java.lang.String r28, h32.c1 r29, java.lang.Integer r30, java.lang.String r31, boolean r32, boolean r33, int r34) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ro1.c.e(ro1.c, com.pinterest.api.model.f30, boolean, java.lang.String, java.lang.String, h32.c1, java.lang.Integer, java.lang.String, boolean, boolean, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0223, code lost:
    
        if (r9 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02bc, code lost:
    
        if (r9 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0163, code lost:
    
        if (r7 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x035c, code lost:
    
        if (r9 != null) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e A[Catch: all -> 0x01a3, TryCatch #1 {all -> 0x01a3, blocks: (B:88:0x0198, B:90:0x019e, B:91:0x01aa), top: B:87:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.pinterest.api.model.f30 r30, android.content.Context r31, java.lang.String r32, h32.c1 r33, java.lang.Integer r34, java.util.HashMap r35) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ro1.c.b(com.pinterest.api.model.f30, android.content.Context, java.lang.String, h32.c1, java.lang.Integer, java.util.HashMap):boolean");
    }
}
