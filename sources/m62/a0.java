package m62;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f85954a;

    public a0(b0 b0Var) {
        this.f85954a = b0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        PointF K = kg.t.K(e13);
        Point point = new Point((int) K.x, (int) K.y);
        b0 b0Var = this.f85954a;
        x72.j jVar = b0Var.f85957a;
        Unit unit = null;
        ke2.d r23 = !ig1.b.U(jVar.a()).contains(point.x, point.y) ? null : kh2.j.r2(jVar, point, b0Var.f85959c);
        if (r23 != null) {
            b0Var.f85958b.u(r23, b0Var);
            unit = Unit.f80348a;
        }
        if (unit != null) {
            return true;
        }
        b0Var.f85958b.g(b0Var);
        return true;
    }
}
