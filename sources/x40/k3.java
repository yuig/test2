package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k3 implements z40.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f132649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132651c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f132652d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f132653e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132654f;

    /* renamed from: g, reason: collision with root package name */
    public final j3 f132655g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132656h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132657i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f132658j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132659k;

    public k3(String __typename, String id3, String entityId, Integer num, Object obj, String str, j3 j3Var, List list, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132649a = __typename;
        this.f132650b = id3;
        this.f132651c = entityId;
        this.f132652d = num;
        this.f132653e = obj;
        this.f132654f = str;
        this.f132655g = j3Var;
        this.f132656h = list;
        this.f132657i = str2;
        this.f132658j = bool;
        this.f132659k = str3;
    }

    @Override // z40.o
    public final String a() {
        return this.f132651c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return Intrinsics.d(this.f132649a, k3Var.f132649a) && Intrinsics.d(this.f132650b, k3Var.f132650b) && Intrinsics.d(this.f132651c, k3Var.f132651c) && Intrinsics.d(this.f132652d, k3Var.f132652d) && Intrinsics.d(this.f132653e, k3Var.f132653e) && Intrinsics.d(this.f132654f, k3Var.f132654f) && Intrinsics.d(this.f132655g, k3Var.f132655g) && Intrinsics.d(this.f132656h, k3Var.f132656h) && Intrinsics.d(this.f132657i, k3Var.f132657i) && Intrinsics.d(this.f132658j, k3Var.f132658j) && Intrinsics.d(this.f132659k, k3Var.f132659k);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132651c, a.cb.d(this.f132650b, this.f132649a.hashCode() * 31, 31), 31);
        Integer num = this.f132652d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f132653e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f132654f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        j3 j3Var = this.f132655g;
        int hashCode4 = (hashCode3 + (j3Var == null ? 0 : j3Var.hashCode())) * 31;
        List list = this.f132656h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f132657i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f132658j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f132659k;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f132649a);
        sb3.append(", id=");
        sb3.append(this.f132650b);
        sb3.append(", entityId=");
        sb3.append(this.f132651c);
        sb3.append(", pinCount=");
        sb3.append(this.f132652d);
        sb3.append(", privacy=");
        sb3.append(this.f132653e);
        sb3.append(", name=");
        sb3.append(this.f132654f);
        sb3.append(", owner=");
        sb3.append(this.f132655g);
        sb3.append(", pinThumbnailUrls=");
        sb3.append(this.f132656h);
        sb3.append(", imageCoverHdUrl=");
        sb3.append(this.f132657i);
        sb3.append(", hasCustomCover=");
        sb3.append(this.f132658j);
        sb3.append(", imageCoverUrl=");
        return a.a.p(sb3, this.f132659k, ")");
    }
}
