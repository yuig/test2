package mj0;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import j1.v0;
import kotlin.jvm.internal.Intrinsics;
import lh0.t;
import nx.d0;
import qa2.n;
import tj0.b0;
import tj0.w;
import uj2.q;
import xk2.m;
import xk2.v;
import yq0.z;
import z32.f2;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f87276a = {RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN};

    /* renamed from: b, reason: collision with root package name */
    public static final v f87277b = m.b(h.f87270i);

    public static void a(nr0.a delegateDataSource, wa2.i pinFeatureConfig, g oneTapSaveListener, boolean z13, f2 f2Var, t tVar, int i13) {
        if ((i13 & 16) != 0) {
            f2Var = null;
        }
        if ((i13 & 32) != 0) {
            tVar = null;
        }
        Intrinsics.checkNotNullParameter(delegateDataSource, "delegateDataSource");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        f2 f2Var2 = f2Var;
        t tVar2 = tVar;
        delegateDataSource.c(f87276a, new w(pinFeatureConfig, oneTapSaveListener, z13, f2Var2, tVar2, 1));
        delegateDataSource.o(160, new w(pinFeatureConfig, oneTapSaveListener, z13, f2Var2, tVar2, 0));
    }

    public static void b(z adapter, Context context, d0 pinalytics, n gridFeatureConfig, q networkStateStream, b0 oneTapSavePinVideoGridCellFactory) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(oneTapSavePinVideoGridCellFactory, "oneTapSavePinVideoGridCellFactory");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, dl2.b.m2(pinalytics, gridFeatureConfig, new i(context, adapter, pinalytics, gridFeatureConfig, 0)));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL, dl2.b.m2(pinalytics, gridFeatureConfig, new q4.h(oneTapSavePinVideoGridCellFactory, context, pinalytics, adapter, gridFeatureConfig, 3)));
        adapter.G(160, new v0(context, adapter, pinalytics, networkStateStream, 7));
        adapter.H(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN}, dl2.b.m2(pinalytics, gridFeatureConfig, new i(context, adapter, pinalytics, gridFeatureConfig, 1)));
        adapter.H(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN}, dl2.b.m2(pinalytics, gridFeatureConfig, new i(context, adapter, pinalytics, gridFeatureConfig, 2)));
    }
}
