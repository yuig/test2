package ads_mobile_sdk;

import ao2.j0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public abstract class y72 {

    /* renamed from: j, reason: collision with root package name */
    public static final MediaType f14124j;

    /* renamed from: a, reason: collision with root package name */
    public final a.v7 f14125a;

    /* renamed from: b, reason: collision with root package name */
    public final yp0 f14126b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f14127c;

    /* renamed from: d, reason: collision with root package name */
    public zr f14128d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f14129e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicReference f14130f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReference f14131g;

    /* renamed from: h, reason: collision with root package name */
    public Object f14132h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedList f14133i;

    static {
        MediaType.f95651d.getClass();
        f14124j = MediaType.Companion.a("application/x-protobuf");
    }

    public y72(a.o8 consentManagerProvider, yp0 httpClient, oh0 flags) {
        Intrinsics.checkNotNullParameter(consentManagerProvider, "consentManagerProvider");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f14125a = consentManagerProvider;
        this.f14126b = httpClient;
        this.f14127c = flags;
        this.f14133i = new LinkedList();
    }

    public static String a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            String format = String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (ArithmeticException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public abstract long a();

    public abstract Object a(bl2.c cVar);

    public final void a(j0 backgroundScope, sj0 baseMessage, AtomicReference variationsData, AtomicReference rawVariationsData) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(baseMessage, "baseMessage");
        Intrinsics.checkNotNullParameter(variationsData, "variationsData");
        Intrinsics.checkNotNullParameter(rawVariationsData, "rawVariationsData");
        Intrinsics.checkNotNullParameter(backgroundScope, "<set-?>");
        this.f14129e = backgroundScope;
        Intrinsics.checkNotNullParameter(baseMessage, "<set-?>");
        this.f14132h = baseMessage;
        Object obj = this.f14125a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        zr zrVar = (zr) obj;
        Intrinsics.checkNotNullParameter(zrVar, "<set-?>");
        this.f14128d = zrVar;
        Intrinsics.checkNotNullParameter(variationsData, "<set-?>");
        this.f14130f = variationsData;
        Intrinsics.checkNotNullParameter(rawVariationsData, "<set-?>");
        this.f14131g = rawVariationsData;
        j0 j0Var = this.f14129e;
        if (j0Var != null) {
            x72 block = new x72(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
            return;
        }
        Intrinsics.r("backgroundScope");
        throw null;
    }

    public final void a(Object snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        synchronized (this) {
            this.f14133i.add(snapshot);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r8 = ads_mobile_sdk.gk0.f5596a;
        ads_mobile_sdk.gk0.c("Failed to ping RCS payload: " + r7, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(byte[] r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.w72
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.w72 r0 = (ads_mobile_sdk.w72) r0
            int r1 = r0.f12894c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12894c = r1
            goto L18
        L13:
            ads_mobile_sdk.w72 r0 = new ads_mobile_sdk.w72
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12892a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12894c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r8)     // Catch: java.io.IOException -> L27
            goto L71
        L27:
            r7 = move-exception
            goto L5e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ue.c.H(r8)
            okhttp3.Request$Builder r8 = new okhttp3.Request$Builder     // Catch: java.io.IOException -> L27
            r8.<init>()     // Catch: java.io.IOException -> L27
            ads_mobile_sdk.oh0 r2 = r6.f14127c     // Catch: java.io.IOException -> L27
            java.lang.String r2 = r2.a0()     // Catch: java.io.IOException -> L27
            r8.j(r2)     // Catch: java.io.IOException -> L27
            okhttp3.RequestBody$Companion r2 = okhttp3.RequestBody.f95711a     // Catch: java.io.IOException -> L27
            okhttp3.MediaType r4 = ads_mobile_sdk.y72.f14124j     // Catch: java.io.IOException -> L27
            r5 = 6
            okhttp3.RequestBody$Companion$toRequestBody$2 r7 = okhttp3.RequestBody.Companion.e(r2, r7, r4, r5)     // Catch: java.io.IOException -> L27
            r8.g(r7)     // Catch: java.io.IOException -> L27
            okhttp3.Request r7 = r8.b()     // Catch: java.io.IOException -> L27
            ads_mobile_sdk.yp0 r8 = r6.f14126b     // Catch: java.io.IOException -> L27
            r0.f12894c = r3     // Catch: java.io.IOException -> L27
            r2 = 0
            java.lang.Object r7 = ads_mobile_sdk.yp0.a(r8, r7, r2, r0, r5)     // Catch: java.io.IOException -> L27
            if (r7 != r1) goto L71
            return r1
        L5e:
            ok.e0 r8 = ads_mobile_sdk.gk0.f5596a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to ping RCS payload: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            ads_mobile_sdk.gk0.c(r7)
        L71:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y72.a(byte[], bl2.c):java.lang.Object");
    }
}
