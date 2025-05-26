package c61;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f26610a;

    public l1(m1 m1Var) {
        this.f26610a = m1Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.m tabDeepLinkEvent) {
        Intrinsics.checkNotNullParameter(tabDeepLinkEvent, "tabDeepLinkEvent");
        if (tabDeepLinkEvent.f106397a != u70.a.SEARCH) {
            return;
        }
        m1 m1Var = this.f26610a;
        m1Var.f26622k.i(tabDeepLinkEvent);
        m1Var.h(tabDeepLinkEvent.f106398b.getBoolean("com.pinterest.EXTRA_SEARCH_SHOULD_MOCK_MODULES", false));
    }
}
