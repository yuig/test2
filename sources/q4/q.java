package q4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import i2.f2;
import i2.y3;
import j1.t0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class q extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public final Window f102350h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f102351i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f102352j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f102353k;

    public q(Context context, Window window) {
        super(6, context, (AttributeSet) null);
        this.f102350h = window;
        this.f102351i = bs1.c.u1(o.f102348a, y3.f71400a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1735448596);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            ((Function2) this.f102351i.getValue()).invoke(sVar, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 6);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: j */
    public final boolean getF17461i() {
        return this.f102353k;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void k(boolean z13, int i13, int i14, int i15, int i16) {
        View childAt;
        super.k(z13, i13, i14, i15, i16);
        if (this.f102352j || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f102350h.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void l(int i13, int i14) {
        if (this.f102352j) {
            super.l(i13, i14);
            return;
        }
        super.l(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }
}
