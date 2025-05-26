package com.pinterest.feature.ideaPinCreation.videotrimming.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger;
import hf0.b;
import kh2.k3;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ml2.c;
import om0.m1;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;
import xk2.n;
import zv0.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/videotrimming/view/IdeaPinVideoTrimmingDragger;", "Lcom/pinterest/feature/ideaPinCreation/common/view/IdeaPinCreationBaseDragger;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinVideoTrimmingDragger extends IdeaPinCreationBaseDragger {

    /* renamed from: s, reason: collision with root package name */
    public final k f46597s;

    /* renamed from: t, reason: collision with root package name */
    public final k f46598t;

    /* renamed from: u, reason: collision with root package name */
    public final k f46599u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoTrimmingDragger(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger
    public final View a() {
        Object value = this.f46597s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @Override // com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger
    public final void c() {
        int c13 = c.c(b.f69002b) - this.f46435m;
        Object value = this.f46598t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.Z1((View) value, 2, c13);
    }

    @Override // com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger
    public final void d() {
        Object value = this.f46599u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.Z1((View) value, 1, this.f46436n);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(e0.b(new Rect(getLeft(), getTop(), getRight(), getBottom())));
        }
        super.onLayout(z13, i13, i14, i15, i16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoTrimmingDragger(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = n.NONE;
        this.f46597s = m.a(nVar, new m1(23, context, this));
        this.f46598t = m.a(nVar, new e(this, 0));
        this.f46599u = m.a(nVar, new e(this, 1));
    }
}
