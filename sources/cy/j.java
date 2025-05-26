package cy;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import su1.p;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f53410a;

    public j(k kVar) {
        this.f53410a = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(okhttp3.Request r35, okhttp3.Response r36, java.io.IOException r37) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.j.a(okhttp3.Request, okhttp3.Response, java.io.IOException):void");
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Call call = chain.call();
        Request f95974e = chain.getF95974e();
        if (!(call instanceof RealCall) || !this.f53410a.f53413d.w()) {
            return chain.b(f95974e);
        }
        try {
            Response b13 = chain.b(f95974e);
            if (Intrinsics.d(b13.f95725f.c("transport"), su1.h.CLIENT_CRONET.getStr())) {
                return b13;
            }
            a(b13.f95720a, b13, null);
            return b13;
        } catch (IOException e13) {
            a(f95974e, null, e13);
            throw e13;
        }
    }
}
