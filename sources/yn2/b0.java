package yn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f139537a = new b0();

    public b0() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sequence p03 = (Sequence) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return p03.iterator();
    }
}
