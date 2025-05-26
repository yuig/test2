package cj0;

/* loaded from: classes5.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27835r;

    /* renamed from: s, reason: collision with root package name */
    public int f27836s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f27837t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f27837t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f27835r = obj;
        this.f27836s |= Integer.MIN_VALUE;
        return this.f27837t.emit(null, this);
    }
}
