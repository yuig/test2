package com.pinterest.feature.search.visual.lens.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.AbstractComposeView;
import i2.f2;
import i2.o;
import i2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oe.f;
import org.jetbrains.annotations.NotNull;
import tc0.i;
import u81.c0;
import u81.d0;
import u81.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/search/visual/lens/view/RoomStylePickerView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoomStylePickerView extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public m f48059h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomStylePickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(1970244425);
        f.h(null, new d0(this, 2), new c0(this, 0), sVar, 0, 1);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i(this, i13, 16);
        }
    }

    public final void o(m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f48059h = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomStylePickerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
