package ads_mobile_sdk;

import a.h4;
import a.l0;
import a.y8;
import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class n82 {

    /* renamed from: a, reason: collision with root package name */
    public final oh0 f8701a;

    /* renamed from: b, reason: collision with root package name */
    public final fg f8702b;

    /* renamed from: c, reason: collision with root package name */
    public final a.j3 f8703c;

    /* renamed from: d, reason: collision with root package name */
    public final xj f8704d;

    /* renamed from: e, reason: collision with root package name */
    public final Optional f8705e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v0 f8706f;

    /* renamed from: g, reason: collision with root package name */
    public final a.a5 f8707g;

    /* renamed from: h, reason: collision with root package name */
    public String f8708h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8709i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8710j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f8711k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f8712l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8713m;

    /* renamed from: n, reason: collision with root package name */
    public Map f8714n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f8715o;

    /* renamed from: p, reason: collision with root package name */
    public final nm.o f8716p;

    /* renamed from: q, reason: collision with root package name */
    public aj.r f8717q;

    /* renamed from: r, reason: collision with root package name */
    public nm.u f8718r;

    /* renamed from: s, reason: collision with root package name */
    public final nm.u f8719s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f8720t;

    public n82(oh0 flags, fg appState, a.j3 traceLogger, xj blobEncrypter, Optional optionalNativeRequest, a.v0 randomGenerator, a.a5 sdkCoreJavascriptEngine) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(blobEncrypter, "blobEncrypter");
        Intrinsics.checkNotNullParameter(optionalNativeRequest, "optionalNativeRequest");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(sdkCoreJavascriptEngine, "sdkCoreJavascriptEngine");
        this.f8701a = flags;
        this.f8702b = appState;
        this.f8703c = traceLogger;
        this.f8704d = blobEncrypter;
        this.f8705e = optionalNativeRequest;
        this.f8706f = randomGenerator;
        this.f8707g = sdkCoreJavascriptEngine;
        this.f8708h = "https://googleads.g.doubleclick.net/mads/gma";
        this.f8711k = new LinkedHashSet();
        this.f8712l = new LinkedHashSet();
        this.f8713m = new LinkedHashMap();
        this.f8715o = new LinkedHashMap();
        nm.p pVar = new nm.p();
        pVar.f91348e.add(new AndroidBundleTypeAdapterFactory());
        this.f8716p = pVar.a();
        this.f8719s = new nm.u();
        this.f8720t = new LinkedHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(18:(2:3|(20:5|6|7|(1:(1:(1:(1:(1:(7:14|15|16|17|(1:19)|21|22)(2:24|25))(7:26|27|28|17|(0)|21|22))(7:29|30|31|17|(0)|21|22))(7:32|33|34|17|(0)|21|22))(4:35|36|37|38))(9:135|136|137|(1:139)|140|(4:143|(2:145|(2:147|148)(2:150|151))(2:152|(2:154|155)(2:156|(2:158|159)(2:160|(2:162|163)(2:164|165))))|149|141)|166|167|(1:169)(1:170))|39|40|(3:43|(3:46|47|(1:49)(6:50|34|17|(0)|21|22))(1:45)|41)|51|52|(4:55|(2:60|61)(1:63)|62|53)|65|66|(1:70)|71|(1:73)(1:103)|(1:102)(1:77)|(2:79|(2:81|(1:83)(6:84|31|17|(0)|21|22))(2:85|(1:87)(2:93|(2:95|(1:97)(6:98|28|17|(0)|21|22))(2:99|100))))(1:101)|88|89|(1:91)(6:92|16|17|(0)|21|22)))|39|40|(1:41)|51|52|(1:53)|65|66|(2:68|70)|71|(0)(0)|(1:75)|102|(0)(0)|88|89|(0)(0))|176|6|7|(0)(0)|(2:(0)|(1:127))) */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0047, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b4 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:40:0x0154, B:41:0x0179, B:43:0x017f, B:47:0x0190, B:45:0x01ab, B:52:0x01b3, B:53:0x01c0, B:55:0x01c6, B:57:0x01e0, B:60:0x01e8, B:66:0x01f8, B:68:0x01fc, B:70:0x0204, B:71:0x0208, B:73:0x0212, B:75:0x021d, B:77:0x023d, B:79:0x0257, B:81:0x025d, B:85:0x027f, B:87:0x0289, B:89:0x02bc, B:93:0x0292, B:95:0x0296, B:99:0x02ae, B:100:0x02b3, B:101:0x02b4, B:103:0x0217), top: B:39:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:40:0x0154, B:41:0x0179, B:43:0x017f, B:47:0x0190, B:45:0x01ab, B:52:0x01b3, B:53:0x01c0, B:55:0x01c6, B:57:0x01e0, B:60:0x01e8, B:66:0x01f8, B:68:0x01fc, B:70:0x0204, B:71:0x0208, B:73:0x0212, B:75:0x021d, B:77:0x023d, B:79:0x0257, B:81:0x025d, B:85:0x027f, B:87:0x0289, B:89:0x02bc, B:93:0x0292, B:95:0x0296, B:99:0x02ae, B:100:0x02b3, B:101:0x02b4, B:103:0x0217), top: B:39:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308 A[Catch: all -> 0x0318, TryCatch #5 {all -> 0x0318, blocks: (B:107:0x0301, B:109:0x0308, B:111:0x030f, B:113:0x0313, B:115:0x0317, B:116:0x031b, B:117:0x0320, B:118:0x0321, B:119:0x0328, B:120:0x0329, B:121:0x0330, B:122:0x0331), top: B:106:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0331 A[Catch: all -> 0x0318, TRY_LEAVE, TryCatch #5 {all -> 0x0318, blocks: (B:107:0x0301, B:109:0x0308, B:111:0x030f, B:113:0x0313, B:115:0x0317, B:116:0x031b, B:117:0x0320, B:118:0x0321, B:119:0x0328, B:120:0x0329, B:121:0x0330, B:122:0x0331), top: B:106:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02f4 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #4 {all -> 0x0047, blocks: (B:15:0x0042, B:16:0x02ee, B:17:0x02f0, B:19:0x02f4, B:27:0x005c, B:28:0x02ab, B:30:0x006b, B:31:0x027b, B:33:0x007a, B:34:0x01a7), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:40:0x0154, B:41:0x0179, B:43:0x017f, B:47:0x0190, B:45:0x01ab, B:52:0x01b3, B:53:0x01c0, B:55:0x01c6, B:57:0x01e0, B:60:0x01e8, B:66:0x01f8, B:68:0x01fc, B:70:0x0204, B:71:0x0208, B:73:0x0212, B:75:0x021d, B:77:0x023d, B:79:0x0257, B:81:0x025d, B:85:0x027f, B:87:0x0289, B:89:0x02bc, B:93:0x0292, B:95:0x0296, B:99:0x02ae, B:100:0x02b3, B:101:0x02b4, B:103:0x0217), top: B:39:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c6 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:40:0x0154, B:41:0x0179, B:43:0x017f, B:47:0x0190, B:45:0x01ab, B:52:0x01b3, B:53:0x01c0, B:55:0x01c6, B:57:0x01e0, B:60:0x01e8, B:66:0x01f8, B:68:0x01fc, B:70:0x0204, B:71:0x0208, B:73:0x0212, B:75:0x021d, B:77:0x023d, B:79:0x0257, B:81:0x025d, B:85:0x027f, B:87:0x0289, B:89:0x02bc, B:93:0x0292, B:95:0x0296, B:99:0x02ae, B:100:0x02b3, B:101:0x02b4, B:103:0x0217), top: B:39:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:40:0x0154, B:41:0x0179, B:43:0x017f, B:47:0x0190, B:45:0x01ab, B:52:0x01b3, B:53:0x01c0, B:55:0x01c6, B:57:0x01e0, B:60:0x01e8, B:66:0x01f8, B:68:0x01fc, B:70:0x0204, B:71:0x0208, B:73:0x0212, B:75:0x021d, B:77:0x023d, B:79:0x0257, B:81:0x025d, B:85:0x027f, B:87:0x0289, B:89:0x02bc, B:93:0x0292, B:95:0x0296, B:99:0x02ae, B:100:0x02b3, B:101:0x02b4, B:103:0x0217), top: B:39:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0257 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:40:0x0154, B:41:0x0179, B:43:0x017f, B:47:0x0190, B:45:0x01ab, B:52:0x01b3, B:53:0x01c0, B:55:0x01c6, B:57:0x01e0, B:60:0x01e8, B:66:0x01f8, B:68:0x01fc, B:70:0x0204, B:71:0x0208, B:73:0x0212, B:75:0x021d, B:77:0x023d, B:79:0x0257, B:81:0x025d, B:85:0x027f, B:87:0x0289, B:89:0x02bc, B:93:0x0292, B:95:0x0296, B:99:0x02ae, B:100:0x02b3, B:101:0x02b4, B:103:0x0217), top: B:39:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v0, types: [aj.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v18, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v20, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v22, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v24, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [nm.o] */
    /* JADX WARN: Type inference failed for: r5v44, types: [ads_mobile_sdk.cs2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.n82 r22, aj.r r23, ads_mobile_sdk.tx1 r24, ads_mobile_sdk.wv1 r25, java.util.Map r26, bl2.c r27) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.a(ads_mobile_sdk.n82, aj.r, ads_mobile_sdk.tx1, ads_mobile_sdk.wv1, java.util.Map, bl2.c):java.lang.Object");
    }

    public final Uri b() {
        Uri.Builder buildUpon = Uri.parse(this.f8708h).buildUpon();
        for (Map.Entry entry : this.f8713m.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (this.f8712l.isEmpty() || this.f8712l.contains(str)) {
                Intrinsics.f(buildUpon);
                m2.W(buildUpon, str, str2);
            }
        }
        return buildUpon.build();
    }

    public final void c() {
        ng2 ng2Var = (ng2) this.f8720t.get(bk.NON_PERSONALIZED_AD.b());
        boolean r13 = ng2Var != null ? ng2Var.r() : false;
        ng2 ng2Var2 = (ng2) this.f8720t.get(bk.TAG_FOR_UNDER_AGE_OF_CONSENT.b());
        boolean r14 = ng2Var2 != null ? ng2Var2.r() : false;
        aj.r rVar = this.f8717q;
        if (rVar == null) {
            Intrinsics.r("signals");
            throw null;
        }
        boolean z13 = rVar.sharedPreferenceSignals.getInt("IABTCF_CmpSdkID", 0) == 300;
        int i13 = r14 ? 2 : 0;
        if (r13) {
            i13 |= 8;
        }
        if (z13) {
            i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        this.f8719s.u(bk.GDPR_USER_CONSENT_INFO.b(), "0.0.0.0.0.0.0." + i13);
    }

    public final void d() {
        int intValue;
        String v13;
        aj.r rVar = this.f8717q;
        if (rVar == null) {
            Intrinsics.r("signals");
            throw null;
        }
        Integer num = rVar.numberOfAdsRequested;
        if (num == null || (intValue = num.intValue()) <= 1) {
            return;
        }
        int min = Math.min(intValue, 5);
        aj.r rVar2 = this.f8717q;
        if (rVar2 == null) {
            Intrinsics.r("signals");
            throw null;
        }
        String str = rVar2.adUnitId;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        ng2 ng2Var = (ng2) this.f8720t.get("sra_regex");
        if (ng2Var != null && (v13 = ng2Var.v()) != null) {
            l0 l0Var = cm0.f3958f;
            String c13 = l0.c(v13, str);
            if (c13 != null) {
                str = c13;
            }
        }
        String[] strArr = new String[min];
        for (int i13 = 0; i13 < min; i13++) {
            strArr[i13] = "slotname=".concat(str);
        }
        this.f8719s.u(bk.SRA_URLS.b(), kotlin.collections.c0.M(strArr, ",", null, null, 0, null, null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x000e, B:9:0x0013, B:11:0x0019, B:14:0x0020, B:52:0x0030, B:19:0x003a, B:20:0x0047, B:22:0x004d, B:24:0x0067, B:26:0x006b, B:29:0x0071, B:46:0x0077, B:33:0x007f, B:34:0x008c, B:36:0x0092, B:38:0x00ac, B:40:0x00b0, B:43:0x00b3, B:44:0x00b6, B:49:0x00b7, B:50:0x00ba, B:55:0x00bb, B:56:0x00be, B:57:0x00bf, B:58:0x00c2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x000e, B:9:0x0013, B:11:0x0019, B:14:0x0020, B:52:0x0030, B:19:0x003a, B:20:0x0047, B:22:0x004d, B:24:0x0067, B:26:0x006b, B:29:0x0071, B:46:0x0077, B:33:0x007f, B:34:0x008c, B:36:0x0092, B:38:0x00ac, B:40:0x00b0, B:43:0x00b3, B:44:0x00b6, B:49:0x00b7, B:50:0x00ba, B:55:0x00bb, B:56:0x00be, B:57:0x00bf, B:58:0x00c2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x000e, B:9:0x0013, B:11:0x0019, B:14:0x0020, B:52:0x0030, B:19:0x003a, B:20:0x0047, B:22:0x004d, B:24:0x0067, B:26:0x006b, B:29:0x0071, B:46:0x0077, B:33:0x007f, B:34:0x008c, B:36:0x0092, B:38:0x00ac, B:40:0x00b0, B:43:0x00b3, B:44:0x00b6, B:49:0x00b7, B:50:0x00ba, B:55:0x00bb, B:56:0x00be, B:57:0x00bf, B:58:0x00c2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x000e, B:9:0x0013, B:11:0x0019, B:14:0x0020, B:52:0x0030, B:19:0x003a, B:20:0x0047, B:22:0x004d, B:24:0x0067, B:26:0x006b, B:29:0x0071, B:46:0x0077, B:33:0x007f, B:34:0x008c, B:36:0x0092, B:38:0x00ac, B:40:0x00b0, B:43:0x00b3, B:44:0x00b6, B:49:0x00b7, B:50:0x00ba, B:55:0x00bb, B:56:0x00be, B:57:0x00bf, B:58:0x00c2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x000e, B:9:0x0013, B:11:0x0019, B:14:0x0020, B:52:0x0030, B:19:0x003a, B:20:0x0047, B:22:0x004d, B:24:0x0067, B:26:0x006b, B:29:0x0071, B:46:0x0077, B:33:0x007f, B:34:0x008c, B:36:0x0092, B:38:0x00ac, B:40:0x00b0, B:43:0x00b3, B:44:0x00b6, B:49:0x00b7, B:50:0x00ba, B:55:0x00bb, B:56:0x00be, B:57:0x00bf, B:58:0x00c2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x000e, B:9:0x0013, B:11:0x0019, B:14:0x0020, B:52:0x0030, B:19:0x003a, B:20:0x0047, B:22:0x004d, B:24:0x0067, B:26:0x006b, B:29:0x0071, B:46:0x0077, B:33:0x007f, B:34:0x008c, B:36:0x0092, B:38:0x00ac, B:40:0x00b0, B:43:0x00b3, B:44:0x00b6, B:49:0x00b7, B:50:0x00ba, B:55:0x00bb, B:56:0x00be, B:57:0x00bf, B:58:0x00c2), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            aj.r r1 = r9.f8717q     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "signals"
            r3 = 0
            if (r1 == 0) goto Lbf
            android.os.Bundle r1 = r1.googleExtrasBundle     // Catch: java.lang.Throwable -> Lc3
            if (r1 != 0) goto L13
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc3
            r1.<init>()     // Catch: java.lang.Throwable -> Lc3
        L13:
            nm.o r4 = r9.f8716p     // Catch: java.lang.Throwable -> Lc3
            aj.r r5 = r9.f8717q     // Catch: java.lang.Throwable -> Lc3
            if (r5 == 0) goto Lbb
            java.lang.String r5 = r5.inspectorExtras     // Catch: java.lang.Throwable -> Lc3
            if (r5 != 0) goto L20
            java.lang.String r5 = "{}"
        L20:
            java.lang.Class<nm.u> r6 = nm.u.class
            java.lang.Object r4 = r4.b(r6, r5)     // Catch: java.lang.Throwable -> Lc3
            nm.u r4 = (nm.u) r4     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "global_extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Throwable -> Lc3
            if (r4 != 0) goto L30
            goto L35
        L30:
            nm.u r5 = r4.x(r5)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> Lc3
            goto L36
        L35:
            r5 = r3
        L36:
            java.lang.String r6 = "asMap(...)"
            if (r5 == 0) goto L67
            pm.o r5 = r5.f91366a     // Catch: java.lang.Throwable -> Lc3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> Lc3
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc3
        L47:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r7 == 0) goto L67
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Lc3
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> Lc3
            nm.s r7 = (nm.s) r7     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lc3
            r1.putString(r8, r7)     // Catch: java.lang.Throwable -> Lc3
            goto L47
        L67:
            aj.r r5 = r9.f8717q     // Catch: java.lang.Throwable -> Lc3
            if (r5 == 0) goto Lb7
            java.lang.String r5 = r5.adUnitId     // Catch: java.lang.Throwable -> Lc3
            if (r5 != 0) goto L71
            java.lang.String r5 = ""
        L71:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Throwable -> Lc3
            if (r4 != 0) goto L77
            goto L7c
        L77:
            nm.u r0 = r4.x(r5)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> Lc3
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r0 == 0) goto Lac
            pm.o r0 = r0.f91366a     // Catch: java.lang.Throwable -> Lc3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)     // Catch: java.lang.Throwable -> Lc3
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc3
        L8c:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lc3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lc3
            nm.s r4 = (nm.s) r4     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc3
            r1.putString(r5, r4)     // Catch: java.lang.Throwable -> Lc3
            goto L8c
        Lac:
            aj.r r0 = r9.f8717q     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lb3
            r0.googleExtrasBundle = r1     // Catch: java.lang.Throwable -> Lc3
            goto Lc3
        Lb3:
            kotlin.jvm.internal.Intrinsics.r(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r3     // Catch: java.lang.Throwable -> Lc3
        Lb7:
            kotlin.jvm.internal.Intrinsics.r(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r3     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            kotlin.jvm.internal.Intrinsics.r(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r3     // Catch: java.lang.Throwable -> Lc3
        Lbf:
            kotlin.jvm.internal.Intrinsics.r(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r3     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.e():void");
    }

    public final void f() {
        Integer num;
        a.s1 builder = tk.s();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        fq2 fq2Var = new fq2(builder);
        aj.r rVar = this.f8717q;
        if (rVar == null) {
            Intrinsics.r("signals");
            throw null;
        }
        List<ac2> list = rVar.f15394y0;
        if (list == null) {
            list = kotlin.collections.q0.f80391a;
        }
        for (ac2 ac2Var : list) {
            ba0 b13 = fq2Var.b();
            y8 builder2 = sk.r();
            Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder2, "builder");
            hq2 hq2Var = new hq2(builder2);
            String str = ac2Var.f2352a;
            if (str == null) {
                str = "";
            }
            hq2Var.a(str);
            hq2Var.b(m2.T(ac2Var.f2354c));
            hq2Var.a(m2.T(ac2Var.f2353b));
            hq2Var.a(1);
            String str2 = ac2Var.f2355d;
            if (str2 != null && !z.j(str2)) {
                String str3 = ac2Var.f2355d;
                hq2Var.b(str3 != null ? str3 : "");
            }
            Long l13 = ac2Var.f2358g;
            hq2Var.a(l13 != null ? l13.longValue() : 0L);
            if (ac2Var.f2356e != null || ((num = ac2Var.f2357f) != null && num.intValue() != 0)) {
                a.o9 builder3 = pk.r();
                Intrinsics.checkNotNullExpressionValue(builder3, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(builder3, "builder");
                jq2 jq2Var = new jq2(builder3);
                Integer num2 = ac2Var.f2357f;
                fk fkVar = fk.ADAPTER_CREATION_FAILURE;
                int a13 = fkVar.a();
                if (num2 == null || num2.intValue() != a13) {
                    fkVar = fk.SIGNAL_COLLECTION_FAILURE;
                    int a14 = fkVar.a();
                    if (num2 == null || num2.intValue() != a14) {
                        fkVar = fk.SIGNAL_COLLECTION_TIMEOUT;
                        int a15 = fkVar.a();
                        if (num2 == null || num2.intValue() != a15) {
                            fkVar = fk.UNKNOWN_ERROR;
                        }
                    }
                }
                jq2Var.a(fkVar);
                String str4 = ac2Var.f2356e;
                if (str4 == null) {
                    str4 = "An undefined error occurred. Error code = " + ac2Var.f2357f;
                }
                jq2Var.a(str4);
                hq2Var.a(jq2Var.a());
            }
            fq2Var.a(b13, hq2Var.a());
        }
        aj.r rVar2 = this.f8717q;
        if (rVar2 == null) {
            Intrinsics.r("signals");
            throw null;
        }
        for (Map.Entry<String, aj.c> entry : rVar2.adapterVersionData.entrySet()) {
            String key = entry.getKey();
            aj.c value = entry.getValue();
            ba0 b14 = fq2Var.b();
            y8 builder4 = sk.r();
            Intrinsics.checkNotNullExpressionValue(builder4, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder4, "builder");
            hq2 hq2Var2 = new hq2(builder4);
            hq2Var2.a(key);
            hq2Var2.a(0);
            hq2Var2.b(m2.T(value.sdkVersion));
            hq2Var2.a(m2.T(value.adapterVersion));
            fq2Var.a(b14, hq2Var2.a());
        }
        tk a16 = fq2Var.a();
        if (a16.r().size() > 0) {
            byte[] encode = Base64.encode(a16.a(), 8);
            Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
            a("a3p", new String(encode, Charsets.UTF_8), "third_party_params");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[LOOP:0: B:11:0x006a->B:13:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.k82
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.k82 r0 = (ads_mobile_sdk.k82) r0
            int r1 = r0.f7169g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7169g = r1
            goto L18
        L13:
            ads_mobile_sdk.k82 r0 = new ads_mobile_sdk.k82
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7167e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7169g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r1 = r0.f7166d
            nm.u r2 = r0.f7165c
            nm.u r3 = r0.f7164b
            nm.u r0 = r0.f7163a
            ue.c.H(r7)
            goto L60
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            ue.c.H(r7)
            nm.u r2 = r6.f8719s
            nm.u r7 = new nm.u
            r7.<init>()
            ads_mobile_sdk.fg r4 = r6.f8702b
            r0.f7163a = r7
            r0.f7164b = r7
            r0.f7165c = r2
            java.lang.String r5 = "sdk_core"
            r0.f7166d = r5
            r0.f7169g = r3
            ads_mobile_sdk.eg0 r3 = r4.f5141a
            r3.getClass()
            java.lang.Object r0 = ads_mobile_sdk.eg0.b(r3, r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r3 = r7
            r1 = r5
            r7 = r0
            r0 = r3
        L60:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L6a:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L86
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r3.u(r5, r4)
            goto L6a
        L86:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            r2.r(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.b(bl2.c):java.lang.Object");
    }

    public final a.ad b(uv1 uv1Var) {
        if (uv1Var.I()) {
            c81 C = uv1Var.C();
            Intrinsics.checkNotNullExpressionValue(C, "getPattern(...)");
            if (!a(C)) {
                for (uv1 uv1Var2 : uv1Var.x()) {
                    Intrinsics.f(uv1Var2);
                    a.ad b13 = b(uv1Var2);
                    if (b13 instanceof jk0) {
                        return (jk0) b13;
                    }
                    Intrinsics.g(b13, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                }
                return new pk0(Unit.f80348a);
            }
        }
        a.ad a13 = a(uv1Var);
        if (a13 instanceof jk0) {
            return (jk0) a13;
        }
        Intrinsics.g(a13, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        for (uv1 uv1Var3 : uv1Var.t()) {
            Intrinsics.f(uv1Var3);
            a.ad b14 = b(uv1Var3);
            if (b14 instanceof jk0) {
                return (jk0) b14;
            }
            Intrinsics.g(b14, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        }
        return new pk0(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r18) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.a(bl2.c):java.lang.Object");
    }

    public final Uri a() {
        Uri.Builder builder = new Uri.Builder();
        for (String str : this.f8711k) {
            String str2 = (String) this.f8713m.get(str);
            if (str2 != null) {
                m2.W(builder, str, str2);
            }
        }
        String query = builder.build().getQuery();
        if (query == null) {
            query = "";
        }
        a.ad a13 = this.f8704d.a(query);
        pk0 pk0Var = a13 instanceof pk0 ? (pk0) a13 : null;
        String str3 = pk0Var != null ? (String) pk0Var.a() : null;
        Uri.Builder buildUpon = Uri.parse(this.f8708h).buildUpon();
        for (Map.Entry entry : this.f8713m.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (this.f8712l.isEmpty() || this.f8712l.contains(str4)) {
                if (!this.f8711k.contains(str4)) {
                    Intrinsics.f(buildUpon);
                    m2.W(buildUpon, str4, str5);
                } else if (this.f8711k.contains(str4) && wk.a() == xk.f13702c) {
                    Intrinsics.f(buildUpon);
                    m2.W(buildUpon, str4 + "l", String.valueOf(str5.length()));
                }
            }
        }
        if (str3 != null && str3.length() > 0) {
            Intrinsics.f(buildUpon);
            m2.W(buildUpon, this.f8701a.r(), str3);
        }
        Uri build = buildUpon.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final Object a(aj.r rVar, tx1 tx1Var, wv1 wv1Var, Map map, dl2.d dVar) {
        return a(this, rVar, tx1Var, wv1Var, map, dVar);
    }

    public final void a(tx1 tx1Var) {
        for (rx1 rx1Var : tx1Var.t()) {
            if (rx1Var.t()) {
                c81 s13 = rx1Var.s();
                Intrinsics.checkNotNullExpressionValue(s13, "getPattern(...)");
                if (a(s13)) {
                }
            }
            Map r13 = rx1Var.r();
            Intrinsics.checkNotNullExpressionValue(r13, "getIncludeSignalsMap(...)");
            for (Map.Entry entry : r13.entrySet()) {
                String str = (String) entry.getKey();
                ng2 ng2Var = (ng2) entry.getValue();
                LinkedHashMap linkedHashMap = this.f8720t;
                Intrinsics.f(str);
                Intrinsics.f(ng2Var);
                linkedHashMap.put(str, ng2Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            aj.r r0 = r11.f8717q
            java.lang.String r1 = "signals"
            r2 = 0
            if (r0 == 0) goto L52
            android.os.Bundle r0 = r0.googleExtrasBundle
            if (r0 == 0) goto L15
            java.util.ArrayList r0 = r0.getIntegerArrayList(r12)
            if (r0 != 0) goto L13
            goto L15
        L13:
            r3 = r0
            goto L23
        L15:
            aj.r r0 = r11.f8717q
            if (r0 == 0) goto L4e
            android.os.Bundle r0 = r0.googleExtrasBundle
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = r0.getStringArrayList(r12)
            goto L13
        L22:
            r3 = r2
        L23:
            if (r3 == 0) goto L4d
            r8 = 0
            r9 = 0
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 62
            java.lang.String r12 = kotlin.collections.CollectionsKt.Z(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L4d
            java.lang.String r0 = "="
            java.lang.String r12 = a.a.D(r13, r0, r12)
            kotlin.text.Regex r13 = new kotlin.text.Regex
            ads_mobile_sdk.oh0 r0 = r11.f8701a
            java.lang.String r0 = r0.m0()
            r13.<init>(r0)
            boolean r13 = r13.e(r12)
            if (r13 == 0) goto L4d
            return r12
        L4d:
            return r2
        L4e:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        L52:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0093, code lost:
    
        if (r0.j().b() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0095, code lost:
    
        r6 = com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b3, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(ads_mobile_sdk.uv1 r9, ads_mobile_sdk.nr0 r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.a(ads_mobile_sdk.uv1, ads_mobile_sdk.nr0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.ad r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n82.a(a.ad, bl2.c):java.lang.Object");
    }

    public final boolean a(c81 c81Var) {
        if (c81Var.r().size() > 0) {
            h4<c81> r13 = c81Var.r();
            Intrinsics.checkNotNullExpressionValue(r13, "getAndNodesList(...)");
            if (!(r13 instanceof Collection) || !r13.isEmpty()) {
                for (c81 c81Var2 : r13) {
                    Intrinsics.f(c81Var2);
                    if (!a(c81Var2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (c81Var.v().size() > 0) {
            h4<c81> v13 = c81Var.v();
            Intrinsics.checkNotNullExpressionValue(v13, "getOrNodesList(...)");
            if (!(v13 instanceof Collection) || !v13.isEmpty()) {
                for (c81 c81Var3 : v13) {
                    Intrinsics.f(c81Var3);
                    if (a(c81Var3)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (c81Var.x()) {
            c81 u13 = c81Var.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getNotNode(...)");
            if (a(u13)) {
                return false;
            }
        } else if (c81Var.w()) {
            nm.u uVar = this.f8718r;
            if (uVar != null) {
                b91 t13 = c81Var.t();
                Intrinsics.checkNotNullExpressionValue(t13, "getMatchNode(...)");
                return m2.a0(uVar, t13);
            }
            Intrinsics.r("signalJson");
            throw null;
        }
        return true;
    }

    public final a.ad a(uv1 uv1Var) {
        yx0 yx0Var;
        Map A = uv1Var.A();
        Intrinsics.checkNotNullExpressionValue(A, "getIncludeMap(...)");
        for (Map.Entry entry : A.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.f(str);
            Intrinsics.f(str2);
            String D = uv1Var.D();
            Intrinsics.checkNotNullExpressionValue(D, "getRuleLabel(...)");
            a(str, str2, D);
        }
        for (nr0 nr0Var : uv1Var.B()) {
            Intrinsics.f(nr0Var);
            a(uv1Var, nr0Var);
        }
        for (String str3 : uv1Var.v()) {
            LinkedHashSet linkedHashSet = this.f8711k;
            Intrinsics.f(str3);
            linkedHashSet.add(str3);
        }
        for (String str4 : uv1Var.w()) {
            ok.e0 e0Var = gk0.f5596a;
            Intrinsics.f(str4);
            gk0.c(str4, null);
        }
        for (String str5 : uv1Var.s()) {
            LinkedHashSet linkedHashSet2 = this.f8712l;
            Intrinsics.f(str5);
            linkedHashSet2.add(str5);
        }
        if (uv1Var.E()) {
            this.f8710j = uv1Var.r();
        }
        if (uv1Var.H()) {
            if (uv1Var.G()) {
                int y13 = uv1Var.y();
                if (y13 == 0) {
                    yx0Var = yx0.f14443a;
                } else if (y13 == 1) {
                    yx0Var = yx0.f14444b;
                } else if (y13 == 2) {
                    yx0Var = yx0.f14447e;
                } else if (y13 == 3) {
                    yx0Var = yx0.f14445c;
                } else if (y13 == 4) {
                    yx0Var = yx0.f14452j;
                } else if (y13 != 8) {
                    switch (y13) {
                        case 10:
                            yx0Var = yx0.f14451i;
                            break;
                        case 11:
                            yx0Var = yx0.f14450h;
                            break;
                        case 12:
                            yx0Var = yx0.f14448f;
                            break;
                        default:
                            yx0Var = yx0.f14443a;
                            break;
                    }
                } else {
                    yx0Var = yx0.f14446d;
                }
            } else {
                yx0Var = yx0.f14443a;
            }
            String z13 = uv1Var.z();
            Intrinsics.checkNotNullExpressionValue(z13, "getErrorString(...)");
            return new nk0(z13, yx0Var);
        }
        if (uv1Var.F()) {
            if (this.f8709i) {
                String k13 = a.a.k("Rule ", uv1Var.D(), " attempted to modify the base URL after it has been set.");
                ((ks2) this.f8703c).a(k13, new Exception(k13));
            } else {
                String u13 = uv1Var.u();
                Intrinsics.checkNotNullExpressionValue(u13, "getBaseUrl(...)");
                this.f8708h = u13;
                this.f8709i = true;
            }
        }
        return new pk0(Unit.f80348a);
    }

    public final void a(String str, String str2, String str3) {
        if (z.j(str)) {
            String k13 = a.a.k("Rule ", str3, " attempted to set a blank URL parameter.");
            ((ks2) this.f8703c).a(k13, new Exception(k13));
            return;
        }
        if (this.f8713m.containsKey(str)) {
            String m13 = a.a.m("URL parameter ", str, " was attempted to be overwritten by rule ", str3, ".");
            ((ks2) this.f8703c).a(m13, new Exception(m13));
            return;
        }
        Map map = this.f8714n;
        if (map == null) {
            Intrinsics.r("concatenatedSignalsRules");
            throw null;
        }
        if (map.containsKey(str)) {
            Map map2 = this.f8714n;
            if (map2 != null) {
                Object obj = map2.get(str);
                Intrinsics.f(obj);
                String str4 = (String) obj;
                StringBuilder sb3 = (StringBuilder) this.f8715o.get(str);
                if (sb3 == null) {
                    sb3 = new StringBuilder();
                }
                if (sb3.length() > 0) {
                    sb3.append(str4);
                }
                sb3.append(str2);
                this.f8715o.put(str, sb3);
                return;
            }
            Intrinsics.r("concatenatedSignalsRules");
            throw null;
        }
        this.f8713m.put(str, str2);
    }
}
