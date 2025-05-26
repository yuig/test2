package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class w0 implements n.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f16144a;

    public final View a(int i13) {
        if (i13 == 0) {
            return new View(this.f16144a.f16151a.f16581a.getContext());
        }
        return null;
    }

    public final void b(int i13) {
        if (i13 == 0) {
            y0 y0Var = this.f16144a;
            if (y0Var.f16154d) {
                return;
            }
            y0Var.f16151a.f16592l = true;
            y0Var.f16154d = true;
        }
    }

    @Override // n.m
    public final boolean h(n.o oVar, MenuItem menuItem) {
        return false;
    }

    @Override // n.m
    public final void w(n.o oVar) {
        y0 y0Var = this.f16144a;
        boolean s13 = y0Var.f16151a.f16581a.s();
        Window.Callback callback = y0Var.f16152b;
        if (s13) {
            callback.onPanelClosed(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
        } else if (callback.onPreparePanel(0, null, oVar)) {
            callback.onMenuOpened(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
        }
    }
}
