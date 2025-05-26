package yn2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class e implements Sequence, f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139547a;

    /* renamed from: b, reason: collision with root package name */
    public final Sequence f139548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139549c;

    public e(Sequence sequence, int i13, int i14) {
        this.f139547a = i14;
        if (i14 != 1) {
            Intrinsics.checkNotNullParameter(sequence, "sequence");
            this.f139548b = sequence;
            this.f139549c = i13;
            if (i13 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("count must be non-negative, but was " + i13 + '.').toString());
        }
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f139548b = sequence;
        this.f139549c = i13;
        if (i13 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i13 + '.').toString());
    }

    @Override // yn2.f
    public final Sequence a(int i13) {
        int i14 = this.f139547a;
        Sequence sequence = this.f139548b;
        int i15 = this.f139549c;
        switch (i14) {
            case 0:
                int i16 = i15 + i13;
                return i16 < 0 ? new e(this, i13, 0) : new e(sequence, i16, 0);
            default:
                return i13 >= i15 ? g.f139557a : new e0(sequence, i13, i15);
        }
    }

    @Override // yn2.f
    public final Sequence b(int i13) {
        int i14 = this.f139547a;
        Sequence sequence = this.f139548b;
        int i15 = this.f139549c;
        switch (i14) {
            case 0:
                int i16 = i15 + i13;
                return i16 < 0 ? new e(this, i13, 1) : new e0(sequence, i15, i16);
            default:
                return i13 >= i15 ? this : new e(sequence, i13, 1);
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f139547a) {
            case 0:
                return new d(this);
            default:
                return new d(this, 0);
        }
    }
}
