package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class lr1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7934a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f7935b;

    /* renamed from: c, reason: collision with root package name */
    public tr1 f7936c;

    /* renamed from: d, reason: collision with root package name */
    public int f7937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ln0 f7938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr1 f7939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr1(ln0 ln0Var, tr1 tr1Var, bl2.c cVar) {
        super(2, cVar);
        this.f7938e = ln0Var;
        this.f7939f = tr1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new lr1(this.f7938e, this.f7939f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lr1(this.f7938e, this.f7939f, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
