package io.embrace.android.embracesdk.internal.payload;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0003\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0096\u0002\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0016\b\u0003\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NetworkCapturedCall;", "", "", "duration", "endTime", "", "httpMethod", "matchedUrl", "networkId", "requestBody", "", "requestBodySize", "requestQuery", "", "requestQueryHeaders", "requestSize", "responseBody", "responseBodySize", "responseHeaders", "responseSize", "responseStatus", "sessionId", "startTime", "url", "errorMessage", "encryptedPayload", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/embrace/android/embracesdk/internal/payload/NetworkCapturedCall;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class NetworkCapturedCall {

    /* renamed from: a, reason: collision with root package name */
    public final Long f73206a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f73207b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73208c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73209d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73210e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73211f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f73212g;

    /* renamed from: h, reason: collision with root package name */
    public final String f73213h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f73214i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f73215j;

    /* renamed from: k, reason: collision with root package name */
    public final String f73216k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f73217l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f73218m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f73219n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f73220o;

    /* renamed from: p, reason: collision with root package name */
    public final String f73221p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f73222q;

    /* renamed from: r, reason: collision with root package name */
    public final String f73223r;

    /* renamed from: s, reason: collision with root package name */
    public final String f73224s;

    /* renamed from: t, reason: collision with root package name */
    public final String f73225t;

    public NetworkCapturedCall(@p(name = "dur") Long l13, @p(name = "et") Long l14, @p(name = "m") String str, @p(name = "mu") String str2, @p(name = "id") @NotNull String networkId, @p(name = "qb") String str3, @p(name = "qi") Integer num, @p(name = "qq") String str4, @p(name = "qh") Map<String, String> map, @p(name = "qz") Integer num2, @p(name = "sb") String str5, @p(name = "si") Integer num3, @p(name = "sh") Map<String, String> map2, @p(name = "sz") Integer num4, @p(name = "sc") Integer num5, @p(name = "sid") String str6, @p(name = "st") Long l15, @p(name = "url") String str7, @p(name = "em") String str8, @p(name = "ne") String str9) {
        Intrinsics.checkNotNullParameter(networkId, "networkId");
        this.f73206a = l13;
        this.f73207b = l14;
        this.f73208c = str;
        this.f73209d = str2;
        this.f73210e = networkId;
        this.f73211f = str3;
        this.f73212g = num;
        this.f73213h = str4;
        this.f73214i = map;
        this.f73215j = num2;
        this.f73216k = str5;
        this.f73217l = num3;
        this.f73218m = map2;
        this.f73219n = num4;
        this.f73220o = num5;
        this.f73221p = str6;
        this.f73222q = l15;
        this.f73223r = str7;
        this.f73224s = str8;
        this.f73225t = str9;
    }

    @NotNull
    public final NetworkCapturedCall copy(@p(name = "dur") Long duration, @p(name = "et") Long endTime, @p(name = "m") String httpMethod, @p(name = "mu") String matchedUrl, @p(name = "id") @NotNull String networkId, @p(name = "qb") String requestBody, @p(name = "qi") Integer requestBodySize, @p(name = "qq") String requestQuery, @p(name = "qh") Map<String, String> requestQueryHeaders, @p(name = "qz") Integer requestSize, @p(name = "sb") String responseBody, @p(name = "si") Integer responseBodySize, @p(name = "sh") Map<String, String> responseHeaders, @p(name = "sz") Integer responseSize, @p(name = "sc") Integer responseStatus, @p(name = "sid") String sessionId, @p(name = "st") Long startTime, @p(name = "url") String url, @p(name = "em") String errorMessage, @p(name = "ne") String encryptedPayload) {
        Intrinsics.checkNotNullParameter(networkId, "networkId");
        return new NetworkCapturedCall(duration, endTime, httpMethod, matchedUrl, networkId, requestBody, requestBodySize, requestQuery, requestQueryHeaders, requestSize, responseBody, responseBodySize, responseHeaders, responseSize, responseStatus, sessionId, startTime, url, errorMessage, encryptedPayload);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCapturedCall)) {
            return false;
        }
        NetworkCapturedCall networkCapturedCall = (NetworkCapturedCall) obj;
        return Intrinsics.d(this.f73206a, networkCapturedCall.f73206a) && Intrinsics.d(this.f73207b, networkCapturedCall.f73207b) && Intrinsics.d(this.f73208c, networkCapturedCall.f73208c) && Intrinsics.d(this.f73209d, networkCapturedCall.f73209d) && Intrinsics.d(this.f73210e, networkCapturedCall.f73210e) && Intrinsics.d(this.f73211f, networkCapturedCall.f73211f) && Intrinsics.d(this.f73212g, networkCapturedCall.f73212g) && Intrinsics.d(this.f73213h, networkCapturedCall.f73213h) && Intrinsics.d(this.f73214i, networkCapturedCall.f73214i) && Intrinsics.d(this.f73215j, networkCapturedCall.f73215j) && Intrinsics.d(this.f73216k, networkCapturedCall.f73216k) && Intrinsics.d(this.f73217l, networkCapturedCall.f73217l) && Intrinsics.d(this.f73218m, networkCapturedCall.f73218m) && Intrinsics.d(this.f73219n, networkCapturedCall.f73219n) && Intrinsics.d(this.f73220o, networkCapturedCall.f73220o) && Intrinsics.d(this.f73221p, networkCapturedCall.f73221p) && Intrinsics.d(this.f73222q, networkCapturedCall.f73222q) && Intrinsics.d(this.f73223r, networkCapturedCall.f73223r) && Intrinsics.d(this.f73224s, networkCapturedCall.f73224s) && Intrinsics.d(this.f73225t, networkCapturedCall.f73225t);
    }

    public final int hashCode() {
        Long l13 = this.f73206a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f73207b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f73208c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73209d;
        int d2 = cb.d(this.f73210e, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f73211f;
        int hashCode4 = (d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f73212g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f73213h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f73214i;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num2 = this.f73215j;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.f73216k;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f73217l;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map map2 = this.f73218m;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num4 = this.f73219n;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f73220o;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.f73221p;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l15 = this.f73222q;
        int hashCode15 = (hashCode14 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str7 = this.f73223r;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f73224s;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f73225t;
        return hashCode17 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NetworkCapturedCall(duration=");
        sb3.append(this.f73206a);
        sb3.append(", endTime=");
        sb3.append(this.f73207b);
        sb3.append(", httpMethod=");
        sb3.append(this.f73208c);
        sb3.append(", matchedUrl=");
        sb3.append(this.f73209d);
        sb3.append(", networkId=");
        sb3.append(this.f73210e);
        sb3.append(", requestBody=");
        sb3.append(this.f73211f);
        sb3.append(", requestBodySize=");
        sb3.append(this.f73212g);
        sb3.append(", requestQuery=");
        sb3.append(this.f73213h);
        sb3.append(", requestQueryHeaders=");
        sb3.append(this.f73214i);
        sb3.append(", requestSize=");
        sb3.append(this.f73215j);
        sb3.append(", responseBody=");
        sb3.append(this.f73216k);
        sb3.append(", responseBodySize=");
        sb3.append(this.f73217l);
        sb3.append(", responseHeaders=");
        sb3.append(this.f73218m);
        sb3.append(", responseSize=");
        sb3.append(this.f73219n);
        sb3.append(", responseStatus=");
        sb3.append(this.f73220o);
        sb3.append(", sessionId=");
        sb3.append(this.f73221p);
        sb3.append(", startTime=");
        sb3.append(this.f73222q);
        sb3.append(", url=");
        sb3.append(this.f73223r);
        sb3.append(", errorMessage=");
        sb3.append(this.f73224s);
        sb3.append(", encryptedPayload=");
        return b.k(sb3, this.f73225t, ')');
    }

    public /* synthetic */ NetworkCapturedCall(Long l13, Long l14, String str, String str2, String str3, String str4, Integer num, String str5, Map map, Integer num2, String str6, Integer num3, Map map2, Integer num4, Integer num5, String str7, Long l15, String str8, String str9, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l13, (i13 & 2) != 0 ? null : l14, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? cb.g("randomUUID().toString()") : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : num, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str5, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : map, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : num2, (i13 & 1024) != 0 ? null : str6, (i13 & 2048) != 0 ? null : num3, (i13 & 4096) != 0 ? null : map2, (i13 & 8192) != 0 ? null : num4, (i13 & 16384) != 0 ? null : num5, (i13 & 32768) != 0 ? null : str7, (i13 & 65536) != 0 ? null : l15, (i13 & 131072) != 0 ? null : str8, (i13 & 262144) != 0 ? null : str9, (i13 & 524288) != 0 ? null : str10);
    }
}
