package zw0;

/* loaded from: classes5.dex */
public final class u extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f142934r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i90.i f142935s;

    /* renamed from: t, reason: collision with root package name */
    public int f142936t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i90.i iVar, bl2.c cVar) {
        super(cVar);
        this.f142935s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f142934r = obj;
        this.f142936t |= Integer.MIN_VALUE;
        return this.f142935s.a(0, null, null, null, this);
    }
}
