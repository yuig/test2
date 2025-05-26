package a;

import ads_mobile_sdk.cm0;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class l0 {
    public static String b(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        AtomicReference atomicReference = cm0.f3960h;
        String str = (String) atomicReference.get();
        if (str != null) {
            return str;
        }
        String str2 = "B3EEABB8EE11C2BE770B684D95219ECB";
        if (!l3.c.g() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null && string.length() != 0) {
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    str2 = null;
                    break;
                }
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bytes = string.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                    String format = String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    str2 = format;
                    break;
                } catch (NoSuchAlgorithmException unused) {
                    i13++;
                }
            }
        }
        atomicReference.set(str2);
        return (String) cm0.f3960h.get();
    }

    public static String c(String regexString, String stringToMatch) {
        Intrinsics.checkNotNullParameter(regexString, "regexString");
        Intrinsics.checkNotNullParameter(stringToMatch, "stringToMatch");
        kotlin.text.j b13 = new Regex(regexString).b(0, stringToMatch);
        if (b13 != null) {
            Collection b14 = b13.b();
            kotlin.collections.b bVar = (kotlin.collections.b) b14;
            if (bVar.b() >= 2) {
                int b15 = bVar.b();
                for (int i13 = 1; i13 < b15; i13++) {
                    kotlin.collections.d1 d1Var = (kotlin.collections.d1) b14;
                    if (!kotlin.text.z.j((CharSequence) d1Var.get(i13))) {
                        return (String) d1Var.get(i13);
                    }
                }
            }
        }
        return null;
    }

    public static boolean d(Context context, String permissionName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
        return context.checkSelfPermission(permissionName) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r5, kotlin.jvm.functions.Function1 r7, bl2.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.yl0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.yl0 r0 = (ads_mobile_sdk.yl0) r0
            int r1 = r0.f14310c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14310c = r1
            goto L18
        L13:
            ads_mobile_sdk.yl0 r0 = new ads_mobile_sdk.yl0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f14308a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14310c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r8)
            ads_mobile_sdk.zl0 r8 = new ads_mobile_sdk.zl0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            r2 = 0
            r8.<init>(r7, r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            r0.f14310c = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            java.lang.Object r8 = bs1.c.x2(r5, r8, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            if (r8 != r1) goto L43
            return r1
        L43:
            ads_mobile_sdk.pk0 r5 = new ads_mobile_sdk.pk0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            r5.<init>(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            goto L62
        L49:
            ads_mobile_sdk.qk0 r6 = new ads_mobile_sdk.qk0
            r6.<init>(r5, r3)
            java.lang.String r7 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            ads_mobile_sdk.cs2 r7 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r8 = r7.f()
            r0 = 0
            r8.f6988j = r0
            r7.a(r5)
            r5 = r6
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l0.a(long, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }
}
