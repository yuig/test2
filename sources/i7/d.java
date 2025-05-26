package i7;

import a7.j0;
import a7.o;
import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import d7.e;
import d7.g0;
import d7.n0;
import g7.i;
import g7.s;
import g7.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import ok.w;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes.dex */
public abstract class d extends g7.b {
    public IOException A;
    public boolean B;
    public volatile long C;

    /* renamed from: e, reason: collision with root package name */
    public final CronetEngine f71642e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f71643f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71644g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71645h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71646i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f71647j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f71648k;

    /* renamed from: l, reason: collision with root package name */
    public final String f71649l;

    /* renamed from: m, reason: collision with root package name */
    public final s f71650m;

    /* renamed from: n, reason: collision with root package name */
    public final s f71651n;

    /* renamed from: o, reason: collision with root package name */
    public final o f71652o;

    /* renamed from: p, reason: collision with root package name */
    public final g0 f71653p;

    /* renamed from: q, reason: collision with root package name */
    public final int f71654q;

    /* renamed from: r, reason: collision with root package name */
    public final w f71655r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f71656s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f71657t;

    /* renamed from: u, reason: collision with root package name */
    public long f71658u;

    /* renamed from: v, reason: collision with root package name */
    public UrlRequest f71659v;

    /* renamed from: w, reason: collision with root package name */
    public c f71660w;

    /* renamed from: x, reason: collision with root package name */
    public i f71661x;

    /* renamed from: y, reason: collision with root package name */
    public ByteBuffer f71662y;

    /* renamed from: z, reason: collision with root package name */
    public UrlResponseInfo f71663z;

    static {
        j0.a("media3.datasource.cronet");
    }

    public d(int i13, s sVar, String str, Executor executor, CronetEngine cronetEngine) {
        super(true);
        cronetEngine.getClass();
        this.f71642e = cronetEngine;
        executor.getClass();
        this.f71643f = executor;
        this.f71644g = 3;
        this.f71645h = 10000;
        this.f71646i = 10000;
        this.f71647j = false;
        this.f71648k = false;
        this.f71649l = str;
        this.f71650m = sVar;
        this.f71655r = null;
        this.f71656s = false;
        this.f71653p = e.f53809a;
        this.f71654q = i13;
        this.f71651n = new s(0);
        this.f71652o = new o(1);
    }

    public static int A(UrlRequest urlRequest) {
        o oVar = new o(1);
        int[] iArr = new int[1];
        urlRequest.getStatus(new b(iArr, oVar));
        oVar.b();
        return iArr[0];
    }

