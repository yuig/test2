package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ int f19534a;

    /* renamed from: b */
    public boolean f19535b;

    /* renamed from: c */
    public final /* synthetic */ Object f19536c;

    public o0(BaseAdsBottomSheetBehavior baseAdsBottomSheetBehavior) {
        this.f19534a = 1;
        this.f19536c = baseAdsBottomSheetBehavior;
    }

    public final boolean c(cu.j jVar) {
        BaseAdsBottomSheetBehavior baseAdsBottomSheetBehavior = (BaseAdsBottomSheetBehavior) this.f19536c;
        if (baseAdsBottomSheetBehavior.getF35311l0()) {
            return ((Boolean) jVar.invoke()).booleanValue();
        }
        if (!this.f19535b) {
            this.f19535b = true;
            cu.i iVar = baseAdsBottomSheetBehavior.f35309j0;
            if (iVar != null) {
                iVar.performClick();
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f19534a) {
            case 0:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e23, float f13, float f14) {
        switch (this.f19534a) {
            case 1:
                Intrinsics.checkNotNullParameter(e23, "e2");
                return c(new cu.j(this, motionEvent, e23, f13, f14, 0));
            default:
                return super.onFling(motionEvent, e23, f13, f14);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        q0 q0Var;
        View m13;
        y2 t13;
        switch (this.f19534a) {
            case 0:
                if (this.f19535b && (m13 = (q0Var = (q0) this.f19536c).m(motionEvent)) != null && (t13 = q0Var.f19585q.t1(m13)) != null) {
                    n0 n0Var = q0Var.f19581m;
                    RecyclerView recyclerView = q0Var.f19585q;
                    int d2 = n0Var.d(recyclerView, t13);
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    if ((n0.b(d2, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                        int pointerId = motionEvent.getPointerId(0);
                        int i13 = q0Var.f19580l;
                        if (pointerId == i13) {
                            int findPointerIndex = motionEvent.findPointerIndex(i13);
                            float x13 = motionEvent.getX(findPointerIndex);
                            float y13 = motionEvent.getY(findPointerIndex);
                            q0Var.f19572d = x13;
                            q0Var.f19573e = y13;
                            q0Var.f19577i = 0.0f;
                            q0Var.f19576h = 0.0f;
                            q0Var.f19581m.getClass();
                            q0Var.r(t13, 2);
                            break;
                        }
                    }
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e23, float f13, float f14) {
        switch (this.f19534a) {
            case 1:
                Intrinsics.checkNotNullParameter(e23, "e2");
                return c(new cu.j(this, motionEvent, e23, f13, f14, 1));
            default:
                return super.onScroll(motionEvent, e23, f13, f14);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e13) {
        switch (this.f19534a) {
            case 1:
                Intrinsics.checkNotNullParameter(e13, "e");
                cu.i iVar = ((BaseAdsBottomSheetBehavior) this.f19536c).f35309j0;
                if (iVar == null) {
                    return true;
                }
                iVar.performClick();
                return true;
            default:
                return super.onSingleTapUp(e13);
        }
    }

    public o0(q0 q0Var) {
        this.f19534a = 0;
        this.f19536c = q0Var;
        this.f19535b = true;
    }
}
