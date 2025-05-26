package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class kt extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lt f7490b;

    /* renamed from: c, reason: collision with root package name */
    public int f7491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(lt ltVar, bl2.c cVar) {
        super(cVar);
        this.f7490b = ltVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7489a = obj;
        this.f7491c |= Integer.MIN_VALUE;
        return this.f7490b.a((a.b) null, this);
    }
}
