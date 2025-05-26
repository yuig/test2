package com.pinterest.feature.core.view;

import android.view.View;
import androidx.annotation.Keep;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import yq0.a;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/core/view/PinFullSpanVideoViewCreator;", "Lyq0/a;", "", "excludeVR", "Z", "Lkotlin/Function0;", "Landroid/view/View;", "getCreator", "()Lkotlin/jvm/functions/Function0;", "creator", "<init>", "(Z)V", "viewCreatorsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinFullSpanVideoViewCreator extends a {
    private final boolean excludeVR;

    public PinFullSpanVideoViewCreator() {
        this(false, 1, null);
    }

    @Override // yq0.a
    @NotNull
    public Function0<View> getCreator() {
        return b.m2(getPinalytics(), getGridFeatureConfig(), new zp0.a(this, 26));
    }

    public PinFullSpanVideoViewCreator(boolean z13) {
        this.excludeVR = z13;
    }

    public /* synthetic */ PinFullSpanVideoViewCreator(boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z13);
    }
}
