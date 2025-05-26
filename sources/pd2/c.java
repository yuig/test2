package pd2;

import a.cb;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class c extends u {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f99827e = {null, null, qd2.c.Companion.serializer()};

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99828b;

    /* renamed from: c, reason: collision with root package name */
    public final x f99829c;

    /* renamed from: d, reason: collision with root package name */
    public final qd2.c f99830d;

    public c(int i13, boolean z13, x xVar, qd2.c cVar) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, a.f99824b);
            throw null;
        }
        this.f99828b = z13;
        this.f99829c = (i13 & 2) == 0 ? new x(z13) : xVar;
        if ((i13 & 4) == 0) {
            this.f99830d = null;
        } else {
            this.f99830d = cVar;
        }
    }

    @Override // pd2.u
    public final p0 a() {
        return this.f99829c;
    }

    @Override // pd2.u
    public final qd2.c b() {
        return this.f99830d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f99828b == ((c) obj).f99828b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99828b);
    }

    public final String toString() {
        return cb.m(new StringBuilder("Bool(defaultValue="), this.f99828b, ')');
    }

    public c(boolean z13) {
        this.f99828b = z13;
        this.f99829c = new x(z13);
    }
}
