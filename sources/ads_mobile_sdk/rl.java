package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class rl extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public tl f10671a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f10672b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl f10674d;

    /* renamed from: e, reason: collision with root package name */
    public int f10675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(tl tlVar, bl2.c cVar) {
        super(cVar);
        this.f10674d = tlVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10673c = obj;
        this.f10675e |= Integer.MIN_VALUE;
        return this.f10674d.b(this);
    }
}
