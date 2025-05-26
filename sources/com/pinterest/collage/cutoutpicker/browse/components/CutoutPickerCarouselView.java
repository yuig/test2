package com.pinterest.collage.cutoutpicker.browse.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import fc0.d;
import i1.j;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import j1.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n90.c;
import n90.m;
import org.jetbrains.annotations.NotNull;
import q2.i;
import yk1.n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/collage/cutoutpicker/browse/components/CutoutPickerCarouselView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lyk1/n;", "Lfc0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cutoutPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CutoutPickerCarouselView extends AbstractComposeView implements n, d {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44623h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44624i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutPickerCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(-1954801828);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            fc0.n.a(false, null, false, false, i.c(1439232124, new j(this, 15), sVar), sVar, 24576, 15);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 12);
        }
    }

    public final void o(c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f44623h.setValue(state);
    }

    public /* synthetic */ CutoutPickerCarouselView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutPickerCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = new c();
        y3 y3Var = y3.f71400a;
        this.f44623h = bs1.c.u1(cVar, y3Var);
        this.f44624i = bs1.c.u1(m.f90021i, y3Var);
    }
}
