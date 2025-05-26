package pu;

/* loaded from: classes3.dex */
public final class d0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f101337r;

    /* renamed from: s, reason: collision with root package name */
    public int f101338s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f101339t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f101339t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f101337r = obj;
        this.f101338s |= Integer.MIN_VALUE;
        return this.f101339t.emit(null, this);
    }
}
