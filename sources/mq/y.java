package mq;

/* loaded from: classes3.dex */
public final class y extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88041r;

    /* renamed from: s, reason: collision with root package name */
    public int f88042s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f88043t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f88043t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f88041r = obj;
        this.f88042s |= Integer.MIN_VALUE;
        return this.f88043t.emit(null, this);
    }
}
