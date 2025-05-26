package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f15881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f15882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f15883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f15884d;

    public d0(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.f15881a = function1;
        this.f15882b = function12;
        this.f15883c = function0;
        this.f15884d = function02;
    }

    public final void onBackCancelled() {
        this.f15884d.invoke();
    }

    public final void onBackInvoked() {
        this.f15883c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f15882b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f15881a.invoke(new b(backEvent));
    }
}
