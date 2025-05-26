package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class m implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139579a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139580b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.g f139581c;

    public m(Sequence sequence, Function2 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f139580b = sequence;
        this.f139581c = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f139579a) {
            case 0:
                return new l(this, 0);
            default:
                return new l(this);
        }
    }

    public m(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f139580b = getInitialValue;
        this.f139581c = getNextValue;
    }
}
