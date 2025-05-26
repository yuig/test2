package c2;

/* loaded from: classes2.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public w f24987r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24988s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f24989t;

    /* renamed from: u, reason: collision with root package name */
    public int f24990u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, bl2.c cVar) {
        super(cVar);
        this.f24989t = wVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f24988s = obj;
        this.f24990u |= Integer.MIN_VALUE;
        return this.f24989t.a(null, null, null, this);
    }
}
