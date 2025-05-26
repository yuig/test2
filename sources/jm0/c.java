package jm0;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f76957r;

    /* renamed from: s, reason: collision with root package name */
    public int f76958s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f76959t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f76959t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f76957r = obj;
        this.f76958s |= Integer.MIN_VALUE;
        return this.f76959t.emit(null, this);
    }
}
