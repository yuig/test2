package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ac2 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("name")
    public final String f2352a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("adapter_version")
    public final String f2353b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("sdk_version")
    public final String f2354c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("signals")
    public String f2355d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("signal_error")
    public String f2356e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("signal_error_code")
    public Integer f2357f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("latency")
    public Long f2358g;

    public /* synthetic */ ac2(String str, String str2, String str3, String str4, Integer num, int i13) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, null, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : num, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac2)) {
            return false;
        }
        ac2 ac2Var = (ac2) obj;
        return Intrinsics.d(this.f2352a, ac2Var.f2352a) && Intrinsics.d(this.f2353b, ac2Var.f2353b) && Intrinsics.d(this.f2354c, ac2Var.f2354c) && Intrinsics.d(this.f2355d, ac2Var.f2355d) && Intrinsics.d(this.f2356e, ac2Var.f2356e) && Intrinsics.d(this.f2357f, ac2Var.f2357f) && Intrinsics.d(this.f2358g, ac2Var.f2358g);
    }

    public final int hashCode() {
        String str = this.f2352a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2353b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2354c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2355d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2356e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f2357f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.f2358g;
        return hashCode6 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f2352a;
        String str2 = this.f2353b;
        String str3 = this.f2354c;
        String str4 = this.f2355d;
        String str5 = this.f2356e;
        Integer num = this.f2357f;
        Long l13 = this.f2358g;
        StringBuilder w13 = a.a.w("RtbAdapterData(adapterClassName=", str, ", adapterVersion=", str2, ", sdkVersion=");
        a.a.B(w13, str3, ", signals=", str4, ", signalErrorMessage=");
        w13.append(str5);
        w13.append(", signalErrorCode=");
        w13.append(num);
        w13.append(", latency=");
        w13.append(l13);
        w13.append(")");
        return w13.toString();
    }

    public ac2(String str, String str2, String str3, String str4, String str5, Integer num, Long l13) {
        this.f2352a = str;
        this.f2353b = str2;
        this.f2354c = str3;
        this.f2355d = str4;
        this.f2356e = str5;
        this.f2357f = num;
        this.f2358g = l13;
    }
}
