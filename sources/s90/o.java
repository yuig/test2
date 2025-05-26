package s90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111995i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f111996j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(v vVar, int i13) {
        super(2);
        this.f111995i = i13;
        this.f111996j = vVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f111995i;
        v vVar = this.f111996j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                t90.f.a((t90.o) vVar.f112030d0.getValue(), androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f), com.bumptech.glide.d.A(eo1.c.space_300, oVar), 0.0f, 2), null, null, null, oVar, 8, 28);
                break;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                n3.e((r0) vVar.f112032f0.getValue(), null, oVar, 8, 2);
                break;
            case 2:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                kg.t.c((t0) vVar.f112031e0.getValue(), null, new q(vVar, 0), null, null, new q(vVar, 1), null, 0.0f, oVar, 0, RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER);
                break;
            case 3:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                v.Y7(vVar, oVar, 8);
                break;
            case 4:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                v.a8(vVar, oVar, 8);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        break;
                    }
                }
                v.Z7(vVar, oVar, 8);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111995i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
