package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gz extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hz f5767b;

    /* renamed from: c, reason: collision with root package name */
    public int f5768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(hz hzVar, bl2.c cVar) {
        super(cVar);
        this.f5767b = hzVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5766a = obj;
        this.f5768c |= Integer.MIN_VALUE;
        return this.f5767b.c(this);
    }
}
