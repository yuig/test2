package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f15887a = new e0();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull Function1<? super b, Unit> onBackStarted, @NotNull Function1<? super b, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
        Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
        Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new d0(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
