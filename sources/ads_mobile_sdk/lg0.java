package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lg0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7822b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7823c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7824d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7825e;

    /* renamed from: f, reason: collision with root package name */
    public final y80 f7826f;

    /* renamed from: g, reason: collision with root package name */
    public final tg0 f7827g;

    /* renamed from: h, reason: collision with root package name */
    public final sb2 f7828h;

    /* renamed from: i, reason: collision with root package name */
    public final eg0 f7829i;

    /* renamed from: j, reason: collision with root package name */
    public final zq1 f7830j;

    public lg0(Context applicationContext, int i13, String afmaVersion, String gmaVersion, String applicationId, y80 deviceProperties, tg0 flagValueProvider, sb2 rootTraceCreator, eg0 flagDataStore, zq1 omid) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        Intrinsics.checkNotNullParameter(omid, "omid");
        this.f7821a = applicationContext;
        this.f7822b = i13;
        this.f7823c = afmaVersion;
        this.f7824d = gmaVersion;
        this.f7825e = applicationId;
        this.f7826f = deviceProperties;
        this.f7827g = flagValueProvider;
        this.f7828h = rootTraceCreator;
        this.f7829i = flagDataStore;
        this.f7830j = omid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #15 {all -> 0x0099, blocks: (B:108:0x0092, B:111:0x0157, B:112:0x0195, B:114:0x019b, B:120:0x017a), top: B:107:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b3 A[Catch: all -> 0x01c3, TryCatch #1 {all -> 0x01c3, blocks: (B:128:0x01ac, B:130:0x01b3, B:132:0x01ba, B:134:0x01be, B:136:0x01c2, B:137:0x01c6, B:138:0x01cb, B:139:0x01cc, B:140:0x01d3, B:141:0x01d4, B:142:0x01db, B:143:0x01dc), top: B:127:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dc A[Catch: all -> 0x01c3, TRY_LEAVE, TryCatch #1 {all -> 0x01c3, blocks: (B:128:0x01ac, B:130:0x01b3, B:132:0x01ba, B:134:0x01be, B:136:0x01c2, B:137:0x01c6, B:138:0x01cb, B:139:0x01cc, B:140:0x01d3, B:141:0x01d4, B:142:0x01db, B:143:0x01dc), top: B:127:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x011e A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #10 {all -> 0x0133, blocks: (B:157:0x0118, B:160:0x011e, B:162:0x0120, B:164:0x0124, B:167:0x012c, B:170:0x0137, B:172:0x013b, B:174:0x013f, B:177:0x0146, B:184:0x0188, B:186:0x018c), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0188 A[Catch: all -> 0x0133, TRY_ENTER, TryCatch #10 {all -> 0x0133, blocks: (B:157:0x0118, B:160:0x011e, B:162:0x0120, B:164:0x0124, B:167:0x012c, B:170:0x0137, B:172:0x013b, B:174:0x013f, B:177:0x0146, B:184:0x0188, B:186:0x018c), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0291 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #9 {all -> 0x0052, blocks: (B:14:0x004c, B:17:0x024c, B:18:0x028b, B:20:0x0291, B:29:0x0270), top: B:13:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02aa A[Catch: all -> 0x02ba, TryCatch #16 {all -> 0x02ba, blocks: (B:36:0x02a3, B:38:0x02aa, B:40:0x02b1, B:42:0x02b5, B:44:0x02b9, B:45:0x02bd, B:46:0x02c2, B:47:0x02c3, B:48:0x02ca, B:49:0x02cb, B:50:0x02d2, B:51:0x02d3), top: B:35:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d3 A[Catch: all -> 0x02ba, TRY_LEAVE, TryCatch #16 {all -> 0x02ba, blocks: (B:36:0x02a3, B:38:0x02aa, B:40:0x02b1, B:42:0x02b5, B:44:0x02b9, B:45:0x02bd, B:46:0x02c2, B:47:0x02c3, B:48:0x02ca, B:49:0x02cb, B:50:0x02d2, B:51:0x02d3), top: B:35:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0212 A[Catch: all -> 0x0227, TRY_LEAVE, TryCatch #3 {all -> 0x0227, blocks: (B:67:0x020c, B:70:0x0212, B:72:0x0214, B:74:0x0218, B:77:0x0220, B:80:0x022c, B:82:0x0230, B:84:0x0234, B:87:0x023b, B:94:0x027c, B:96:0x0280), top: B:66:0x020c }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027c A[Catch: all -> 0x0227, TRY_ENTER, TryCatch #3 {all -> 0x0227, blocks: (B:67:0x020c, B:70:0x0212, B:72:0x0214, B:74:0x0218, B:77:0x0220, B:80:0x022c, B:82:0x0230, B:84:0x0234, B:87:0x023b, B:94:0x027c, B:96:0x0280), top: B:66:0x020c }] */
    /* JADX WARN: Type inference failed for: r19v0, types: [ads_mobile_sdk.sy0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.lg0 r18, ads_mobile_sdk.sy0 r19, nm.u r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lg0.a(ads_mobile_sdk.lg0, ads_mobile_sdk.sy0, nm.u, bl2.c):java.lang.Object");
    }

    public final nm.u a(nm.u consentStrings) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(consentStrings, "consentStrings");
        nm.u uVar = new nm.u();
        uVar.u("pn", this.f7821a.getPackageName());
        PackageManager packageManager = this.f7821a.getPackageManager();
        uVar.s(Integer.valueOf((packageManager == null || (packageInfo = packageManager.getPackageInfo(this.f7821a.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)) == null) ? 0 : packageInfo.versionCode), "vc");
        uVar.u((String) bk.LANGUAGE_CODE.f3510a.get(0), Locale.getDefault().getLanguage());
        uVar.u((String) bk.GEO_COUNTRY.f3510a.get(0), Locale.getDefault().getCountry());
        uVar.u("app_id", this.f7825e);
        uVar.u("js", this.f7823c);
        uVar.t("mf", Boolean.FALSE);
        uVar.u("mv", (String) this.f7826f.f14141k.getValue());
        uVar.t("is_decagon", Boolean.TRUE);
        uVar.u("sdk_version", this.f7824d);
        uVar.s(Integer.valueOf(this.f7822b), "dynamite_version");
        uVar.u("package_name", this.f7821a.getPackageName());
        uVar.u("omid_v", (String) this.f7830j.f14866g.b(qq1.f10224a, "GetOmidVersion"));
        uVar.r("shared_pref", consentStrings);
        DisplayMetrics displayMetrics = this.f7821a.getResources().getDisplayMetrics();
        float f13 = displayMetrics.density;
        int i13 = displayMetrics.widthPixels;
        int i14 = displayMetrics.heightPixels;
        uVar.s(Integer.valueOf(ml2.c.c(i13 / f13)), (String) bk.SCREEN_WIDTH.f3510a.get(0));
        uVar.s(Integer.valueOf(ml2.c.c(i14 / f13)), (String) bk.SCREEN_HEIGHT.f3510a.get(0));
        return uVar;
    }
}
