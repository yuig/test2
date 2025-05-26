package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class g32 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public r32 f5381a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r32 f5383c;

    /* renamed from: d, reason: collision with root package name */
    public int f5384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g32(r32 r32Var, bl2.c cVar) {
        super(cVar);
        this.f5383c = r32Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5382b = obj;
        this.f5384d |= Integer.MIN_VALUE;
        return this.f5383c.a(this);
    }
}
