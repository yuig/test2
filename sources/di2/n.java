package di2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum n {
    INITIAL,
    END_MANUAL,
    ON_FOREGROUND,
    ON_BACKGROUND,
    CRASH;

    @NotNull
    public final bi2.f endState(@NotNull bi2.f currentState) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        int i13 = m.f55106a[ordinal()];
        return i13 != 1 ? i13 != 2 ? currentState : bi2.f.BACKGROUND : bi2.f.FOREGROUND;
    }

    @NotNull
    public final th2.i lifeEventType(@NotNull bi2.f currentState) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return m.f55106a[ordinal()] == 3 ? m.f55107b[currentState.ordinal()] == 1 ? th2.i.MANUAL : th2.i.BKGND_MANUAL : m.f55107b[currentState.ordinal()] == 1 ? th2.i.STATE : th2.i.BKGND_STATE;
    }
}
