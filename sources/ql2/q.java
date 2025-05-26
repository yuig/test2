package ql2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class q extends n implements i {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final p f104119e = new p(null);

    @Override // ql2.i
    public final Comparable c() {
        return Long.valueOf(this.f104112a);
    }

    @Override // ql2.i
    public final Comparable d() {
        return Long.valueOf(this.f104113b);
    }

    public final boolean e(long j13) {
        return this.f104112a <= j13 && j13 <= this.f104113b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (!isEmpty() || !((q) obj).isEmpty()) {
                q qVar = (q) obj;
                if (this.f104112a == qVar.f104112a) {
                    if (this.f104113b == qVar.f104113b) {
                    }
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
        long j13 = this.f104112a;
        long j14 = 31 * (j13 ^ (j13 >>> 32));
        long j15 = this.f104113b;
        return (int) (j14 + (j15 ^ (j15 >>> 32)));
    }

    @Override // ql2.i
    public final boolean isEmpty() {
        return this.f104112a > this.f104113b;
    }

    public final String toString() {
        return this.f104112a + ".." + this.f104113b;
    }
}
