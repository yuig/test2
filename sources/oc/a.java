package oc;

import do2.i;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.c0;
import pc.e;
import pc.f;
import pc.f0;
import pc.h0;
import pc.o0;
import pc.v;
import pc.y;
import qc.g;

/* loaded from: classes.dex */
public final class a implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f93983a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f93984b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f93985c;

    /* renamed from: d, reason: collision with root package name */
    public g f93986d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f93987e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f93988f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f93989g;

    /* renamed from: h, reason: collision with root package name */
    public List f93990h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f93991i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f93992j;

    public a(c apolloClient, o0 operation) {
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f93983a = apolloClient;
        this.f93984b = operation;
        this.f93985c = y.f99612b;
    }

    @Override // pc.h0
    public final /* bridge */ /* synthetic */ Object a(c0 c0Var) {
        b(c0Var);
        return this;
    }

    public final void b(f0 executionContext) {
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        f0 c13 = this.f93985c.c(executionContext);
        Intrinsics.checkNotNullParameter(c13, "<set-?>");
        this.f93985c = c13;
    }

    public final a c() {
        a aVar = new a(this.f93983a, this.f93984b);
        aVar.b(this.f93985c);
        aVar.f93986d = this.f93986d;
        List list = this.f93990h;
        if (aVar.f93991i != null) {
            throw new IllegalStateException("Apollo: it is an error to call both .headers() and .addHeader() or .additionalHeaders() at the same time".toString());
        }
        aVar.f93990h = list;
        aVar.f93991i = this.f93991i;
        aVar.f93987e = this.f93987e;
        aVar.f93988f = this.f93988f;
        aVar.f93989g = this.f93989g;
        aVar.f93992j = this.f93992j;
        return aVar;
    }

    public final i d() {
        o0 operation = this.f93984b;
        Intrinsics.checkNotNullParameter(operation, "operation");
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        f0 executionContext = this.f93985c;
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(executionContext, "<set-?>");
        g gVar = this.f93986d;
        List list = this.f93990h;
        Boolean bool = this.f93987e;
        Boolean bool2 = this.f93988f;
        Boolean bool3 = this.f93989g;
        Boolean bool4 = this.f93992j;
        f apolloRequest = new f(operation, randomUUID, executionContext, gVar, list, bool, bool2, bool3, bool4);
        Boolean bool5 = this.f93991i;
        boolean z13 = bool5 == null || Intrinsics.d(bool5, Boolean.TRUE);
        c cVar = this.f93983a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        d dVar = cVar.f94027l;
        dVar.getClass();
        v vVar = cVar.f94017b;
        f0 c13 = tb.f.Z(dVar, vVar).c(cVar.f94020e).c(executionContext);
        e eVar = new e(operation);
        eVar.b(dVar);
        eVar.b(vVar);
        eVar.b(c13);
        eVar.b(executionContext);
        eVar.f99534d = cVar.f94021f;
        eVar.f99536f = cVar.f94023h;
        eVar.f99537g = cVar.f94024i;
        eVar.f99538h = cVar.f94025j;
        List list2 = cVar.f94022g;
        if (list == null) {
            list = list2;
        } else if (!z13) {
            if (list2 == null) {
                list2 = q0.f80391a;
            }
            list = CollectionsKt.l0(list, list2);
        }
        eVar.f99535e = list;
        if (gVar != null) {
            eVar.f99534d = gVar;
        }
        if (bool != null) {
            eVar.f99536f = bool;
        }
        if (bool2 != null) {
            eVar.f99537g = bool2;
        }
        if (bool3 != null) {
            eVar.f99538h = bool3;
        }
        if (bool4 != null) {
            eVar.c("X-APOLLO-CAN-BE-BATCHED", String.valueOf(bool4));
        }
        f request = eVar.d();
        ArrayList interceptors = CollectionsKt.m0(cVar.f94028m, cVar.f94019d);
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        if (interceptors.size() > 0) {
            return ((ad.a) interceptors.get(0)).a(request, new ad.b(interceptors, 1));
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
