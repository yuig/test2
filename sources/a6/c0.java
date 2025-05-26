package a6;

/* loaded from: classes.dex */
public final class c0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j0 f803r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f804s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f805t;

    /* renamed from: u, reason: collision with root package name */
    public int f806u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f805t = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f804s = obj;
        this.f806u |= Integer.MIN_VALUE;
        return this.f805t.f(this);
    }
}
