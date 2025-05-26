package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qp extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public wp f10210a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f10211b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp f10213d;

    /* renamed from: e, reason: collision with root package name */
    public int f10214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(wp wpVar, bl2.c cVar) {
        super(cVar);
        this.f10213d = wpVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10212c = obj;
        this.f10214e |= Integer.MIN_VALUE;
        return wp.a(this.f10213d, this);
    }
}
