package ql2;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final float f104105a;

    /* renamed from: b, reason: collision with root package name */
    public final float f104106b;

    public g(float f13, float f14) {
        this.f104105a = f13;
        this.f104106b = f14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        return floatValue >= this.f104105a && floatValue <= this.f104106b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ql2.h
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // ql2.i
    public final Comparable c() {
        return Float.valueOf(this.f104105a);
    }

    @Override // ql2.i
    public final Comparable d() {
        return Float.valueOf(this.f104106b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f104105a != gVar.f104105a || this.f104106b != gVar.f104106b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f104105a) * 31) + Float.hashCode(this.f104106b);
    }

    @Override // ql2.i
    public final boolean isEmpty() {
        return this.f104105a > this.f104106b;
    }

    public final String toString() {
        return this.f104105a + ".." + this.f104106b;
    }
}
