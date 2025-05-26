package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.Handshake;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RealConnection$connectTls$2 extends s implements Function0<List<? extends X509Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ RealConnection f95940i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f95940i = realConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Handshake handshake = this.f95940i.f95923e;
        Intrinsics.f(handshake);
        List<Certificate> a13 = handshake.a();
        ArrayList arrayList = new ArrayList(g0.q(a13, 10));
        for (Certificate certificate : a13) {
            Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
