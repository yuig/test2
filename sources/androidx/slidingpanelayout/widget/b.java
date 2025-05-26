package androidx.slidingpanelayout.widget;

/* loaded from: classes3.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f19785r;

    /* renamed from: s, reason: collision with root package name */
    public int f19786s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f19787t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f19787t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f19785r = obj;
        this.f19786s |= Integer.MIN_VALUE;
        return this.f19787t.emit(null, this);
    }
}
