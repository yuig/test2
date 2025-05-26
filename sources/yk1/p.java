package yk1;

import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class p extends b {

    @NotNull
    private xj2.b disposables;
    private boolean isInitialSubscriptionValue;

    @NotNull
    private final xu1.f networkStateManager;

    @NotNull
    private final uj2.q<Boolean> networkStateStream;

    @NotNull
    private final uk1.d presenterPinalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uk1.d presenterPinalytics, uj2.q networkStateStream) {
        super(0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.presenterPinalytics = presenterPinalytics;
        this.networkStateStream = networkStateStream;
        this.networkStateManager = new xu1.f();
        this.disposables = new xj2.b();
        this.isInitialSubscriptionValue = true;
    }

    public abstract void bindPinalytics(r rVar);

    @NotNull
    public final uj2.q<Boolean> getNetworkStateStream() {
        return this.networkStateStream;
    }

    @NotNull
    public d0 getPinalytics() {
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        return d0Var;
    }

    @NotNull
    public uk1.d getPresenterPinalytics() {
        return this.presenterPinalytics;
    }

    public String getUniqueViewKey() {
        return null;
    }

    public final boolean hasInternet() {
        return this.networkStateManager.f135957a.get();
    }

    public void initNetworkObserver() {
        this.disposables.a(this.networkStateStream.A(wj2.c.a()).H(tk2.e.f118017c).F(new com.pinterest.feature.home.model.h(10, new hk1.t(this, 1)), new com.pinterest.feature.home.model.h(11, o.f139233i), ck2.i.f27923c, ck2.i.f27924d));
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public void r3(r view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((n) view);
        rebindPinalytics(view);
        initNetworkObserver();
    }

    public void onNetworkLost() {
    }

    public void onNetworkRegained() {
    }

    public final void onNetworkStateChange(boolean z13) {
        this.networkStateManager.a(z13);
        if (this.isInitialSubscriptionValue) {
            this.isInitialSubscriptionValue = false;
        } else if (isBound()) {
            if (z13) {
                onNetworkRegained();
            } else {
                onNetworkLost();
            }
        }
    }

    @Override // yk1.b
    public void onUnbind() {
        this.isInitialSubscriptionValue = true;
        this.disposables.dispose();
        this.disposables = new xj2.b();
        unbindPinalytics();
        super.onUnbind();
    }

    public final void rebindPinalytics(@NotNull r view) {
        Intrinsics.checkNotNullParameter(view, "view");
        bindPinalytics(view);
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        view.setPinalytics(d0Var);
    }

    public abstract void unbindPinalytics();
}
