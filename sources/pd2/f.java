package pd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f extends u {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f99835e = {null, null, qd2.c.Companion.serializer()};

    /* renamed from: b, reason: collision with root package name */
    public final id2.c f99836b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f99837c;

    /* renamed from: d, reason: collision with root package name */
    public final qd2.c f99838d;

    public f(int i13, id2.c cVar, a0 a0Var, qd2.c cVar2) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, d.f99832b);
            throw null;
        }
        this.f99836b = cVar;
        this.f99837c = (i13 & 2) == 0 ? new a0(cVar) : a0Var;
        if ((i13 & 4) == 0) {
            this.f99838d = null;
        } else {
            this.f99838d = cVar2;
        }
    }

    @Override // pd2.u
    public final p0 a() {
        return this.f99837c;
    }

    @Override // pd2.u
    public final qd2.c b() {
        return this.f99838d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f99836b, ((f) obj).f99836b);
    }

    public final int hashCode() {
        return this.f99836b.hashCode();
    }

    public final String toString() {
        return "Color(defaultValue=" + this.f99836b + ')';
    }

    public f(id2.c defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f99836b = defaultValue;
        this.f99837c = new a0(defaultValue);
    }
}
