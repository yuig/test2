package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class Handshake$peerCertificates$2 extends s implements Function0<List<? extends Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f95625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(Function0 function0) {
        super(0);
        this.f95625i = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return (List) this.f95625i.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return q0.f80391a;
        }
    }
}
