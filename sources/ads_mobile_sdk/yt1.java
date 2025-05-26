package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class yt1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14389a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f14390b;

    /* renamed from: c, reason: collision with root package name */
    public final cm0 f14391c;

    /* renamed from: d, reason: collision with root package name */
    public final y4 f14392d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f14393e;

    /* renamed from: f, reason: collision with root package name */
    public final x f14394f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f14395g;

    /* renamed from: h, reason: collision with root package name */
    public final a.v7 f14396h;

    /* renamed from: i, reason: collision with root package name */
    public final kd1 f14397i;

    /* renamed from: j, reason: collision with root package name */
    public final yg f14398j;

    /* renamed from: k, reason: collision with root package name */
    public final h92 f14399k;

    /* renamed from: l, reason: collision with root package name */
    public final e00 f14400l;

    /* renamed from: m, reason: collision with root package name */
    public final kd0 f14401m;

    /* renamed from: n, reason: collision with root package name */
    public final r0 f14402n;

    /* renamed from: o, reason: collision with root package name */
    public final ed2 f14403o;

    /* renamed from: p, reason: collision with root package name */
    public final tp1 f14404p;

    public yt1(Context applicationContext, oh0 flags, cm0 gmaUtil, y4 adSpamClient, n1 adEventEmitter, x activityTracker, a.o8 onePieceExpandableContentPresenter, a.o8 twoPieceExpandableContentPresenter, kd1 mraidResizeHandler, yg attributionReportingManager, h92 requestType, e00 customTabsConnection, kd0 firebaseAnalyticsEventHandler, r0 adConfiguration, ed2 safeBrowsingManager, tp1 offlineOpenHandler) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(onePieceExpandableContentPresenter, "onePieceExpandableContentPresenter");
        Intrinsics.checkNotNullParameter(twoPieceExpandableContentPresenter, "twoPieceExpandableContentPresenter");
        Intrinsics.checkNotNullParameter(mraidResizeHandler, "mraidResizeHandler");
        Intrinsics.checkNotNullParameter(attributionReportingManager, "attributionReportingManager");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(customTabsConnection, "customTabsConnection");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEventHandler, "firebaseAnalyticsEventHandler");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(offlineOpenHandler, "offlineOpenHandler");
        this.f14389a = applicationContext;
        this.f14390b = flags;
        this.f14391c = gmaUtil;
        this.f14392d = adSpamClient;
        this.f14393e = adEventEmitter;
        this.f14394f = activityTracker;
        this.f14395g = onePieceExpandableContentPresenter;
        this.f14396h = twoPieceExpandableContentPresenter;
        this.f14397i = mraidResizeHandler;
        this.f14398j = attributionReportingManager;
        this.f14399k = requestType;
        this.f14400l = customTabsConnection;
        this.f14401m = firebaseAnalyticsEventHandler;
        this.f14402n = adConfiguration;
        this.f14403o = safeBrowsingManager;
        this.f14404p = offlineOpenHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x028c, code lost:
    
        if (s.k.c(r18.f14389a) != null) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x041d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r19, java.util.Map r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yt1.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ads_mobile_sdk.ym0 r12, java.util.Map r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yt1.b(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 99) {
                if (hashCode != 108) {
                    if (hashCode == 112 && str.equals("p")) {
                        return 7;
                    }
                } else if (str.equals("l")) {
                    return 6;
                }
            } else if (str.equals("c")) {
                return 14;
            }
        }
        return -1;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NAME_OPEN;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map r18, boolean r19, ads_mobile_sdk.ym0 r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yt1.a(java.util.Map, boolean, ads_mobile_sdk.ym0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [ads_mobile_sdk.ym0, ads_mobile_sdk.yt1, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [ads_mobile_sdk.ym0, ads_mobile_sdk.yt1, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map r18, boolean r19, boolean r20, ads_mobile_sdk.ym0 r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yt1.a(java.util.Map, boolean, boolean, ads_mobile_sdk.ym0, bl2.c):java.lang.Object");
    }

    public final Intent a(String str, Map map, ym0 ym0Var) {
        String str2 = (String) map.get("m");
        String str3 = (String) map.get("p");
        String str4 = (String) map.get("c");
        String str5 = (String) map.get("f");
        Intent intent = new Intent();
        y4 y4Var = this.f14392d;
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        Uri a13 = y4Var.a(parse, ym0Var);
        if (str2 != null && !z.j(str2)) {
            intent.setDataAndType(a13, str2);
        } else {
            intent.setData(a13);
        }
        intent.setAction("android.intent.action.VIEW");
        if (str3 != null && !z.j(str3)) {
            intent.setPackage(str3);
        }
        if (str4 != null && !z.j(str4)) {
            String[] strArr = (String[]) new Regex("/").f(2, str4).toArray(new String[0]);
            if (strArr.length < 2) {
                ft2.b("Could not parse component name from open GMSG: ".concat(str4));
                return null;
            }
            intent.setClassName(strArr[0], strArr[1]);
        }
        if (str5 != null && !z.j(str5)) {
            try {
                intent.addFlags(Integer.parseInt(str5));
            } catch (NumberFormatException e13) {
                ft2.a("Could not parse intent flags (" + str5 + "): " + e13);
            }
        }
        return intent;
    }

    public final Intent a(Map map) {
        String str = (String) map.get("p");
        if (str == null) {
            ft2.b("Package name missing from open app action: " + map);
            return null;
        }
        return this.f14389a.getPackageManager().getLaunchIntentForPackage(str);
    }

    public final Intent a(Map map, ym0 ym0Var) {
        String str = (String) map.get("intent_url");
        Intent intent = null;
        if (str != null && !z.j(str)) {
            try {
                intent = Intent.parseUri(str, 0);
                Uri data = intent.getData();
                if (data != null) {
                    intent.setDataAndType(this.f14392d.a(data, ym0Var), intent.getType());
                }
            } catch (URISyntaxException e13) {
                ft2.a("Error parsing the intent url (" + str + "): " + e13);
            }
        }
        if (intent != null) {
            return intent;
        }
        String str2 = (String) map.get("u");
        if (str2 != null && !z.j(str2)) {
            return a(str2, map, ym0Var);
        }
        ft2.b("Blank URL and invalid intent URL for an open GMSG: " + map);
        return intent;
    }

    public final ResolveInfo a(Intent intent, List list) {
        Object obj;
        ResolveInfo resolveActivity = this.f14389a.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((ResolveInfo) obj).activityInfo.name, resolveActivity.activityInfo.name)) {
                break;
            }
        }
        if (obj != null) {
            return resolveActivity;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(ads_mobile_sdk.ym0 r6, java.lang.String r7, bl2.c r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yt1.a(ads_mobile_sdk.ym0, java.lang.String, bl2.c):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map r6, boolean r7, boolean r8, boolean r9, ads_mobile_sdk.ym0 r10, bl2.c r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.wt1
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.wt1 r0 = (ads_mobile_sdk.wt1) r0
            int r1 = r0.f13248g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13248g = r1
            goto L18
        L13:
            ads_mobile_sdk.wt1 r0 = new ads_mobile_sdk.wt1
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.f13246e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13248g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r11)
            goto L80
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r8 = r0.f13245d
            boolean r7 = r0.f13244c
            ads_mobile_sdk.ym0 r10 = r0.f13243b
            java.util.Map r6 = r0.f13242a
            ue.c.H(r11)
            goto L58
        L3e:
            ue.c.H(r11)
            if (r7 == 0) goto L58
            if (r9 == 0) goto L58
            ads_mobile_sdk.n1 r9 = r5.f14393e
            r0.f13242a = r6
            r0.f13243b = r10
            r0.f13244c = r7
            r0.f13245d = r8
            r0.f13248g = r4
            java.lang.Object r9 = r9.l(r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            if (r8 == 0) goto L83
            nm.u r8 = new nm.u
            r8.<init>()
            java.lang.String r9 = "event_id"
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.t(r6, r7)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            r6 = 0
            r0.f13242a = r6
            r0.f13243b = r6
            r0.f13248g = r3
            java.lang.String r6 = "openIntentAsync"
            java.lang.Object r6 = r10.a(r8, r6, r0)
            if (r6 != r1) goto L80
            return r1
        L80:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L83:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yt1.a(java.util.Map, boolean, boolean, boolean, ads_mobile_sdk.ym0, bl2.c):java.lang.Object");
    }
}
