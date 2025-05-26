package pk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q0 extends d7.b0 {
    @Override // d7.b0
    public final d7.b0 e(Object obj, Object obj2) {
        super.e(obj, obj2);
        return this;
    }

    @Override // d7.b0
    public final void f(Map.Entry entry) {
        super.f(entry);
    }

    @Override // d7.b0
    public final d7.b0 g(Iterable iterable) {
        throw null;
    }

    @Override // d7.b0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final u2 a() {
        int i13 = this.f53787a;
        if (i13 == 0) {
            return u2.f100492i;
        }
        if (((Comparator) this.f53789c) != null) {
            if (this.f53788b) {
                this.f53790d = Arrays.copyOf((Object[]) this.f53790d, i13 * 2);
            }
            d7.b0.k(this.f53787a, (Comparator) this.f53789c, (Object[]) this.f53790d);
        }
        this.f53788b = true;
        return new u2(this.f53787a, (Object[]) this.f53790d);
    }

    public final void n(String str, Integer num) {
        super.e(str, num);
    }
}
