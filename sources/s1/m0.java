package s1;

import k1.v1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public o0 f110479r;

    /* renamed from: s, reason: collision with root package name */
    public v1 f110480s;

    /* renamed from: t, reason: collision with root package name */
    public Function2 f110481t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f110482u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0 f110483v;

    /* renamed from: w, reason: collision with root package name */
    public int f110484w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, bl2.c cVar) {
        super(cVar);
        this.f110483v = o0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f110482u = obj;
        this.f110484w |= Integer.MIN_VALUE;
        return o0.t(this.f110483v, null, null, this);
    }
}
