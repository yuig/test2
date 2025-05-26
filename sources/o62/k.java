package o62;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import android.view.View;
import g4.u;
import jg1.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final x72.j f92994a;

    /* renamed from: b, reason: collision with root package name */
    public c f92995b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f92996c;

    /* renamed from: d, reason: collision with root package name */
    public PointF f92997d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92998e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92999f;

    /* renamed from: g, reason: collision with root package name */
    public PointF f93000g;

    /* renamed from: h, reason: collision with root package name */
    public PointF f93001h;

    /* renamed from: i, reason: collision with root package name */
    public final int f93002i;

    /* renamed from: j, reason: collision with root package name */
    public final int f93003j;

    /* renamed from: k, reason: collision with root package name */
    public ke2.d f93004k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f93005l;

    /* renamed from: m, reason: collision with root package name */
    public float f93006m;

    /* renamed from: n, reason: collision with root package name */
    public hd2.a f93007n;

    /* renamed from: o, reason: collision with root package name */
    public f f93008o;

    /* renamed from: p, reason: collision with root package name */
    public d f93009p;

    /* renamed from: q, reason: collision with root package name */
    public final q5.j f93010q;

    /* renamed from: r, reason: collision with root package name */
    public final ScaleGestureDetector f93011r;

    /* renamed from: s, reason: collision with root package name */
    public final v f93012s;

    /* renamed from: t, reason: collision with root package name */
    public final b f93013t;

    public k(x72.j sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        this.f92994a = sceneView;
        this.f92995b = new u();
        this.f92996c = true;
        this.f92997d = new PointF();
        this.f93000g = new PointF(0.0f, 0.0f);
        this.f93001h = new PointF(0.0f, 0.0f);
        this.f93002i = kg.a.g0(16, pe.i.w(sceneView));
        this.f93003j = kg.a.g0(64, pe.i.w(sceneView));
        this.f93005l = new PointF();
        this.f93007n = new hd2.a(0.0d);
        this.f93008o = f.f92982f;
        this.f93009p = d.DEFAULT;
        this.f93010q = new q5.j(pe.i.w(sceneView), new j(this));
        this.f93011r = new ScaleGestureDetector(pe.i.w(sceneView), new i(this));
        this.f93012s = new v(pe.i.w(sceneView), new h(this));
        this.f93013t = new b(pe.i.w(sceneView), new h(this));
    }

    public static final ke2.d a(k kVar, Point point) {
        x72.j jVar = kVar.f92994a;
        if (ig1.b.U(jVar.a()).contains(point.x, point.y)) {
            return kh2.j.r2(jVar, point, kVar.f93002i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (r2 != 6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o62.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
