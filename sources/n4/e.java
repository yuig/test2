package n4;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f89174b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f89175a;

    public static final boolean a(float f13, float f14) {
        return Float.compare(f13, f14) == 0;
    }

    public static String b(float f13) {
        if (Float.isNaN(f13)) {
            return "Dp.Unspecified";
        }
        return f13 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f89175a, ((e) obj).f89175a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f89175a, ((e) obj).f89175a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89175a);
    }

    public final String toString() {
        return b(this.f89175a);
    }
}
