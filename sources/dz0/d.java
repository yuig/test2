package dz0;

import android.content.Context;
import androidx.appcompat.widget.c2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ez0.i;
import ez0.j;
import i91.u;
import kotlin.jvm.internal.Intrinsics;
import lh0.l2;
import nx.d0;
import q4.h;
import qa2.n;
import uj2.q;
import xk2.m;
import xk2.v;
import yq0.z;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final v f56657d = m.b(b.f56650i);

    /* renamed from: a, reason: collision with root package name */
    public final j f56658a;

    /* renamed from: b, reason: collision with root package name */
    public final i f56659b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f56660c;

    public d(j oneTapPinVideoGridCellFactory, i oneTapPinGridCellFactory, l2 oneTapLibraryExperiments, c2 sharesheetUtils) {
        Intrinsics.checkNotNullParameter(oneTapPinVideoGridCellFactory, "oneTapPinVideoGridCellFactory");
        Intrinsics.checkNotNullParameter(oneTapPinGridCellFactory, "oneTapPinGridCellFactory");
        Intrinsics.checkNotNullParameter(oneTapLibraryExperiments, "oneTapLibraryExperiments");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f56658a = oneTapPinVideoGridCellFactory;
        this.f56659b = oneTapPinGridCellFactory;
        this.f56660c = sharesheetUtils;
    }

    public final void a(z adapter, Context context, d0 pinalytics, n gridFeatureConfig, q networkStateStream, u style) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(style, "style");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, new c(this, context, adapter, pinalytics, style));
        adapter.H(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN}, dl2.b.m2(pinalytics, gridFeatureConfig, new c(this, context, pinalytics, style, adapter)));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL, new h(context, adapter, pinalytics, networkStateStream, style, 5));
    }
}
