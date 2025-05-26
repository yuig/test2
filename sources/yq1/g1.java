package yq1;

/* loaded from: classes4.dex */
public final class g1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f139851r;

    /* renamed from: s, reason: collision with root package name */
    public int f139852s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f139853t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f139853t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f139851r = obj;
        this.f139852s |= Integer.MIN_VALUE;
        return this.f139853t.emit(null, this);
    }
}
