package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class pt2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public qt2 f9810a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qt2 f9812c;

    /* renamed from: d, reason: collision with root package name */
    public int f9813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt2(qt2 qt2Var, bl2.c cVar) {
        super(cVar);
        this.f9812c = qt2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9811b = obj;
        this.f9813d |= Integer.MIN_VALUE;
        return this.f9812c.j(this);
    }
}
