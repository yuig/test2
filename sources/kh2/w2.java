package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class w2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2 f79731j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(y2 y2Var, int i13) {
        super(0);
        this.f79730i = i13;
        this.f79731j = y2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79730i;
        y2 y2Var = this.f79731j;
        switch (i13) {
            case 0:
                y2Var.getClass();
                return (gh2.d) y2Var.f79758h.a(y2Var, y2.f79750l[7]);
            default:
                y2Var.getClass();
                rl2.u[] uVarArr = y2.f79750l;
                return new hh2.a((fh2.a) y2Var.f79759i.a(y2Var, uVarArr[8]), (gh2.d) y2Var.f79758h.a(y2Var, uVarArr[7]), (hh2.b) y2Var.f79752b.a(y2Var, uVarArr[1]));
        }
    }
}
