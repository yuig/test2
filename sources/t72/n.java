package t72;

/* loaded from: classes4.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116671r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f116672s;

    /* renamed from: t, reason: collision with root package name */
    public int f116673t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, bl2.c cVar) {
        super(cVar);
        this.f116672s = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116671r = obj;
        this.f116673t |= Integer.MIN_VALUE;
        return this.f116672s.m(null, this);
    }
}
