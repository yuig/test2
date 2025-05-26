package ek1;

import kotlin.jvm.functions.Function0;
import so.uc;
import so.vb;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.e f59255j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1 f59256k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(l82.e eVar, r1 r1Var, int i13) {
        super(0);
        this.f59254i = i13;
        this.f59255j = eVar;
        this.f59256k = r1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f59254i;
        r1 r1Var = this.f59256k;
        l82.e eVar = this.f59255j;
        switch (i13) {
            case 0:
                eVar.a(new l0(uc.f114662a));
                return Boolean.valueOf(r1Var.f59342d.f90848d);
            default:
                eVar.a(new l0(vb.f114677a));
                return Boolean.valueOf(r1Var.f59342d.D);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f59254i) {
        }
        return invoke();
    }
}
