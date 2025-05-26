package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    public final String f132960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132961b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132962c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f132963d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f132964e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132965f;

    /* renamed from: g, reason: collision with root package name */
    public final nc f132966g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132967h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132968i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f132969j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132970k;

    public oc(String __typename, String id3, String entityId, Integer num, Object obj, String str, nc ncVar, List list, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132960a = __typename;
        this.f132961b = id3;
        this.f132962c = entityId;
        this.f132963d = num;
        this.f132964e = obj;
        this.f132965f = str;
        this.f132966g = ncVar;
        this.f132967h = list;
        this.f132968i = str2;
        this.f132969j = bool;
        this.f132970k = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return Intrinsics.d(this.f132960a, ocVar.f132960a) && Intrinsics.d(this.f132961b, ocVar.f132961b) && Intrinsics.d(this.f132962c, ocVar.f132962c) && Intrinsics.d(this.f132963d, ocVar.f132963d) && Intrinsics.d(this.f132964e, ocVar.f132964e) && Intrinsics.d(this.f132965f, ocVar.f132965f) && Intrinsics.d(this.f132966g, ocVar.f132966g) && Intrinsics.d(this.f132967h, ocVar.f132967h) && Intrinsics.d(this.f132968i, ocVar.f132968i) && Intrinsics.d(this.f132969j, ocVar.f132969j) && Intrinsics.d(this.f132970k, ocVar.f132970k);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132962c, a.cb.d(this.f132961b, this.f132960a.hashCode() * 31, 31), 31);
        Integer num = this.f132963d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f132964e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f132965f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        nc ncVar = this.f132966g;
        int hashCode4 = (hashCode3 + (ncVar == null ? 0 : ncVar.hashCode())) * 31;
        List list = this.f132967h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f132968i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f132969j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f132970k;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f132960a);
        sb3.append(", id=");
        sb3.append(this.f132961b);
        sb3.append(", entityId=");
        sb3.append(this.f132962c);
        sb3.append(", pinCount=");
        sb3.append(this.f132963d);
        sb3.append(", privacy=");
        sb3.append(this.f132964e);
        sb3.append(", name=");
        sb3.append(this.f132965f);
        sb3.append(", owner=");
        sb3.append(this.f132966g);
        sb3.append(", pinThumbnailUrls=");
        sb3.append(this.f132967h);
        sb3.append(", imageCoverHdUrl=");
        sb3.append(this.f132968i);
        sb3.append(", hasCustomCover=");
        sb3.append(this.f132969j);
        sb3.append(", imageCoverUrl=");
        return a.a.p(sb3, this.f132970k, ")");
    }
}
