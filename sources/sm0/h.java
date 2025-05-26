package sm0;

import androidx.appcompat.widget.c2;
import ao2.j0;
import ao2.v0;
import ca0.y;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import qm0.a1;
import qm0.d1;
import qm0.f1;
import qm0.g1;
import qm0.h1;
import qm0.i1;
import qm0.n1;
import qm0.y0;
import qm0.z0;
import u50.r;

/* loaded from: classes5.dex */
public final class h implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final e12.d f113250a;

    /* renamed from: b, reason: collision with root package name */
    public final pm0.o f113251b;

    /* renamed from: c, reason: collision with root package name */
    public final pm0.j f113252c;

    /* renamed from: d, reason: collision with root package name */
    public final b f113253d;

    /* renamed from: e, reason: collision with root package name */
    public final i f113254e;

    /* renamed from: f, reason: collision with root package name */
    public final qz.k f113255f;

    /* renamed from: g, reason: collision with root package name */
    public final an0.h f113256g;

    /* renamed from: h, reason: collision with root package name */
    public final c2 f113257h;

    /* renamed from: i, reason: collision with root package name */
    public final ob0.a f113258i;

    public h(e12.d boardService, pm0.o boardLoadSEP, pm0.j boardCollaboratorSEP, b actionSEP, i optionSEP, c contentNavigationSEP, qz.k boardVideoTemplateService, an0.h boardSharePreviewHelper, c2 shareSheetUtils, ob0.a crashReporter) {
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(boardLoadSEP, "boardLoadSEP");
        Intrinsics.checkNotNullParameter(boardCollaboratorSEP, "boardCollaboratorSEP");
        Intrinsics.checkNotNullParameter(actionSEP, "actionSEP");
        Intrinsics.checkNotNullParameter(optionSEP, "optionSEP");
        Intrinsics.checkNotNullParameter(contentNavigationSEP, "contentNavigationSEP");
        Intrinsics.checkNotNullParameter(boardVideoTemplateService, "boardVideoTemplateService");
        Intrinsics.checkNotNullParameter(boardSharePreviewHelper, "boardSharePreviewHelper");
        Intrinsics.checkNotNullParameter(shareSheetUtils, "shareSheetUtils");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f113250a = boardService;
        this.f113251b = boardLoadSEP;
        this.f113252c = boardCollaboratorSEP;
        this.f113253d = actionSEP;
        this.f113254e = optionSEP;
        this.f113255f = boardVideoTemplateService;
        this.f113256g = boardSharePreviewHelper;
        this.f113257h = shareSheetUtils;
        this.f113258i = crashReporter;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        n1 request = (n1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof a1) {
            this.f113251b.e(scope, ((a1) request).f104238a, new y(eventIntake, 18));
            return;
        }
        if (request instanceof g1) {
            v7 v7Var = ((g1) request).f104274a;
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new f(this, v7Var, eventIntake, null), 2);
            return;
        }
        if (request instanceof y0) {
            this.f113253d.e(scope, (y0) request, eventIntake);
            return;
        }
        if (request instanceof d1) {
            this.f113254e.e(scope, (d1) request, eventIntake);
            return;
        }
        if (request instanceof z0) {
            this.f113252c.e(scope, ((z0) request).f104371a, new y(eventIntake, 19));
            return;
        }
        if (request instanceof h1) {
            String str = ((h1) request).f104279a;
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new g(this, str, eventIntake, null), 2);
        } else {
            if (!(request instanceof f1)) {
                if (request instanceof i1) {
                    ((tb0.h) this.f113258i).p(((i1) request).f104283a);
                    return;
                }
                return;
            }
            f1 f1Var = (f1) request;
            v7 v7Var2 = f1Var.f104272a;
            boolean a13 = this.f113256g.a(v7Var2);
            i91.b bVar = f1Var.f104273b;
            i91.b a14 = i91.b.a(bVar, a13 && bVar.f71799b.length() > 0, null, null, 6);
            String uid = v7Var2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            this.f113257h.o(uid, y32.f.BOARD_SHARE.getValue(), a14, v7Var2);
        }
    }
}
