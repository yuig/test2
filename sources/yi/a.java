package yi;

import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lyi/a;", "", "", "a", "Ljava/lang/String;", "appId", "b", "adUnitId", "", "c", "Z", "isCalledFromInit", "d", "packageName", "", "e", "Ljava/lang/Integer;", "versionCode", "f", "afmaVersion", "g", "experimentIds", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("app_id")
    @NotNull
    public final String appId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("ad_unit_id")
    public final String adUnitId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("is_init")
    public final boolean isCalledFromInit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @b("pn")
    @NotNull
    public final String packageName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @b("version")
    public final Integer versionCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @b("js")
    @NotNull
    public final String afmaVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("experiment_ids")
    @NotNull
    public final String experimentIds;

    public a(String appId, String str, boolean z13, String packageName, Integer num, String afmaVersion, String experimentIds) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        this.appId = appId;
        this.adUnitId = str;
        this.isCalledFromInit = z13;
        this.packageName = packageName;
        this.versionCode = num;
        this.afmaVersion = afmaVersion;
        this.experimentIds = experimentIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.appId, aVar.appId) && Intrinsics.d(this.adUnitId, aVar.adUnitId) && this.isCalledFromInit == aVar.isCalledFromInit && Intrinsics.d(this.packageName, aVar.packageName) && Intrinsics.d(this.versionCode, aVar.versionCode) && Intrinsics.d(this.afmaVersion, aVar.afmaVersion) && Intrinsics.d(this.experimentIds, aVar.experimentIds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        String str = this.adUnitId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z13 = this.isCalledFromInit;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int t13 = j1.t((hashCode2 + i13) * 31, this.packageName);
        Integer num = this.versionCode;
        return this.experimentIds.hashCode() + j1.t((t13 + (num != null ? num.hashCode() : 0)) * 31, this.afmaVersion);
    }

    public final String toString() {
        String str = this.appId;
        String str2 = this.adUnitId;
        boolean z13 = this.isCalledFromInit;
        String str3 = this.packageName;
        Integer num = this.versionCode;
        String str4 = this.afmaVersion;
        String str5 = this.experimentIds;
        StringBuilder w13 = a.a.w("ConfigLoaderRequest(appId=", str, ", adUnitId=", str2, ", isCalledFromInit=");
        w13.append(z13);
        w13.append(", packageName=");
        w13.append(str3);
        w13.append(", versionCode=");
        w13.append(num);
        w13.append(", afmaVersion=");
        w13.append(str4);
        w13.append(", experimentIds=");
        return a.a.p(w13, str5, ")");
    }
}
