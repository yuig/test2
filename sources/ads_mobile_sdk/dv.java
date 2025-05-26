package ads_mobile_sdk;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class dv extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final a.j3 f4459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(a.j3 traceLogger) {
        super(il0.CUI_NAME_SDKINIT_INIT_CRYPTO, true, 2);
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f4459d = traceLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a.ad a(java.lang.String r6, java.lang.String r7, ads_mobile_sdk.mh2 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "CryptoUtils.decrypt"
            java.lang.String r1 = "CryptoUtil.getHandle: CleartextKeysetHandle.read"
            java.lang.String r2 = "encodedEncryptedAdResponseBlob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "requestId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "signalGenerationData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            aj.r r8 = r8.f8230c
            java.lang.String r8 = r8.adResponseEncryptionKey
            if (r8 != 0) goto L24
            ads_mobile_sdk.nk0 r6 = new ads_mobile_sdk.nk0
            java.lang.String r7 = "An encrypted S2S ad response had no adResponseEncryptionKey"
            ads_mobile_sdk.yx0 r8 = ads_mobile_sdk.yx0.f14443a
            r6.<init>(r7, r8)
            return r6
        L24:
            r2 = 11
            byte[] r6 = android.util.Base64.decode(r6, r2)
            kotlin.jvm.internal.Intrinsics.f(r6)
            r2 = 6
            r3 = 0
            ads_mobile_sdk.pk0 r8 = gh0.b.q(r8)     // Catch: java.lang.IllegalArgumentException -> L34 java.io.IOException -> L45 java.security.GeneralSecurityException -> L53
            goto L61
        L34:
            r8 = move-exception
            a.j3 r1 = r5.f4459d
            ads_mobile_sdk.ks2 r1 = (ads_mobile_sdk.ks2) r1
            java.lang.String r4 = "CryptoUtil.getHandle: Base64.decode"
            r1.a(r4, r8)
            ads_mobile_sdk.kk0 r1 = new ads_mobile_sdk.kk0
            r1.<init>(r8, r3, r3, r2)
        L43:
            r8 = r1
            goto L61
        L45:
            r8 = move-exception
            a.j3 r4 = r5.f4459d
            ads_mobile_sdk.ks2 r4 = (ads_mobile_sdk.ks2) r4
            r4.a(r1, r8)
            ads_mobile_sdk.kk0 r1 = new ads_mobile_sdk.kk0
            r1.<init>(r8, r3, r3, r2)
            goto L43
        L53:
            r8 = move-exception
            a.j3 r4 = r5.f4459d
            ads_mobile_sdk.ks2 r4 = (ads_mobile_sdk.ks2) r4
            r4.a(r1, r8)
            ads_mobile_sdk.kk0 r1 = new ads_mobile_sdk.kk0
            r1.<init>(r8, r3, r3, r2)
            goto L43
        L61:
            boolean r1 = r8 instanceof ads_mobile_sdk.jk0
            if (r1 == 0) goto L68
            ads_mobile_sdk.jk0 r8 = (ads_mobile_sdk.jk0) r8
            goto Lb0
        L68:
            ads_mobile_sdk.pk0 r8 = (ads_mobile_sdk.pk0) r8
            java.lang.Object r8 = r8.f9719b
            ads_mobile_sdk.p51 r8 = (ads_mobile_sdk.p51) r8
            java.lang.Object r8 = r8.b()     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            a.y9 r8 = (a.y9) r8     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            byte[] r7 = r7.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            java.lang.String r4 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            byte[] r6 = r8.a(r6, r7)     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            java.lang.String r7 = "decrypt(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            java.lang.String r7 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            r7.<init>(r6, r1)     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            ads_mobile_sdk.pk0 r8 = new ads_mobile_sdk.pk0     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            r8.<init>(r7)     // Catch: java.io.UnsupportedEncodingException -> L93 java.security.GeneralSecurityException -> L95
            goto Lb0
        L93:
            r6 = move-exception
            goto L97
        L95:
            r6 = move-exception
            goto La4
        L97:
            a.j3 r7 = r5.f4459d
            ads_mobile_sdk.ks2 r7 = (ads_mobile_sdk.ks2) r7
            r7.a(r0, r6)
            ads_mobile_sdk.kk0 r8 = new ads_mobile_sdk.kk0
            r8.<init>(r6, r3, r3, r2)
            goto Lb0
        La4:
            a.j3 r7 = r5.f4459d
            ads_mobile_sdk.ks2 r7 = (ads_mobile_sdk.ks2) r7
            r7.a(r0, r6)
            ads_mobile_sdk.kk0 r8 = new ads_mobile_sdk.kk0
            r8.<init>(r6, r3, r3, r2)
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dv.a(java.lang.String, java.lang.String, ads_mobile_sdk.mh2):a.ad");
    }

    public final a.ad c() {
        try {
            try {
                p51 a13 = p51.a(gy1.f5751a);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        a13.f9559a.a(byteArrayOutputStream);
                        byteArrayOutputStream.close();
                        byte[] encode = Base64.encode(byteArrayOutputStream.toByteArray(), 11);
                        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
                        return new pk0(new String(encode, Charsets.UTF_8));
                    } catch (Throwable th3) {
                        byteArrayOutputStream.close();
                        throw th3;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Serialize keyset failed");
                }
            } catch (IOException e13) {
                ((ks2) this.f4459d).a("CryptoUtils.generateKey", e13);
                return new kk0(e13, null, null, 6);
            }
        } catch (GeneralSecurityException e14) {
            ((ks2) this.f4459d).a("CryptoUtils.generateKey", e14);
            return new kk0(e14, null, null, 6);
        }
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        try {
            a.ma.a();
            return new pk0(Unit.f80348a);
        } catch (GeneralSecurityException e13) {
            ((ks2) this.f4459d).a("CryptoUtil: AeadConfig.register()", e13);
            return new pk0(Unit.f80348a);
        }
    }

    public static a.ad a(String adString) {
        Intrinsics.checkNotNullParameter(adString, "adString");
        int N = StringsKt.N(adString, "&request_id=", 0, 6);
        if (N != -1) {
            String substring = adString.substring(0, N);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = adString.substring(N + 12);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return new pk0(new Pair(substring, substring2));
        }
        return new nk0("Invalid ad string, no request ID present", yx0.f14443a);
    }
}
