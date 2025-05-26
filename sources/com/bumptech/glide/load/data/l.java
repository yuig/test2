package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import td.t;

/* loaded from: classes3.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final t f29811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29812b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f29813c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f29814d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f29815e;

    public l(t tVar, int i13) {
        this.f29811a = tVar;
        this.f29812b = i13;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e13) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e13);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f29814d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f29813c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f29813c = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f29815e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, d dVar) {
        StringBuilder sb3;
        t tVar = this.f29811a;
        int i13 = he.i.f68949b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (tVar.f117439f == null) {
                    tVar.f117439f = new URL(tVar.d());
                }
                dVar.f(f(tVar.f117439f, 0, null, tVar.f117435b.a()));
            } catch (IOException e13) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e13);
                }
                dVar.d(e13);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb3 = new StringBuilder("Finished http url fetcher fetch in ");
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb3 = new StringBuilder("Finished http url fetcher fetch in ");
                sb3.append(he.i.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb3.toString());
            }
        } catch (Throwable th3) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + he.i.a(elapsedRealtimeNanos));
            }
            throw th3;
        }
    }

    public final InputStream f(URL url, int i13, URL url2, Map map) {
        if (i13 >= 5) {
            throw new HttpException(-1, "Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, "In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i14 = this.f29812b;
            httpURLConnection.setConnectTimeout(i14);
            httpURLConnection.setReadTimeout(i14);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f29813c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f29814d = this.f29813c.getInputStream();
                if (this.f29815e) {
                    return null;
                }
                int d2 = d(this.f29813c);
                int i15 = d2 / 100;
                if (i15 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f29813c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f29814d = new he.e(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f29814d = httpURLConnection2.getInputStream();
                        }
                        return this.f29814d;
                    } catch (IOException e13) {
                        throw new HttpException(d(httpURLConnection2), "Failed to obtain InputStream", e13);
                    }
                }
                if (i15 != 3) {
                    if (d2 == -1) {
                        throw new HttpException(d2, "Http request failed", null);
                    }
                    try {
                        throw new HttpException(d2, this.f29813c.getResponseMessage(), null);
                    } catch (IOException e14) {
                        throw new HttpException(d2, "Failed to get a response message", e14);
                    }
                }
                String headerField = this.f29813c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(d2, "Received empty or null redirect url", null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i13 + 1, url, map);
                } catch (MalformedURLException e15) {
                    throw new HttpException(d2, a.a.j("Bad redirect url: ", headerField), e15);
                }
            } catch (IOException e16) {
                throw new HttpException(d(this.f29813c), "Failed to connect or obtain data", e16);
            }
        } catch (IOException e17) {
            throw new HttpException(0, "URL.openConnection threw", e17);
        }
    }
}
