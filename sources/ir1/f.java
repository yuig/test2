package ir1;

import com.pinterest.identity.core.error.UnauthException;
import kk2.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kp.n;
import so.k9;
import so.oa;
import u5.l;
import u5.w;
import uj2.b0;
import uj2.f0;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f73522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(1);
        this.f73521i = i13;
        this.f73522j = hVar;
    }

    public final f0 b(u5.i credential) {
        int i13 = this.f73521i;
        h hVar = this.f73522j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(credential, "credential");
                return hVar.h(credential);
            default:
                Intrinsics.checkNotNullParameter(credential, "credential");
                hVar.getClass();
                if (!(credential instanceof w) || !Intrinsics.d(credential.f120514a, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                    k g13 = b0.g(new UnauthException.ThirdParty.Google.UnsupportedProviderError());
                    Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
                    return g13;
                }
                try {
                    ej.c c03 = n.c0(credential.f120515b);
                    k9 k9Var = hVar.f73525n;
                    String str = c03.f59072d;
                    String str2 = c03.f59073e;
                    oa oaVar = k9Var.f113521a.f113568a;
                    gr1.h hVar2 = new gr1.h(str, str2);
                    hVar2.f65999d = (cr1.a) oaVar.A2.get();
                    hVar2.f66000e = (or1.i) oaVar.f114015y5.get();
                    return hVar2.e();
                } catch (Exception e13) {
                    return b0.g(new UnauthException.ThirdParty.GoogleOneTap.GoogleIdCredentialRetrievalError((Throwable) e13));
                }
        }
    }

    public final f0 e(l credentialManager) {
        int i13 = this.f73521i;
        h hVar = this.f73522j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
                break;
        }
        return hVar.i(credentialManager, h.j(hVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f73521i) {
            case 0:
                return e((l) obj);
            case 1:
                return b((u5.i) obj);
            case 2:
                return e((l) obj);
            case 3:
                return e((l) obj);
            default:
                return b((u5.i) obj);
        }
    }
}
