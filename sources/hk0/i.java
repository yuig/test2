package hk0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f69311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f69312b;

    public i(j jVar, Context context) {
        this.f69312b = jVar;
        this.f69311a = new GestureDetector(context, new c1.a(this, 3));
    }

    @Override // android.view.View.OnTouchListener
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                return this.f69311a.onTouchEvent(motionEvent);
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }
}
