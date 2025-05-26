package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139538a;

    /* renamed from: b, reason: collision with root package name */
    public final Sequence f139539b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f139540c;

    public c(Sequence sequence, Function1 predicate, int i13) {
        this.f139538a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(sequence, "source");
            Intrinsics.checkNotNullParameter(predicate, "keySelector");
            this.f139539b = sequence;
            this.f139540c = predicate;
            return;
        }
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f139539b = sequence;
        this.f139540c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f139538a) {
            case 0:
                return new b(this.f139539b.iterator(), this.f139540c);
            default:
                return new f0(this);
        }
    }
}
