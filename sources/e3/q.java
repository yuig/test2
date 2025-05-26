package e3;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import b3.u;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class q extends View {

    /* renamed from: j */
    public static final p f57109j = new p(0);

    /* renamed from: a */
    public final h1.b f57110a;

    /* renamed from: b */
    public final d3.c f57111b;

    /* renamed from: c */
    public boolean f57112c;

    /* renamed from: d */
    public Outline f57113d;

    /* renamed from: e */
    public boolean f57114e;

    /* renamed from: f */
    public n4.b f57115f;

    /* renamed from: g */
    public n4.k f57116g;

    /* renamed from: h */
    public Function1 f57117h;

    /* renamed from: i */
    public d f57118i;

    public q(View view, h1.b bVar, d3.c cVar) {
        super(view.getContext());
        this.f57110a = bVar;
        this.f57111b = cVar;
        setOutlineProvider(f57109j);
        this.f57114e = true;
        this.f57115f = d3.f.f53656a;
        this.f57116g = n4.k.Ltr;
        f.f57029a.getClass();
        this.f57117h = c.f57002k;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h1.b bVar = this.f57110a;
        Object obj = bVar.f66449b;
        Canvas canvas2 = ((b3.d) obj).f21309a;
        ((b3.d) obj).f21309a = canvas;
        b3.d dVar = (b3.d) obj;
        n4.b bVar2 = this.f57115f;
        n4.k kVar = this.f57116g;
        long c13 = bs1.c.c(getWidth(), getHeight());
        d dVar2 = this.f57118i;
        Function1 function1 = this.f57117h;
        d3.c cVar = this.f57111b;
        n4.b b13 = cVar.p0().b();
        n4.k d2 = cVar.p0().d();
        u a13 = cVar.p0().a();
        long e13 = cVar.p0().e();
        d dVar3 = cVar.p0().f53649b;
        d3.b p03 = cVar.p0();
        p03.g(bVar2);
        p03.i(kVar);
        p03.f(dVar);
        p03.j(c13);
        p03.f53649b = dVar2;
        dVar.j();
        try {
            function1.invoke(cVar);
            dVar.restore();
            d3.b p04 = cVar.p0();
            p04.g(b13);
            p04.i(d2);
            p04.f(a13);
            p04.j(e13);
            p04.f53649b = dVar3;
            ((b3.d) bVar.f66449b).f21309a = canvas2;
            this.f57112c = false;
        } catch (Throwable th3) {
            dVar.restore();
            d3.b p05 = cVar.p0();
            p05.g(b13);
            p05.i(d2);
            p05.f(a13);
            p05.j(e13);
            p05.f53649b = dVar3;
            throw th3;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f57114e;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f57112c) {
            return;
        }
        this.f57112c = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }
}
