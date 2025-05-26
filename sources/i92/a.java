package i92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface a {
    static void a(a aVar, String message, boolean z13, int i13) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        k kVar = (k) aVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        k.f(kVar, message, 7000, false, z13, 4);
    }
}
