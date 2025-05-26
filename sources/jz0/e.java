package jz0;

/* loaded from: classes5.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f77760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f77761s;

    /* renamed from: t, reason: collision with root package name */
    public int f77762t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, bl2.c cVar) {
        super(cVar);
        this.f77761s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f77760r = obj;
        this.f77762t |= Integer.MIN_VALUE;
        return this.f77761s.i(null, this);
    }
}
