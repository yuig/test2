package rr;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final lb2.d f109722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qr.h webhookDeeplinkUtil, lb2.d accountManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        this.f109722g = accountManager;
    }

    @Override // rr.d0
    public final String a() {
        return "unlink_account_verify_link";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        xj2.c o13;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("username");
        String queryParameter2 = uri.getQueryParameter("e");
        String queryParameter3 = uri.getQueryParameter("t");
        String[] strArr = {queryParameter, queryParameter2, queryParameter3};
        int i13 = 0;
        while (true) {
            if (i13 >= 3) {
                ArrayList A = kotlin.collections.c0.A(strArr);
                String userName = (String) A.get(0);
                String expiration = (String) A.get(1);
                String token = (String) A.get(2);
                lb2.d dVar = this.f109722g;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(userName, "userName");
                Intrinsics.checkNotNullParameter(expiration, "expiration");
                Intrinsics.checkNotNullParameter(token, "token");
                kk2.m mVar = new kk2.m(dVar.f82746a.y(kotlin.collections.z0.g(new Pair("username", userName), new Pair("token", token), new Pair("expiration", expiration))).r(tk2.e.f118017c).l(wj2.c.a()), new b22.f(22, lb2.c.f82745i), 2);
                Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
                o13 = mVar.o(new c(0, new j1.p0(queryParameter, queryParameter2, queryParameter3, this, 4)), new c(0, new tq.a0(this, 7)));
                break;
            }
            if (strArr[i13] == null) {
                o13 = null;
                break;
            }
            i13++;
        }
        if (o13 == null) {
            g();
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return uri.getPathSegments().size() == 1 && n60.o.x(uri, 0, "unlink");
    }

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.pinterest.EXTRA_UNLINK_ACCOUNT_SHOW_EXPIRED_LINK_MODAL", true);
        this.f109723a.t(bundle);
    }
}
