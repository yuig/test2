package com.pinterest.collage.effects.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
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
import rm1.q;
import z90.e;
import z90.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/collage/effects/components/EffectToolView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "effects_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EffectToolView extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44648h;

    /* renamed from: i, reason: collision with root package name */
    public Function0 f44649i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EffectToolView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-1075117024);
        n.a(false, null, false, false, i.c(-219914944, new j(this, 19), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 16);
        }
    }

    public final void o(g state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f44648h.setValue(state);
    }

    public /* synthetic */ EffectToolView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectToolView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44648h = c.u1(new g(q.REPORT, null, null, false, false, 30), y3.f71400a);
        this.f44649i = e.f141349k;
    }
}
