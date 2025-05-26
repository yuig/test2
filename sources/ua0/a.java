package ua0;

/* loaded from: classes5.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121388r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f121389s;

    /* renamed from: t, reason: collision with root package name */
    public int f121390t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, bl2.c cVar) {
        super(cVar);
        this.f121389s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f121388r = obj;
        this.f121390t |= Integer.MIN_VALUE;
        return this.f121389s.l(null, null, this);
    }
}
