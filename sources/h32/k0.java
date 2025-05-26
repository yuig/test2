package h32;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final kp.n f67127g = new kp.n(13);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f67128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67129b;

    /* renamed from: c, reason: collision with root package name */
    public final Short f67130c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67131d;

    /* renamed from: e, reason: collision with root package name */
    public final List f67132e;

    /* renamed from: f, reason: collision with root package name */
    public final List f67133f;

    public k0(Integer num, String str, Short sh3, String str2, List list, List list2) {
        this.f67128a = num;
        this.f67129b = str;
        this.f67130c = sh3;
        this.f67131d = str2;
        this.f67132e = list;
        this.f67133f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f67128a, k0Var.f67128a) && Intrinsics.d(this.f67129b, k0Var.f67129b) && Intrinsics.d(this.f67130c, k0Var.f67130c) && Intrinsics.d(this.f67131d, k0Var.f67131d) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(this.f67132e, k0Var.f67132e) && Intrinsics.d(this.f67133f, k0Var.f67133f);
    }

    public final int hashCode() {
        Integer num = this.f67128a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f67129b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Short sh3 = this.f67130c;
        int hashCode3 = (hashCode2 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str2 = this.f67131d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 29791;
        List list = this.f67132e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f67133f;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DcoEventData(clientCreativeType=");
        sb3.append(this.f67128a);
        sb3.append(", ceAltImageSignature=");
        sb3.append(this.f67129b);
        sb3.append(", dpaLayoutType=");
        sb3.append(this.f67130c);
        sb3.append(", dpaVariantId=");
        sb3.append(this.f67131d);
        sb3.append(", collectionInternalItemIds=null, collectionPinIds=null, collectionInternalItemIdList=");
        sb3.append(this.f67132e);
        sb3.append(", collectionPinIdList=");
        return a.c.j(sb3, this.f67133f, ")");
    }
}
