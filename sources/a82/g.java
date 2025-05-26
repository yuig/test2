package a82;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.pinterest.shuffles.scene.composer.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.x;
import rl2.u;

/* loaded from: classes4.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: i */
    public static final /* synthetic */ u[] f1536i;

    /* renamed from: a */
    public final x72.j f1537a;

    /* renamed from: b */
    public d f1538b;

    /* renamed from: c */
    public final long f1539c;

    /* renamed from: d */
    public final int f1540d;

    /* renamed from: e */
    public final f f1541e;

    /* renamed from: f */
    public final f f1542f;

    /* renamed from: g */
    public final q5.j f1543g;

    /* renamed from: h */
    public final c f1544h;

    static {
        x xVar = new x(g.class, "isInHighlightMode", "isInHighlightMode()Z", 0);
        l0 l0Var = k0.f80436a;
        f1536i = new u[]{l0Var.e(xVar), a.a.y(g.class, "highlightedSceneItem", "getHighlightedSceneItem()Lcom/pinterest/xrenderer/scene/SceneItem;", 0, l0Var)};
    }

    public g(x72.j sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        this.f1537a = sceneView;
        this.f1538b = new gi2.b();
        this.f1539c = pe.i.w(sceneView).getResources().getInteger(R.integer.config_shortAnimTime);
        Integer num = 16;
        Context context = pe.i.w(sceneView);
        Intrinsics.checkNotNullParameter(num, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1540d = (int) ((num.floatValue() * context.getResources().getDisplayMetrics().density) + 0.5f);
        this.f1541e = new f(Boolean.FALSE, this, 0);
        this.f1542f = new f(null, this, 1);
        this.f1543g = new q5.j(pe.i.w(sceneView), new c1.a(this, 6));
        this.f1544h = new c(new e(this));
    }

    public static final ke2.d a(g gVar, Point point) {
        x72.j jVar = gVar.f1537a;
        if (ig1.b.U(jVar.a()).contains(point.x, point.y)) {
            return kh2.j.r2(jVar, point, gVar.f1540d);
        }
        return null;
    }

    public final ValueAnimator b(ke2.d dVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.f79320b.f79308e, 1.0f);
        ofFloat.setDuration(this.f1539c);
        ofFloat.addUpdateListener(new k(dVar, 1));
        ofFloat.start();
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final void c(ke2.d dVar) {
        this.f1542f.d(this, f1536i[1], dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r13 != 3) goto L73;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
