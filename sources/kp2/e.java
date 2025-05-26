package kp2;

import android.util.Log;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public final class e extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final CronetEngine f80595a;

    /* renamed from: b, reason: collision with root package name */
    public final j f80596b;

    /* renamed from: c, reason: collision with root package name */
    public ExperimentalUrlRequest f80597c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f80598d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f80599e;

    /* renamed from: f, reason: collision with root package name */
    public int f80600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f80601g;

    /* renamed from: h, reason: collision with root package name */
    public int f80602h;

    /* renamed from: i, reason: collision with root package name */
    public final g f80603i;

    /* renamed from: j, reason: collision with root package name */
    public h f80604j;

    /* renamed from: k, reason: collision with root package name */
    public UrlResponseInfo f80605k;

    /* renamed from: l, reason: collision with root package name */
    public IOException f80606l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f80607m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f80608n;

    /* renamed from: o, reason: collision with root package name */
    public List f80609o;

    /* renamed from: p, reason: collision with root package name */
    public Map f80610p;

    public e(URL url, CronetEngine cronetEngine) {
        super(url);
        this.f80595a = cronetEngine;
        this.f80596b = new j();
        this.f80603i = new g(this);
        this.f80598d = new ArrayList();
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        i(str, str2, false);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        getOutputStream();
        j();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (((HttpURLConnection) this).connected) {
            this.f80597c.cancel();
        }
    }

    public final int e(String str) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f80598d;
            if (i13 >= arrayList.size()) {
                return -1;
            }
            if (((String) ((Pair) arrayList.get(i13)).first).equalsIgnoreCase(str)) {
                return i13;
            }
            i13++;
        }
    }

    public final Map f() {
        Map map = this.f80610p;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : g()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f80610p = unmodifiableMap;
        return unmodifiableMap;
    }

    public final List g() {
        List list = this.f80609o;
        if (list != null) {
            return list;
        }
        this.f80609o = new ArrayList();
        for (Map.Entry<String, String> entry : this.f80605k.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.f80609o.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(this.f80609o);
        this.f80609o = unmodifiableList;
        return unmodifiableList;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            h();
            if (this.f80605k.getHttpStatusCode() >= 400) {
                return this.f80603i;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[RETURN] */
    @Override // java.net.HttpURLConnection, java.net.URLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getHeaderField(int r4) {
        /*
            r3 = this;
            r0 = 0
            r3.h()     // Catch: java.io.IOException -> Le
            java.util.List r1 = r3.g()
            int r2 = r1.size()
            if (r4 < r2) goto L10
        Le:
            r4 = r0
            goto L16
        L10:
            java.lang.Object r4 = r1.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
        L16:
            if (r4 != 0) goto L19
            return r0
        L19:
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kp2.e.getHeaderField(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[RETURN] */
    @Override // java.net.HttpURLConnection, java.net.URLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getHeaderFieldKey(int r4) {
        /*
            r3 = this;
            r0 = 0
            r3.h()     // Catch: java.io.IOException -> Le
            java.util.List r1 = r3.g()
            int r2 = r1.size()
            if (r4 < r2) goto L10
        Le:
            r4 = r0
            goto L16
        L10:
            java.lang.Object r4 = r1.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
        L16:
            if (r4 != 0) goto L19
            return r0
        L19:
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kp2.e.getHeaderFieldKey(int):java.lang.String");
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            h();
            return f();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        h();
        if (!((HttpURLConnection) this).instanceFollowRedirects && this.f80607m) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.f80605k.getHttpStatusCode() < 400) {
            return this.f80603i;
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        if (this.f80604j == null && ((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            boolean z13 = ((HttpURLConnection) this).chunkLength > 0;
            j jVar = this.f80596b;
            if (z13) {
                this.f80604j = new b(this, ((HttpURLConnection) this).chunkLength, jVar);
                j();
            } else {
                long j13 = ((HttpURLConnection) this).fixedContentLength;
                long j14 = ((HttpURLConnection) this).fixedContentLengthLong;
                if (j14 != -1) {
                    j13 = j14;
                }
                if (j13 != -1) {
                    this.f80604j = new c(this, j13, jVar);
                    j();
                } else {
                    Log.d("e", "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.f80604j = new a(this);
                    } else {
                        this.f80604j = new a(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f80604j;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = this.f80598d.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int e13 = e(str);
        if (e13 >= 0) {
            return (String) ((Pair) this.f80598d.get(e13)).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        h();
        return this.f80605k.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        h();
        return this.f80605k.getHttpStatusText();
    }

    public final void h() {
        h hVar = this.f80604j;
        if (hVar != null) {
            hVar.c();
            if (((HttpURLConnection) this).chunkLength > 0) {
                this.f80604j.close();
            }
        }
        if (!this.f80608n) {
            j();
            this.f80596b.a(0);
        }
        if (!this.f80608n) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.f80606l;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f80605k == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    public final void i(String str, String str2, boolean z13) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int e13 = e(str);
        ArrayList arrayList = this.f80598d;
        if (e13 >= 0) {
            if (!z13) {
                throw new UnsupportedOperationException(a.a.k("Cannot add multiple headers of the same key, ", str, ". crbug.com/432719."));
            }
            arrayList.remove(e13);
        }
        arrayList.add(Pair.create(str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r7.f80599e != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        if (r7.f80601g != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r7 = this;
            boolean r0 = r7.connected
            if (r0 == 0) goto L5
            return
        L5:
            java.net.URL r0 = r7.getURL()
            java.lang.String r0 = r0.toString()
            kp2.d r1 = new kp2.d
            r1.<init>(r7)
            org.chromium.net.CronetEngine r2 = r7.f80595a
            kp2.j r3 = r7.f80596b
            org.chromium.net.UrlRequest$Builder r0 = r2.newUrlRequestBuilder(r0, r1, r3)
            org.chromium.net.ExperimentalUrlRequest$Builder r0 = (org.chromium.net.ExperimentalUrlRequest.Builder) r0
            boolean r1 = r7.doOutput
            if (r1 == 0) goto L76
            java.lang.String r1 = r7.method
            java.lang.String r2 = "GET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "POST"
            r7.method = r1
        L2e:
            kp2.h r1 = r7.f80604j
            r2 = 0
            java.lang.String r4 = "Content-Length"
            if (r1 == 0) goto L5e
            org.chromium.net.UploadDataProvider r1 = r1.d()
            r0.setUploadDataProvider(r1, r3)
            java.lang.String r1 = r7.getRequestProperty(r4)
            if (r1 != 0) goto L58
            int r1 = r7.chunkLength
            if (r1 <= 0) goto L47
            goto L58
        L47:
            kp2.h r1 = r7.f80604j
            org.chromium.net.UploadDataProvider r1 = r1.d()
            long r5 = r1.getLength()
            java.lang.String r1 = java.lang.Long.toString(r5)
            r7.i(r4, r1, r2)
        L58:
            kp2.h r1 = r7.f80604j
            r1.e()
            goto L69
        L5e:
            java.lang.String r1 = r7.getRequestProperty(r4)
            if (r1 != 0) goto L69
            java.lang.String r1 = "0"
            r7.i(r4, r1, r2)
        L69:
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = r7.getRequestProperty(r1)
            if (r3 != 0) goto L76
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r7.i(r1, r3, r2)
        L76:
            java.util.ArrayList r1 = r7.f80598d
            java.util.Iterator r1 = r1.iterator()
        L7c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            r0.addHeader(r3, r2)
            goto L7c
        L94:
            boolean r1 = r7.getUseCaches()
            if (r1 != 0) goto L9d
            r0.disableCache()
        L9d:
            java.lang.String r1 = r7.method
            r0.setHttpMethod(r1)
            boolean r1 = r7.f80599e
            r2 = -1
            r3 = 1
            if (r1 == 0) goto La9
            goto Lb7
        La9:
            int r1 = android.net.TrafficStats.getThreadStatsTag()
            if (r1 == r2) goto Lb3
            r7.f80600f = r1
            r7.f80599e = r3
        Lb3:
            boolean r1 = r7.f80599e
            if (r1 == 0) goto Lbc
        Lb7:
            int r1 = r7.f80600f
            r0.setTrafficStatsTag(r1)
        Lbc:
            boolean r1 = r7.f80601g
            if (r1 == 0) goto Lc1
            goto Ld6
        Lc1:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r1 >= r4) goto Lc8
            goto Ldb
        Lc8:
            int r1 = a.i0.a()
            if (r1 == r2) goto Ld2
            r7.f80602h = r1
            r7.f80601g = r3
        Ld2:
            boolean r1 = r7.f80601g
            if (r1 == 0) goto Ldb
        Ld6:
            int r1 = r7.f80602h
            r0.setTrafficStatsUid(r1)
        Ldb:
            org.chromium.net.ExperimentalUrlRequest r0 = r0.build()
            r7.f80597c = r0
            r0.start()
            r7.connected = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kp2.e.j():void");
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i13) {
        Log.d("e", "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        i(str, str2, true);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            h();
            Map f13 = f();
            if (!f13.containsKey(str)) {
                return null;
            }
            return (String) ep.b.i((List) f13.get(str), 1);
        } catch (IOException unused) {
            return null;
        }
    }
}
