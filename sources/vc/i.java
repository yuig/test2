package vc;

/* loaded from: classes3.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f125531r;

    /* renamed from: s, reason: collision with root package name */
    public int f125532s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f125533t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bl2.c cVar) {
        super(cVar);
        this.f125533t = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f125531r = obj;
        this.f125532s |= Integer.MIN_VALUE;
        return this.f125533t.emit(null, this);
    }
}
