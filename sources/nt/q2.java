package nt;

/* loaded from: classes3.dex */
public final class q2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92148r;

    /* renamed from: s, reason: collision with root package name */
    public int f92149s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f92150t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f92150t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92148r = obj;
        this.f92149s |= Integer.MIN_VALUE;
        return this.f92150t.emit(null, this);
    }
}
