package qm0;

/* loaded from: classes5.dex */
public final class k0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f104292r;

    /* renamed from: s, reason: collision with root package name */
    public int f104293s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f104294t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f104294t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f104292r = obj;
        this.f104293s |= Integer.MIN_VALUE;
        return this.f104294t.emit(null, this);
    }
}
