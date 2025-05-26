package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class cx2 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final j0 f4058d;

    /* renamed from: e, reason: collision with root package name */
    public final yp0 f4059e;

    /* renamed from: f, reason: collision with root package name */
    public final co2.q f4060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(j0 backgroundScope, yp0 httpClient) {
        super((il0) null, false, 7);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f4058d = backgroundScope;
        this.f4059e = httpClient;
        this.f4060f = l0.b(Integer.MAX_VALUE, null, 6);
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        j0 j0Var = this.f4058d;
        bx2 block = new bx2(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return new pk0(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:13:0x0071, B:15:0x0077, B:23:0x0058), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006e -> B:13:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.ax2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.ax2 r0 = (ads_mobile_sdk.ax2) r0
            int r1 = r0.f2597e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2597e = r1
            goto L18
        L13:
            ads_mobile_sdk.ax2 r0 = new ads_mobile_sdk.ax2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f2595c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2597e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            android.net.Uri r2 = r0.f2594b
            ads_mobile_sdk.cx2 r6 = r0.f2593a
            ue.c.H(r10)     // Catch: java.lang.Exception -> L2f
            goto L71
        L2f:
            r10 = move-exception
            goto L84
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            ads_mobile_sdk.cx2 r2 = r0.f2593a
            ue.c.H(r10)
            r6 = r2
            goto L55
        L40:
            ue.c.H(r10)
            r10 = r9
        L44:
            co2.q r2 = r10.f4060f
            r0.f2593a = r10
            r0.f2594b = r3
            r0.f2597e = r5
            java.lang.Object r2 = r2.p(r0)
            if (r2 != r1) goto L53
            return r1
        L53:
            r6 = r10
            r10 = r2
        L55:
            r2 = r10
            android.net.Uri r2 = (android.net.Uri) r2
            ads_mobile_sdk.yp0 r10 = r6.f4059e     // Catch: java.lang.Exception -> L2f
            java.net.URL r7 = new java.net.URL     // Catch: java.lang.Exception -> L2f
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L2f
            r7.<init>(r8)     // Catch: java.lang.Exception -> L2f
            r0.f2593a = r6     // Catch: java.lang.Exception -> L2f
            r0.f2594b = r2     // Catch: java.lang.Exception -> L2f
            r0.f2597e = r4     // Catch: java.lang.Exception -> L2f
            r8 = 6
            java.lang.Object r10 = ads_mobile_sdk.yp0.a(r10, r7, r3, r0, r8)     // Catch: java.lang.Exception -> L2f
            if (r10 != r1) goto L71
            return r1
        L71:
            a.ad r10 = (a.ad) r10     // Catch: java.lang.Exception -> L2f
            boolean r7 = r10 instanceof ads_mobile_sdk.pk0     // Catch: java.lang.Exception -> L2f
            if (r7 == 0) goto L82
            ads_mobile_sdk.pk0 r10 = (ads_mobile_sdk.pk0) r10     // Catch: java.lang.Exception -> L2f
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Exception -> L2f
            okhttp3.Response r10 = (okhttp3.Response) r10     // Catch: java.lang.Exception -> L2f
            r10.close()     // Catch: java.lang.Exception -> L2f
        L82:
            r10 = r6
            goto L44
        L84:
            ok.e0 r7 = ads_mobile_sdk.gk0.f5596a
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Error while pinging URL: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = ": "
            r7.append(r2)
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            ads_mobile_sdk.gk0.c(r10)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cx2.f(bl2.c):java.lang.Object");
    }
}
