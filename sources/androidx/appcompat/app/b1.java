package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class b1 extends l3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f15956b;

    public /* synthetic */ b1(d1 d1Var, int i13) {
        this.f15955a = i13;
        this.f15956b = d1Var;
    }

    @Override // q5.e1
    public final void d(View view) {
        View view2;
        int i13 = this.f15955a;
        d1 d1Var = this.f15956b;
        switch (i13) {
            case 0:
                if (d1Var.f15985o && (view2 = d1Var.f15977g) != null) {
                    view2.setTranslationY(0.0f);
                    d1Var.f15974d.setTranslationY(0.0f);
                }
                d1Var.f15974d.setVisibility(8);
                ActionBarContainer actionBarContainer = d1Var.f15974d;
                actionBarContainer.f16194a = false;
                actionBarContainer.setDescendantFocusability(262144);
                d1Var.f15989s = null;
                m.b bVar = d1Var.f15981k;
                if (bVar != null) {
                    bVar.e(d1Var.f15980j);
                    d1Var.f15980j = null;
                    d1Var.f15981k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = d1Var.f15973c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    q5.k0.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                d1Var.f15989s = null;
                d1Var.f15974d.requestLayout();
                break;
        }
    }
}
