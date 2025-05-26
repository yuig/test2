package vc;

/* loaded from: classes.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f125550r;

    /* renamed from: s, reason: collision with root package name */
    public int f125551s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l5.c f125552t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l5.c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f125552t = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f125550r = obj;
        this.f125551s |= Integer.MIN_VALUE;
        return this.f125552t.emit(null, this);
    }
}
