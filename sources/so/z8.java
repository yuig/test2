package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z8 implements bf2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114743a;

    /* renamed from: b, reason: collision with root package name */
    public final oa f114744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f114745c;

    /* renamed from: d, reason: collision with root package name */
    public final af2.a f114746d;

    public /* synthetic */ z8(oa oaVar, af2.a aVar, int i13, int i14) {
        this.f114743a = i14;
        this.f114744b = oaVar;
        this.f114746d = aVar;
        this.f114745c = i13;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f114743a;
        int i14 = this.f114745c;
        switch (i13) {
            case 0:
                if (i14 != 0) {
                    if (i14 == 1) {
                        return new hj0.a((j22.b) this.f114744b.U3.get());
                    }
                    throw new AssertionError(i14);
                }
                se2.a lazyUndoHideSearchRetrofitRemoteRequest = bf2.b.a(((a9) this.f114746d).f113334g);
                Intrinsics.checkNotNullParameter(lazyUndoHideSearchRetrofitRemoteRequest, "lazyUndoHideSearchRetrofitRemoteRequest");
                Object obj = ((bf2.b) lazyUndoHideSearchRetrofitRemoteRequest).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                com.pinterest.hairball.network.e eVar = (com.pinterest.hairball.network.e) obj;
                dl2.b.I(eVar);
                return eVar;
            default:
                if (i14 == 0) {
                    return new b9(this);
                }
                throw new AssertionError(i14);
        }
    }
}
