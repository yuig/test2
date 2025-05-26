package e;

import android.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.o;
import androidx.compose.ui.platform.ComposeView;
import lb.l0;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f56687a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(o oVar, q2.h hVar) {
        View childAt = ((ViewGroup) oVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.n(null);
            composeView.o(hVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(6, oVar, (AttributeSet) null);
        composeView2.n(null);
        composeView2.o(hVar);
        View decorView = oVar.getWindow().getDecorView();
        if (b7.c.r(decorView) == null) {
            b7.c.Q(decorView, oVar);
        }
        if (d7.b.J(decorView) == null) {
            d7.b.t0(decorView, oVar);
        }
        if (l0.l0(decorView) == null) {
            l0.i1(decorView, oVar);
        }
        oVar.setContentView(composeView2, f56687a);
    }
}
