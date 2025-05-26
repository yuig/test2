package b32;

import c50.t4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: i */
    public static final t4 f21463i = new t4(9);

    /* renamed from: a */
    public final String f21464a;

    /* renamed from: b */
    public final String f21465b;

    /* renamed from: c */
    public final String f21466c;

    /* renamed from: d */
    public final List f21467d;

    /* renamed from: e */
    public final j f21468e;

    /* renamed from: f */
    public final Short f21469f;

    /* renamed from: g */
    public final Short f21470g;

    /* renamed from: h */
    public final Long f21471h;

    public b(String str, String str2, String str3, List list, j jVar, Short sh3, Short sh4, Long l13) {
        this.f21464a = str;
        this.f21465b = str2;
        this.f21466c = str3;
        this.f21467d = list;
        this.f21468e = jVar;
        this.f21469f = sh3;
        this.f21470g = sh4;
        this.f21471h = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f21464a, bVar.f21464a) && Intrinsics.d(this.f21465b, bVar.f21465b) && Intrinsics.d(this.f21466c, bVar.f21466c) && Intrinsics.d(this.f21467d, bVar.f21467d) && Intrinsics.d(this.f21468e, bVar.f21468e) && Intrinsics.d(this.f21469f, bVar.f21469f) && Intrinsics.d(this.f21470g, bVar.f21470g) && Intrinsics.d(this.f21471h, bVar.f21471h);
    }

    public final int hashCode() {
        String str = this.f21464a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21465b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21466c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f21467d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        j jVar = this.f21468e;
        int hashCode5 = (hashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Short sh3 = this.f21469f;
        int hashCode6 = (hashCode5 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Short sh4 = this.f21470g;
        int hashCode7 = (hashCode6 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Long l13 = this.f21471h;
        return hashCode7 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "CartingEventData(parentPinID=" + this.f21464a + ", platform=" + this.f21465b + ", productID=" + this.f21466c + ", retailers=" + this.f21467d + ", retailer=" + this.f21468e + ", closeupType=" + this.f21469f + ", errorCode=" + this.f21470g + ", vendorID=" + this.f21471h + ")";
    }
}
