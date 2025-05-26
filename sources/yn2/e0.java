package yn2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class e0 implements Sequence, f {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f139550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139552c;

    public e0(Sequence sequence, int i13, int i14) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f139550a = sequence;
        this.f139551b = i13;
        this.f139552c = i14;
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("startIndex should be non-negative, but is ", i13).toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException(a.a.d("endIndex should be non-negative, but is ", i14).toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(a.a.f("endIndex should be not less than startIndex, but was ", i14, " < ", i13).toString());
        }
    }

    @Override // yn2.f
    public final Sequence a(int i13) {
        int i14 = this.f139552c;
        int i15 = this.f139551b;
        if (i13 >= i14 - i15) {
            return g.f139557a;
        }
        return new e0(this.f139550a, i15 + i13, i14);
    }

    @Override // yn2.f
    public final Sequence b(int i13) {
        int i14 = this.f139552c;
        int i15 = this.f139551b;
        if (i13 >= i14 - i15) {
            return this;
        }
        return new e0(this.f139550a, i15, i13 + i15);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new d0(this);
    }
}
