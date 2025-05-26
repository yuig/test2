package tu1;

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
import pk.o1;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f119475a = o1.p(4, "br", "deflate", "gzip", "x-gzip");

    /* renamed from: b, reason: collision with root package name */
    public static final ok.e0 f119476b;

    static {
        ok.e0 a13 = ok.e0.a(',');
        ok.o oVar = ok.o.f95441c;
        oVar.getClass();
        f119476b = new ok.e0(a13.f95422c, true, oVar, a13.f95423d);
    }

    public static Response.Builder a(Request request, UrlResponseInfo urlResponseInfo, wo2.e0 e0Var) {
        ResponseBody responseBody;
        long j13;
        MediaType mediaType;
        List<String> list;
        Response.Builder builder = new Response.Builder();
        builder.f95745l = System.currentTimeMillis();
        List<String> list2 = urlResponseInfo.getAllHeaders().get("Content-Type");
        Response response = null;
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
            Iterable b13 = f119476b.b(it.next());
            if (b13 instanceof Collection) {
                arrayList.addAll((Collection) b13);
            } else {
                com.bumptech.glide.c.h(arrayList, b13.iterator());
            }
        }
        boolean z13 = arrayList.isEmpty() || !f119475a.containsAll(arrayList);
        String str2 = (!z13 || (list = urlResponseInfo.getAllHeaders().get("Content-Length")) == null || list.isEmpty()) ? null : (String) com.bumptech.glide.c.P(list);
        if (e0Var != null) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (request.f95701b.equals("HEAD")) {
                j13 = 0;
            } else {
                j13 = -1;
                if (str2 != null) {
                    try {
                        j13 = Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if ((httpStatusCode == 204 || httpStatusCode == 205) && j13 > 0) {
                throw new ProtocolException("HTTP " + httpStatusCode + " had non-zero Content-Length: " + str2);
            }
            if (str != null) {
                MediaType.f95651d.getClass();
                mediaType = MediaType.Companion.b(str);
            } else {
                mediaType = null;
            }
            responseBody = ResponseBody.create(mediaType, j13, ao2.m0.i(e0Var));
        } else {
            responseBody = null;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        builder.f95734a = request;
        builder.f95736c = urlResponseInfo.getHttpStatusCode();
        builder.f(urlResponseInfo.getHttpStatusText());
        if (urlResponseInfo.wasCached()) {
            Response.Builder builder2 = new Response.Builder();
            Intrinsics.checkNotNullParameter(request, "request");
            builder2.f95734a = request;
            builder2.h(Protocol.HTTP_2);
            builder2.f95736c = urlResponseInfo.getHttpStatusCode();
            builder2.f(urlResponseInfo.getHttpStatusText());
            response = builder2.b();
        }
        Response.Builder.c("cacheResponse", response);
        builder.f95742i = response;
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        builder.h(negotiatedProtocol.contains("quic") ? Protocol.QUIC : negotiatedProtocol.contains("h3") ? Protocol.QUIC : negotiatedProtocol.contains("spdy") ? Protocol.HTTP_2 : negotiatedProtocol.contains("h2") ? Protocol.HTTP_2 : negotiatedProtocol.contains("http1.1") ? Protocol.HTTP_1_1 : Protocol.HTTP_1_0);
        builder.f95740g = responseBody;
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (z13 || (!com.bumptech.glide.c.z(entry.getKey(), "Content-Length") && !com.bumptech.glide.c.z(entry.getKey(), "Content-Encoding"))) {
                try {
                    builder.a(entry.getKey(), entry.getValue());
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        builder.a("transport", su1.h.CLIENT_CRONET.getStr());
        return builder;
    }
}
