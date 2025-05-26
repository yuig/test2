package we0;

import android.animation.ObjectAnimator;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.d;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import do1.u;
import do1.v;
import do1.w;

/* loaded from: classes5.dex */
public final class c implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public VelocityTracker f129245a;

    /* renamed from: b, reason: collision with root package name */
    public float f129246b;

    /* renamed from: c, reason: collision with root package name */
    public float f129247c;

    /* renamed from: d, reason: collision with root package name */
    public final View f129248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PinterestToastContainer f129249e;

    public c(PinterestToastContainer pinterestToastContainer, GestaltToast gestaltToast) {
        this.f129249e = pinterestToastContainer;
        this.f129248d = gestaltToast;
    }

    @Override // gm1.a
    public final void h3(gm1.c cVar) {
        boolean z13 = cVar instanceof u;
        PinterestToastContainer pinterestToastContainer = this.f129249e;
        View view = this.f129248d;
        if (z13) {
            MotionEvent motionEvent = ((u) cVar).f55699c;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f129245a = obtain;
            obtain.addMovement(motionEvent);
            this.f129246b = motionEvent.getRawX();
            SparseArray sparseArray = pinterestToastContainer.f44921a;
            Runnable runnable = (Runnable) sparseArray.get(view.getId());
            if (runnable != null) {
                pinterestToastContainer.removeCallbacks(runnable);
                sparseArray.remove(view.getId());
                return;
            }
            return;
        }
        if (!(cVar instanceof w)) {
            if (cVar instanceof v) {
                MotionEvent motionEvent2 = ((v) cVar).f55701c;
                VelocityTracker velocityTracker = this.f129245a;
                if (velocityTracker == null) {
                    return;
                }
                velocityTracker.addMovement(motionEvent2);
                float rawX = motionEvent2.getRawX() - this.f129246b;
                this.f129247c = rawX;
                view.setTranslationX(rawX);
                return;
            }
            return;
        }
        MotionEvent motionEvent3 = ((w) cVar).f55703c;
        if (this.f129245a == null) {
            return;
        }
        this.f129247c = motionEvent3.getRawX() - this.f129246b;
        this.f129245a.addMovement(motionEvent3);
        this.f129245a.computeCurrentVelocity(1000);
        if (Math.abs(this.f129245a.getXVelocity()) >= PinterestToastContainer.f44919c) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), Math.copySign(pinterestToastContainer.d(), this.f129247c));
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addListener(new d(this, 12));
            ofFloat.start();
            if (view.getTag() instanceof a) {
                a aVar = (a) view.getTag();
                if (aVar.f129241a) {
                    return;
                }
                aVar.f129241a = true;
                return;
            }
            return;
        }
        if (motionEvent3.getEventTime() - motionEvent3.getDownTime() < 200.0f) {
            pinterestToastContainer.f(view);
            Object tag = view.getTag();
            if (tag instanceof a) {
                ((a) tag).b(view.getContext());
                return;
            }
            return;
        }
        if (Math.abs(this.f129247c) >= PinterestToastContainer.f44920d) {
            kg.a.d0(this.f129248d, "translationX", this.f129247c, 0.0f, 0.75f, 0.25f).start();
            return;
        }
        this.f129245a.recycle();
        this.f129245a = null;
        pinterestToastContainer.a(view);
    }
}
