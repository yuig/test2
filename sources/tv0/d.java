package tv0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119514i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f119515j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f119514i = i13;
        this.f119515j = eVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f119514i;
        e eVar = this.f119515j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], eVar.Y7()), eVar.getF119532p0().f119501b, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, eVar.getF119532p0().f119503d, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119514i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, this.f119515j.getF119532p0().f119502c, null, null, false, 0, 1019);
        }
    }
}
