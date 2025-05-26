package com.pinterest.feature.profile.emptystate;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import bs1.c;
import gv0.b;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2.i;
import v31.e;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/profile/emptystate/EmptyStateBannerView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profileLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EmptyStateBannerView extends AbstractComposeView implements n {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f47514h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyStateBannerView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(1377486487);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            fc0.n.a(false, null, false, false, i.c(-1770135625, new b(this, 10), sVar), sVar, 24576, 15);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(this, i13, 12);
        }
    }

    public final void o(v31.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f47514h.setValue(state);
    }

    public /* synthetic */ EmptyStateBannerView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47514h = c.u1(e.f123965a, y3.f71400a);
    }
}
