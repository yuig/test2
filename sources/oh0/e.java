package oh0;

import fk2.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f94467i = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c result = (c) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof b) {
            return m.f62459a;
        }
        if (result instanceof a) {
            return uj2.b.g(((a) result).a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
