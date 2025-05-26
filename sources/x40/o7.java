package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o7 implements z40.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f132942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132944c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f132945d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f132946e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132947f;

    /* renamed from: g, reason: collision with root package name */
    public final n7 f132948g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132949h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132950i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f132951j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132952k;

    public o7(String __typename, String id3, String entityId, Integer num, Object obj, String str, n7 n7Var, List list, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132942a = __typename;
        this.f132943b = id3;
        this.f132944c = entityId;
        this.f132945d = num;
        this.f132946e = obj;
        this.f132947f = str;
        this.f132948g = n7Var;
        this.f132949h = list;
        this.f132950i = str2;
        this.f132951j = bool;
        this.f132952k = str3;
    }

    @Override // z40.o
    public final String a() {
        return this.f132944c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return Intrinsics.d(this.f132942a, o7Var.f132942a) && Intrinsics.d(this.f132943b, o7Var.f132943b) && Intrinsics.d(this.f132944c, o7Var.f132944c) && Intrinsics.d(this.f132945d, o7Var.f132945d) && Intrinsics.d(this.f132946e, o7Var.f132946e) && Intrinsics.d(this.f132947f, o7Var.f132947f) && Intrinsics.d(this.f132948g, o7Var.f132948g) && Intrinsics.d(this.f132949h, o7Var.f132949h) && Intrinsics.d(this.f132950i, o7Var.f132950i) && Intrinsics.d(this.f132951j, o7Var.f132951j) && Intrinsics.d(this.f132952k, o7Var.f132952k);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132944c, a.cb.d(this.f132943b, this.f132942a.hashCode() * 31, 31), 31);
        Integer num = this.f132945d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f132946e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f132947f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        n7 n7Var = this.f132948g;
        int hashCode4 = (hashCode3 + (n7Var == null ? 0 : n7Var.hashCode())) * 31;
        List list = this.f132949h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f132950i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f132951j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f132952k;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f132942a);
        sb3.append(", id=");
        sb3.append(this.f132943b);
        sb3.append(", entityId=");
        sb3.append(this.f132944c);
        sb3.append(", pinCount=");
        sb3.append(this.f132945d);
        sb3.append(", privacy=");
        sb3.append(this.f132946e);
        sb3.append(", name=");
        sb3.append(this.f132947f);
        sb3.append(", owner=");
        sb3.append(this.f132948g);
        sb3.append(", pinThumbnailUrls=");
        sb3.append(this.f132949h);
        sb3.append(", imageCoverHdUrl=");
        sb3.append(this.f132950i);
        sb3.append(", hasCustomCover=");
        sb3.append(this.f132951j);
        sb3.append(", imageCoverUrl=");
        return a.a.p(sb3, this.f132952k, ")");
    }
}
