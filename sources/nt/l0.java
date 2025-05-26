package nt;

import java.util.List;

/* loaded from: classes3.dex */
public final class l0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f92086r;

    /* renamed from: s, reason: collision with root package name */
    public List f92087s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f92088t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q0 f92089u;

    /* renamed from: v, reason: collision with root package name */
    public int f92090v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(q0 q0Var, bl2.c cVar) {
        super(cVar);
        this.f92089u = q0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92088t = obj;
        this.f92090v |= Integer.MIN_VALUE;
        return q0.j(this.f92089u, null, null, null, this);
    }
}
