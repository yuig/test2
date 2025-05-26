package x40;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public final String f132041a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132042b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132043c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f132044d;

    /* renamed from: e, reason: collision with root package name */
    public final String f132045e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132046f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132047g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f132048h;

    /* renamed from: i, reason: collision with root package name */
    public final ac f132049i;

    /* renamed from: j, reason: collision with root package name */
    public final zb f132050j;

    public bc(String __typename, String id3, String entityId, Object obj, String str, Boolean bool, String str2, Date date, ac acVar, zb zbVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132041a = __typename;
        this.f132042b = id3;
        this.f132043c = entityId;
        this.f132044d = obj;
        this.f132045e = str;
        this.f132046f = bool;
        this.f132047g = str2;
        this.f132048h = date;
        this.f132049i = acVar;
        this.f132050j = zbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return Intrinsics.d(this.f132041a, bcVar.f132041a) && Intrinsics.d(this.f132042b, bcVar.f132042b) && Intrinsics.d(this.f132043c, bcVar.f132043c) && Intrinsics.d(this.f132044d, bcVar.f132044d) && Intrinsics.d(this.f132045e, bcVar.f132045e) && Intrinsics.d(this.f132046f, bcVar.f132046f) && Intrinsics.d(this.f132047g, bcVar.f132047g) && Intrinsics.d(this.f132048h, bcVar.f132048h) && Intrinsics.d(this.f132049i, bcVar.f132049i) && Intrinsics.d(this.f132050j, bcVar.f132050j);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132043c, a.cb.d(this.f132042b, this.f132041a.hashCode() * 31, 31), 31);
        Object obj = this.f132044d;
        int hashCode = (d2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f132045e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f132046f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f132047g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.f132048h;
        int hashCode5 = (hashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        ac acVar = this.f132049i;
        int hashCode6 = (hashCode5 + (acVar == null ? 0 : acVar.hashCode())) * 31;
        zb zbVar = this.f132050j;
        return hashCode6 + (zbVar != null ? zbVar.hashCode() : 0);
    }

    public final String toString() {
        return "Data(__typename=" + this.f132041a + ", id=" + this.f132042b + ", entityId=" + this.f132043c + ", status=" + this.f132044d + ", type=" + this.f132045e + ", isAcceptable=" + this.f132046f + ", message=" + this.f132047g + ", createdAt=" + this.f132048h + ", invitedByUser=" + this.f132049i + ", board=" + this.f132050j + ")";
    }
}
