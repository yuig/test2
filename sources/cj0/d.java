package cj0;

import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27792i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f27793j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(2);
        this.f27792i = i13;
        this.f27793j = fVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f27792i;
        f fVar = this.f27793j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                u2.q r13 = androidx.compose.foundation.layout.b.r(u2.n.f120041b, 0.0f, 0.0f, 0.0f, com.bumptech.glide.d.A(eo1.c.space_300, oVar), 7);
                ej0.a aVar = (ej0.a) fVar.f27813a.getValue();
                f fVar2 = this.f27793j;
                k3.d(aVar, r13, new c(2, fVar2, f.class, "onTitleLayout", "onTitleLayout(ILandroidx/compose/ui/geometry/Rect;)V", 0), new hh0.a(fVar2, 13), oVar, 8, 0);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                f.a(fVar, oVar, 8);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27792i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
