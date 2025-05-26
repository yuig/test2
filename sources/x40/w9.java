package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w9 implements z40.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f133608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133610c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f133611d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f133612e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133613f;

    /* renamed from: g, reason: collision with root package name */
    public final v9 f133614g;

    /* renamed from: h, reason: collision with root package name */
    public final List f133615h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133616i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f133617j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133618k;

    public w9(String __typename, String id3, String entityId, Integer num, Object obj, String str, v9 v9Var, List list, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133608a = __typename;
        this.f133609b = id3;
        this.f133610c = entityId;
        this.f133611d = num;
        this.f133612e = obj;
        this.f133613f = str;
        this.f133614g = v9Var;
        this.f133615h = list;
        this.f133616i = str2;
        this.f133617j = bool;
        this.f133618k = str3;
    }

    @Override // z40.o
    public final String a() {
        return this.f133610c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return Intrinsics.d(this.f133608a, w9Var.f133608a) && Intrinsics.d(this.f133609b, w9Var.f133609b) && Intrinsics.d(this.f133610c, w9Var.f133610c) && Intrinsics.d(this.f133611d, w9Var.f133611d) && Intrinsics.d(this.f133612e, w9Var.f133612e) && Intrinsics.d(this.f133613f, w9Var.f133613f) && Intrinsics.d(this.f133614g, w9Var.f133614g) && Intrinsics.d(this.f133615h, w9Var.f133615h) && Intrinsics.d(this.f133616i, w9Var.f133616i) && Intrinsics.d(this.f133617j, w9Var.f133617j) && Intrinsics.d(this.f133618k, w9Var.f133618k);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133610c, a.cb.d(this.f133609b, this.f133608a.hashCode() * 31, 31), 31);
        Integer num = this.f133611d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f133612e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f133613f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        v9 v9Var = this.f133614g;
        int hashCode4 = (hashCode3 + (v9Var == null ? 0 : v9Var.hashCode())) * 31;
        List list = this.f133615h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f133616i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f133617j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f133618k;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f133608a);
        sb3.append(", id=");
        sb3.append(this.f133609b);
        sb3.append(", entityId=");
        sb3.append(this.f133610c);
        sb3.append(", pinCount=");
        sb3.append(this.f133611d);
        sb3.append(", privacy=");
        sb3.append(this.f133612e);
        sb3.append(", name=");
        sb3.append(this.f133613f);
        sb3.append(", owner=");
        sb3.append(this.f133614g);
        sb3.append(", pinThumbnailUrls=");
        sb3.append(this.f133615h);
        sb3.append(", imageCoverHdUrl=");
        sb3.append(this.f133616i);
        sb3.append(", hasCustomCover=");
        sb3.append(this.f133617j);
        sb3.append(", imageCoverUrl=");
        return a.a.p(sb3, this.f133618k, ")");
    }
}
