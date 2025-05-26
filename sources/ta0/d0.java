package ta0;

import r72.f2;

/* loaded from: classes5.dex */
public final class d0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f0 f116855r;

    /* renamed from: s, reason: collision with root package name */
    public f2 f116856s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f116857t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f0 f116858u;

    /* renamed from: v, reason: collision with root package name */
    public int f116859v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, bl2.c cVar) {
        super(cVar);
        this.f116858u = f0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116857t = obj;
        this.f116859v |= Integer.MIN_VALUE;
        return this.f116858u.a(null, this);
    }
}
