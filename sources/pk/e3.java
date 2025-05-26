package pk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class e3 extends t2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f100385a;

    public e3(t2 t2Var) {
        t2Var.getClass();
        this.f100385a = t2Var;
    }

    @Override // pk.t2
    public final t2 a() {
        return this.f100385a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f100385a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e3) {
            return this.f100385a.equals(((e3) obj).f100385a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f100385a.hashCode();
    }

    public final String toString() {
        return this.f100385a + ".reverse()";
    }
}
