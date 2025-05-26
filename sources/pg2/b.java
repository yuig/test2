package pg2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequestUrl;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final k f100117a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.k f100118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100119c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f100120d;

    public b(k urlBuilder, xk2.k lazyDeviceId, String appId) {
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        Intrinsics.checkNotNullParameter(lazyDeviceId, "lazyDeviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f100117a = urlBuilder;
        this.f100118b = lazyDeviceId;
        this.f100119c = appId;
        s[] values = s.values();
        int a13 = y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (s sVar : values) {
            linkedHashMap.put(sVar, ((p) this.f100117a).a(sVar));
        }
        this.f100120d = linkedHashMap;
    }

    public final ApiRequest a(String str) {
        ApiRequestUrl apiRequestUrl = new ApiRequestUrl(str);
        HttpMethod httpMethod = HttpMethod.POST;
        return new ApiRequest(null, "Embrace/a/7.1.0", "gzip", null, null, this.f100119c, (String) this.f100118b.getValue(), apiRequestUrl, httpMethod, null, 537, null);
    }
}
