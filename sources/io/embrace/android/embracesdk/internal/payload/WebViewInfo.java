package io.embrace.android.embracesdk.internal.payload;

import a.a;
import a.cb;
import ep.b;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010JV\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/WebViewInfo;", "", "", "tag", "", "Lio/embrace/android/embracesdk/internal/payload/WebVital;", "webVitals", "url", "", "startTime", "", "Lth2/p;", "webVitalMap", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Map;)Lio/embrace/android/embracesdk/internal/payload/WebViewInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Map;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class WebViewInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f73284a;

    /* renamed from: b, reason: collision with root package name */
    public final List f73285b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73286c;

    /* renamed from: d, reason: collision with root package name */
    public final long f73287d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f73288e;

    public WebViewInfo(@p(name = "t") String str, @p(name = "vt") @NotNull List<WebVital> webVitals, @p(name = "u") @NotNull String url, @p(name = "ts") long j13, @NotNull Map<th2.p, WebVital> webVitalMap) {
        Intrinsics.checkNotNullParameter(webVitals, "webVitals");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webVitalMap, "webVitalMap");
        this.f73284a = str;
        this.f73285b = webVitals;
        this.f73286c = url;
        this.f73287d = j13;
        this.f73288e = webVitalMap;
    }

    public static /* synthetic */ WebViewInfo a(WebViewInfo webViewInfo, String str, ArrayList arrayList, EnumMap enumMap, int i13) {
        if ((i13 & 1) != 0) {
            str = webViewInfo.f73284a;
        }
        String str2 = str;
        List<WebVital> list = arrayList;
        if ((i13 & 2) != 0) {
            list = webViewInfo.f73285b;
        }
        List<WebVital> list2 = list;
        Map<th2.p, WebVital> map = enumMap;
        if ((i13 & 16) != 0) {
            map = webViewInfo.f73288e;
        }
        return webViewInfo.copy(str2, list2, webViewInfo.f73286c, webViewInfo.f73287d, map);
    }

    @NotNull
    public final WebViewInfo copy(@p(name = "t") String tag, @p(name = "vt") @NotNull List<WebVital> webVitals, @p(name = "u") @NotNull String url, @p(name = "ts") long startTime, @NotNull Map<th2.p, WebVital> webVitalMap) {
        Intrinsics.checkNotNullParameter(webVitals, "webVitals");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webVitalMap, "webVitalMap");
        return new WebViewInfo(tag, webVitals, url, startTime, webVitalMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewInfo)) {
            return false;
        }
        WebViewInfo webViewInfo = (WebViewInfo) obj;
        return Intrinsics.d(this.f73284a, webViewInfo.f73284a) && Intrinsics.d(this.f73285b, webViewInfo.f73285b) && Intrinsics.d(this.f73286c, webViewInfo.f73286c) && this.f73287d == webViewInfo.f73287d && Intrinsics.d(this.f73288e, webViewInfo.f73288e);
    }

    public final int hashCode() {
        String str = this.f73284a;
        return this.f73288e.hashCode() + a.c(this.f73287d, cb.d(this.f73286c, b.c(this.f73285b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WebViewInfo(tag=" + this.f73284a + ", webVitals=" + this.f73285b + ", url=" + this.f73286c + ", startTime=" + this.f73287d + ", webVitalMap=" + this.f73288e + ')';
    }

    public /* synthetic */ WebViewInfo(String str, List list, String str2, long j13, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? new ArrayList() : list, str2, j13, (i13 & 16) != 0 ? new HashMap() : map);
    }
}
