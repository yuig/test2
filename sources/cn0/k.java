package cn0;

/* loaded from: classes5.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final float f28081a;

    public k(float f13) {
        this.f28081a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Float.compare(this.f28081a, ((k) obj).f28081a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28081a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("ProgressChanged(progress="), this.f28081a, ")");
    }
}
