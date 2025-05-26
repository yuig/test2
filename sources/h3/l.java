package h3;

/* loaded from: classes.dex */
public final class l extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66732c;

    public l(float f13) {
        super(false, false, 3);
        this.f66732c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f66732c, ((l) obj).f66732c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66732c);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("HorizontalTo(x="), this.f66732c, ')');
    }
}
