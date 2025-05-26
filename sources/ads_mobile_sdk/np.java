package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class np extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public wp f8900a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f8901b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8902c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp f8904e;

    /* renamed from: f, reason: collision with root package name */
    public int f8905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(wp wpVar, bl2.c cVar) {
        super(cVar);
        this.f8904e = wpVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8903d = obj;
        this.f8905f |= Integer.MIN_VALUE;
        return wp.a(this.f8904e, false, null, this);
    }
}
