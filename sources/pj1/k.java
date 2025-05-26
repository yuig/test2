package pj1;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface k {
    boolean a();

    default void c() {
        g().postInvalidate();
    }

    boolean e();

    boolean f();

    View g();

    AnimatorSet h();

    /* JADX WARN: Multi-variable type inference failed */
    default float i() {
        ViewParent viewParent = g().getParent();
        while (viewParent != 0 && !(viewParent instanceof RecyclerView)) {
            viewParent = viewParent.getParent();
        }
        View view = viewParent instanceof View ? (View) viewParent : null;
        if (view == null) {
            return 0.0f;
        }
        View g13 = g();
        while (!(g13.getParent() instanceof RecyclerView)) {
            Object parent = g13.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            g13 = (View) parent;
        }
        qc2.a p13 = p();
        i iVar = ((e) this).f100282f;
        return ((qc2.d) p13).c(g13, 0, iVar.f128840c, iVar.f128841d, iVar.f128842e, view);
    }

    void j(List list);

    void l();

    void m();

    default void n() {
        if (h().isRunning() || f() || a()) {
            return;
        }
        if (i() < 80.0f) {
            l();
            return;
        }
        ArrayList o13 = o();
        if (e()) {
            j(o13);
        }
        AnimatorSet h10 = h();
        h10.playSequentially(CollectionsKt.F0(o13));
        h10.setStartDelay(1000L);
        h10.start();
        m();
    }

    ArrayList o();

    qc2.a p();
}
