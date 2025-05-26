package h3;

/* loaded from: classes.dex */
public final class t extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66760c;

    public t(float f13) {
        super(false, false, 3);
        this.f66760c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f66760c, ((t) obj).f66760c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66760c);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("RelativeHorizontalTo(dx="), this.f66760c, ')');
    }
}
