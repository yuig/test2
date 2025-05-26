package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f6052a;

    /* renamed from: b, reason: collision with root package name */
    public aq f6053b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f6055d;

    /* renamed from: e, reason: collision with root package name */
    public int f6056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f6055d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6054c = obj;
        this.f6056e |= Integer.MIN_VALUE;
        return this.f6055d.u(this);
    }
}
