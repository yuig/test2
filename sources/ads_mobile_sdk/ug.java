package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ug extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f12068a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f12069b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg f12071d;

    /* renamed from: e, reason: collision with root package name */
    public int f12072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(yg ygVar, bl2.c cVar) {
        super(cVar);
        this.f12071d = ygVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12070c = obj;
        this.f12072e |= Integer.MIN_VALUE;
        return this.f12071d.a(null, this);
    }
}
