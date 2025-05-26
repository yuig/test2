package n;

import android.view.View;
import android.view.ViewTreeObserver;
import ao2.j0;
import com.google.android.material.search.SearchBar;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88575a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f88576b;

    public /* synthetic */ f(Object obj, int i13) {
        this.f88575a = i13;
        this.f88576b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v13) {
        int i13 = this.f88575a;
        Object obj = this.f88576b;
        switch (i13) {
            case 0:
            case 1:
                break;
            case 2:
                SearchBar searchBar = (SearchBar) obj;
                searchBar.f32955k0.addTouchExplorationStateChangeListener(new r5.c(searchBar.f32956l0));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v13, "v");
                x21.g gVar = (x21.g) obj;
                View view = gVar.f131589a;
                while (view != null) {
                    if (view instanceof PinterestRecyclerView) {
                        ((PinterestRecyclerView) view).b(gVar);
                    }
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v13, "view");
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v13) {
        int i13 = this.f88575a;
        Object obj = this.f88576b;
        switch (i13) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.f88630y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.f88630y = v13.getViewTreeObserver();
                    }
                    iVar.f88630y.removeGlobalOnLayoutListener(iVar.f88615j);
                }
                v13.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                f0 f0Var = (f0) obj;
                ViewTreeObserver viewTreeObserver2 = f0Var.f88592p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        f0Var.f88592p = v13.getViewTreeObserver();
                    }
                    f0Var.f88592p.removeGlobalOnLayoutListener(f0Var.f88586j);
                }
                v13.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                SearchBar searchBar = (SearchBar) obj;
                searchBar.f32955k0.removeTouchExplorationStateChangeListener(new r5.c(searchBar.f32956l0));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v13, "v");
                x21.g gVar = (x21.g) obj;
                View view = gVar.f131589a;
                while (view != null) {
                    if (view instanceof PinterestRecyclerView) {
                        ((PinterestRecyclerView) view).e(gVar);
                    }
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v13, "view");
                break;
        }
    }

    public f(j0 adapterScope) {
        this.f88575a = 4;
        Intrinsics.checkNotNullParameter(adapterScope, "adapterScope");
        this.f88576b = adapterScope;
    }
}
