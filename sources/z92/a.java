package z92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f141417e = new a(null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final g f141418a;

    /* renamed from: b, reason: collision with root package name */
    public final g f141419b;

    /* renamed from: c, reason: collision with root package name */
    public final d f141420c;

    /* renamed from: d, reason: collision with root package name */
    public final d f141421d;

    public a(g gVar, g gVar2, d dVar, d dVar2) {
        this.f141418a = gVar;
        this.f141419b = gVar2;
        this.f141420c = dVar;
        this.f141421d = dVar2;
    }

    public final g a() {
        return this.f141418a;
    }

    public final d b() {
        return this.f141420c;
    }

    public final g c() {
        return this.f141419b;
    }

    public final d d() {
        return this.f141421d;
    }

    public final boolean e() {
        if (Intrinsics.d(this, f141417e)) {
            return false;
        }
        return (this.f141418a == null && this.f141419b == null && this.f141420c == null && this.f141421d == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f141418a, aVar.f141418a) && Intrinsics.d(this.f141419b, aVar.f141419b) && Intrinsics.d(this.f141420c, aVar.f141420c) && Intrinsics.d(this.f141421d, aVar.f141421d);
    }

    public final int hashCode() {
        g gVar = this.f141418a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        g gVar2 = this.f141419b;
        int hashCode2 = (hashCode + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        d dVar = this.f141420c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f141421d;
        return hashCode3 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public final String toString() {
        return "LegoActionBarState(leftActionItem=" + this.f141418a + ", rightActionItem=" + this.f141419b + ", primaryActionItem=" + this.f141420c + ", secondaryActionItem=" + this.f141421d + ")";
    }
}
