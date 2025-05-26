package yn2;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class n implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139582a;

    /* renamed from: b, reason: collision with root package name */
    public final Sequence f139583b;

    public n(Sequence sequence, int i13) {
        this.f139582a = i13;
        if (i13 == 1) {
            this.f139583b = sequence;
        } else {
            Intrinsics.checkNotNullParameter(sequence, "sequence");
            this.f139583b = sequence;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f139582a) {
            case 0:
                return new d(this);
            default:
                ArrayList u13 = c0.u(this.f139583b);
                j0.s(u13);
                return u13.iterator();
        }
    }
}
