package yq0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import org.jetbrains.annotations.NotNull;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a {
    public Context context;
    public nr0.c goToHomefeedListener;
    public qa2.n gridFeatureConfig;
    public uj2.q<Boolean> networkStateStream;
    public qa2.j0 pinGridCellFactory;
    public nx.d0 pinalytics;
    public ao2.j0 scope;
    public d1 trackingParamAttacher;
    public x2 userRepository;

    @NotNull
    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.r("context");
        throw null;
    }

    public abstract Function0 getCreator();

    @NotNull
    public final nr0.c getGoToHomefeedListener() {
        nr0.c cVar = this.goToHomefeedListener;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("goToHomefeedListener");
        throw null;
    }

    @NotNull
    public final qa2.n getGridFeatureConfig() {
        qa2.n nVar = this.gridFeatureConfig;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.r("gridFeatureConfig");
        throw null;
    }

    @NotNull
    public final uj2.q<Boolean> getNetworkStateStream() {
        uj2.q<Boolean> qVar = this.networkStateStream;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("networkStateStream");
        throw null;
    }

    @NotNull
    public final qa2.j0 getPinGridCellFactory() {
        qa2.j0 j0Var = this.pinGridCellFactory;
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.r("pinGridCellFactory");
        throw null;
    }

    @NotNull
    public final nx.d0 getPinalytics() {
        nx.d0 d0Var = this.pinalytics;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("pinalytics");
        throw null;
    }

    @NotNull
    public final ao2.j0 getScope() {
        ao2.j0 j0Var = this.scope;
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.r("scope");
        throw null;
    }

    @NotNull
    public final d1 getTrackingParamAttacher() {
        d1 d1Var = this.trackingParamAttacher;
        if (d1Var != null) {
            return d1Var;
        }
        Intrinsics.r("trackingParamAttacher");
        throw null;
    }

    @NotNull
    public final x2 getUserRepository() {
        x2 x2Var = this.userRepository;
        if (x2Var != null) {
            return x2Var;
        }
        Intrinsics.r("userRepository");
        throw null;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setGoToHomefeedListener(@NotNull nr0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.goToHomefeedListener = cVar;
    }

    public final void setGridFeatureConfig(@NotNull qa2.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.gridFeatureConfig = nVar;
    }

    public final void setNetworkStateStream(@NotNull uj2.q<Boolean> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.networkStateStream = qVar;
    }

    public final void setPinGridCellFactory(@NotNull qa2.j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.pinGridCellFactory = j0Var;
    }

    public final void setPinalytics(@NotNull nx.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.pinalytics = d0Var;
    }

    public final void setScope(@NotNull ao2.j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.scope = j0Var;
    }

    public final void setTrackingParamAttacher(@NotNull d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<set-?>");
        this.trackingParamAttacher = d1Var;
    }

    public final void setUserRepository(@NotNull x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "<set-?>");
        this.userRepository = x2Var;
    }
}
