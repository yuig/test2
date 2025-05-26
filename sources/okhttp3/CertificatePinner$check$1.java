package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CertificatePinner$check$1 extends s implements Function0<List<? extends X509Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f95545i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f95546j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f95547k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f95545i = certificatePinner;
        this.f95546j = list;
        this.f95547k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List a13;
        CertificateChainCleaner certificateChainCleaner = this.f95545i.f95543b;
        List list = this.f95546j;
        if (certificateChainCleaner != null && (a13 = certificateChainCleaner.a(this.f95547k, list)) != null) {
            list = a13;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        for (Certificate certificate : list2) {
            Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
