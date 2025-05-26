package b40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List f21768a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21769b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21770c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21771d;

    /* renamed from: e, reason: collision with root package name */
    public final List f21772e;

    public z(List list, List list2, List list3, List list4, List list5) {
        this.f21768a = list;
        this.f21769b = list2;
        this.f21770c = list3;
        this.f21771d = list4;
        this.f21772e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f21768a, zVar.f21768a) && Intrinsics.d(this.f21769b, zVar.f21769b) && Intrinsics.d(this.f21770c, zVar.f21770c) && Intrinsics.d(this.f21771d, zVar.f21771d) && Intrinsics.d(this.f21772e, zVar.f21772e);
    }

    public final int hashCode() {
        List list = this.f21768a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f21769b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f21770c;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f21771d;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f21772e;
        return hashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ObjectMap(pins=");
        sb3.append(this.f21768a);
        sb3.append(", users=");
        sb3.append(this.f21769b);
        sb3.append(", interests=");
        sb3.append(this.f21770c);
        sb3.append(", usersDidItData=");
        sb3.append(this.f21771d);
        sb3.append(", boards=");
        return a.c.j(sb3, this.f21772e, ")");
    }
}
