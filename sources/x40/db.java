package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class db implements z40.r {

    /* renamed from: a, reason: collision with root package name */
    public final String f132237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132238b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132239c;

    /* renamed from: d, reason: collision with root package name */
    public final cb f132240d;

    /* renamed from: e, reason: collision with root package name */
    public final ab f132241e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132242f;

    /* renamed from: g, reason: collision with root package name */
    public final List f132243g;

    public db(String __typename, String id3, String entityId, cb cbVar, ab abVar, String str, List list) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132237a = __typename;
        this.f132238b = id3;
        this.f132239c = entityId;
        this.f132240d = cbVar;
        this.f132241e = abVar;
        this.f132242f = str;
        this.f132243g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return Intrinsics.d(this.f132237a, dbVar.f132237a) && Intrinsics.d(this.f132238b, dbVar.f132238b) && Intrinsics.d(this.f132239c, dbVar.f132239c) && Intrinsics.d(this.f132240d, dbVar.f132240d) && Intrinsics.d(this.f132241e, dbVar.f132241e) && Intrinsics.d(this.f132242f, dbVar.f132242f) && Intrinsics.d(this.f132243g, dbVar.f132243g);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132239c, a.cb.d(this.f132238b, this.f132237a.hashCode() * 31, 31), 31);
        cb cbVar = this.f132240d;
        int hashCode = (d2 + (cbVar == null ? 0 : cbVar.hashCode())) * 31;
        ab abVar = this.f132241e;
        int hashCode2 = (hashCode + (abVar == null ? 0 : abVar.hashCode())) * 31;
        String str = this.f132242f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f132243g;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserDidItData(__typename=");
        sb3.append(this.f132237a);
        sb3.append(", id=");
        sb3.append(this.f132238b);
        sb3.append(", entityId=");
        sb3.append(this.f132239c);
        sb3.append(", user=");
        sb3.append(this.f132240d);
        sb3.append(", pin=");
        sb3.append(this.f132241e);
        sb3.append(", details=");
        sb3.append(this.f132242f);
        sb3.append(", images=");
        return a.c.j(sb3, this.f132243g, ")");
    }
}
