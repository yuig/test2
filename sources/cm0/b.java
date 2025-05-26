package cm0;

import e12.c;
import fk2.l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;

/* loaded from: classes5.dex */
public final class b implements vk1.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f28003a;

    public b(c boardOrganizationService) {
        Intrinsics.checkNotNullParameter(boardOrganizationService, "boardOrganizationService");
        this.f28003a = boardOrganizationService;
    }

    @Override // vk1.a
    public final uj2.b a(a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        l h10 = this.f28003a.e(CollectionsKt.Z(params.f28001a, ",", null, null, 0, null, null, 62), params.f28002b).l(e.f118017c).h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        l h13 = h10.h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h13, "observeOn(...)");
        return h13;
    }
}
