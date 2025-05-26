package c2;

/* loaded from: classes2.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public w f24869r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24870s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f24871t;

    /* renamed from: u, reason: collision with root package name */
    public int f24872u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w wVar, bl2.c cVar) {
        super(cVar);
        this.f24871t = wVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f24870s = obj;
        this.f24872u |= Integer.MIN_VALUE;
        return this.f24871t.b(null, null, this);
    }
}
