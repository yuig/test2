package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1 extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
