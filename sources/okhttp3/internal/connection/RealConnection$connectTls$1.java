package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RealConnection$connectTls$1 extends s implements Function0<List<? extends Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f95937i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Handshake f95938j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Address f95939k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f95937i = certificatePinner;
        this.f95938j = handshake;
        this.f95939k = address;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f95937i.f95543b;
        Intrinsics.f(certificateChainCleaner);
        return certificateChainCleaner.a(this.f95939k.f95488i.f95634d, this.f95938j.a());
    }
}
