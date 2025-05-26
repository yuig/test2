package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig;
import io.embrace.android.embracesdk.internal.config.remote.NetworkRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.f0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final List f117613e = f0.j("-----BEGIN PUBLIC KEY-----", "-----END PUBLIC KEY-----", "\\r", "\\n", "\\t", " ");

    /* renamed from: a, reason: collision with root package name */
    public final InstrumentedConfig f117614a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfig f117615b;

    /* renamed from: c, reason: collision with root package name */
    public final List f117616c;

    /* renamed from: d, reason: collision with root package name */
    public final NetworkCaptureConfig f117617d;

    public m(InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117614a = local;
        this.f117615b = remoteConfig;
        this.f117616c = null;
        this.f117617d = local.getNetworkCapture();
    }

    public final LinkedHashMap a() {
        Map map;
        NetworkRemoteConfig networkRemoteConfig;
        RemoteConfig remoteConfig = this.f117615b;
        if (remoteConfig == null || (networkRemoteConfig = remoteConfig.f73051f) == null || (map = networkRemoteConfig.f73037b) == null) {
            Map<String, String> limitsByDomain = this.f117617d.getLimitsByDomain();
            LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(limitsByDomain.size()));
            Iterator<T> it = limitsByDomain.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
            }
            map = linkedHashMap;
        }
        int c13 = c();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Integer.valueOf(Math.min(((Number) entry2.getValue()).intValue(), c13)));
        }
        return linkedHashMap2;
    }

    public final String b() {
        String networkBodyCapturePublicKey = this.f117617d.getNetworkBodyCapturePublicKey();
        if (networkBodyCapturePublicKey != null) {
            Iterator it = f117613e.iterator();
            while (it.hasNext()) {
                networkBodyCapturePublicKey = networkBodyCapturePublicKey != null ? new Regex((String) it.next()).replace(networkBodyCapturePublicKey, "") : null;
            }
        }
        return networkBodyCapturePublicKey;
    }

    public final int c() {
        NetworkRemoteConfig networkRemoteConfig;
        Integer num;
        RemoteConfig remoteConfig = this.f117615b;
        return Math.min((remoteConfig == null || (networkRemoteConfig = remoteConfig.f73051f) == null || (num = networkRemoteConfig.f73036a) == null) ? 1000 : num.intValue(), this.f117617d.getRequestLimitPerDomain());
    }
}
