package tu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j0 cronetEngineFactory, tb0.h crashReporting, v libraryInstaller) {
        super(cronetEngineFactory, crashReporting, libraryInstaller);
        Intrinsics.checkNotNullParameter(cronetEngineFactory, "cronetEngineFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(libraryInstaller, "libraryInstaller");
    }
}
