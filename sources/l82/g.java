package l82;

import ao2.j0;
import ao2.v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface g extends u50.t {
    void e(j0 j0Var, h hVar, u50.r rVar);

    default CoroutineContext f(h effectRequest) {
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        ko2.f fVar = v0.f20219a;
        return ko2.e.f80326c;
    }
}
