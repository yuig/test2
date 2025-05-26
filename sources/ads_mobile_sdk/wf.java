package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wf extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public fg f13016a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f13017b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg f13019d;

    /* renamed from: e, reason: collision with root package name */
    public int f13020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(fg fgVar, bl2.c cVar) {
        super(cVar);
        this.f13019d = fgVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13018c = obj;
        this.f13020e |= Integer.MIN_VALUE;
        return fg.a(this.f13019d, this);
    }
}
