package b40;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements d40.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f21689a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21690b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21691c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f21692d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f21693e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21694f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21695g;

    /* renamed from: h, reason: collision with root package name */
    public final List f21696h;

    /* renamed from: i, reason: collision with root package name */
    public final z f21697i;

    /* renamed from: j, reason: collision with root package name */
    public final List f21698j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f21699k;

    public b0(String __typename, String id3, String entityId, Integer num, Integer num2, String str, String str2, List list, z zVar, List list2, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21689a = __typename;
        this.f21690b = id3;
        this.f21691c = entityId;
        this.f21692d = num;
        this.f21693e = num2;
        this.f21694f = str;
        this.f21695g = str2;
        this.f21696h = list;
        this.f21697i = zVar;
        this.f21698j = list2;
        this.f21699k = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f21689a, b0Var.f21689a) && Intrinsics.d(this.f21690b, b0Var.f21690b) && Intrinsics.d(this.f21691c, b0Var.f21691c) && Intrinsics.d(this.f21692d, b0Var.f21692d) && Intrinsics.d(this.f21693e, b0Var.f21693e) && Intrinsics.d(this.f21694f, b0Var.f21694f) && Intrinsics.d(this.f21695g, b0Var.f21695g) && Intrinsics.d(this.f21696h, b0Var.f21696h) && Intrinsics.d(this.f21697i, b0Var.f21697i) && Intrinsics.d(this.f21698j, b0Var.f21698j) && Intrinsics.d(this.f21699k, b0Var.f21699k);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f21691c, cb.d(this.f21690b, this.f21689a.hashCode() * 31, 31), 31);
        Integer num = this.f21692d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21693e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f21694f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21695g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f21696h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        z zVar = this.f21697i;
        int hashCode6 = (hashCode5 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        List list2 = this.f21698j;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.f21699k;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f21689a);
        sb3.append(", id=");
        sb3.append(this.f21690b);
        sb3.append(", entityId=");
        sb3.append(this.f21691c);
        sb3.append(", displayMode=");
        sb3.append(this.f21692d);
        sb3.append(", encodedDisplayMode=");
        sb3.append(this.f21693e);
        sb3.append(", detailHeader=");
        sb3.append(this.f21694f);
        sb3.append(", headerText=");
        sb3.append(this.f21695g);
        sb3.append(", headerIconObjectIds=");
        sb3.append(this.f21696h);
        sb3.append(", objectMap=");
        sb3.append(this.f21697i);
        sb3.append(", textMapping=");
        sb3.append(this.f21698j);
        sb3.append(", newsType=");
        return a.c.i(sb3, this.f21699k, ")");
    }
}
