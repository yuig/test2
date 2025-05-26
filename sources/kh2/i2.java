package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class i2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79539i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f79540j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(j2 j2Var, int i13) {
        super(0);
        this.f79539i = i13;
        this.f79540j = j2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79539i;
        j2 j2Var = this.f79540j;
        switch (i13) {
            case 0:
                return (a) j2Var.f79555g.invoke(j2Var.f79550b, j2Var.d());
            case 1:
                return ((m) j2Var.c()).b();
            case 2:
                m mVar = (m) j2Var.c();
                return (vg2.c) mVar.f79611d.a(mVar, m.f79607g[3]);
            default:
                return (d3) j2Var.f79557i.invoke(j2Var.f79550b, j2Var.d(), j2Var.m());
        }
    }
}
