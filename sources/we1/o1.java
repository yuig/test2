package we1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129534i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ re1.r f129535j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(re1.r rVar, int i13) {
        super(1);
        this.f129534i = i13;
        this.f129535j = rVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f129534i;
        re1.r rVar = this.f129535j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h23 = bs1.c.h2(rVar.f107649k);
                fm1.c cVar = fm1.c.VISIBLE;
                re1.v vVar = rVar.f107650l;
                return rn1.a.y(it, h23, vVar.f107681a, null, kotlin.collections.e0.b(vVar.f107683c), null, 0, cVar, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097076);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h24 = bs1.c.h2(rVar.f107646h);
                fm1.c cVar2 = fm1.c.VISIBLE;
                re1.v vVar2 = rVar.f107648j;
                return rn1.a.y(it, h24, vVar2.f107681a, kotlin.collections.e0.b(vVar2.f107682b), kotlin.collections.e0.b(vVar2.f107683c), rVar.f107645g.f107631b, 0, cVar2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097056);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(rVar.f107648j.f107682b), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(rVar.f107650l.f107682b), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, rVar.f107645g.f107630a, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, rVar.f107645g.f107631b, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f129534i) {
        }
        return b((rn1.a) obj);
    }
}
