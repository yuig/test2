package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class br extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f3563a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3564b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f3566d;

    /* renamed from: e, reason: collision with root package name */
    public int f3567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f3566d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3565c = obj;
        this.f3567e |= Integer.MIN_VALUE;
        return zr.g(this.f3566d, this);
    }
}
