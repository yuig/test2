package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Laj/p;", "", "", "a", "Ljava/lang/String;", "parentQueryId", "b", "parentQueryDimensions", "c", "requestMulticallIndex", "d", "bowCachedAdKey", "e", "bowCacheDatacenter", "f", "bowCacheWriteQueryId", "g", "multicallExpFloorType", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("pqid")
    public String parentQueryId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("pqd")
    public String parentQueryDimensions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("mindex")
    public String requestMulticallIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("cak")
    public String bowCachedAdKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("cadc")
    public String bowCacheDatacenter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("caqid")
    public String bowCacheWriteQueryId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("mfloor")
    public String multicallExpFloorType;

    public p() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.parentQueryId, pVar.parentQueryId) && Intrinsics.d(this.parentQueryDimensions, pVar.parentQueryDimensions) && Intrinsics.d(this.requestMulticallIndex, pVar.requestMulticallIndex) && Intrinsics.d(this.bowCachedAdKey, pVar.bowCachedAdKey) && Intrinsics.d(this.bowCacheDatacenter, pVar.bowCacheDatacenter) && Intrinsics.d(this.bowCacheWriteQueryId, pVar.bowCacheWriteQueryId) && Intrinsics.d(this.multicallExpFloorType, pVar.multicallExpFloorType);
    }

    public final int hashCode() {
        String str = this.parentQueryId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.parentQueryDimensions;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestMulticallIndex;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bowCachedAdKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bowCacheDatacenter;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bowCacheWriteQueryId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.multicallExpFloorType;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.parentQueryId;
        String str2 = this.parentQueryDimensions;
        String str3 = this.requestMulticallIndex;
        String str4 = this.bowCachedAdKey;
        String str5 = this.bowCacheDatacenter;
        String str6 = this.bowCacheWriteQueryId;
        String str7 = this.multicallExpFloorType;
        StringBuilder w13 = a.a.w("RecursiveRequestParameters(parentQueryId=", str, ", parentQueryDimensions=", str2, ", requestMulticallIndex=");
        a.a.B(w13, str3, ", bowCachedAdKey=", str4, ", bowCacheDatacenter=");
        a.a.B(w13, str5, ", bowCacheWriteQueryId=", str6, ", multicallExpFloorType=");
        return a.a.p(w13, str7, ")");
    }

    public p(int i13) {
        this.parentQueryId = null;
        this.parentQueryDimensions = null;
        this.requestMulticallIndex = null;
        this.bowCachedAdKey = null;
        this.bowCacheDatacenter = null;
        this.bowCacheWriteQueryId = null;
        this.multicallExpFloorType = null;
    }
}
