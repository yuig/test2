package qz;

import ey.j1;
import ey.n1;
import ey.q2;
import ey.r2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;

/* loaded from: classes.dex */
public final class y extends x {

    /* renamed from: t, reason: collision with root package name */
    public final n1 f105463t;

    public y() {
        j1 networkActivityRecorder = j1.f60505b;
        Intrinsics.checkNotNullParameter(networkActivityRecorder, "networkActivityRecorder");
        this.f105463t = networkActivityRecorder;
    }

    @Override // qz.x, okhttp3.EventListener
    public final void m(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        super.m(call, domainName, inetAddressList);
        j1 j1Var = (j1) this.f105463t;
        j1Var.getClass();
        if (j1.f60506c) {
            String url = call.getF95898b().f95700a.f95639i;
            j1Var.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.E(url, "pinimg.com", false)) {
                Intrinsics.checkNotNullParameter(url, "url");
                new r2(url).i();
            }
        }
    }

    @Override // qz.x, okhttp3.EventListener
    public final void n(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        super.n(call, domainName);
        j1 j1Var = (j1) this.f105463t;
        j1Var.getClass();
        if (j1.f60506c) {
            String url = call.getF95898b().f95700a.f95639i;
            j1Var.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.E(url, "pinimg.com", false)) {
                Intrinsics.checkNotNullParameter(url, "url");
                new q2(url).i();
            }
        }
    }
}
