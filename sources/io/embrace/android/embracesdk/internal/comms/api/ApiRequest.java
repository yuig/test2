package io.embrace.android.embracesdk.internal.comms.api;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import oe2.s;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/ApiRequest;", "", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class ApiRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f72923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72926d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72927e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72928f;

    /* renamed from: g, reason: collision with root package name */
    public final String f72929g;

    /* renamed from: h, reason: collision with root package name */
    public final ApiRequestUrl f72930h;

    /* renamed from: i, reason: collision with root package name */
    public final HttpMethod f72931i;

    /* renamed from: j, reason: collision with root package name */
    public final String f72932j;

    public ApiRequest(String contentType, String userAgent, String str, String accept, String str2, String str3, String str4, ApiRequestUrl url, HttpMethod httpMethod, String str5) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(accept, "accept");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.f72923a = contentType;
        this.f72924b = userAgent;
        this.f72925c = str;
        this.f72926d = accept;
        this.f72927e = str2;
        this.f72928f = str3;
        this.f72929g = str4;
        this.f72930h = url;
        this.f72931i = httpMethod;
        this.f72932j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) obj;
        return Intrinsics.d(this.f72923a, apiRequest.f72923a) && Intrinsics.d(this.f72924b, apiRequest.f72924b) && Intrinsics.d(this.f72925c, apiRequest.f72925c) && Intrinsics.d(this.f72926d, apiRequest.f72926d) && Intrinsics.d(this.f72927e, apiRequest.f72927e) && Intrinsics.d(this.f72928f, apiRequest.f72928f) && Intrinsics.d(this.f72929g, apiRequest.f72929g) && Intrinsics.d(this.f72930h, apiRequest.f72930h) && this.f72931i == apiRequest.f72931i && Intrinsics.d(this.f72932j, apiRequest.f72932j);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f72924b, this.f72923a.hashCode() * 31, 31);
        String str = this.f72925c;
        int d13 = cb.d(this.f72926d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f72927e;
        int hashCode = (d13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72928f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f72929g;
        int hashCode3 = (this.f72931i.hashCode() + cb.d(this.f72930h.f72939a, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31)) * 31;
        String str5 = this.f72932j;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ApiRequest(contentType=");
        sb3.append(this.f72923a);
        sb3.append(", userAgent=");
        sb3.append(this.f72924b);
        sb3.append(", contentEncoding=");
        sb3.append(this.f72925c);
        sb3.append(", accept=");
        sb3.append(this.f72926d);
        sb3.append(", acceptEncoding=");
        sb3.append(this.f72927e);
        sb3.append(", appId=");
        sb3.append(this.f72928f);
        sb3.append(", deviceId=");
        sb3.append(this.f72929g);
        sb3.append(", url=");
        sb3.append(this.f72930h);
        sb3.append(", httpMethod=");
        sb3.append(this.f72931i);
        sb3.append(", eTag=");
        return b.k(sb3, this.f72932j, ')');
    }

    public /* synthetic */ ApiRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, ApiRequestUrl apiRequestUrl, HttpMethod httpMethod, String str8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "application/json" : str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? "application/json" : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, apiRequestUrl, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? HttpMethod.POST : httpMethod, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str8);
    }
}
