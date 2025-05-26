package sm0;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import ol0.t;
import qm0.w0;
import qm0.y0;
import u50.r;
import x02.x0;

/* loaded from: classes5.dex */
public final class b implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f113236a;

    public b(x0 boardRepository) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f113236a = boardRepository;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, y0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof w0) {
            v7 v7Var = ((w0) request).f104351a;
            qm0.i iVar = new qm0.i(v7Var);
            t tVar = new t(4, v7Var);
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new a(eventIntake, iVar, tVar, this, null), 2);
            return;
        }
        if (request instanceof qm0.x0) {
            v7 v7Var2 = ((qm0.x0) request).f104354a;
            qm0.j jVar = new qm0.j(v7Var2);
            t tVar2 = new t(5, v7Var2);
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new a(eventIntake, jVar, tVar2, this, null), 2);
        }
    }
}
