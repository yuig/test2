package by0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m40.d;
import m40.e;
import m40.f;
import m40.g;
import nm.u;
import pc.h;
import vd0.c;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f24122j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f24121i = i13;
        this.f24122j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d dVar;
        List<e> list;
        int i13 = this.f24121i;
        b bVar = this.f24122j;
        switch (i13) {
            case 0:
                h response = (h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                c cVar = new c(new u());
                g gVar = (g) response.f99563c;
                if (gVar != null && (dVar = gVar.f85825a) != null) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    f fVar = dVar instanceof f ? (f) dVar : null;
                    if (fVar != null && (list = fVar.f85824e) != null) {
                        for (e eVar : list) {
                            cVar.t(eVar != null ? eVar.f85821a : null, eVar != null ? eVar.f85822b : null);
                        }
                    }
                }
                bVar.f24125c.getClass();
                com.bumptech.glide.d.D0(new File(lb0.g.c("COUNTRIES", true)), cVar.f125623a.toString());
                return cVar;
            default:
                if (bVar.isBound()) {
                    bVar.f24125c.getClass();
                    if (lb0.g.e("COUNTRIES") != null) {
                        cy0.h hVar = (cy0.h) ((ay0.c) bVar.getView());
                        iy0.a aVar = hVar.f53429j0;
                        if (aVar != null) {
                            aVar.updateIndicatorHeader(false);
                        }
                        w0 supportFragmentManager = hVar.requireActivity().getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        int i14 = jv1.d.fragment_wrapper;
                        wk2.a aVar2 = hVar.f53435p0;
                        if (aVar2 == null) {
                            Intrinsics.r("countryPickerFragmentProvider");
                            throw null;
                        }
                        Object obj2 = aVar2.get();
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        mo1.c.c(supportFragmentManager, i14, (Fragment) obj2, true, null, 48);
                    }
                }
                return Unit.f80348a;
        }
    }
}
