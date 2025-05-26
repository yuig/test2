package sv0;

import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpRequest;
import com.amazonaws.http.HttpResponse;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class c implements HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f115327a;

    /* renamed from: b, reason: collision with root package name */
    public Call f115328b;

    public c(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f115327a = okHttpClient;
    }

    @Override // com.amazonaws.http.HttpClient
    public final HttpResponse a(HttpRequest request) {
        ByteArrayInputStream byteArrayInputStream;
        String string;
        Intrinsics.checkNotNullParameter(request, "request");
        Request.Builder builder = new Request.Builder();
        URL url = request.f28599b.toURL();
        Intrinsics.checkNotNullExpressionValue(url, "toURL(...)");
        builder.k(url);
        String str = request.f28598a;
        Intrinsics.checkNotNullExpressionValue(str, "getMethod(...)");
        builder.f(str, new d(request));
        Map map = request.f28600c;
        Iterator it = map.keySet().iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            Intrinsics.f(str3);
            String str4 = (String) map.get(str3);
            if (str4 != null) {
                str2 = str4;
            }
            builder.a(str3, str2);
        }
        Call newCall = this.f115327a.newCall(builder.b());
        this.f115328b = newCall;
        Response e13 = newCall.e();
        try {
            HttpResponse.Builder builder2 = new HttpResponse.Builder();
            HashMap hashMap = builder2.f28611d;
            builder2.f28608a = e13.f95722c;
            builder2.f28609b = e13.f95723d;
            ResponseBody responseBody = e13.f95726g;
            if (responseBody == null || (string = responseBody.string()) == null) {
                byteArrayInputStream = null;
            } else {
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                byteArrayInputStream = new ByteArrayInputStream(bytes);
            }
            builder2.f28610c = byteArrayInputStream;
            for (String str5 : e13.f95725f.e()) {
                hashMap.put(str5, e13.c(str5, ""));
            }
            HttpResponse httpResponse = new HttpResponse(builder2.f28608a, builder2.f28609b, Collections.unmodifiableMap(hashMap), builder2.f28610c);
            dl2.b.J(e13, null);
            Intrinsics.checkNotNullExpressionValue(httpResponse, "use(...)");
            return httpResponse;
        } finally {
        }
    }

    @Override // com.amazonaws.http.HttpClient
    public final void shutdown() {
        Call call = this.f115328b;
        if (call != null) {
            call.cancel();
        }
    }
}
