package nt;

/* loaded from: classes3.dex */
public final class r2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92164r;

    /* renamed from: s, reason: collision with root package name */
    public int f92165s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fd.q f92166t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(fd.q qVar, bl2.c cVar) {
        super(cVar);
        this.f92166t = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92164r = obj;
        this.f92165s |= Integer.MIN_VALUE;
        return this.f92166t.emit(null, this);
    }
}
