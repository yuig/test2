package om0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.f f96556a;

    public p(qb0.f numberFormatter) {
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        this.f96556a = numberFormatter;
    }

    public final u50.j0 b(int i13) {
        int i14 = d70.f.plural_pins_string;
        ((qb0.a) this.f96556a).getClass();
        List formatArgs = kotlin.collections.e0.b(qb0.j.b(i13));
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new u50.j0(i14, i13, formatArgs);
    }
}
