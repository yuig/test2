package fl1;

import dl1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements e {
    @Override // fl1.e
    public final s a(s oldModel, s newModel) {
        Intrinsics.checkNotNullParameter(oldModel, "oldModel");
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        return oldModel instanceof d ? ((d) oldModel).a(newModel) : newModel;
    }
}
