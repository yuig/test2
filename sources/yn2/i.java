package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class i implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f139566a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139567b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f139568c;

    public i(Sequence sequence, boolean z13, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f139566a = sequence;
        this.f139567b = z13;
        this.f139568c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new h(this);
    }
}
