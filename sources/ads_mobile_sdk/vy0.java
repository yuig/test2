package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class vy0 implements xi.b {

    /* renamed from: a, reason: collision with root package name */
    public final xi.a f12717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12719c;

    public vy0(xi.a aVar, String str, int i13) {
        this.f12717a = aVar;
        this.f12718b = str;
        this.f12719c = i13;
    }

    @Override // xi.b
    public final String getDescription() {
        return this.f12718b;
    }

    @Override // xi.b
    public final xi.a getInitializationState() {
        return this.f12717a;
    }

    @Override // xi.b
    public final int getLatency() {
        return this.f12719c;
    }
}
