package w21;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f127629j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f127630k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127631i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(2);
        this.f127631i = i13;
    }

    public final void b(i2.o oVar, int i13) {
        u2.n nVar = u2.n.f120041b;
        switch (this.f127631i) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                Intrinsics.checkNotNullParameter(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, "string");
                dl2.b.c(new rn1.a(new u50.f0(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE), null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.HEADING_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), androidx.compose.foundation.layout.e.k(nVar, com.bumptech.glide.d.A(db0.a.pin_selection_number_card_dimension, oVar), com.bumptech.glide.d.A(db0.a.pin_selection_number_card_dimension, oVar)), null, null, oVar, 8, 12);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                Intrinsics.checkNotNullParameter("2", "string");
                dl2.b.c(new rn1.a(new u50.f0("2"), null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.HEADING_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), androidx.compose.foundation.layout.e.k(nVar, com.bumptech.glide.d.A(db0.a.pin_selection_number_card_dimension, oVar), com.bumptech.glide.d.A(db0.a.pin_selection_number_card_dimension, oVar)), null, null, oVar, 8, 12);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127631i) {
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
