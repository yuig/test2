package x2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import b3.u;
import kotlin.jvm.functions.Function1;
import n4.k;

/* loaded from: classes2.dex */
public final class a extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final n4.b f131577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f131578b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f131579c;

    public a(n4.c cVar, long j13, Function1 function1) {
        this.f131577a = cVar;
        this.f131578b = j13;
        this.f131579c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        d3.c cVar = new d3.c();
        k kVar = k.Ltr;
        b3.d a13 = b3.e.a(canvas);
        d3.a aVar = cVar.f53651a;
        n4.b bVar = aVar.f53644a;
        k kVar2 = aVar.f53645b;
        u uVar = aVar.f53646c;
        long j13 = aVar.f53647d;
        aVar.f53644a = this.f131577a;
        aVar.f53645b = kVar;
        aVar.f53646c = a13;
        aVar.f53647d = this.f131578b;
        a13.j();
        this.f131579c.invoke(cVar);
        a13.restore();
        aVar.f53644a = bVar;
        aVar.f53645b = kVar2;
        aVar.f53646c = uVar;
        aVar.f53647d = j13;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j13 = this.f131578b;
        float d2 = a3.f.d(j13);
        n4.b bVar = this.f131577a;
        point.set(bVar.R(bVar.g0(d2)), bVar.R(bVar.g0(a3.f.b(j13))));
        point2.set(point.x / 2, point.y / 2);
    }
}
