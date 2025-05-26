package ads_mobile_sdk;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qj1 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: a, reason: collision with root package name */
    public final xf1 f10111a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f10112b;

    public qj1(xf1 nativeAdCore, WeakReference clickedView) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        this.f10111a = nativeAdCore;
        this.f10112b = clickedView;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e23, float f13, float f14) {
        int value;
        float x13;
        int i13;
        Intrinsics.checkNotNullParameter(e23, "e2");
        if (motionEvent == null) {
            return false;
        }
        if (Math.abs(f13) > Math.abs(f14)) {
            value = f13 > 0.0f ? bj.e.RIGHT.getValue() : bj.e.LEFT.getValue();
        } else {
            if (f14 <= 0.0f) {
                if (f14 < 0.0f) {
                    value = bj.e.UP.getValue();
                }
                return false;
            }
            value = bj.e.DOWN.getValue();
        }
        if (value != this.f10111a.d()) {
            return false;
        }
        if (value == bj.e.RIGHT.getValue() || value == bj.e.LEFT.getValue()) {
            x13 = (e23.getX() - motionEvent.getX()) / f13;
        } else {
            if (value != bj.e.UP.getValue() && value != bj.e.DOWN.getValue()) {
                i13 = 0;
                this.f10111a.a((View) this.f10112b.get(), i13);
                return false;
            }
            x13 = (e23.getY() - motionEvent.getY()) / f14;
        }
        i13 = (int) (x13 * 1000);
        this.f10111a.a((View) this.f10112b.get(), i13);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e23, float f13, float f14) {
        Intrinsics.checkNotNullParameter(e23, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!this.f10111a.c()) {
            return false;
        }
        this.f10111a.b();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return false;
    }
}
