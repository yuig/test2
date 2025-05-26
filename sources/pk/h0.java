package pk;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class h0 extends j0 {
    public static j0 f(int i13) {
        return i13 < 0 ? j0.f100433b : i13 > 0 ? j0.f100434c : j0.f100432a;
    }

    @Override // pk.j0
    public final j0 a(int i13, int i14) {
        return f(Integer.compare(i13, i14));
    }

    @Override // pk.j0
    public final j0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // pk.j0
    public final j0 c(boolean z13, boolean z14) {
        return f(Boolean.compare(z13, z14));
    }

    @Override // pk.j0
    public final j0 d(boolean z13, boolean z14) {
        return f(Boolean.compare(z14, z13));
    }

    @Override // pk.j0
    public final int e() {
        return 0;
    }
}
