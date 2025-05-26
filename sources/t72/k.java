package t72;

/* loaded from: classes4.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116664r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f116665s;

    /* renamed from: t, reason: collision with root package name */
    public int f116666t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(cVar);
        this.f116665s = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116664r = obj;
        this.f116666t |= Integer.MIN_VALUE;
        return this.f116665s.a(null, null, this);
    }
}
