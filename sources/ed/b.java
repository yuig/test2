package ed;

import ao2.o;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.google.firebase.messaging.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k1.s2;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xk2.s;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f58462a;

    public b(OkHttpClient httpCallFactory) {
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        this.f58462a = httpCallFactory;
    }

    @Override // ed.c
    public final Object a(q qVar, bl2.c frame) {
        IOException iOException;
        Response response;
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        Request.Builder builder = new Request.Builder();
        builder.j((String) qVar.f33803a);
        builder.e(dd.b.a((List) qVar.f33805c));
        if (((qc.g) qVar.f33804b) == qc.g.Get) {
            builder.f("GET", null);
        } else {
            qc.e eVar = (qc.e) qVar.f33806d;
            if (eVar == null) {
                throw new IllegalStateException("HTTP POST requires a request body".toString());
            }
            builder.g(new a(eVar));
        }
        Call newCall = this.f58462a.newCall(builder.b());
        oVar.e(new s2(newCall, 24));
        try {
            response = newCall.e();
            iOException = null;
        } catch (IOException e13) {
            iOException = e13;
            response = null;
        }
        if (iOException != null) {
            xk2.q qVar2 = s.f135225b;
            oVar.resumeWith(ue.c.m(new ApolloNetworkException(iOException, "Failed to execute GraphQL http network request")));
        } else {
            xk2.q qVar3 = s.f135225b;
            Intrinsics.f(response);
            ArrayList arrayList = new ArrayList();
            ResponseBody responseBody = response.f95726g;
            Intrinsics.f(responseBody);
            wo2.l bodySource = responseBody.getF95981f();
            Intrinsics.checkNotNullParameter(bodySource, "bodySource");
            Headers headers = response.f95725f;
            IntRange q13 = ql2.s.q(0, headers.size());
            ArrayList headers2 = new ArrayList(g0.q(q13, 10));
            ql2.k it = q13.iterator();
            while (it.f104109c) {
                int b13 = it.b();
                headers2.add(new qc.f(headers.d(b13), headers.j(b13)));
            }
            Intrinsics.checkNotNullParameter(headers2, "headers");
            arrayList.addAll(headers2);
            qc.i iVar = new qc.i(response.f95723d, arrayList, bodySource, null);
            ue.c.H(iVar);
            xk2.q qVar4 = s.f135225b;
            oVar.resumeWith(iVar);
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    @Override // ed.c
    public final void dispose() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b() {
        /*
            r4 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 60000(0xea60, double:2.9644E-319)
            r0.c(r2, r1)
            r0.e(r2, r1)
            okhttp3.OkHttpClient r1 = new okhttp3.OkHttpClient
            r1.<init>(r0)
            java.lang.String r0 = "okHttpClient"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r4.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.b.<init>():void");
    }
}
