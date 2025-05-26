package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ct extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dt f4025b;

    /* renamed from: c, reason: collision with root package name */
    public int f4026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(dt dtVar, bl2.c cVar) {
        super(cVar);
        this.f4025b = dtVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4024a = obj;
        this.f4026c |= Integer.MIN_VALUE;
        return this.f4025b.a((a.b) null, this);
    }
}
