package j40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements p40.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f74616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74617b;

    /* renamed from: c, reason: collision with root package name */
    public final String f74618c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f74619d;

    /* renamed from: e, reason: collision with root package name */
    public final String f74620e;

    /* renamed from: f, reason: collision with root package name */
    public final String f74621f;

    /* renamed from: g, reason: collision with root package name */
    public final p f74622g;

    public q(String __typename, String id3, String entityId, Boolean bool, String str, String str2, p pVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f74616a = __typename;
        this.f74617b = id3;
        this.f74618c = entityId;
        this.f74619d = bool;
        this.f74620e = str;
        this.f74621f = str2;
        this.f74622g = pVar;
    }

    @Override // p40.b
    public final String a() {
        return this.f74618c;
    }

    @Override // p40.b
    public final String b() {
        return this.f74616a;
    }

    @Override // p40.b
    public final Boolean c() {
        return this.f74619d;
    }

    @Override // p40.b
    public final p40.a d() {
        return this.f74622g;
    }

    @Override // p40.b
    public final String e() {
        return this.f74620e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f74616a, qVar.f74616a) && Intrinsics.d(this.f74617b, qVar.f74617b) && Intrinsics.d(this.f74618c, qVar.f74618c) && Intrinsics.d(this.f74619d, qVar.f74619d) && Intrinsics.d(this.f74620e, qVar.f74620e) && Intrinsics.d(this.f74621f, qVar.f74621f) && Intrinsics.d(this.f74622g, qVar.f74622g);
    }

    @Override // p40.b
    public final String getId() {
        return this.f74617b;
    }

    @Override // p40.b
    public final String getName() {
        return this.f74621f;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f74618c, cb.d(this.f74617b, this.f74616a.hashCode() * 31, 31), 31);
        Boolean bool = this.f74619d;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f74620e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74621f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.f74622g;
        return hashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.f74616a + ", id=" + this.f74617b + ", entityId=" + this.f74618c + ", isFollowed=" + this.f74619d + ", backgroundColor=" + this.f74620e + ", name=" + this.f74621f + ", images=" + this.f74622g + ")";
    }
}
