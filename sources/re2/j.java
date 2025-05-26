package re2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final vb0.i f107708k = new vb0.i(16);

    /* renamed from: a, reason: collision with root package name */
    public final Long f107709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107710b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f107711c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f107712d;

    /* renamed from: e, reason: collision with root package name */
    public final List f107713e;

    /* renamed from: f, reason: collision with root package name */
    public final List f107714f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f107715g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f107716h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f107717i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f107718j;

    public j(Long l13, String str, Long l14, Long l15, List list, List list2, Boolean bool, Long l16, Long l17, Long l18) {
        this.f107709a = l13;
        this.f107710b = str;
        this.f107711c = l14;
        this.f107712d = l15;
        this.f107713e = list;
        this.f107714f = list2;
        this.f107715g = bool;
        this.f107716h = l16;
        this.f107717i = l17;
        this.f107718j = l18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f107709a, jVar.f107709a) && Intrinsics.d(this.f107710b, jVar.f107710b) && Intrinsics.d(this.f107711c, jVar.f107711c) && Intrinsics.d(this.f107712d, jVar.f107712d) && Intrinsics.d(this.f107713e, jVar.f107713e) && Intrinsics.d(this.f107714f, jVar.f107714f) && Intrinsics.d(this.f107715g, jVar.f107715g) && Intrinsics.d(this.f107716h, jVar.f107716h) && Intrinsics.d(this.f107717i, jVar.f107717i) && Intrinsics.d(this.f107718j, jVar.f107718j);
    }

    public final int hashCode() {
        Long l13 = this.f107709a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f107710b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f107711c;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f107712d;
        int hashCode4 = (hashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        List list = this.f107713e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f107714f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f107715g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l16 = this.f107716h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f107717i;
        int hashCode9 = (hashCode8 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f107718j;
        return hashCode9 + (l18 != null ? l18.hashCode() : 0);
    }

    public final String toString() {
        return "Span(trace_id=" + this.f107709a + ", name=" + this.f107710b + ", id=" + this.f107711c + ", parent_id=" + this.f107712d + ", annotations=" + this.f107713e + ", binary_annotations=" + this.f107714f + ", debug=" + this.f107715g + ", timestamp=" + this.f107716h + ", duration=" + this.f107717i + ", trace_id_high=" + this.f107718j + ")";
    }
}
