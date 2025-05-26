package ve0;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.design.brio.widget.voice.PinterestSuggestion;

/* loaded from: classes5.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public int f125711a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f125712b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinterestSuggestion f125713c;

    public k(PinterestSuggestion pinterestSuggestion) {
        this.f125713c = pinterestSuggestion;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        PinterestSuggestion pinterestSuggestion = this.f125713c;
        PointF pointF = this.f125712b;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(0);
            this.f125711a = pointerId;
            pointF.set(motionEvent.getX(pointerId), motionEvent.getY(this.f125711a));
            return pinterestSuggestion.f44895f.f(action, pointF);
        }
        if (action == 2) {
            pointF.set(motionEvent.getX(this.f125711a), motionEvent.getY(this.f125711a));
            return pinterestSuggestion.f44895f.f(action, pointF);
        }
        if (action != 1) {
            return false;
        }
        pointF.set(motionEvent.getX(this.f125711a), motionEvent.getY(this.f125711a));
        boolean f13 = pinterestSuggestion.f44895f.f(action, pointF);
        this.f125711a = -1;
        return f13;
    }
}
