package ul2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 extends e {
    @Override // ul2.e, am2.o
    public final Object a(am2.l descriptor, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        throw new IllegalStateException("No constructors should appear here: " + descriptor);
    }
}
