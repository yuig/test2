package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class k implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f139572a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f139573b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f139574c;

    public k(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f139572a = sequence;
        this.f139573b = transformer;
        this.f139574c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new j(this);
    }
}
