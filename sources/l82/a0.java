package l82;

import android.app.Application;
import ao2.j0;
import ao2.v0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.b3;
import pk.o1;
import so.oa;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f82203a;

    /* renamed from: b, reason: collision with root package name */
    public d f82204b;

    /* renamed from: c, reason: collision with root package name */
    public Application f82205c;

    /* renamed from: d, reason: collision with root package name */
    public p f82206d;

    public a0(j0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f82203a = scope;
        ko2.f fVar = v0.f20219a;
        this.f82206d = new p(((bo2.e) ho2.q.f69782a).f23612f);
    }

    public static y b(a0 a0Var, i0 vm3, Function1 starter, int i13) {
        if ((i13 & 4) != 0) {
            starter = z.f82293i;
        }
        Intrinsics.checkNotNullParameter(vm3, "vm");
        Intrinsics.checkNotNullParameter(starter, "starter");
        y a13 = a0Var.a();
        a13.h(vm3, true, starter);
        return a13;
    }

    public final y a() {
        d dVar = this.f82204b;
        if (dVar == null) {
            throw new IllegalArgumentException("Missing state transformer".toString());
        }
        y yVar = new y(this.f82203a, dVar, this.f82206d);
        Application application = this.f82205c;
        if (application != null) {
            ((oa) ((j) me.o.b(application, j.class))).getClass();
            int i13 = o1.f100461c;
            b3 b3Var = b3.f100362j;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(b3Var, 10));
            pk.a aVar = (pk.a) b3Var.iterator();
            if (aVar.hasNext()) {
                ep.b.A(aVar.next());
                throw null;
            }
            yVar.c(new m82.a(CollectionsKt.l0(b3Var, arrayList)));
        }
        return yVar;
    }

    public final void c(i debugOwner, Application application) {
        Intrinsics.checkNotNullParameter(debugOwner, "debugOwner");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f82205c = application;
    }

    public final void d(d stateTransformer) {
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        this.f82204b = stateTransformer;
    }
}
