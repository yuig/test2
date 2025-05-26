package o80;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.pinterest.ui.imageview.WebImageView;
import i01.l0;
import kotlin.jvm.internal.Intrinsics;
import oq.x0;

/* loaded from: classes5.dex */
public final class k extends ScaleGestureDetector.SimpleOnScaleGestureListener implements m {

    /* renamed from: a, reason: collision with root package name */
    public final jq.j f93520a;

    /* renamed from: b, reason: collision with root package name */
    public final ScaleGestureDetector f93521b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f93522c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f93523d;

    public k(Context context, jq.j pinchToZoomInteraction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinchToZoomInteraction, "pinchToZoomInteraction");
        this.f93520a = pinchToZoomInteraction;
        this.f93521b = new ScaleGestureDetector(context, this);
    }

    public final boolean a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        ScaleGestureDetector scaleGestureDetector = this.f93521b;
        if (action == 1 || event.getActionMasked() == 6) {
            this.f93522c = true;
            onScaleEnd(scaleGestureDetector);
        } else if (event.getAction() == 3) {
            this.f93520a.a(false);
        }
        return scaleGestureDetector.onTouchEvent(event);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (this.f93522c) {
            return super.onScale(detector);
        }
        float scaleFactor = detector.getScaleFactor();
        jq.j jVar = this.f93520a;
        if (!jVar.f77439q) {
            jVar.f77433k = scaleFactor;
            jVar.c();
            if (!Float.isNaN(scaleFactor)) {
                WebImageView webImageView = jVar.f77426d;
                if (webImageView != null) {
                    webImageView.setScaleX(scaleFactor);
                    webImageView.setScaleY(scaleFactor);
                }
                if (scaleFactor >= 1.0f) {
                    float f13 = 0.5f / scaleFactor;
                    l0 l0Var = jVar.f77434l;
                    if (l0Var != null) {
                        ((x0) l0Var).setAlpha(f13);
                    }
                }
            }
        }
        return detector.getScaleFactor() >= 5.0f;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f93523d = false;
        return super.onScaleBegin(detector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (this.f93522c) {
            this.f93522c = false;
            if (this.f93523d) {
                return;
            }
            this.f93520a.a(true);
            this.f93523d = true;
            super.onScaleEnd(detector);
        }
    }
}
