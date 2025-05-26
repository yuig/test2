package ads_mobile_sdk;

import ao2.m0;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class m92 {

    /* renamed from: a, reason: collision with root package name */
    public static final pk.o1 f8141a = pk.o1.p(4, "br", "deflate", "gzip", "x-gzip");

    /* renamed from: b, reason: collision with root package name */
    public static final ok.e0 f8142b;

    static {
        ok.e0 a13 = ok.e0.a(',');
        ok.o oVar = ok.o.f95441c;
        oVar.getClass();
        f8142b = new ok.e0(a13.f95422c, true, oVar, a13.f95423d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Response.Builder a(Request request, UrlResponseInfo urlResponseInfo, wo2.e0 e0Var) {
        long parseLong;
        List<String> list;
        Response.Builder builder = new Response.Builder();
        List<String> list2 = urlResponseInfo.getAllHeaders().get("Content-Type");
        ResponseBody responseBody = null;
        MediaType mediaType = null;
        String str = (list2 == null || list2.isEmpty()) ? null : (String) com.bumptech.glide.c.P(list2);
        ArrayList arrayList = new ArrayList();
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        List<String> emptyList = Collections.emptyList();
        List<String> list3 = allHeaders.get("Content-Encoding");
        if (list3 == null) {
            emptyList.getClass();
        } else {
            emptyList = list3;
        }
        Iterator<String> it = emptyList.iterator();
        while (it.hasNext()) {
            ok.b0 b13 = f8142b.b(it.next());
            if (b13 instanceof Collection) {
                arrayList.addAll((Collection) b13);
            } else {
                com.bumptech.glide.c.h(arrayList, b13.iterator());
            }
        }
        boolean z13 = arrayList.isEmpty() || !f8141a.containsAll(arrayList);
        String str2 = (!z13 || (list = urlResponseInfo.getAllHeaders().get("Content-Length")) == null || list.isEmpty()) ? null : (String) com.bumptech.glide.c.P(list);
        if (e0Var != null) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (request.f95701b.equals("HEAD")) {
                parseLong = 0;
            } else {
                if (str2 != null) {
                    try {
                        parseLong = Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                    }
                }
                parseLong = -1;
            }
            if ((httpStatusCode == 204 || httpStatusCode == 205) && parseLong > 0) {
                throw new ProtocolException("HTTP " + httpStatusCode + " had non-zero Content-Length: " + str2);
            }
            if (str != null) {
                MediaType.f95651d.getClass();
                mediaType = MediaType.Companion.b(str);
            }
            responseBody = ResponseBody.create(mediaType, parseLong, m0.i(e0Var));
        }
        Intrinsics.checkNotNullParameter(request, "request");
        builder.f95734a = request;
        builder.f95736c = urlResponseInfo.getHttpStatusCode();
        builder.f(urlResponseInfo.getHttpStatusText());
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        builder.h(negotiatedProtocol.contains("quic") ? Protocol.QUIC : negotiatedProtocol.contains("h3") ? Protocol.QUIC : negotiatedProtocol.contains("spdy") ? Protocol.HTTP_2 : negotiatedProtocol.contains("h2") ? Protocol.HTTP_2 : negotiatedProtocol.contains("http/1.1") ? Protocol.HTTP_1_1 : Protocol.HTTP_1_0);
        builder.f95740g = responseBody;
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (z13 || (!com.bumptech.glide.c.z(entry.getKey(), "Content-Length") && !com.bumptech.glide.c.z(entry.getKey(), "Content-Encoding"))) {
                builder.a(entry.getKey(), entry.getValue());
            }
        }
        return builder;
    }
}
