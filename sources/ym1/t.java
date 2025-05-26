package ym1;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final e f139456a;

    public t(e eVar) {
        this.f139456a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f139456a == ((t) obj).f139456a;
        }
        return false;
    }

    public final int hashCode() {
        e eVar = this.f139456a;
        return Boolean.hashCode(true) + ((eVar == null ? 0 : eVar.hashCode()) * 31);
    }

    public final String toString() {
        return "PopoverConfig(idealPosition=" + this.f139456a + ", dismissOnOutsideTouch=true)";
    }
}
