package uu;

/* loaded from: classes3.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f123116r;

    /* renamed from: s, reason: collision with root package name */
    public int f123117s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f123118t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f123118t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f123116r = obj;
        this.f123117s |= Integer.MIN_VALUE;
        return this.f123118t.emit(null, this);
    }
}
