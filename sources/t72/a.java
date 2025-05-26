package t72;

/* loaded from: classes4.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116623r;

    /* renamed from: s, reason: collision with root package name */
    public int f116624s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f116625t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f116625t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116623r = obj;
        this.f116624s |= Integer.MIN_VALUE;
        return this.f116625t.emit(null, this);
    }
}
