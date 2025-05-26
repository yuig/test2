package bc2;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f22657a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22658b;

    /* renamed from: c, reason: collision with root package name */
    public final d4 f22659c;

    /* renamed from: d, reason: collision with root package name */
    public final a4 f22660d;

    /* renamed from: e, reason: collision with root package name */
    public final q f22661e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f22662f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22663g;

    public k(String str, float f13, d4 d4Var, a4 a4Var, q qVar, Long l13) {
        this.f22657a = str;
        this.f22658b = f13;
        this.f22659c = d4Var;
        this.f22660d = a4Var;
        this.f22661e = qVar;
        this.f22662f = l13;
        this.f22663g = qVar.f22673b.f22665b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f22657a, kVar.f22657a) && Float.compare(this.f22658b, kVar.f22658b) == 0 && this.f22659c == kVar.f22659c && this.f22660d == kVar.f22660d && Intrinsics.d(this.f22661e, kVar.f22661e) && Intrinsics.d(this.f22662f, kVar.f22662f);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f22658b, this.f22657a.hashCode() * 31, 31);
        d4 d4Var = this.f22659c;
        int hashCode = (a13 + (d4Var == null ? 0 : d4Var.hashCode())) * 31;
        a4 a4Var = this.f22660d;
        int hashCode2 = (this.f22661e.hashCode() + ((hashCode + (a4Var == null ? 0 : a4Var.hashCode())) * 31)) * 31;
        Long l13 = this.f22662f;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "VideoMetadata(uid=" + this.f22657a + ", aspectRatio=" + this.f22658b + ", viewType=" + this.f22659c + ", viewParameterType=" + this.f22660d + ", videoTracks=" + this.f22661e + ", clipEndPositionMs=" + this.f22662f + ")";
    }
}
