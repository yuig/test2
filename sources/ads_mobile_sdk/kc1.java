package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class kc1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public String f7217a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc1 f7219c;

    /* renamed from: d, reason: collision with root package name */
    public int f7220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(lc1 lc1Var, bl2.c cVar) {
        super(cVar);
        this.f7219c = lc1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7218b = obj;
        this.f7220d |= Integer.MIN_VALUE;
        return this.f7219c.a(null, null, this);
    }
}
