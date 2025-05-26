package we1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129631i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ re1.p f129632j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(re1.p pVar, int i13) {
        super(1);
        this.f129631i = i13;
        this.f129632j = pVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f129631i;
        re1.p pVar = this.f129632j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, pVar.f107626d.f107630a, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, pVar.f107626d.f107631b, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f129631i) {
        }
        return b((rn1.a) obj);
    }
}
