package jz0;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f77755r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f77756s;

    /* renamed from: t, reason: collision with root package name */
    public int f77757t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, bl2.c cVar) {
        super(cVar);
        this.f77756s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f77755r = obj;
        this.f77757t |= Integer.MIN_VALUE;
        return this.f77756s.i(null, this);
    }
}
