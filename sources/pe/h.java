package pe;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final qe.c f99914a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f99915b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f99916c;

    /* renamed from: d, reason: collision with root package name */
    public final View.OnTouchListener f99917d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99918e;

    public h(qe.c mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f99914a = mapping;
        this.f99915b = new WeakReference(hostView);
        this.f99916c = new WeakReference(rootView);
        this.f99917d = qe.h.f(hostView);
        this.f99918e = true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        View view2 = (View) this.f99916c.get();
        View view3 = (View) this.f99915b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            c.a(this.f99914a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f99917d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
