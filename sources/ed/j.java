package ed;

import k1.j0;

/* loaded from: classes3.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f58481r;

    /* renamed from: s, reason: collision with root package name */
    public int f58482s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f58483t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f58483t = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f58481r = obj;
        this.f58482s |= Integer.MIN_VALUE;
        return this.f58483t.emit(null, this);
    }
}
