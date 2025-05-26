package retrofit2;

import pq2.a1;

/* loaded from: classes4.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f107721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107722b;

    /* renamed from: c, reason: collision with root package name */
    public final transient a1 f107723c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpException(pq2.a1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "response == null"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            okhttp3.Response r1 = r4.f100989a
            int r2 = r1.f95723d
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r2 = r1.f95722c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            int r0 = r1.f95723d
            r3.f107721a = r0
            java.lang.String r0 = r1.f95722c
            r3.f107722b = r0
            r3.f107723c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.HttpException.<init>(pq2.a1):void");
    }
}
