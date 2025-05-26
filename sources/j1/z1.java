package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface z1 {
    Object a();

    default boolean b(Enum r23, Enum r33) {
        return Intrinsics.d(r23, c()) && Intrinsics.d(r33, a());
    }

    Object c();
}
