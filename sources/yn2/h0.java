package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class h0 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f139564a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f139565b;

    public h0(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f139564a = sequence;
        this.f139565b = transformer;
    }

    public final k c(Function1 iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new k(this.f139564a, this.f139565b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g0(this);
    }
}
