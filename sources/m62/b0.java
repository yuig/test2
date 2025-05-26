package m62;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final x72.j f85957a;

    /* renamed from: b, reason: collision with root package name */
    public w f85958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85959c;

    /* renamed from: d, reason: collision with root package name */
    public ke2.a f85960d;

    /* renamed from: e, reason: collision with root package name */
    public final q5.j f85961e;

    /* renamed from: f, reason: collision with root package name */
    public final jg1.v f85962f;

    public b0(x72.j sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        this.f85957a = sceneView;
        this.f85958b = new g4.u();
        this.f85959c = kg.a.g0(16, pe.i.w(sceneView));
        this.f85960d = new ke2.a(0.0f, 0.0f);
        this.f85961e = new q5.j(pe.i.w(sceneView), new a0(this));
        this.f85962f = new jg1.v(pe.i.w(sceneView), new z(this));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v13, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v13, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f85961e.a(event);
        this.f85962f.b(event);
        return true;
    }
}
