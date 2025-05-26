package n4;

/* loaded from: classes.dex */
public final class l implements o4.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f89187a;

    public l(float f13) {
        this.f89187a = f13;
    }

    @Override // o4.a
    public final float a(float f13) {
        return f13 / this.f89187a;
    }

    @Override // o4.a
    public final float b(float f13) {
        return f13 * this.f89187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f89187a, ((l) obj).f89187a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89187a);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f89187a, ')');
    }
}
