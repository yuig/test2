package aj;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Laj/g;", "", "Laj/r;", "a", "Laj/r;", "signals", "", "b", "Ljava/lang/String;", "url", "c", "postBody", "d", "error", "", "e", "Ljava/lang/Boolean;", "cookiesInclude", "f", "requestId", "g", "params", "h", "cParams", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("signals")
    public r signals;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("url")
    public String url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("post_body")
    public String postBody;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("error")
    public String error;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("cookies_include")
    public Boolean cookiesInclude;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("request_id")
    public String requestId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("params")
    public String params;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("c_params")
    public String cParams;

    public g() {
        this(null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.signals, gVar.signals) && Intrinsics.d(this.url, gVar.url) && Intrinsics.d(this.postBody, gVar.postBody) && Intrinsics.d(this.error, gVar.error) && Intrinsics.d(this.cookiesInclude, gVar.cookiesInclude) && Intrinsics.d(this.requestId, gVar.requestId) && Intrinsics.d(this.params, gVar.params) && Intrinsics.d(this.cParams, gVar.cParams);
    }

    public final int hashCode() {
        r rVar = this.signals;
        int hashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postBody;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.cookiesInclude;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.requestId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.params;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cParams;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        r rVar = this.signals;
        String str = this.url;
        String str2 = this.postBody;
        String str3 = this.error;
        Boolean bool = this.cookiesInclude;
        String str4 = this.requestId;
        String str5 = this.params;
        String str6 = this.cParams;
        StringBuilder sb3 = new StringBuilder("ClientRequestBuildingData(signals=");
        sb3.append(rVar);
        sb3.append(", url=");
        sb3.append(str);
        sb3.append(", postBody=");
        a.a.B(sb3, str2, ", error=", str3, ", cookiesInclude=");
        sb3.append(bool);
        sb3.append(", requestId=");
        sb3.append(str4);
        sb3.append(", params=");
        return a.a.q(sb3, str5, ", cParams=", str6, ")");
    }

    public g(String str, String str2, String str3, Boolean bool, String str4, String str5, int i13) {
        str = (i13 & 2) != 0 ? null : str;
        str2 = (i13 & 4) != 0 ? null : str2;
        str3 = (i13 & 8) != 0 ? null : str3;
        bool = (i13 & 16) != 0 ? null : bool;
        str4 = (i13 & 32) != 0 ? null : str4;
        str5 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str5;
        this.signals = null;
        this.url = str;
        this.postBody = str2;
        this.error = str3;
        this.cookiesInclude = bool;
        this.requestId = str4;
        this.params = null;
        this.cParams = str5;
    }
}
