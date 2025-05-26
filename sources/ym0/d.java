package ym0;

import hk2.u;
import kotlin.jvm.internal.Intrinsics;
import uj2.l;
import x02.z0;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f139402a;

    public d(z0 boardSectionRepository) {
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        this.f139402a = boardSectionRepository;
    }

    @Override // ym0.e
    public final u a(a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String movedSectionId = result.f139397a;
        Intrinsics.checkNotNullExpressionValue(movedSectionId, "getReorderedModelId(...)");
        z0 z0Var = this.f139402a;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(movedSectionId, "movedSectionId");
        l G = z0Var.G(new j12.f(movedSectionId, result.f139398b, result.f139399c), null);
        G.getClass();
        u uVar = new u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }
}
