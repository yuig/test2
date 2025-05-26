package y30;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f136740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136741b;

    /* renamed from: c, reason: collision with root package name */
    public final List f136742c;

    /* renamed from: d, reason: collision with root package name */
    public final String f136743d;

    /* renamed from: e, reason: collision with root package name */
    public final String f136744e;

    /* renamed from: f, reason: collision with root package name */
    public final String f136745f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f136746g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f136747h;

    public i(String __typename, String id3, List list, String str, String str2, String entityId, Object obj, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f136740a = __typename;
        this.f136741b = id3;
        this.f136742c = list;
        this.f136743d = str;
        this.f136744e = str2;
        this.f136745f = entityId;
        this.f136746g = obj;
        this.f136747h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f136740a, iVar.f136740a) && Intrinsics.d(this.f136741b, iVar.f136741b) && Intrinsics.d(this.f136742c, iVar.f136742c) && Intrinsics.d(this.f136743d, iVar.f136743d) && Intrinsics.d(this.f136744e, iVar.f136744e) && Intrinsics.d(this.f136745f, iVar.f136745f) && Intrinsics.d(this.f136746g, iVar.f136746g) && Intrinsics.d(this.f136747h, iVar.f136747h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f136741b, this.f136740a.hashCode() * 31, 31);
        List list = this.f136742c;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f136743d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f136744e;
        int d13 = cb.d(this.f136745f, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Object obj = this.f136746g;
        int hashCode3 = (d13 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.f136747h;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TodayArticleNode(__typename=");
        sb3.append(this.f136740a);
        sb3.append(", id=");
        sb3.append(this.f136741b);
        sb3.append(", imageUrls=");
        sb3.append(this.f136742c);
        sb3.append(", title=");
        sb3.append(this.f136743d);
        sb3.append(", subtitle=");
        sb3.append(this.f136744e);
        sb3.append(", entityId=");
        sb3.append(this.f136745f);
        sb3.append(", feedSource=");
        sb3.append(this.f136746g);
        sb3.append(", isProductPinFeed=");
        return a.c.h(sb3, this.f136747h, ")");
    }
}
