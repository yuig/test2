package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ve extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ we f12467b;

    /* renamed from: c, reason: collision with root package name */
    public int f12468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(we weVar, bl2.c cVar) {
        super(cVar);
        this.f12467b = weVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12466a = obj;
        this.f12468c |= Integer.MIN_VALUE;
        return this.f12467b.c(this);
    }
}
