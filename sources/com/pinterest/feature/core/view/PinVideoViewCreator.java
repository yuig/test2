package com.pinterest.feature.core.view;

import android.view.View;
import androidx.annotation.Keep;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import qa2.j0;
import yq0.a;
import yq0.k;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/core/view/PinVideoViewCreator;", "Lyq0/a;", "Lqa2/j0;", "customPinGridCellFactory", "Lqa2/j0;", "", "excludeVR", "Z", "Lkotlin/Function0;", "Landroid/view/View;", "getCreator", "()Lkotlin/jvm/functions/Function0;", "creator", "<init>", "(Lqa2/j0;Z)V", "viewCreatorsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinVideoViewCreator extends a {
    private final j0 customPinGridCellFactory;
    private final boolean excludeVR;

    public PinVideoViewCreator() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // yq0.a
    @NotNull
    public Function0<View> getCreator() {
        return b.m2(getPinalytics(), getGridFeatureConfig(), new k(this, 0));
    }

    public PinVideoViewCreator(j0 j0Var, boolean z13) {
        this.customPinGridCellFactory = j0Var;
        this.excludeVR = z13;
    }

    public /* synthetic */ PinVideoViewCreator(j0 j0Var, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : j0Var, (i13 & 2) != 0 ? false : z13);
    }
}
