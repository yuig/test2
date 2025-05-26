package com.pinterest.feature.pin;

import android.animation.Animator;
import ey.l2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f47234a;

    public l(Animator animator) {
        this.f47234a = animator;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l2 navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f47234a.cancel();
    }
}
