package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rc implements z40.c, z40.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f133181a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133182b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133183c;

    /* renamed from: d, reason: collision with root package name */
    public final List f133184d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133185e;

    /* renamed from: f, reason: collision with root package name */
    public final List f133186f;

    public rc(String __typename, String id3, String entityId, List list, Integer num, List list2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133181a = __typename;
        this.f133182b = id3;
        this.f133183c = entityId;
        this.f133184d = list;
        this.f133185e = num;
        this.f133186f = list2;
    }

    @Override // z40.t
    public final String a() {
        return this.f133183c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return Intrinsics.d(this.f133181a, rcVar.f133181a) && Intrinsics.d(this.f133182b, rcVar.f133182b) && Intrinsics.d(this.f133183c, rcVar.f133183c) && Intrinsics.d(this.f133184d, rcVar.f133184d) && Intrinsics.d(this.f133185e, rcVar.f133185e) && Intrinsics.d(this.f133186f, rcVar.f133186f);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133183c, a.cb.d(this.f133182b, this.f133181a.hashCode() * 31, 31), 31);
        List list = this.f133184d;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f133185e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.f133186f;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Conversation(__typename=");
        sb3.append(this.f133181a);
        sb3.append(", id=");
        sb3.append(this.f133182b);
        sb3.append(", entityId=");
        sb3.append(this.f133183c);
        sb3.append(", emails=");
        sb3.append(this.f133184d);
        sb3.append(", unread=");
        sb3.append(this.f133185e);
        sb3.append(", readTimesMs=");
        return a.c.j(sb3, this.f133186f, ")");
    }
}
