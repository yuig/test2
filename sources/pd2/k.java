package pd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class k extends u {

    @NotNull
    public static final j Companion = new j();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f99848e = {null, qd2.l.Companion.serializer(), null};

    /* renamed from: b, reason: collision with root package name */
    public final float f99849b;

    /* renamed from: c, reason: collision with root package name */
    public final qd2.l f99850c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f99851d;

    public /* synthetic */ k(float f13) {
        this(f13, null);
    }

    @Override // pd2.u
    public final p0 a() {
        return this.f99851d;
    }

    @Override // pd2.u
    public final qd2.c b() {
        return this.f99850c;
    }

    public final k c(float f13, float f14) {
        return new k(this.f99849b, new qd2.f(f13, f14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f99849b, kVar.f99849b) == 0 && Intrinsics.d(this.f99850c, kVar.f99850c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f99849b) * 31;
        qd2.l lVar = this.f99850c;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "Float(defaultValue=" + this.f99849b + ", limits=" + this.f99850c + ')';
    }

    public k(int i13, float f13, qd2.l lVar, f0 f0Var) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, i.f99844b);
            throw null;
        }
        this.f99849b = f13;
        if ((i13 & 2) == 0) {
            this.f99850c = null;
        } else {
            this.f99850c = lVar;
        }
        if ((i13 & 4) == 0) {
            this.f99851d = new f0(f13);
        } else {
            this.f99851d = f0Var;
        }
    }

    public k(float f13, qd2.l lVar) {
        this.f99849b = f13;
        this.f99850c = lVar;
        this.f99851d = new f0(f13);
    }
}
