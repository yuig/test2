package io.embrace.android.embracesdk.internal.comms.api;

import a.cb;
import ep.b;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.s;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestV2;", "", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class ApiRequestV2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f72942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72944c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72945d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72946e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72947f;

    /* renamed from: g, reason: collision with root package name */
    public final String f72948g;

    public ApiRequestV2(String contentType, String userAgent, String str, String accept, String str2, String str3, String url) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(accept, "accept");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f72942a = contentType;
        this.f72943b = userAgent;
        this.f72944c = str;
        this.f72945d = accept;
        this.f72946e = str2;
        this.f72947f = str3;
        this.f72948g = url;
    }

    public final LinkedHashMap a() {
        LinkedHashMap h10 = z0.h(new Pair("Accept", this.f72945d), new Pair("User-Agent", this.f72943b), new Pair("Content-Type", this.f72942a));
        String str = this.f72944c;
        if (str != null) {
            h10.put("Content-Encoding", str);
        }
        String str2 = this.f72946e;
        if (str2 != null) {
            h10.put("X-EM-AID", str2);
        }
        String str3 = this.f72947f;
        if (str3 != null) {
            h10.put("X-EM-DID", str3);
        }
        return h10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequestV2)) {
            return false;
        }
        ApiRequestV2 apiRequestV2 = (ApiRequestV2) obj;
        return Intrinsics.d(this.f72942a, apiRequestV2.f72942a) && Intrinsics.d(this.f72943b, apiRequestV2.f72943b) && Intrinsics.d(this.f72944c, apiRequestV2.f72944c) && Intrinsics.d(this.f72945d, apiRequestV2.f72945d) && Intrinsics.d(this.f72946e, apiRequestV2.f72946e) && Intrinsics.d(this.f72947f, apiRequestV2.f72947f) && Intrinsics.d(this.f72948g, apiRequestV2.f72948g);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f72943b, this.f72942a.hashCode() * 31, 31);
        String str = this.f72944c;
        int d13 = cb.d(this.f72945d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f72946e;
        int hashCode = (d13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72947f;
        return this.f72948g.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ApiRequestV2(contentType=");
        sb3.append(this.f72942a);
        sb3.append(", userAgent=");
        sb3.append(this.f72943b);
        sb3.append(", contentEncoding=");
        sb3.append(this.f72944c);
        sb3.append(", accept=");
        sb3.append(this.f72945d);
        sb3.append(", appId=");
        sb3.append(this.f72946e);
        sb3.append(", deviceId=");
        sb3.append(this.f72947f);
        sb3.append(", url=");
        return b.k(sb3, this.f72948g, ')');
    }

    public /* synthetic */ ApiRequestV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "application/json" : str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? "application/json" : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, str7);
    }
}
