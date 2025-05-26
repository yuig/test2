package ql2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e extends b implements i {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final d f104102e = new d(null);

    static {
        new e((char) 1, (char) 0);
    }

    @Override // ql2.i
    public final Comparable c() {
        return Character.valueOf(this.f104095a);
    }

    @Override // ql2.i
    public final Comparable d() {
        return Character.valueOf(this.f104096b);
    }

    public final boolean e(char c13) {
        return Intrinsics.i(this.f104095a, c13) <= 0 && Intrinsics.i(c13, this.f104096b) <= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f104095a == eVar.f104095a) {
                    if (this.f104096b == eVar.f104096b) {
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
        return (this.f104095a * 31) + this.f104096b;
    }

    @Override // ql2.i
    public final boolean isEmpty() {
        return Intrinsics.i(this.f104095a, this.f104096b) > 0;
    }

    public final String toString() {
        return this.f104095a + ".." + this.f104096b;
    }
}
