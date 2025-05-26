package pk;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z extends t2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final ok.t f100525a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f100526b;

    public z(ok.t tVar, t2 t2Var) {
        tVar.getClass();
        this.f100525a = tVar;
        t2Var.getClass();
        this.f100526b = t2Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ok.t tVar = this.f100525a;
        return this.f100526b.compare(tVar.apply(obj), tVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f100525a.equals(zVar.f100525a) && this.f100526b.equals(zVar.f100526b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f100525a, this.f100526b});
    }

    public final String toString() {
        return this.f100526b + ".onResultOf(" + this.f100525a + ")";
    }
}
