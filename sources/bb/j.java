package bb;

import kh2.g0;

/* loaded from: classes3.dex */
public final class j extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, int i13) {
        super(str, str2, 2);
        this.f22452e = i13;
    }

    @Override // bb.c
    public final boolean b() {
        switch (this.f22452e) {
            case 0:
                if (!super.b() || !g0.f0("MULTI_PROCESS")) {
                    return false;
                }
                int i13 = ab.e.f1688a;
                if (k.f22454b.b()) {
                    return l.f22459a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (g0.f0("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
