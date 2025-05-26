package n90;

import com.pinterest.api.model.i50;
import i2.o;
import java.util.List;
import kh2.g0;
import kh2.s0;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import ra0.j0;
import w21.e1;

/* loaded from: classes5.dex */
public final class j extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f90009j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f90010k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f90011l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(float f13, float f14, int i13, Object obj) {
        super(2);
        this.f90008i = i13;
        this.f90011l = obj;
        this.f90009j = f13;
        this.f90010k = f14;
    }

    public final void b(o oVar, int i13) {
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f90008i;
        Object obj = this.f90011l;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                int i15 = 0;
                for (Object obj2 : (List) obj) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        f0.p();
                        throw null;
                    }
                    wa0.c cVar = (wa0.c) obj2;
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(847535314);
                    boolean f13 = sVar2.f(i15);
                    Object J2 = sVar2.J();
                    if (f13 || J2 == i2.n.f71185a) {
                        ol2.f.f96454a.getClass();
                        J2 = Float.valueOf((ol2.f.f96455b.h().nextFloat() * 60) - 30);
                        sVar2.g0(J2);
                    }
                    float floatValue = ((Number) J2).floatValue();
                    sVar2.r(false);
                    s0.d(new j0(cVar.f128624a), g0.m0(nVar, floatValue), this.f90009j, this.f90010k, null, sVar2, 0, 16);
                    i15 = i16;
                }
                return;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                String e13 = ((i50) obj).e();
                if (e13 == null) {
                    e13 = "";
                }
                e1.c(e13, androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.k(nVar, this.f90009j, this.f90010k), v1.i.a(com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar))), oVar, 0, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f90008i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
