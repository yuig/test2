package pg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a {
    public static i a(q qVar) {
        int i13;
        try {
            try {
                i13 = qVar.f100146a.getResponseCode();
            } catch (Throwable th3) {
                return new d(new IllegalStateException("Error occurred during HTTP request execution", th3));
            }
        } catch (IOException unused) {
            i13 = -1;
        }
        Map b13 = b(qVar);
        if (i13 == -1) {
            return new d(new IllegalStateException("Connection failed or unexpected response code"));
        }
        if (i13 == 200) {
            return new g(c(qVar), b13);
        }
        if (i13 == 304) {
            return f.f100125a;
        }
        if (i13 == 413) {
            return f.f100126b;
        }
        if (i13 != 429) {
            return new c(i13, b13);
        }
        s a13 = qVar.f100147b.a();
        String str = (String) b13.get("Retry-After");
        return new h(a13, str != null ? StringsKt.h0(str) : null);
    }

    public static Map b(q qVar) {
        Map<String, List<String>> headerFields = qVar.f100146a.getHeaderFields();
        if (headerFields == null) {
            return z0.d();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(headerFields.size()));
        Iterator<T> it = headerFields.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            linkedHashMap.put(key, CollectionsKt.Z((Iterable) value, null, null, null, 0, null, null, 63));
        }
        return linkedHashMap;
    }

    public static String c(q qVar) {
        BufferedReader bufferedReader;
        List<String> list;
        try {
            Map<String, List<String>> headerFields = qVar.f100146a.getHeaderFields();
            boolean d2 = Intrinsics.d((headerFields == null || (list = headerFields.get("Content-Encoding")) == null) ? null : (String) CollectionsKt.u0(list), "gzip");
            HttpURLConnection httpURLConnection = qVar.f100146a;
            if (d2) {
                Reader inputStreamReader = new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream()), Charsets.UTF_8);
                bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            } else {
                Reader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                bufferedReader = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
            }
            try {
                String z23 = kh2.j.z2(bufferedReader);
                dl2.b.J(bufferedReader, null);
                return z23;
            } finally {
            }
        } catch (IOException e13) {
            throw new IllegalStateException("Failed to read response body.", e13);
        }
    }
}
