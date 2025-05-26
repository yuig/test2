package h3;

/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66775c;

    public z(float f13) {
        super(false, false, 3);
        this.f66775c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f66775c, ((z) obj).f66775c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66775c);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("RelativeVerticalTo(dy="), this.f66775c, ')');
    }
}
