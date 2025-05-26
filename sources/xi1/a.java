package xi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements wi1.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f135025a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f135026b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.c f135027c;

    /* renamed from: d, reason: collision with root package name */
    public final rm1.c f135028d;

    /* renamed from: e, reason: collision with root package name */
    public final b f135029e;

    public a(vn1.c cVar, rm1.c cVar2, b chinCTADrawableDisplayState) {
        Intrinsics.checkNotNullParameter(chinCTADrawableDisplayState, "chinCTADrawableDisplayState");
        this.f135025a = false;
        this.f135026b = null;
        this.f135027c = cVar;
        this.f135028d = cVar2;
        this.f135029e = chinCTADrawableDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135025a == aVar.f135025a && Intrinsics.d(this.f135026b, aVar.f135026b) && this.f135027c == aVar.f135027c && this.f135028d == aVar.f135028d && Intrinsics.d(this.f135029e, aVar.f135029e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f135025a) * 31;
        Integer num = this.f135026b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        vn1.c cVar = this.f135027c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        rm1.c cVar2 = this.f135028d;
        return this.f135029e.hashCode() + ((hashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChinCTADisplayState(shouldAnimateChinCTA=" + this.f135025a + ", backgroundColor=" + this.f135026b + ", endingTextColor=" + this.f135027c + ", endingIconColor=" + this.f135028d + ", chinCTADrawableDisplayState=" + this.f135029e + ")";
    }
}
