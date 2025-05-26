package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class dz {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f4517a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f4518b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f4519c;

    /* renamed from: d, reason: collision with root package name */
    public final x92 f4520d;

    /* renamed from: e, reason: collision with root package name */
    public final mo2.a f4521e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4522f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4523g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f4524h;

    public dz(j0 backgroundScope, Context context, oh0 flags, zb clock, x92 urlPinger, h92 requestType, y80 deviceProperties, vo commonConfiguration) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        this.f4517a = backgroundScope;
        this.f4518b = flags;
        this.f4519c = clock;
        this.f4520d = urlPinger;
        this.f4521e = mo2.d.a();
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("ad_format", requestType.a());
        pairArr[1] = new Pair("api_v", String.valueOf(Build.VERSION.SDK_INT));
        pairArr[2] = new Pair("app", context.getPackageName());
        pairArr[3] = new Pair("s", "gmob_sdk");
        pairArr[4] = new Pair("v", "3");
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.f(str2);
        Intrinsics.f(str);
        pairArr[5] = new Pair("device", z.p(str2, str, false) ? str2 : a.a.D(str, " ", str2));
        pairArr[6] = new Pair("is_bstar", deviceProperties.c() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        pairArr[7] = new Pair("is_lite_sdk", "0");
        pairArr[8] = new Pair("gqi", commonConfiguration.f12583h);
        pairArr[9] = new Pair("os", Build.VERSION.RELEASE);
        this.f4522f = kotlin.collections.z0.h(pairArr);
        this.f4523g = new ArrayList();
        this.f4524h = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3 A[LOOP:1: B:23:0x00bd->B:25:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dz.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:11:0x008e, B:13:0x0098, B:14:0x00b9, B:19:0x00a0), top: B:10:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:11:0x008e, B:13:0x0098, B:14:0x00b9, B:19:0x00a0), top: B:10:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r16, java.util.List r17, bl2.c r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            boolean r2 = r0 instanceof ads_mobile_sdk.wy
            if (r2 == 0) goto L16
            r2 = r0
            ads_mobile_sdk.wy r2 = (ads_mobile_sdk.wy) r2
            int r3 = r2.f13300g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f13300g = r3
            goto L1b
        L16:
            ads_mobile_sdk.wy r2 = new ads_mobile_sdk.wy
            r2.<init>(r15, r0)
        L1b:
            java.lang.Object r0 = r2.f13298e
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r2.f13300g
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            mo2.a r3 = r2.f13297d
            java.lang.String r4 = r2.f13296c
            java.lang.String r5 = r2.f13295b
            ads_mobile_sdk.dz r2 = r2.f13294a
            ue.c.H(r0)
            goto L8e
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            ue.c.H(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r17.iterator()
        L47:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r0.next()
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L47
            r7.add(r4)
            goto L47
        L5e:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L67
            kotlin.Unit r0 = kotlin.Unit.f80348a
            return r0
        L67:
            r12 = 0
            r13 = 0
            java.lang.String r8 = ","
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 62
            java.lang.String r4 = kotlin.collections.CollectionsKt.Z(r7, r8, r9, r10, r11, r12, r13, r14)
            mo2.a r0 = r1.f4521e
            r2.f13294a = r1
            r7 = r16
            r2.f13295b = r7
            r2.f13296c = r4
            r2.f13297d = r0
            r2.f13300g = r5
            mo2.c r0 = (mo2.c) r0
            java.lang.Object r2 = r0.f(r6, r2)
            if (r2 != r3) goto L8b
            return r3
        L8b:
            r3 = r0
            r2 = r1
            r5 = r7
        L8e:
            java.util.Map r0 = r2.f4522f     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto La0
            java.util.Map r0 = r2.f4522f     // Catch: java.lang.Throwable -> L9e
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L9e
            goto Lb9
        L9e:
            r0 = move-exception
            goto Lc1
        La0:
            java.util.Map r2 = r2.f4522f     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r7.<init>()     // Catch: java.lang.Throwable -> L9e
            r7.append(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = ","
            r7.append(r0)     // Catch: java.lang.Throwable -> L9e
            r7.append(r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L9e
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L9e
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L9e
            mo2.c r3 = (mo2.c) r3
            r3.i(r6)
            return r0
        Lc1:
            mo2.c r3 = (mo2.c) r3
            r3.i(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dz.a(java.lang.String, java.util.List, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.xy
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.xy r0 = (ads_mobile_sdk.xy) r0
            int r1 = r0.f13882h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13882h = r1
            goto L18
        L13:
            ads_mobile_sdk.xy r0 = new ads_mobile_sdk.xy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f13880f
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13882h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo2.a r8 = r0.f13879e
            ads_mobile_sdk.cr2 r1 = r0.f13878d
            ads_mobile_sdk.cr2 r2 = r0.f13877c
            java.lang.String r3 = r0.f13876b
            ads_mobile_sdk.dz r0 = r0.f13875a
            ue.c.H(r9)
            goto L6f
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            ue.c.H(r9)
            ads_mobile_sdk.cr2 r9 = new ads_mobile_sdk.cr2
            zn2.a r2 = zn2.b.f142311b
            a.zb r2 = r7.f4519c
            r2.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            zn2.d r2 = zn2.d.MILLISECONDS
            long r5 = dl2.b.Q2(r5, r2)
            r9.<init>(r5, r8)
            mo2.a r2 = r7.f4521e
            r0.f13875a = r7
            r0.f13876b = r8
            r0.f13877c = r9
            r0.f13878d = r9
            r0.f13879e = r2
            r0.f13882h = r3
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r0 = r2.f(r4, r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r0 = r7
            r3 = r8
            r1 = r9
            r8 = r2
            r2 = r1
        L6f:
            java.util.LinkedHashMap r9 = r0.f4524h     // Catch: java.lang.Throwable -> L7c
            r9.put(r3, r1)     // Catch: java.lang.Throwable -> L7c
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7c
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            return r2
        L7c:
            r9 = move-exception
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dz.a(java.lang.String, bl2.c):java.lang.Object");
    }

    public final Uri a(String str, String str2, Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f4518b.u()).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return Uri.parse(buildUpon.build().toString() + "&it=" + str + "&blat=" + str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x0059, B:17:0x0063), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x0059, B:17:0x0063), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, boolean r8, bl2.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.bz
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.bz r0 = (ads_mobile_sdk.bz) r0
            int r1 = r0.f3652h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3652h = r1
            goto L18
        L13:
            ads_mobile_sdk.bz r0 = new ads_mobile_sdk.bz
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f3650f
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f3652h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            boolean r8 = r0.f3649e
            mo2.a r6 = r0.f3648d
            java.lang.String r7 = r0.f3647c
            java.lang.String r1 = r0.f3646b
            ads_mobile_sdk.dz r0 = r0.f3645a
            ue.c.H(r9)
            r9 = r6
            r6 = r1
            goto L57
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            ue.c.H(r9)
            mo2.a r9 = r5.f4521e
            r0.f3645a = r5
            r0.f3646b = r6
            r0.f3647c = r7
            r0.f3648d = r9
            r0.f3649e = r8
            r0.f3652h = r3
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r0 = r9.f(r4, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            if (r8 == 0) goto L63
            java.util.Map r8 = r0.f4522f     // Catch: java.lang.Throwable -> L61
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L61
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L61
            goto L68
        L61:
            r6 = move-exception
            goto L70
        L63:
            java.util.Map r8 = r0.f4522f     // Catch: java.lang.Throwable -> L61
            r8.putIfAbsent(r6, r7)     // Catch: java.lang.Throwable -> L61
        L68:
            mo2.c r9 = (mo2.c) r9
            r9.i(r4)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L70:
            mo2.c r9 = (mo2.c) r9
            r9.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dz.a(java.lang.String, java.lang.String, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x0057, B:13:0x0061), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, long r8, bl2.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.cz
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.cz r0 = (ads_mobile_sdk.cz) r0
            int r1 = r0.f4073h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4073h = r1
            goto L18
        L13:
            ads_mobile_sdk.cz r0 = new ads_mobile_sdk.cz
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f4071f
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4073h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            long r8 = r0.f4070e
            mo2.a r6 = r0.f4069d
            java.lang.String r7 = r0.f4068c
            java.lang.String r1 = r0.f4067b
            ads_mobile_sdk.dz r0 = r0.f4066a
            ue.c.H(r10)
            r10 = r6
            r6 = r1
            goto L57
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            ue.c.H(r10)
            mo2.a r10 = r5.f4521e
            r0.f4066a = r5
            r0.f4067b = r6
            r0.f4068c = r7
            r0.f4069d = r10
            r0.f4070e = r8
            r0.f4073h = r3
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r0 = r10.f(r4, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            java.util.LinkedHashMap r1 = r0.f4524h     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.cr2 r7 = (ads_mobile_sdk.cr2) r7     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto L6e
            java.util.ArrayList r0 = r0.f4523g     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.uy r1 = new ads_mobile_sdk.uy     // Catch: java.lang.Throwable -> L6c
            r1.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L6c
            r0.add(r1)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r6 = move-exception
            goto L76
        L6e:
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L76:
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dz.a(java.lang.String, java.lang.String, long, bl2.c):java.lang.Object");
    }
}
