package su1;

import java.io.File;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public abstract class g extends hb0.c {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f115230g = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final OkHttpClient f115231d;

    /* renamed from: e, reason: collision with root package name */
    public final long f115232e;

    /* renamed from: f, reason: collision with root package name */
    public final int f115233f;

    public g(OkHttpClient clientWithoutRedirects) {
        Intrinsics.checkNotNullParameter(clientWithoutRedirects, "clientWithoutRedirects");
        this.f115231d = clientWithoutRedirects;
        this.f115232e = 0L;
        this.f115233f = 3;
    }

    @Override // hb0.c
    public final void c() {
        Thread.currentThread().setPriority(1);
        AtomicInteger atomicInteger = f115230g;
        atomicInteger.incrementAndGet();
        synchronized (g.class) {
            g(f());
            atomicInteger.decrementAndGet();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.io.File r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = r12
            zf1.a r0 = (zf1.a) r0
            java.lang.String r1 = r0.f141914n
            boolean r2 = kotlin.text.z.j(r1)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L13
            java.net.URL r2 = new java.net.URL
            r2.<init>(r1)
            goto L23
        L13:
            java.net.URL r2 = new java.net.URL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r0.f141915o
            java.lang.String r1 = a.a.p(r1, r4, r14)
            r2.<init>(r1)
        L23:
            r1 = 0
            r4 = 0
            r7 = r1
            r5 = r4
            r6 = r5
        L28:
            int r8 = r7 + 1
            int r9 = r12.f115233f
            if (r7 >= r9) goto Lbb
            r2.getPath()
            okhttp3.Request$Builder r7 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            r7.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            r7.k(r2)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            okhttp3.Request r7 = r7.b()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            okhttp3.OkHttpClient r9 = r12.f115231d     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            okhttp3.Call r7 = r9.newCall(r7)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            okhttp3.Response r6 = r7.e()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            int r7 = r6.f95723d     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            r9 = 200(0xc8, float:2.8E-43)
            okhttp3.ResponseBody r10 = r6.f95726g
            if (r7 == r9) goto L60
            if (r4 == 0) goto L54
            r4.close()     // Catch: java.io.IOException -> L59
        L54:
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.io.IOException -> L59
        L59:
            if (r10 == 0) goto L5e
            r10.close()
        L5e:
            r7 = r8
            goto L28
        L60:
            kotlin.jvm.internal.Intrinsics.f(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            java.io.InputStream r5 = r10.byteStream()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            r7.<init>(r13, r14)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> La7
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
        L75:
            kotlin.jvm.internal.Intrinsics.f(r5)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            int r7 = r5.read(r4)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            r11 = -1
            if (r7 != r11) goto L89
            r9.close()     // Catch: java.io.IOException -> L85
            r5.close()     // Catch: java.io.IOException -> L85
        L85:
            r10.close()
            return r3
        L89:
            r9.write(r4, r1, r7)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            goto L75
        L8d:
            r13 = move-exception
            r4 = r9
            goto L93
        L90:
            r4 = r9
            goto La7
        L92:
            r13 = move-exception
        L93:
            if (r4 == 0) goto L98
            r4.close()     // Catch: java.io.IOException -> L9d
        L98:
            if (r5 == 0) goto L9d
            r5.close()     // Catch: java.io.IOException -> L9d
        L9d:
            if (r6 == 0) goto La6
            okhttp3.ResponseBody r14 = r6.f95726g
            if (r14 == 0) goto La6
            r14.close()
        La6:
            throw r13
        La7:
            if (r4 == 0) goto Lac
            r4.close()     // Catch: java.io.IOException -> Lb1
        Lac:
            if (r5 == 0) goto Lb1
            r5.close()     // Catch: java.io.IOException -> Lb1
        Lb1:
            if (r6 == 0) goto L5e
            okhttp3.ResponseBody r7 = r6.f95726g
            if (r7 == 0) goto L5e
            r7.close()
            goto L5e
        Lbb:
            java.util.HashSet r13 = tb0.h.f117076w
            tb0.h r13 = tb0.g.f117075a
            android.util.Pair r14 = new android.util.Pair
            java.lang.String r2 = "Task"
            java.lang.String r0 = r0.f141910j
            r14.<init>(r2, r0)
            java.util.List r14 = kotlin.collections.e0.b(r14)
            java.lang.String r0 = "DownloaderTaskFailed"
            r13.k(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: su1.g.e(java.io.File, java.lang.String):boolean");
    }

    public final f f() {
        zf1.a aVar = (zf1.a) this;
        if (!aVar.f141911k) {
            return f.ERROR_DOWNLOAD_NOT_SUPPORTED;
        }
        long j13 = this.f115232e;
        if (j13 > 0) {
            try {
                Thread.sleep(j13);
            } catch (InterruptedException unused) {
            }
        }
        if (!qb0.d.f103396a.d()) {
            return f.ERROR_NO_INTERNET_1;
        }
        try {
            Request.Builder builder = new Request.Builder();
            builder.j("https://connectivitycheck.gstatic.com/generate_204");
            builder.c(CacheControl.f95522o);
            Response e13 = this.f115231d.newCall(builder.b()).e();
            int i13 = e13.f95723d;
            Headers headers = e13.f95725f;
            HashSet hashSet = tb0.h.f117076w;
            tb0.h hVar = tb0.g.f117075a;
            hVar.h("Network connection responseCode: " + i13);
            if (headers.e().contains("Location")) {
                String c13 = headers.c("Location");
                Intrinsics.f(c13);
                hVar.h("Network connection redirect: ".concat(c13));
            }
            if (i13 == 204) {
                File file = aVar.f141912l;
                if (!file.exists() && !file.mkdirs()) {
                    hVar.p(new IllegalStateException(a.a.p(new StringBuilder(), aVar.f141910j, ": directory could not be created")));
                    return f.ERROR_FAILED_TO_CREATE_DIR;
                }
                f fVar = f.SUCCESS;
                String str = aVar.f141913m;
                File file2 = new File(file, str);
                try {
                    if (e(file, str)) {
                        return fVar;
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                    return f.ERROR_DOWNLOAD_FAILED;
                } catch (Exception e14) {
                    HashSet hashSet2 = tb0.h.f117076w;
                    tb0.g.f117075a.p(new IllegalStateException("Native lib download, unpack or verify failed", e14));
                    return f.ERROR_DOWNLOAD_EXCEPTION;
                }
            }
        } catch (Exception e15) {
            HashSet hashSet3 = tb0.h.f117076w;
            tb0.g.f117075a.h("Network connection failed: " + e15);
        }
        return f.ERROR_NO_INTERNET_2;
    }

    public abstract void g(f fVar);
}
