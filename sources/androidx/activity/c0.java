package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f15878a = new c0();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull final Function0<Unit> onBackInvoked) {
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: androidx.activity.b0
            public final void onBackInvoked() {
                Function0 onBackInvoked2 = Function0.this;
                Intrinsics.checkNotNullParameter(onBackInvoked2, "$onBackInvoked");
                onBackInvoked2.invoke();
            }
        };
    }

    public final void b(@NotNull Object dispatcher, int i13, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i13, (OnBackInvokedCallback) callback);
    }

    public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
