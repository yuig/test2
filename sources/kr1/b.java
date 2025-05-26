package kr1;

import com.pinterest.identity.core.error.UnauthException;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qr1.e0;
import qr1.y;
import so.oa;
import sr1.i;
import uj2.b0;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f80767i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(1);
        this.f80767i = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e0 it = (e0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        d dVar = this.f80767i;
        dVar.getClass();
        Map map = tr1.b.f119038a;
        y yVar = dVar.f80770h;
        String a13 = tr1.b.a(yVar.f105054b);
        String ssoIdToken = it.getSsoIdToken();
        String ssoId = it.getSsoId();
        String ssoEmail = it.getSsoEmail();
        oa oaVar = dVar.f80774l.f114639a.f113568a;
        i iVar = new i(a13, yVar.f105054b, a13, ssoIdToken, ssoId, ssoEmail);
        iVar.f115120e = (cr1.b) oaVar.Z5.get();
        iVar.f115121f = (or1.i) oaVar.f114015y5.get();
        iVar.f115122g = (b60.b) oaVar.f113850p0.get();
        iVar.f115123h = (tr1.a) oaVar.f113734i6.get();
        iVar.f115124i = (fr1.c) oaVar.f113821n6.get();
        return b0.g(new UnauthException.AuthenticationError.AgeRequiredForCountryError(iVar.d(), null));
    }
}
