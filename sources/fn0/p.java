package fn0;

import android.graphics.PointF;
import android.util.SizeF;
import android.view.Surface;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f62654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Surface f62655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f62656t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, Surface surface, g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f62654r = tVar;
        this.f62655s = surface;
        this.f62656t = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f62654r, this.f62655s, this.f62656t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        hn0.h hVar = new hn0.h();
        e eVar = this.f62654r.f62667d;
        if (eVar == null) {
            Intrinsics.r("videoExtractor");
            throw null;
        }
        hVar.d(eVar.a(), this.f62655s);
        g gVar = this.f62656t;
        SizeF watermarkFrameSize = gVar.f62625b;
        Intrinsics.checkNotNullParameter(watermarkFrameSize, "watermarkFrameSize");
        PointF translation = gVar.f62626c;
        Intrinsics.checkNotNullParameter(translation, "translation");
        float width = watermarkFrameSize.getWidth();
        if (hVar.f69633e == null) {
            Intrinsics.r("inputSize");
            throw null;
        }
        float width2 = width / r4.getWidth();
        float height = watermarkFrameSize.getHeight();
        if (hVar.f69633e == null) {
            Intrinsics.r("inputSize");
            throw null;
        }
        float height2 = height / r4.getHeight();
        dn0.b bVar = new dn0.b(null, 1);
        bVar.f55606h = ql2.s.f(width2, 1.0E-6f, 1.0f);
        bVar.f55607i = ql2.s.f(height2, 1.0E-6f, 1.0f);
        if (bVar.f55600b != null) {
            bVar.h(bVar.f55608j, bVar.f55609k);
        }
        float f13 = translation.x;
        float f14 = translation.y;
        bVar.f55604f = f13;
        bVar.f55605g = f14;
        if (bVar.f55600b != null) {
            bVar.h(bVar.f55608j, bVar.f55609k);
        }
        bVar.h(0, true);
        hVar.f69636h = bVar;
        return hVar;
    }
}
