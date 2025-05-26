package eo2;

/* loaded from: classes4.dex */
public final class y extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f59851r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yc.t f59852s;

    /* renamed from: t, reason: collision with root package name */
    public int f59853t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yc.t tVar, bl2.c cVar) {
        super(cVar);
        this.f59852s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f59851r = obj;
        this.f59853t |= Integer.MIN_VALUE;
        return this.f59852s.emit(null, this);
    }
}
