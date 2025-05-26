package p90;

/* loaded from: classes5.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f99219r;

    /* renamed from: s, reason: collision with root package name */
    public int f99220s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f99221t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f99221t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f99219r = obj;
        this.f99220s |= Integer.MIN_VALUE;
        return this.f99221t.emit(null, this);
    }
}
