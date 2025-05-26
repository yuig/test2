package com.pinterest.collagesCoreLibrary.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import b3.w;
import bs1.c;
import fc0.n;
import i1.j;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import j1.t0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2.i;
import ra0.e0;
import ra0.g0;
import ra0.z;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/collagesCoreLibrary/components/ColorPickerCellView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "collagesCoreLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ColorPickerCellView extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44671h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44672i;

    /* renamed from: j, reason: collision with root package name */
    public Function0 f44673j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPickerCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-1740263395);
        n.a(false, null, false, false, i.c(1346830653, new j(this, 27), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 23);
        }
    }

    public final void o(z state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f44671h.setValue(state);
    }

    public /* synthetic */ ColorPickerCellView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        z zVar = new z(new e0(w.f21382f));
        y3 y3Var = y3.f71400a;
        this.f44671h = c.u1(zVar, y3Var);
        this.f44672i = c.u1(Boolean.FALSE, y3Var);
        this.f44673j = g0.f106925i;
    }
}
