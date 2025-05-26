package q5;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f102463a;

    public j(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f102463a = new GestureDetector(context, simpleOnGestureListener, null);
    }

    public final void a(MotionEvent motionEvent) {
        this.f102463a.onTouchEvent(motionEvent);
    }
}
