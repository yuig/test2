package hk;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f69285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj.a f69287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f69288d;

    public a(ExpandableBehavior expandableBehavior, View view, int i13, sj.a aVar) {
        this.f69288d = expandableBehavior;
        this.f69285a = view;
        this.f69286b = i13;
        this.f69287c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f69285a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f69288d;
        if (expandableBehavior.f33375a == this.f69286b) {
            Object obj = this.f69287c;
            expandableBehavior.C((View) obj, view, ((FloatingActionButton) obj).f32638l.f16503b, false);
        }
        return false;
    }
}
