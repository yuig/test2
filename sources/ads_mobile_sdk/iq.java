package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class iq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f6515a;

    /* renamed from: b, reason: collision with root package name */
    public aq f6516b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f6518d;

    /* renamed from: e, reason: collision with root package name */
    public int f6519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f6518d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6517c = obj;
        this.f6519e |= Integer.MIN_VALUE;
        return this.f6518d.h(this);
    }
}
