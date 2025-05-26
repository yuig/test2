package c3;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f25537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i13) {
        super(1);
        this.f25536i = i13;
        this.f25537j = sVar;
    }

    public final Double b(double d2) {
        int i13 = this.f25536i;
        s sVar = this.f25537j;
        switch (i13) {
            case 0:
                return Double.valueOf(sVar.f25549n.i(ql2.s.e(d2, sVar.f25540e, sVar.f25541f)));
            default:
                return Double.valueOf(ql2.s.e(sVar.f25546k.i(d2), sVar.f25540e, sVar.f25541f));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25536i) {
        }
        return b(((Number) obj).doubleValue());
    }
}
