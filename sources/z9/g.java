package z9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f141184a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f141185b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f141186c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f141187d;

    public g(o0 type, boolean z13, Object obj, boolean z14) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.f141253a && z13) {
            throw new IllegalArgumentException(type.b().concat(" does not allow nullable values").toString());
        }
        if (!z13 && z14 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f141184a = type;
        this.f141185b = z13;
        this.f141187d = obj;
        this.f141186c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(g.class, obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f141185b != gVar.f141185b || this.f141186c != gVar.f141186c || !Intrinsics.d(this.f141184a, gVar.f141184a)) {
            return false;
        }
        Object obj2 = gVar.f141187d;
        Object obj3 = this.f141187d;
        return obj3 != null ? Intrinsics.d(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f141184a.hashCode() * 31) + (this.f141185b ? 1 : 0)) * 31) + (this.f141186c ? 1 : 0)) * 31;
        Object obj = this.f141187d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(g.class.getSimpleName());
        sb3.append(" Type: " + this.f141184a);
        sb3.append(" Nullable: " + this.f141185b);
        if (this.f141186c) {
            sb3.append(" DefaultValue: " + this.f141187d);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
