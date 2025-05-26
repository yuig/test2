package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class qf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf1 f10064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm.u f10065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if1 f10066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f10064b = uf1Var;
        this.f10065c = uVar;
        this.f10066d = if1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new qf1(this.f10066d, this.f10064b, this.f10065c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
