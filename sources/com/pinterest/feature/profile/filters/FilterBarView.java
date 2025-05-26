package com.pinterest.feature.profile.filters;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import bs1.c;
import fc0.n;
import gv0.b;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2.i;
import x31.d;
import x31.h;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/profile/filters/FilterBarView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profileLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FilterBarView extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f47515h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f47516i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(-1806477006);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 11;
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            n.a(false, null, false, false, i.c(-1640342510, new b(this, i15), sVar), sVar, 24576, 15);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(this, i13, 13);
        }
    }

    public final void o(x31.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f47515h.setValue(state);
    }

    public final void q(d style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f47516i.setValue(style);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterBarView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        x31.b bVar = h.f131623a;
        y3 y3Var = y3.f71400a;
        this.f47515h = c.u1(bVar, y3Var);
        this.f47516i = c.u1(h.f131624b, y3Var);
    }
}
