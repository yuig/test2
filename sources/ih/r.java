package ih;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class r extends s {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f72287e;

    public /* synthetic */ r(k kVar) {
        super(false, null, null);
        this.f72287e = kVar;
    }

    @Override // ih.s
    public final String a() {
        try {
            return (String) this.f72287e.call();
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }
}
