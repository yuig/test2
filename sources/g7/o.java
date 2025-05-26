package g7;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import d7.n0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import pk.a3;

/* loaded from: classes3.dex */
public final class o extends b {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63815e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63816f;

    /* renamed from: g, reason: collision with root package name */
    public final int f63817g;

    /* renamed from: h, reason: collision with root package name */
    public final int f63818h;

    /* renamed from: i, reason: collision with root package name */
    public final String f63819i;

    /* renamed from: j, reason: collision with root package name */
    public final s f63820j;

    /* renamed from: k, reason: collision with root package name */
    public final s f63821k;

    /* renamed from: l, reason: collision with root package name */
    public final ok.w f63822l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f63823m;

    /* renamed from: n, reason: collision with root package name */
    public i f63824n;

    /* renamed from: o, reason: collision with root package name */
    public HttpURLConnection f63825o;

    /* renamed from: p, reason: collision with root package name */
    public InputStream f63826p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f63827q;

    /* renamed from: r, reason: collision with root package name */
    public int f63828r;

    /* renamed from: s, reason: collision with root package name */
    public long f63829s;

    /* renamed from: t, reason: collision with root package name */
    public long f63830t;

    public o(String str, int i13, int i14, s sVar) {
        super(true);
        this.f63819i = str;
        this.f63817g = i13;
        this.f63818h = i14;
        this.f63815e = false;
        this.f63816f = false;
        this.f63820j = sVar;
        this.f63822l = null;
        this.f63821k = new s(0);
        this.f63823m = false;
    }

    public final HttpURLConnection A(URL url, int i13, byte[] bArr, long j13, long j14, boolean z13, boolean z14, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f63817g);
        httpURLConnection.setReadTimeout(this.f63818h);
        HashMap hashMap = new HashMap();
        s sVar = this.f63820j;
        if (sVar != null) {
            hashMap.putAll(sVar.b());
        }
        hashMap.putAll(this.f63821k.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a13 = t.a(j13, j14);
        if (a13 != null) {
            httpURLConnection.setRequestProperty("Range", a13);
        }
        String str = this.f63819i;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z13 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z14);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(i.b(i13));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void B(long j13) {
        if (j13 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j13 > 0) {
            int min = (int) Math.min(j13, 4096);
            InputStream inputStream = this.f63826p;
            int i13 = n0.f53866a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(2008);
            }
            j13 -= read;
            t(read);
        }
    }

    @Override // g7.f
    public final void close() {
        try {
            InputStream inputStream = this.f63826p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    int i13 = n0.f53866a;
                    throw new HttpDataSource$HttpDataSourceException(e13, 2000, 3);
                }
            }
        } finally {
            this.f63826p = null;
            x();
            if (this.f63827q) {
                this.f63827q = false;
                u();
            }
            this.f63825o = null;
            this.f63824n = null;
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        this.f63824n = iVar;
        long j13 = 0;
        this.f63830t = 0L;
        this.f63829s = 0L;
        v(iVar);
        try {
            HttpURLConnection z13 = z(iVar);
            this.f63825o = z13;
            this.f63828r = z13.getResponseCode();
            z13.getResponseMessage();
            int i13 = this.f63828r;
            long j14 = iVar.f63791f;
            long j15 = iVar.f63792g;
            if (i13 < 200 || i13 > 299) {
                Map<String, List<String>> headerFields = z13.getHeaderFields();
                if (this.f63828r == 416 && j14 == t.c(z13.getHeaderField("Content-Range"))) {
                    this.f63827q = true;
                    w(iVar);
                    if (j15 != -1) {
                        return j15;
                    }
                    return 0L;
                }
                InputStream errorStream = z13.getErrorStream();
                try {
                    if (errorStream != null) {
                        qk.e.b(errorStream);
                    } else {
                        int i14 = n0.f53866a;
                    }
                } catch (IOException unused) {
                    int i15 = n0.f53866a;
                }
                x();
                throw new HttpDataSource$InvalidResponseCodeException(this.f63828r, this.f63828r == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            String contentType = z13.getContentType();
            ok.w wVar = this.f63822l;
            if (wVar != null && !wVar.apply(contentType)) {
                x();
                throw new HttpDataSource$InvalidContentTypeException(contentType);
            }
            if (this.f63828r == 200 && j14 != 0) {
                j13 = j14;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(z13.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.f63829s = j15;
            } else if (j15 != -1) {
                this.f63829s = j15;
            } else {
                long b13 = t.b(z13.getHeaderField("Content-Length"), z13.getHeaderField("Content-Range"));
                this.f63829s = b13 != -1 ? b13 - j13 : -1L;
            }
            try {
                this.f63826p = z13.getInputStream();
                if (equalsIgnoreCase) {
                    this.f63826p = new GZIPInputStream(this.f63826p);
                }
                this.f63827q = true;
                w(iVar);
                try {
                    B(j13);
                    return this.f63829s;
                } catch (IOException e13) {
                    x();
                    if (e13 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e13);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e13, 2000, 1);
                }
            } catch (IOException e14) {
                x();
                throw new HttpDataSource$HttpDataSourceException(e14, 2000, 1);
            }
        } catch (IOException e15) {
            x();
            throw HttpDataSource$HttpDataSourceException.b(e15, 1);
        }
    }

    @Override // g7.f
    public final Map e() {
        HttpURLConnection httpURLConnection = this.f63825o;
        return httpURLConnection == null ? a3.f100350g : new n(httpURLConnection.getHeaderFields());
    }

    @Override // g7.f
    public final Uri r() {
        HttpURLConnection httpURLConnection = this.f63825o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        i iVar = this.f63824n;
        if (iVar != null) {
            return iVar.f63786a;
        }
        return null;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        try {
            long j13 = this.f63829s;
            if (j13 != -1) {
                long j14 = j13 - this.f63830t;
                if (j14 != 0) {
                    i14 = (int) Math.min(i14, j14);
                }
                return -1;
            }
            InputStream inputStream = this.f63826p;
            int i15 = n0.f53866a;
            int read = inputStream.read(bArr, i13, i14);
            if (read == -1) {
                return -1;
            }
            this.f63830t += read;
            t(read);
            return read;
        } catch (IOException e13) {
            int i16 = n0.f53866a;
            throw HttpDataSource$HttpDataSourceException.b(e13, 2);
        }
    }

    public final void x() {
        HttpURLConnection httpURLConnection = this.f63825o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e13) {
                d7.u.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e13);
            }
        }
    }

    public final URL y(URL url, String str) {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(a.a.j("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f63815e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f63816f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e13) {
                    throw new HttpDataSource$HttpDataSourceException(e13, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e14) {
            throw new HttpDataSource$HttpDataSourceException(e14, 2001, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection z(g7.i r26) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.o.z(g7.i):java.net.HttpURLConnection");
    }
}
