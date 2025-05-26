package eo2;

/* loaded from: classes4.dex */
public final class a0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f59735r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.t f59736s;

    /* renamed from: t, reason: collision with root package name */
    public int f59737t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(do2.t tVar, bl2.c cVar) {
        super(cVar);
        this.f59736s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f59735r = obj;
        this.f59737t |= Integer.MIN_VALUE;
        return this.f59736s.emit(null, this);
    }
}
