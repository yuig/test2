package cn0;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f28063r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f28064s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f28065t;

    /* renamed from: u, reason: collision with root package name */
    public int f28066u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, bl2.c cVar) {
        super(cVar);
        this.f28065t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f28064s = obj;
        this.f28066u |= Integer.MIN_VALUE;
        return this.f28065t.a(this);
    }
}
