package yc;

import kotlin.jvm.functions.Function0;
import lb.l0;
import pc.o0;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f138643i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pc.v f138644j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f138645k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wc.a f138646l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o0 o0Var, pc.v vVar, q qVar, wc.a aVar) {
        super(0);
        this.f138643i = o0Var;
        this.f138644j = vVar;
        this.f138645k = qVar;
        this.f138646l = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q qVar = this.f138645k;
        return l0.U0(this.f138643i, this.f138644j, (xc.e) qVar.f138662e.getValue(), qVar.f138659b, this.f138646l);
    }
}
