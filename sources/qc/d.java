package qc;

import androidx.lifecycle.n1;
import com.google.firebase.messaging.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jk.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pc.o0;
import pc.v;
import wo2.m;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f103430a;

    public d(String serverUrl) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        this.f103430a = serverUrl;
    }

    @Override // qc.h
    public final q a(pc.f apolloRequest) {
        boolean z13;
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        o0 operation = apolloRequest.f99541a;
        v customScalarAdapters = (v) apolloRequest.f99543c.a(v.f99606d);
        if (customScalarAdapters == null) {
            customScalarAdapters = v.f99607e;
        }
        ArrayList headers = new ArrayList();
        headers.add(new f("X-APOLLO-OPERATION-ID", operation.a()));
        headers.add(new f("X-APOLLO-OPERATION-NAME", operation.name()));
        headers.add(new f("Accept", "multipart/mixed; deferSpec=20220824, application/json"));
        List list = apolloRequest.f99545e;
        if (list != null) {
            headers.addAll(list);
        }
        Boolean bool = apolloRequest.f99546f;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = apolloRequest.f99547g;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        g gVar = apolloRequest.f99544d;
        if (gVar == null) {
            gVar = g.Post;
        }
        int i13 = c.f103429a[gVar.ordinal()];
        String url = this.f103430a;
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String c13 = booleanValue2 ? operation.c() : null;
            g method = g.Post;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkNotNullParameter(headers, "headers");
            arrayList.addAll(headers);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            wo2.j jVar = new wo2.j();
            LinkedHashMap a13 = n1.a(new tc.b(jVar, null), operation, customScalarAdapters, booleanValue, c13);
            m a14 = jVar.a1(jVar.f130711b);
            Object body = a13.isEmpty() ? new b(a14) : new j(a13, a14);
            Intrinsics.checkNotNullParameter(body, "body");
            q qVar = new q();
            qVar.f33804b = method;
            qVar.f33803a = url;
            qVar.f33805c = arrayList;
            qVar.f33806d = body;
            return qVar;
        }
        g method2 = g.Get;
        LinkedHashMap parameters = new LinkedHashMap();
        parameters.put("operationName", operation.name());
        wo2.j jVar2 = new wo2.j();
        uc.a aVar = new uc.a(new tc.b(jVar2, null));
        aVar.s();
        operation.e(aVar, customScalarAdapters);
        aVar.v();
        if (!aVar.f121751b.isEmpty()) {
            throw new IllegalStateException("FileUpload and Http GET are not supported at the same time".toString());
        }
        parameters.put("variables", jVar2.M());
        if (booleanValue2) {
            parameters.put("query", operation.c());
        }
        if (booleanValue) {
            wo2.j jVar3 = new wo2.j();
            tc.b bVar = new tc.b(jVar3, null);
            bVar.s();
            bVar.M0("persistedQuery");
            bVar.s();
            bVar.M0("version");
            z13 = true;
            bVar.D(1);
            bVar.M0("sha256Hash");
            bVar.n1(operation.a());
            bVar.v();
            bVar.v();
            parameters.put("extensions", jVar3.M());
        } else {
            z13 = true;
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(url);
        boolean E = StringsKt.E(url, "?", false);
        for (Map.Entry entry : parameters.entrySet()) {
            if (E) {
                sb3.append('&');
            } else {
                sb3.append('?');
                E = z13;
            }
            sb3.append(r.C((String) entry.getKey()));
            sb3.append('=');
            sb3.append(r.C((String) entry.getValue()));
        }
        String url2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "StringBuilder().apply(builderAction).toString()");
        Intrinsics.checkNotNullParameter(method2, "method");
        Intrinsics.checkNotNullParameter(url2, "url");
        ArrayList arrayList2 = new ArrayList();
        Intrinsics.checkNotNullParameter(headers, "headers");
        arrayList2.addAll(headers);
        q qVar2 = new q();
        qVar2.f33804b = method2;
        qVar2.f33803a = url2;
        qVar2.f33805c = arrayList2;
        qVar2.f33806d = null;
        return qVar2;
    }
}
