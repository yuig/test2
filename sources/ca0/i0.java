package ca0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s80.l7;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27127i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f27128j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u50.r f27129k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(d dVar, u50.r rVar, int i13) {
        super(3);
        this.f27127i = i13;
        this.f27128j = dVar;
        this.f27129k = rVar;
    }

    public final void b(q1.c item, i2.o oVar, int i13) {
        int i14 = this.f27127i;
        u50.r rVar = this.f27129k;
        d dVar = this.f27128j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                n0.b(z0.Title, null, dVar.f27085d, new p70.a(rVar, 4), null, oVar, 6, 18);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                n0.b(z0.Description, null, dVar.f27086e, new p70.a(rVar, 5), null, oVar, 6, 18);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                n0.c(dVar.f27091j, null, new j0(rVar, 0), oVar, 0, 2);
                break;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                l3.c.c(new on1.k(new on1.b(dVar.f27088g, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), u50.g0.b(new String[0], l7.publish_option_enable_remix_title), u50.g0.b(new String[0], l7.publish_option_enable_remix_description), fm1.c.VISIBLE, on1.n.START, on1.l.LEFT, Integer.MIN_VALUE), androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f), 0.0f, 0.0f, 0.0f, com.bumptech.glide.d.A(eo1.c.space_200, oVar), 7), new p70.a(rVar, 6), oVar, 8, 0);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f27127i) {
            case 0:
                b((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 1:
                b((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 2:
                b((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            default:
                b((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
