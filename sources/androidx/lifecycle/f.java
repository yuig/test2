package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface f extends y {
    default void onDestroy(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onPause(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onResume(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStart(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStop(z owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
