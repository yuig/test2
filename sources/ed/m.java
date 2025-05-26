package ed;

import com.google.firebase.messaging.q;
import do2.f0;
import do2.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import pc.c0;
import pc.o0;
import pc.v;

/* loaded from: classes.dex */
public final class m implements dd.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f58490f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final qc.h f58491a;

    /* renamed from: b, reason: collision with root package name */
    public final c f58492b;

    /* renamed from: c, reason: collision with root package name */
    public final List f58493c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58494d;

    /* renamed from: e, reason: collision with root package name */
    public final f f58495e = new f(this);

    public m(qc.h hVar, c cVar, ArrayList arrayList, boolean z13) {
        this.f58491a = hVar;
        this.f58492b = cVar;
        this.f58493c = arrayList;
        this.f58494d = z13;
    }

    public static final j0 b(m mVar, o0 o0Var, v vVar, qc.i response) {
        mVar.getClass();
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        Intrinsics.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
        return new j0(new k(new f0(new pb.k(new bd.i(j0Var2, response, null)), new vc.h(j0Var2, null, 4)), o0Var, vVar, j0Var), new l(0, null));
    }

    public static final pc.h c(m mVar, pc.h hVar, UUID requestUuid, qc.i iVar, long j13) {
        mVar.getClass();
        pc.g b13 = hVar.b();
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        b13.f99552b = requestUuid;
        int i13 = cd.b.f27547a;
        System.currentTimeMillis();
        int i14 = iVar.f103433a;
        b13.a(new d(iVar.f103434b));
        return b13.b();
    }

    @Override // dd.a
    public final do2.i a(pc.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        c0 a13 = request.f99543c.a(v.f99606d);
        Intrinsics.f(a13);
        v customScalarAdapters = (v) a13;
        q httpRequest = this.f58491a.a(request);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return new pb.k(new i(this, httpRequest, request, customScalarAdapters, null));
    }

    public final boolean d() {
        return this.f58494d;
    }

    @Override // dd.a
    public final void dispose() {
        Iterator it = this.f58493c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
        this.f58492b.dispose();
    }
}
