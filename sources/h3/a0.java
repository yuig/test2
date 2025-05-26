package h3;

/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66591c;

    public a0(float f13) {
        super(false, false, 3);
        this.f66591c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f66591c, ((a0) obj).f66591c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66591c);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("VerticalTo(y="), this.f66591c, ')');
    }
}
