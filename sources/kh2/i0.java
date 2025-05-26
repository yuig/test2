package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79525i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f79526j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f79527k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f79528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f79529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0 f79530n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Function0 function0, k kVar, o oVar, b1 b1Var, l0 l0Var, int i13) {
        super(0);
        this.f79525i = i13;
        this.f79526j = function0;
        this.f79527k = kVar;
        this.f79528l = oVar;
        this.f79529m = b1Var;
        this.f79530n = l0Var;
    }

    public final dh2.e b() {
        int i13 = this.f79525i;
        l0 l0Var = this.f79530n;
        b1 b1Var = this.f79529m;
        o oVar = this.f79528l;
        dh2.e eVar = null;
        k kVar = this.f79527k;
        Function0 function0 = this.f79526j;
        switch (i13) {
            case 0:
                if (function0 == null || (r0 = (dh2.e) function0.invoke()) == null) {
                    if (!((sg2.b) ((m) kVar).b()).a()) {
                        d1 d1Var = (d1) b1Var;
                        eVar = new dh2.e(dh2.f.CACHE.asFile(((q) oVar).b(), d1Var.f79456b), l0.a(l0Var), l0Var.f79586a, d1Var.f79456b);
                    }
                    break;
                }
                break;
            default:
                if (function0 == null || (r0 = (dh2.e) function0.invoke()) == null) {
                    if (!((sg2.b) ((m) kVar).b()).a()) {
                        d1 d1Var2 = (d1) b1Var;
                        eVar = new dh2.e(dh2.f.PAYLOAD.asFile(((q) oVar).b(), d1Var2.f79456b), l0.a(l0Var), l0Var.f79586a, d1Var2.f79456b);
                    }
                    break;
                }
                break;
        }
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f79525i) {
        }
        return b();
    }
}
