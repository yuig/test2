package nm;

/* loaded from: classes.dex */
public final class u extends s {

    /* renamed from: a, reason: collision with root package name */
    public final pm.o f91366a = new pm.o(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof u) && ((u) obj).f91366a.equals(this.f91366a));
    }

    public final int hashCode() {
        return this.f91366a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f91366a.f100619d == 0;
    }

    public final void r(String str, s sVar) {
        if (sVar == null) {
            sVar = t.f91365a;
        }
        this.f91366a.put(str, sVar);
    }

    public final void s(Number number, String str) {
        r(str, number == null ? t.f91365a : new v(number));
    }

    public final void t(String str, Boolean bool) {
        r(str, bool == null ? t.f91365a : new v(bool));
    }

    public final void u(String str, String str2) {
        r(str, str2 == null ? t.f91365a : new v(str2));
    }

    public final s v(String str) {
        return (s) this.f91366a.get(str);
    }

    public final q w(String str) {
        return (q) this.f91366a.get(str);
    }

    public final u x(String str) {
        return (u) this.f91366a.get(str);
    }

    public final s y(String str) {
        return (s) this.f91366a.remove(str);
    }
}
