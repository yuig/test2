package ca0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t3.s3;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27119i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f27120j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s3 f27121k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u50.r f27122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(d dVar, s3 s3Var, u50.r rVar, int i13) {
        super(2);
        this.f27119i = i13;
        this.f27120j = dVar;
        this.f27121k = s3Var;
        this.f27122l = rVar;
    }

    public final void b(i2.o oVar, int i13) {
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f27119i;
        u50.r rVar = this.f27122l;
        s3 s3Var = this.f27121k;
        d dVar = this.f27120j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                n0.f(dVar.f27082a, nc0.e.a(k3.b0(oVar), eo1.c.space_100), androidx.compose.foundation.layout.e.b(nVar, 1.0f), new g0(s3Var, rVar, 0), 0.0f, oVar, 392, 16);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                n0.d(androidx.compose.foundation.layout.e.b(nVar, 1.0f), dVar.f27092k, new g0(s3Var, rVar, 1), new g0(s3Var, rVar, 2), 0L, dVar.f27089h, null, 0.0f, oVar, 262150, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27119i) {
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
