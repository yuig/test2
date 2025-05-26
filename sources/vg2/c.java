package vg2;

import ao2.m0;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequestUrl;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kh2.a1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import pg2.k;
import pg2.p;
import pg2.s;
import wo2.h;
import wo2.l;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f125795a;

    /* renamed from: b, reason: collision with root package name */
    public final k f125796b;

    /* renamed from: c, reason: collision with root package name */
    public final xh2.d f125797c;

    /* renamed from: d, reason: collision with root package name */
    public String f125798d;

    public c(OkHttpClient okhttpClient, k apiUrlBuilder, xh2.d serializer) {
        Intrinsics.checkNotNullParameter(okhttpClient, "okhttpClient");
        Intrinsics.checkNotNullParameter(apiUrlBuilder, "apiUrlBuilder");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f125795a = okhttpClient;
        this.f125796b = apiUrlBuilder;
        this.f125797c = serializer;
    }

    public final b a() {
        l f95981f;
        s sVar = s.CONFIG;
        p pVar = (p) this.f125796b;
        String a13 = pVar.a(sVar);
        LinkedHashMap D = a1.D(new ApiRequest(null, "Embrace/a/7.1.0", null, null, "gzip", pVar.f100141c, pVar.f100139a, new ApiRequestUrl(a13), HttpMethod.GET, null, 525, null));
        Request.Builder builder = new Request.Builder();
        builder.j(a13);
        String str = this.f125798d;
        if (str != null) {
            builder.d("If-None-Match", str);
        }
        for (Map.Entry entry : D.entrySet()) {
            builder.d((String) entry.getKey(), (String) entry.getValue());
        }
        Response e13 = this.f125795a.newCall(builder.b()).e();
        RemoteConfig remoteConfig = null;
        String c13 = e13.c("etag", null);
        if (c13 != null) {
            this.f125798d = c13;
        }
        if (!e13.d()) {
            return null;
        }
        ResponseBody responseBody = e13.f95726g;
        if (responseBody != null && (f95981f = responseBody.getF95981f()) != null) {
            try {
                h k23 = m0.i(new wo2.s(f95981f)).k2();
                try {
                    RemoteConfig remoteConfig2 = (RemoteConfig) this.f125797c.g(k23, RemoteConfig.class);
                    dl2.b.J(k23, null);
                    dl2.b.J(f95981f, null);
                    remoteConfig = remoteConfig2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    dl2.b.J(f95981f, th3);
                    throw th4;
                }
            }
        }
        return new b(remoteConfig, this.f125798d);
    }
}
