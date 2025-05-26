package pg2;

import android.os.Build;
import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f100139a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100140b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100141c;

    /* renamed from: d, reason: collision with root package name */
    public final String f100142d;

    /* renamed from: e, reason: collision with root package name */
    public final String f100143e;

    /* renamed from: f, reason: collision with root package name */
    public final String f100144f;

    /* renamed from: g, reason: collision with root package name */
    public final String f100145g;

    public p(String deviceId, String appVersionName, InstrumentedConfigImpl instrumentedConfig) {
        List split$default;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(appVersionName, "appVersionName");
        Intrinsics.checkNotNullParameter(instrumentedConfig, "instrumentedConfig");
        this.f100139a = deviceId;
        this.f100140b = appVersionName;
        String appId = instrumentedConfig.getProject().getAppId();
        if (appId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f100141c = appId;
        String data = instrumentedConfig.getBaseUrls().getData();
        this.f100142d = data == null ? a.a.k("https://a-", appId, ".data.emb-api.com") : data;
        String config = instrumentedConfig.getBaseUrls().getConfig();
        this.f100143e = config == null ? a.a.k("https://a-", appId, ".config.emb-api.com") : config;
        this.f100144f = a.a.n(new StringBuilder(), Build.VERSION.SDK_INT, ".0.0");
        s sVar = s.SESSIONS;
        split$default = StringsKt__StringsKt.split$default(a(sVar), new String[]{sVar.getPath()}, false, 0, 6, null);
        this.f100145g = (String) CollectionsKt.S(split$default);
    }

    public final String a(s endpoint) {
        String str;
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        int[] iArr = o.f100138a;
        String str2 = iArr[endpoint.ordinal()] == 1 ? this.f100143e : this.f100142d;
        if (iArr[endpoint.ordinal()] == 1) {
            str = "?appId=" + this.f100141c + "&osVersion=" + this.f100144f + "&appVersion=" + this.f100140b + "&deviceId=" + this.f100139a;
        } else {
            str = "";
        }
        return str2 + '/' + endpoint.getVersion() + '/' + endpoint.getPath() + str;
    }
}
