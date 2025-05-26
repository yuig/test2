package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f71188i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q2.j f71189j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1.z f71190k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f71191l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, q2.j jVar, g1.z zVar, int i13) {
        super(1);
        this.f71188i = o0Var;
        this.f71189j = jVar;
        this.f71190k = zVar;
        this.f71191l = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (obj == this.f71188i) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (obj instanceof s2.z) {
            int i13 = this.f71189j.f102114a - this.f71191l;
            g1.z zVar = this.f71190k;
            int e13 = zVar.e(obj);
            zVar.i(Math.min(i13, e13 >= 0 ? zVar.f63355c[e13] : Integer.MAX_VALUE), obj);
        }
        return Unit.f80348a;
    }
}
