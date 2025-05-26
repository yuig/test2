package eo2;

/* loaded from: classes2.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f59823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f59824s;

    /* renamed from: t, reason: collision with root package name */
    public int f59825t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(cVar);
        this.f59824s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f59823r = obj;
        this.f59825t |= Integer.MIN_VALUE;
        return this.f59824s.emit(null, this);
    }
}
