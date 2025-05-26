package i2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public x1 f71335r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f71336s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f71337t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x1 f71338u;

    /* renamed from: v, reason: collision with root package name */
    public int f71339v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, bl2.c cVar) {
        super(cVar);
        this.f71338u = x1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f71337t = obj;
        this.f71339v |= Integer.MIN_VALUE;
        return this.f71338u.d(null, this);
    }
}
