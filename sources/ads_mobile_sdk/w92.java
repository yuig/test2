package ads_mobile_sdk;

import a.zb;
import android.net.Uri;
import android.os.SystemClock;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w92 {

    /* renamed from: a, reason: collision with root package name */
    public final oh0 f12904a;

    /* renamed from: b, reason: collision with root package name */
    public final np1 f12905b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f12906c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f12907d;

    /* renamed from: e, reason: collision with root package name */
    public final yp0 f12908e;

    /* renamed from: f, reason: collision with root package name */
    public final cx2 f12909f;

    public w92(oh0 flags, np1 offlineDatabase, zb clock, j0 backgroundScope, yp0 httpClient, cx2 urlPinger) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(offlineDatabase, "offlineDatabase");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        this.f12904a = flags;
        this.f12905b = offlineDatabase;
        this.f12906c = clock;
        this.f12907d = backgroundScope;
        this.f12908e = httpClient;
        this.f12909f = urlPinger;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(1:(4:9|10|11|12)(2:35|36))(13:37|38|39|40|41|42|43|44|45|46|47|48|(1:50)(1:51))|13|14|(1:16)(2:22|(1:26))|17|18|19))|66|6|(0)(0)|13|14|(0)(0)|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: Exception -> 0x003e, IOException -> 0x0090, TryCatch #1 {Exception -> 0x003e, blocks: (B:11:0x0037, B:14:0x007d, B:16:0x0083, B:22:0x0092, B:24:0x0096, B:26:0x00a2), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[Catch: Exception -> 0x003e, IOException -> 0x0090, TryCatch #1 {Exception -> 0x003e, blocks: (B:11:0x0037, B:14:0x007d, B:16:0x0083, B:22:0x0092, B:24:0x0096, B:26:0x00a2), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r15, ads_mobile_sdk.zn1 r16, int r17, long r18, java.lang.String r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w92.a(android.net.Uri, ads_mobile_sdk.zn1, int, long, java.lang.String, bl2.c):java.lang.Object");
    }

    public final String a(Uri uri, int i13) {
        if (this.f12904a.L()) {
            String encodedQuery = uri.getEncodedQuery();
            return uri.buildUpon().clearQuery().appendQueryParameter("pa", String.valueOf(i13)).build() + "&" + encodedQuery;
        }
        String uri2 = uri.toString();
        Intrinsics.f(uri2);
        return uri2;
    }

    public final void a(Uri uri, zn1 zn1Var, int i13, long j13, String str) {
        if (i13 >= zn1Var.f14840a) {
            if (zn1Var.f14842c) {
                np1 np1Var = this.f12905b;
                this.f12906c.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String a13 = a(uri, i13 + 1);
                fp1 fp1Var = fp1.f5235a;
                gp1 pingRecord = new gp1(elapsedRealtime, str, a13);
                np1Var.getClass();
                Intrinsics.checkNotNullParameter(pingRecord, "pingRecord");
                kotlin.jvm.internal.j.z(np1Var.f8912a, null, null, new kp1(np1Var, new jp1(np1Var, pingRecord, null), null), 3);
                return;
            }
            return;
        }
        kotlin.jvm.internal.j.z(this.f12907d, null, null, new v92(i13, j13, uri, zn1Var, this, str, null), 3);
    }
}
