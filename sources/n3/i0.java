package n3;

import ao2.k2;

/* loaded from: classes2.dex */
public final class i0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public k2 f89066r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89067s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0 f89068t;

    /* renamed from: u, reason: collision with root package name */
    public int f89069u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, bl2.c cVar) {
        super(cVar);
        this.f89068t = l0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f89067s = obj;
        this.f89069u |= Integer.MIN_VALUE;
        return this.f89068t.l(0L, null, this);
    }
}
