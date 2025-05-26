package zk;

import java.util.Objects;
import uk.q;

/* loaded from: classes3.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f142074a;

    /* renamed from: b, reason: collision with root package name */
    public final e f142075b;

    public f(int i13, e eVar) {
        this.f142074a = i13;
        this.f142075b = eVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f142075b != e.f142072d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f142074a == this.f142074a && fVar.f142075b == this.f142075b;
    }

    public final int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f142074a), this.f142075b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesSiv Parameters (variant: ");
        sb3.append(this.f142075b);
        sb3.append(", ");
        return a.a.n(sb3, this.f142074a, "-byte key)");
    }
}
