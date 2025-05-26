package c1;

import a82.g;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinInteractiveFrameLayout;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveFrameLayout;
import com.pinterest.shuffles.scene.composer.k;
import com.pinterest.ui.grid.PinterestAdapterView;
import e81.h;
import gi2.b;
import hk0.i;
import java.util.Iterator;
import ke2.d;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import lu.f;
import o80.j;
import qa2.h0;

/* loaded from: classes2.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24479b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f24478a = i13;
        this.f24479b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e13) {
        switch (this.f24478a) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                b bVar = (b) this.f24479b;
                e13.getX();
                bVar.getClass();
                e13.getY();
                bVar.getClass();
                return true;
            default:
                return super.onDoubleTap(e13);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent event) {
        int i13 = this.f24478a;
        Object obj = this.f24479b;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(event, "event");
                return true;
            case 2:
            case 4:
            case 5:
            default:
                return super.onDown(event);
            case 3:
                Intrinsics.checkNotNullParameter(event, "e");
                return true;
            case 6:
                Intrinsics.checkNotNullParameter(event, "e");
                g gVar = (g) obj;
                PointF p13 = o.p(event);
                d a13 = g.a(gVar, new Point((int) p13.x, (int) p13.y));
                if (a13 == null) {
                    a13 = null;
                } else if (gVar.f1538b.p(a13)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(a13.f79320b.f79308e, 0.95f);
                    ofFloat.setDuration(gVar.f1539c);
                    ofFloat.addUpdateListener(new k(a13, 2));
                    ofFloat.start();
                    Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
                }
                return a13 != null;
            case 7:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj;
                int childCount = pinterestAdapterView.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = pinterestAdapterView.getChildAt(i14);
                    if (!(childAt instanceof h0)) {
                        int rawX = (int) event.getRawX();
                        int rawY = (int) event.getRawY();
                        ra2.b bVar = PinterestAdapterView.M;
                        Rect rect = new Rect();
                        int[] iArr = new int[2];
                        childAt.getLocationOnScreen(iArr);
                        int i15 = iArr[0];
                        int width = childAt.getWidth() + i15;
                        int i16 = iArr[1];
                        rect.set(i15, i16, width, childAt.getHeight() + i16);
                        childAt.setPressed(rect.contains(rawX, rawY));
                    }
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e23, float f13, float f14) {
        int i13 = this.f24478a;
        Object obj = this.f24479b;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(e23, "e2");
                ((j) obj).getClass();
                break;
            case 3:
                Intrinsics.checkNotNullParameter(e23, "e2");
                if (motionEvent != null) {
                    i iVar = (i) obj;
                    float x13 = e23.getX() - motionEvent.getX();
                    if (Math.abs(x13) > Math.abs(e23.getY() - motionEvent.getY()) && Math.abs(x13) > 100.0f && Math.abs(f13) > 100.0f) {
                        if (x13 > 0.0f) {
                            hk0.j.a(iVar.f69312b, hk0.b.RIGHT);
                            break;
                        } else {
                            hk0.j.a(iVar.f69312b, hk0.b.LEFT);
                            break;
                        }
                    }
                }
                break;
            case 7:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj;
                int childCount = pinterestAdapterView.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    pinterestAdapterView.getChildAt(i14).setPressed(false);
                }
                break;
        }
        return super.onFling(motionEvent, e23, f13, f14);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent ev2) {
        Object obj;
        int i13 = this.f24478a;
        Object obj2 = this.f24479b;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(ev2, "ev");
                super.onLongPress(ev2);
                int i14 = CollageInteractiveFrameLayout.f47942c;
                Iterator it = ((CollageInteractiveFrameLayout) obj2).a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        h hVar = (h) obj;
                        if (!hVar.G0() || !hVar.n(ev2)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                h hVar2 = (h) obj;
                if (hVar2 != null) {
                    hVar2.X();
                    break;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(ev2, "e");
                g gVar = (g) obj2;
                PointF p13 = o.p(ev2);
                d a13 = g.a(gVar, new Point((int) p13.x, (int) p13.y));
                if (a13 != null) {
                    gVar.b(a13);
                    gVar.c(a13);
                    gVar.f1541e.d(gVar, g.f1536i[0], Boolean.TRUE);
                    break;
                }
                break;
            default:
                super.onLongPress(ev2);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e23, float f13, float f14) {
        vt.i iVar;
        int i13 = this.f24478a;
        Object obj = this.f24479b;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(e23, "e2");
                if (f13 == 0.0f && f14 < 1.0f && (iVar = ((f) obj).D.f84936h) != null) {
                    iVar.f126600a.d();
                    break;
                }
                break;
            case 7:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj;
                int childCount = pinterestAdapterView.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    pinterestAdapterView.getChildAt(i14).setPressed(false);
                }
                break;
        }
        return super.onScroll(motionEvent, e23, f13, f14);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e13) {
        switch (this.f24478a) {
            case 6:
                Intrinsics.checkNotNullParameter(e13, "e");
                g gVar = (g) this.f24479b;
                PointF p13 = o.p(e13);
                d a13 = g.a(gVar, new Point((int) p13.x, (int) p13.y));
                if (a13 == null) {
                    return true;
                }
                gVar.b(a13);
                a82.d dVar = gVar.f1538b;
                PointF p14 = o.p(e13);
                dVar.s(a13, gVar, new Point((int) p14.x, (int) p14.y));
                return true;
            default:
                return super.onSingleTapConfirmed(e13);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e13) {
        Object obj;
        int i13 = this.f24478a;
        Object obj2 = this.f24479b;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(e13, "e");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(e13, "ev");
                int i14 = IdeaPinInteractiveFrameLayout.f46463c;
                Iterator it = ((IdeaPinInteractiveFrameLayout) obj2).a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        fu0.i iVar = (fu0.i) obj;
                        if (!iVar.T0() || !iVar.n(e13)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                fu0.i iVar2 = (fu0.i) obj;
                if (iVar2 != null) {
                    iVar2.d0();
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(e13, "ev");
                int i15 = CollageInteractiveFrameLayout.f47942c;
                Iterator it2 = ((CollageInteractiveFrameLayout) obj2).a().iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).getClass();
                }
                break;
            case 7:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj2;
                int childCount = pinterestAdapterView.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = pinterestAdapterView.getChildAt(i16);
                    if (!(childAt instanceof h0)) {
                        childAt.setPressed(false);
                    }
                }
                break;
        }
        return super.onSingleTapUp(e13);
    }
}
