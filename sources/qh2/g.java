package qh2;

import io.embrace.android.embracesdk.Embrace;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f103930a;

    /* renamed from: b, reason: collision with root package name */
    public final long f103931b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f103932c;

    /* renamed from: d, reason: collision with root package name */
    public final y f103933d;

    /* renamed from: e, reason: collision with root package name */
    public volatile b f103934e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f103935f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Long f103936g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f103937h;

    /* renamed from: i, reason: collision with root package name */
    public volatile HashMap f103938i;

    /* renamed from: j, reason: collision with root package name */
    public volatile IOException f103939j;

    /* renamed from: k, reason: collision with root package name */
    public volatile Exception f103940k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicLong f103941l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f103942m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f103943n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f103944o;

    /* renamed from: p, reason: collision with root package name */
    public volatile String f103945p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f103946q;

    public g(HttpURLConnection httpURLConnection, boolean z13) {
        y yVar = j.f103954a;
        this.f103935f = false;
        this.f103941l = new AtomicLong(-1L);
        this.f103942m = new AtomicInteger(0);
        this.f103943n = new AtomicReference(null);
        this.f103944o = new AtomicReference(null);
        this.f103945p = null;
        this.f103930a = httpURLConnection;
        this.f103932c = z13;
        this.f103933d = yVar;
        lf2.b bVar = Embrace.Companion;
        bVar.getClass();
        this.f103931b = Embrace.instance.getSdkCurrentTimeMs();
        bVar.getClass();
        this.f103946q = Embrace.instance.isStarted();
    }

    public static HashMap h(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sb3 = new StringBuilder();
            for (String str : (List) entry.getValue()) {
                if (str != null) {
                    sb3.append(str);
                }
            }
            hashMap.put((String) entry.getKey(), sb3.toString());
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.Map] */
    public final void a(byte[] bArr) {
        HashMap hashMap;
        if (this.f103946q) {
            this.f103933d.getClass();
            Embrace.Companion.getClass();
            Long valueOf = Long.valueOf(Embrace.instance.getSdkCurrentTimeMs());
            if (this.f103936g == null) {
                this.f103936g = valueOf;
            }
            if (this.f103943n.get() == null) {
                synchronized (this.f103943n) {
                    try {
                        if (this.f103943n.get() == null) {
                            if (this.f103932c) {
                                HashMap hashMap2 = new HashMap(this.f103930a.getHeaderFields());
                                hashMap2.remove("Content-Encoding");
                                hashMap2.remove("Content-Length");
                                hashMap = hashMap2;
                            } else {
                                hashMap = this.f103930a.getHeaderFields();
                            }
                            this.f103943n.set(hashMap);
                        }
                    } catch (Exception e13) {
                        this.f103940k = e13;
                    } finally {
                    }
                }
            }
            if (this.f103942m.get() == 0) {
                synchronized (this.f103942m) {
                    if (this.f103942m.get() == 0) {
                        try {
                            this.f103942m.set(this.f103930a.getResponseCode());
                        } catch (Exception e14) {
                            this.f103940k = e14;
                        }
                    }
                }
            }
            if (this.f103941l.get() == -1) {
                synchronized (this.f103941l) {
                    if (this.f103941l.get() == -1) {
                        try {
                            this.f103941l.set(this.f103930a.getContentLength());
                        } catch (Exception e15) {
                            this.f103940k = e15;
                        }
                    }
                }
            }
            if (!this.f103932c) {
                l();
            }
            if (n()) {
                synchronized (this.f103944o) {
                    try {
                        if (n()) {
                            k kVar = (k) this.f103944o.get();
                            if (kVar == null) {
                                this.f103944o.set(new k(this.f103938i, this.f103930a.getURL().getQuery(), this.f103934e != null ? this.f103934e.f103925b.toByteArray() : null, h((Map) this.f103943n.get()), bArr));
                            } else if (bArr != null) {
                                this.f103944o.set(new k(kVar.f103956a, kVar.f103957b, kVar.f103958c, kVar.f103959d, bArr));
                            }
                        }
                    } catch (Exception e16) {
                        this.f103940k = e16;
                    } finally {
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.f103946q) {
            k();
            try {
                this.f103933d.getClass();
                if (y.R().isNetworkSpanForwardingEnabled()) {
                    this.f103945p = this.f103930a.getRequestProperty("traceparent");
                }
            } catch (Exception unused) {
            }
        }
        this.f103930a.connect();
    }

    public final String c(int i13) {
        HttpURLConnection httpURLConnection = this.f103930a;
        String headerFieldKey = httpURLConnection.getHeaderFieldKey(i13);
        if (headerFieldKey == null) {
            return null;
        }
        if (o() && (headerFieldKey.equalsIgnoreCase("Content-Encoding") || headerFieldKey.equalsIgnoreCase("Content-Length"))) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(i13);
        a(null);
        return headerField;
    }

    public final long d(String str, long j13) {
        Long valueOf = Long.valueOf(j13);
        if (str == null) {
            valueOf = null;
        } else if (!o() || (!str.equalsIgnoreCase("Content-Encoding") && !str.equalsIgnoreCase("Content-Length"))) {
            valueOf = Long.valueOf(this.f103930a.getHeaderFieldDate(str, j13));
            a(null);
        }
        return valueOf != null ? valueOf.longValue() : j13;
    }

    public final int e(String str, int i13) {
        Integer valueOf = Integer.valueOf(i13);
        if (str == null) {
            valueOf = null;
        } else if (!o() || (!str.equalsIgnoreCase("Content-Encoding") && !str.equalsIgnoreCase("Content-Length"))) {
            valueOf = Integer.valueOf(this.f103930a.getHeaderFieldInt(str, i13));
            a(null);
        }
        return valueOf != null ? valueOf.intValue() : i13;
    }

    public final long f(String str, long j13) {
        Long valueOf = Long.valueOf(j13);
        if (str == null) {
            valueOf = null;
        } else if (!o() || (!str.equalsIgnoreCase("Content-Encoding") && !str.equalsIgnoreCase("Content-Length"))) {
            valueOf = Long.valueOf(this.f103930a.getHeaderFieldLong(str, j13));
            a(null);
        }
        return valueOf != null ? valueOf.longValue() : j13;
    }

    public final OutputStream g() {
        k();
        OutputStream outputStream = this.f103930a.getOutputStream();
        if (!this.f103932c || this.f103934e != null || outputStream == null) {
            return outputStream;
        }
        b bVar = new b(outputStream);
        bVar.f103925b = new ByteArrayOutputStream();
        this.f103934e = bVar;
        return this.f103934e;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream i(java.io.InputStream r7) {
        /*
            r6 = this;
            r6.k()
            org.chromium.net.y r0 = r6.f103933d
            r0.getClass()
            lf2.b r0 = io.embrace.android.embracesdk.Embrace.Companion
            r0.getClass()
            io.embrace.android.embracesdk.Embrace r0 = io.embrace.android.embracesdk.Embrace.access$getInstance$cp()
            long r0 = r0.getSdkCurrentTimeMs()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = r6.f103936g
            if (r1 != 0) goto L1f
            r6.f103936g = r0
        L1f:
            boolean r0 = r6.o()
            r1 = 16
            r2 = 0
            if (r0 == 0) goto L41
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L41
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L41
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L41
            qh2.a r3 = new qh2.a     // Catch: java.lang.Throwable -> L41
            boolean r4 = r6.j()     // Catch: java.lang.Throwable -> L41
            cp.i r5 = new cp.i     // Catch: java.lang.Throwable -> L41
            r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> L41
            r3.<init>(r0, r4, r5)     // Catch: java.lang.Throwable -> L41
            goto L42
        L41:
            r3 = r2
        L42:
            if (r3 != 0) goto L5c
            boolean r0 = r6.f103932c
            if (r0 == 0) goto L5b
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r7)
            qh2.a r7 = new qh2.a
            boolean r3 = r6.j()
            cp.i r4 = new cp.i
            r4.<init>(r6, r1)
            r7.<init>(r0, r3, r4)
        L5b:
            r3 = r7
        L5c:
            r6.a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.g.i(java.io.InputStream):java.io.InputStream");
    }

    public final boolean j() {
        if (!this.f103946q) {
            return false;
        }
        HttpURLConnection httpURLConnection = this.f103930a;
        if (httpURLConnection.getURL() == null) {
            return false;
        }
        String url = httpURLConnection.getURL().toString();
        String method = httpURLConnection.getRequestMethod();
        this.f103933d.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        return y.R().shouldCaptureNetworkBody(url, method);
    }

    public final void k() {
        if (this.f103946q && this.f103937h == null) {
            try {
                this.f103937h = this.f103930a.getRequestProperty("x-emb-trace-id");
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7 A[Catch: all -> 0x00bd, Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:13:0x005a, B:16:0x006a, B:18:0x0078, B:20:0x007c, B:22:0x0084, B:23:0x00c3, B:25:0x00c7, B:30:0x00fd, B:33:0x00d8, B:35:0x00dc, B:37:0x0062), top: B:12:0x005a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[Catch: all -> 0x00bd, Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:13:0x005a, B:16:0x006a, B:18:0x0078, B:20:0x007c, B:22:0x0084, B:23:0x00c3, B:25:0x00c7, B:30:0x00fd, B:33:0x00d8, B:35:0x00dc, B:37:0x0062), top: B:12:0x005a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062 A[Catch: all -> 0x00bd, Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:13:0x005a, B:16:0x006a, B:18:0x0078, B:20:0x007c, B:22:0x0084, B:23:0x00c3, B:25:0x00c7, B:30:0x00fd, B:33:0x00d8, B:35:0x00dc, B:37:0x0062), top: B:12:0x005a, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7, types: [t72.j] */
    /* JADX WARN: Type inference failed for: r0v9, types: [t72.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void l() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.g.l():void");
    }

    public final Object m(String str, Function0 function0) {
        if (str == null) {
            return null;
        }
        if (o() && (str.equalsIgnoreCase("Content-Encoding") || str.equalsIgnoreCase("Content-Length"))) {
            return null;
        }
        Object invoke = function0.invoke();
        a(null);
        return invoke;
    }

    public final boolean n() {
        return j() && (this.f103932c || this.f103939j != null) && (this.f103944o.get() == null || ((k) this.f103944o.get()).f103960e == null);
    }

    public final boolean o() {
        String contentEncoding = this.f103930a.getContentEncoding();
        return this.f103932c && contentEncoding != null && contentEncoding.equalsIgnoreCase("gzip");
    }

    public final String toString() {
        return this.f103930a.toString();
    }
}
