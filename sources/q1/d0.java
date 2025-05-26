package q1;

import k1.v1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h0 f101883r;

    /* renamed from: s, reason: collision with root package name */
    public v1 f101884s;

    /* renamed from: t, reason: collision with root package name */
    public Function2 f101885t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f101886u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h0 f101887v;

    /* renamed from: w, reason: collision with root package name */
    public int f101888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, bl2.c cVar) {
        super(cVar);
        this.f101887v = h0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f101886u = obj;
        this.f101888w |= Integer.MIN_VALUE;
        return this.f101887v.b(null, null, this);
    }
}
