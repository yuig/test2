package yn;

import android.content.Context;
import android.net.Uri;
import com.linecorp.linesdk.LineApiError;
import gi.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import kh2.u2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f139510e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final m f139511a;

    /* renamed from: b, reason: collision with root package name */
    public final z.a f139512b = new z.a("UTF-8", 10, 0);

    /* renamed from: c, reason: collision with root package name */
    public final int f139513c = 90000;

    /* renamed from: d, reason: collision with root package name */
    public final int f139514d = 90000;

    public b(Context context) {
        this.f139511a = new m(24, context, "5.8.0");
    }

    public static rn.b b(HttpURLConnection httpURLConnection, c cVar, z.a aVar) {
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            int i13 = 0;
            while (true) {
                if (i13 >= list.size()) {
                    break;
                }
                if (list.get(i13).equalsIgnoreCase("gzip")) {
                    inputStream = new GZIPInputStream(inputStream);
                    break;
                }
                i13++;
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            return (responseCode == 200 || responseCode == 204) ? cVar == null ? rn.b.b(null) : rn.b.b(cVar.c(inputStream)) : rn.b.a(rn.c.SERVER_ERROR, new LineApiError(responseCode, aVar.c(inputStream), rn.a.NOT_DEFINED));
        } catch (IOException e13) {
            return rn.b.a(rn.c.INTERNAL_ERROR, new LineApiError(e13, rn.a.HTTP_RESPONSE_PARSE_ERROR));
        }
    }

    public static HttpURLConnection d(Uri uri) {
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            return (HttpURLConnection) openConnection;
        }
        throw new IllegalArgumentException(a.c.g("The scheme of the server url must be https.", uri));
    }

    public static void g(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final rn.b a(Uri uri, Map map, Map map2, xn.c cVar) {
        Uri s13 = u2.s(uri, map2);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = c(s13);
                g(httpURLConnection, map);
                httpURLConnection.connect();
                rn.b b13 = b(httpURLConnection, cVar, this.f139512b);
                httpURLConnection.disconnect();
                return b13;
            } catch (IOException e13) {
                rn.b a13 = rn.b.a(rn.c.NETWORK_ERROR, new LineApiError(e13));
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return a13;
            }
        } catch (Throwable th3) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th3;
        }
    }

    public final HttpURLConnection c(Uri uri) {
        HttpURLConnection d2 = d(uri);
        d2.setInstanceFollowRedirects(true);
        d2.setRequestProperty("User-Agent", this.f139511a.A());
        d2.setRequestProperty("Accept-Encoding", "gzip");
        d2.setConnectTimeout(this.f139513c);
        d2.setReadTimeout(this.f139514d);
        d2.setRequestMethod(a.GET.name());
        return d2;
    }

    public final HttpURLConnection e(Uri uri, int i13) {
        HttpURLConnection d2 = d(uri);
        d2.setInstanceFollowRedirects(true);
        d2.setRequestProperty("User-Agent", this.f139511a.A());
        d2.setRequestProperty("Accept-Encoding", "gzip");
        d2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        d2.setRequestProperty("Content-Length", String.valueOf(i13));
        d2.setConnectTimeout(this.f139513c);
        d2.setReadTimeout(this.f139514d);
        d2.setRequestMethod(a.POST.name());
        d2.setDoOutput(true);
        return d2;
    }

    public final rn.b f(Uri uri, Map map, LinkedHashMap linkedHashMap, c cVar) {
        byte[] bytes;
        if (linkedHashMap.isEmpty()) {
            bytes = f139510e;
        } else {
            try {
                bytes = u2.s(Uri.parse(""), linkedHashMap).getEncodedQuery().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e13) {
                throw new RuntimeException(e13);
            }
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = e(uri, bytes.length);
                g(httpURLConnection, map);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                rn.b b13 = b(httpURLConnection, cVar, this.f139512b);
                httpURLConnection.disconnect();
                return b13;
            } catch (IOException e14) {
                rn.b a13 = rn.b.a(rn.c.NETWORK_ERROR, new LineApiError(e14));
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return a13;
            }
        } catch (Throwable th3) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th3;
        }
    }
}
