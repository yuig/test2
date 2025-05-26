package kx0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import o82.i3;

/* loaded from: classes5.dex */
public final class m extends ar0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81072a;

    /* renamed from: b, reason: collision with root package name */
    public final yq0.t f81073b;

    public m(i3 fragment) {
        this.f81072a = 2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f81073b = fragment;
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        switch (this.f81072a) {
            case 2:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                i3 i3Var = (i3) this.f81073b;
                Context context = i3Var.getContext();
                if (context != null) {
                    int dimensionPixelSize = i3Var.getResources().getDimensionPixelSize(i82.b.article_immersive_header_height);
                    int dimensionPixelSize2 = i3Var.getResources().getDimensionPixelSize(r0.search_toolbar_height);
                    l2 l2Var = recyclerView.f19242n;
                    Intrinsics.f(l2Var);
                    if (eb2.j.b(l2Var, null) == 0 && d7.b.I(recyclerView, 0).getTop() + dimensionPixelSize > dimensionPixelSize2) {
                        double d2 = dimensionPixelSize * 0.75d;
                        if (d7.b.I(recyclerView, 0).getTop() + dimensionPixelSize <= d2) {
                            int b13 = ml2.c.b((((Math.abs(d7.b.I(recyclerView, 0).getTop()) + dimensionPixelSize2) - d2) / d7.b.I(recyclerView, 0).getHeight()) * 255);
                            fo1.a i73 = i3Var.i7();
                            if (i73 != null) {
                                ((GestaltToolbarImpl) i73).setBackgroundColor(f5.c.j(dl2.b.x0(context, eo1.a.sema_color_background_default), ql2.s.g(b13 * 5, 0, 255)));
                                break;
                            }
                        } else {
                            fo1.a i74 = i3Var.i7();
                            if (i74 != null) {
                                ((GestaltToolbarImpl) i74).setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_transparent));
                                break;
                            }
                        }
                    } else {
                        fo1.a i75 = i3Var.i7();
                        if (i75 != null) {
                            ((GestaltToolbarImpl) i75).setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_default));
                            break;
                        }
                    }
                }
                break;
            default:
                super.c(recyclerView, i13, i14);
                break;
        }
    }

    @Override // ar0.s, ar0.x
    public final void f(RecyclerView recyclerView) {
        hx0.e eVar;
        switch (this.f81072a) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                int childCount = recyclerView.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = recyclerView.getChildAt(i13);
                    o oVar = (o) this.f81073b;
                    qc2.d dVar = (qc2.d) oVar.f81078c1.getValue();
                    Intrinsics.f(childAt);
                    if (dVar.e(childAt, recyclerView) && (eVar = oVar.f81077b1) != null) {
                        eVar.z3(i13);
                    }
                }
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            default:
                super.f(recyclerView);
                break;
        }
    }

    @Override // ar0.s
    public final void j(RecyclerView recyclerView, View view) {
        i01.o oVar;
        switch (this.f81072a) {
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(view, "view");
                PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.f81073b;
                if (pinCloseupFragment.u8() && (oVar = pinCloseupFragment.I2) != null) {
                    oVar.updateSpinnerSeen();
                    break;
                }
                break;
            default:
                super.j(recyclerView, view);
                break;
        }
    }

    @Override // ar0.s, ar0.r
    public final void onViewDetachedFromWindow(View view) {
        hx0.e eVar;
        switch (this.f81072a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                super.onViewDetachedFromWindow(view);
                o oVar = (o) this.f81073b;
                int i13 = o.f81075g1;
                Integer valueOf = oVar.g8() != null ? Integer.valueOf(RecyclerView.r1(view)) : null;
                if (valueOf != null && (eVar = oVar.f81077b1) != null) {
                    eVar.z3(valueOf.intValue());
                    break;
                }
                break;
            default:
                super.onViewDetachedFromWindow(view);
                break;
        }
    }

    public m(wk1.k kVar, int i13) {
        this.f81072a = i13;
        this.f81073b = kVar;
    }
}
