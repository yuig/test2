package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class kq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f7442a;

    /* renamed from: b, reason: collision with root package name */
    public aq f7443b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f7445d;

    /* renamed from: e, reason: collision with root package name */
    public int f7446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f7445d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7444c = obj;
        this.f7446e |= Integer.MIN_VALUE;
        return this.f7445d.j(this);
    }
}
