package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.z;
import m60.f0;
import okhttp3.Response;
import okhttp3.internal.Util;
import wo2.j;
import wo2.m;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    public static final m f95967a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f95968b;

    static {
        m mVar = m.f130712d;
        f95967a = f0.h0("\"\\");
        f95968b = f0.h0("\t ,=");
    }

    public static final boolean a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.d(response.f95720a.f95701b, "HEAD")) {
            return false;
        }
        int i13 = response.f95723d;
        return (((i13 >= 100 && i13 < 200) || i13 == 204 || i13 == 304) && Util.k(response) == -1 && !z.i("chunked", response.c("Transfer-Encoding", null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0109, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0109, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(wo2.j r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.b(wo2.j, java.util.ArrayList):void");
    }

    public static final String c(j jVar) {
        long L0 = jVar.L0(f95968b);
        if (L0 == -1) {
            L0 = jVar.f130711b;
        }
        if (L0 != 0) {
            return jVar.L(L0, Charsets.UTF_8);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01dd, code lost:
    
        if (okhttp3.internal.Util.f95762f.e(r0) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f4, code lost:
    
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f96248h.a(r15) == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x023c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(okhttp3.CookieJar r38, okhttp3.HttpUrl r39, okhttp3.Headers r40) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static final boolean e(j jVar) {
        boolean z13 = false;
        while (!jVar.o1()) {
            byte k13 = jVar.k(0L);
            if (k13 == 44) {
                jVar.readByte();
                z13 = true;
            } else {
                if (k13 != 32 && k13 != 9) {
                    break;
                }
                jVar.readByte();
            }
        }
        return z13;
    }
}
