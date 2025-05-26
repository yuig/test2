package nt;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public float f92051a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getAction() != 2) {
            return false;
        }
        if (Math.abs(this.f92051a - motionEvent.getY()) > 0.0f) {
            hf0.b.k(view);
        }
        this.f92051a = motionEvent.getY();
        return false;
    }
}
