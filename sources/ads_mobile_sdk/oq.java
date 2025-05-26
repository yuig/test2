package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class oq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f9402a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9403b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f9405d;

    /* renamed from: e, reason: collision with root package name */
    public int f9406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f9405d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9404c = obj;
        this.f9406e |= Integer.MIN_VALUE;
        return this.f9405d.m(this);
    }
}