    public static String y(String str, Map map) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public final void B(ByteBuffer byteBuffer) {
        UrlRequest urlRequest = this.f71659v;
        int i13 = n0.f53866a;
        urlRequest.read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.f71662y) {
                this.f71662y = null;
            }
            Thread.currentThread().interrupt();
            this.A = new InterruptedIOException();
        } catch (SocketTimeoutException e13) {
            if (byteBuffer == this.f71662y) {
                this.f71662y = null;
            }
            this.A = new HttpDataSource$HttpDataSourceException(e13, 2002, 2);
        }
        if (!this.f71652o.c(this.f71646i)) {
            throw new SocketTimeoutException();
        }
        IOException iOException = this.A;
        if (iOException != null) {
            if (!(iOException instanceof HttpDataSource$HttpDataSourceException)) {
                throw HttpDataSource$HttpDataSourceException.b(iOException, 2);
            }
            throw ((HttpDataSource$HttpDataSourceException) iOException);
        }
    }

    public final byte[] C() {
        byte[] bArr = n0.f53868c;
        ByteBuffer z13 = z();
        while (!this.B) {
            this.f71652o.f();
            z13.clear();
            B(z13);
            z13.flip();
            if (z13.remaining() > 0) {
                int length = bArr.length;
                bArr = Arrays.copyOf(bArr, z13.remaining() + bArr.length);
                z13.get(bArr, length, z13.remaining());
            }
        }
        return bArr;
    }

    @Override // g7.f
    public final synchronized void close() {
        try {
            UrlRequest urlRequest = this.f71659v;
            if (urlRequest != null) {
                urlRequest.cancel();
                this.f71659v = null;
            }
            c cVar = this.f71660w;
            if (cVar != null) {
                cVar.f71640j = true;
                this.f71660w = null;
            }
            ByteBuffer byteBuffer = this.f71662y;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.f71661x = null;
            this.f71663z = null;
            this.A = null;
            this.B = false;
            if (this.f71657t) {
                this.f71657t = false;
                u();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r5 != 0) goto L40;
     */
    @Override // g7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(g7.i r17) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d.d(g7.i):long");
    }

    @Override // g7.f
    public final Map e() {
        UrlResponseInfo urlResponseInfo = this.f71663z;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getAllHeaders();
    }

    @Override // g7.f
    public final Uri r() {
        UrlResponseInfo urlResponseInfo = this.f71663z;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        i iVar = this.f71661x;
        if (iVar != null) {
            return iVar.f63786a;
        }
        return null;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        bf.b.t(this.f71657t);
        if (i14 == 0) {
            return 0;
        }
        if (this.f71658u == 0) {
            return -1;
        }
        ByteBuffer z13 = z();
        if (!z13.hasRemaining()) {
            this.f71652o.f();
            z13.clear();
            int i15 = n0.f53866a;
            B(z13);
            if (this.B) {
                this.f71658u = 0L;
                return -1;
            }
            z13.flip();
            bf.b.t(z13.hasRemaining());
        }
        long[] jArr = new long[3];
        long j13 = this.f71658u;
        if (j13 == -1) {
            j13 = Long.MAX_VALUE;
        }
        jArr[0] = j13;
        jArr[1] = z13.remaining();
        jArr[2] = i14;
        long j14 = jArr[0];
        for (int i16 = 1; i16 < 3; i16++) {
            long j15 = jArr[i16];
            if (j15 < j14) {
                j14 = j15;
            }
        }
        int i17 = (int) j14;
        z13.get(bArr, i13, i17);
        long j16 = this.f71658u;
        if (j16 != -1) {
            this.f71658u = j16 - i17;
        }
        t(i17);
        return i17;
    }

    public final void x(i iVar) {
        this.f71660w = new c(this);
        String uri = iVar.f63786a.toString();
        c cVar = this.f71660w;
        CronetEngine cronetEngine = this.f71642e;
        Executor executor = this.f71643f;
        UrlRequest.Builder allowDirectExecutor = cronetEngine.newUrlRequestBuilder(uri, cVar, executor).setPriority(this.f71644g).allowDirectExecutor();
        HashMap hashMap = new HashMap();
        s sVar = this.f71650m;
        if (sVar != null) {
            hashMap.putAll(sVar.b());
        }
        hashMap.putAll(this.f71651n.b());
        hashMap.putAll(iVar.f63790e);
        for (Map.Entry entry : hashMap.entrySet()) {
            allowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        byte[] bArr = iVar.f63789d;
        if (bArr != null && !hashMap.containsKey("Content-Type")) {
            throw new HttpDataSource$HttpDataSourceException() { // from class: androidx.media3.datasource.cronet.CronetDataSource$OpenException
            };
        }
        String a13 = t.a(iVar.f63791f, iVar.f63792g);
        if (a13 != null) {
            allowDirectExecutor.addHeader("Range", a13);
        }
        String str = this.f71649l;
        if (str != null) {
            allowDirectExecutor.addHeader("User-Agent", str);
        }
        allowDirectExecutor.setHttpMethod(i.b(iVar.f63788c));
        if (bArr != null) {
            allowDirectExecutor.setUploadDataProvider(new a(bArr), executor);
        }
        this.f71659v = allowDirectExecutor.build();
    }

    public final ByteBuffer z() {
        if (this.f71662y == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f71654q);
            this.f71662y = allocateDirect;
            allocateDirect.limit(0);
        }
        return this.f71662y;
    }
}
