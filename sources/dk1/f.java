package dk1;

import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f55163i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b state = (b) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        q0 pieceDisplayStates = q0.f80391a;
        state.getClass();
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        return new b(pieceDisplayStates);
    }
}
