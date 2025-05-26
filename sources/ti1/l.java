package ti1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l implements wa2.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f117722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wa2.a f117723c;

    public /* synthetic */ l(wa2.a aVar, v42.j jVar, int i13) {
        this.f117721a = i13;
        this.f117723c = aVar;
        this.f117722b = jVar;
    }

    @Override // wa2.q
    public final void a() {
        int i13 = this.f117721a;
        Function2 function2 = this.f117722b;
        wa2.a aVar = this.f117723c;
        switch (i13) {
            case 0:
                wa2.s sVar = (wa2.s) aVar;
                function2.invoke(Integer.valueOf(sVar.f128842e), Integer.valueOf(sVar.f128841d));
                break;
            default:
                yi1.p pVar = (yi1.p) aVar;
                function2.invoke(Integer.valueOf(pVar.f128842e), Integer.valueOf(pVar.f128841d));
                break;
        }
    }
}
