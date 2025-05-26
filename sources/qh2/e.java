package qh2;

import java.net.URLStreamHandler;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(URLStreamHandler uRLStreamHandler, int i13) {
        super(uRLStreamHandler);
        this.f103928f = i13;
    }

    @Override // java.net.URLStreamHandler
    public final int getDefaultPort() {
        switch (this.f103928f) {
            case 0:
                return 80;
            default:
                return 443;
        }
    }
}
