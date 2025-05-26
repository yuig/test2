package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ql2.i;
import ql2.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "Lql2/i;", "", "", "e", "ql2/l", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class IntRange extends a implements i {

    /* renamed from: e */
    @NotNull
    public static final l f80450e = new l(null);

    /* renamed from: f */
    public static final IntRange f80451f = new IntRange(1, 0, 1);

    @Override // ql2.i
    public final Comparable c() {
        return Integer.valueOf(this.f80453a);
    }

    @Override // ql2.i
    public final Comparable d() {
        return Integer.valueOf(this.f80454b);
    }

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (this.f80453a == intRange.f80453a) {
                    if (this.f80454b == intRange.f80454b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f(int i13) {
        return this.f80453a <= i13 && i13 <= this.f80454b;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f80453a * 31) + this.f80454b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean i(Comparable comparable) {
        return f(((Number) comparable).intValue());
    }

    @Override // kotlin.ranges.a, ql2.i
    public final boolean isEmpty() {
        return this.f80453a > this.f80454b;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f80453a + ".." + this.f80454b;
    }
}
