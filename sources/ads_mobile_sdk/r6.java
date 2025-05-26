package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class r6 implements xi.b {

    /* renamed from: a, reason: collision with root package name */
    public final xi.a f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10505b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10506c;

    public r6(xi.a aVar, String str, int i13) {
        this.f10504a = aVar;
        this.f10505b = str;
        this.f10506c = i13;
    }

    @Override // xi.b
    public final String getDescription() {
        return this.f10505b;
    }

    @Override // xi.b
    public final xi.a getInitializationState() {
        return this.f10504a;
    }

    @Override // xi.b
    public final int getLatency() {
        return this.f10506c;
    }
}
