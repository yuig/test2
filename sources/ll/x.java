package ll;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class x extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f83781a;

    public x(y yVar) {
        this.f83781a = yVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        y yVar = this.f83781a;
        try {
            Mac mac = (Mac) s.f83769c.a(yVar.f83784b);
            mac.init(yVar.f83785c);
            return mac;
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException(e13);
        }
    }
}
