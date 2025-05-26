package uf2;

import ei2.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v destination, lh2.b logger, wf2.c limitStrategy) {
        super(destination, logger, limitStrategy);
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(limitStrategy, "limitStrategy");
    }

    public final boolean g(Function0 inputValidation, Function1 captureAction, boolean z13) {
        Intrinsics.checkNotNullParameter(inputValidation, "inputValidation");
        Intrinsics.checkNotNullParameter(captureAction, "captureAction");
        return f(inputValidation, captureAction, z13);
    }
}
