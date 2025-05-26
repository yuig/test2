package com.pinterest.component.actionbutton.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import bs1.c;
import fc0.n;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import j1.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2.i;
import wb0.l;
import xb0.a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/component/actionbutton/view/ActionButtonView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ActionButtonView extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44683h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(-2097554146);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            n.a(false, null, false, false, i.c(-1448949762, new a(this, 1), sVar), sVar, 24576, 15);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 26);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44683h = c.u1(l.f129004a, y3.f71400a);
    }
}
