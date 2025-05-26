package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class k0 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f19461a;

    public k0(q0 q0Var) {
        this.f19461a = q0Var;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        q0 q0Var = this.f19461a;
        q0Var.f19592x.a(motionEvent);
        VelocityTracker velocityTracker = q0Var.f19587s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (q0Var.f19580l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(q0Var.f19580l);
        if (findPointerIndex >= 0 && q0Var.f19571c == null && actionMasked == 2 && q0Var.f19582n != 2) {
            q0Var.f19581m.getClass();
        }
        y2 y2Var = q0Var.f19571c;
        if (y2Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    q0Var.t(q0Var.f19583o, findPointerIndex, motionEvent);
                    q0Var.p(y2Var);
                    RecyclerView recyclerView2 = q0Var.f19585q;
                    androidx.appcompat.app.z zVar = q0Var.f19586r;
                    recyclerView2.removeCallbacks(zVar);
                    zVar.run();
                    q0Var.f19585q.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == q0Var.f19580l) {
                    q0Var.f19580l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    q0Var.t(q0Var.f19583o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = q0Var.f19587s;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        q0Var.r(null, 0);
        q0Var.f19580l = -1;
    }

    @Override // androidx.recyclerview.widget.n2
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        q0 q0Var = this.f19461a;
        q0Var.f19592x.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        l0 l0Var = null;
        if (actionMasked == 0) {
            q0Var.f19580l = motionEvent.getPointerId(0);
            q0Var.f19572d = motionEvent.getX();
            q0Var.f19573e = motionEvent.getY();
            VelocityTracker velocityTracker = q0Var.f19587s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            q0Var.f19587s = VelocityTracker.obtain();
            if (q0Var.f19571c == null) {
                ArrayList arrayList = q0Var.f19584p;
                if (!arrayList.isEmpty()) {
                    View m13 = q0Var.m(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        l0 l0Var2 = (l0) arrayList.get(size);
                        if (l0Var2.f19478e.f19717a == m13) {
                            l0Var = l0Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (l0Var != null) {
                    q0Var.f19572d -= l0Var.f19482i;
                    q0Var.f19573e -= l0Var.f19483j;
                    y2 y2Var = l0Var.f19478e;
                    q0Var.l(y2Var, true);
                    if (q0Var.f19569a.remove(y2Var.f19717a)) {
                        q0Var.f19581m.a(q0Var.f19585q, y2Var);
                    }
                    q0Var.r(y2Var, l0Var.f19479f);
                    q0Var.t(q0Var.f19583o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            q0Var.f19580l = -1;
            q0Var.r(null, 0);
        } else {
            int i13 = q0Var.f19580l;
            if (i13 != -1 && motionEvent.findPointerIndex(i13) >= 0 && q0Var.f19571c == null && actionMasked == 2 && q0Var.f19582n != 2) {
                q0Var.f19581m.getClass();
            }
        }
        VelocityTracker velocityTracker2 = q0Var.f19587s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return q0Var.f19571c != null;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void e(boolean z13) {
        if (z13) {
            this.f19461a.r(null, 0);
        }
    }
}
