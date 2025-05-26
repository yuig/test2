package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ru extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f10799a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f10800b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu f10802d;

    /* renamed from: e, reason: collision with root package name */
    public int f10803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(vu vuVar, bl2.c cVar) {
        super(cVar);
        this.f10802d = vuVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10801c = obj;
        this.f10803e |= Integer.MIN_VALUE;
        return this.f10802d.f(this);
    }
}
