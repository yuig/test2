package gb1;

import com.pinterest.api.model.jz;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends vq0.h {
    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        com.pinterest.feature.settings.notifications.c view = (com.pinterest.feature.settings.notifications.c) nVar;
        db1.e model = (db1.e) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        jz jzVar = model.f54291a;
        view.Z5(jzVar.e());
        view.s0();
        view.u0();
        if (jzVar.a() != null) {
            List<jz.a> a13 = jzVar.a();
            if (a13 != null) {
                for (jz.a aVar : a13) {
                    String c13 = jzVar.c();
                    Intrinsics.checkNotNullExpressionValue(c13, "getKey(...)");
                    String a14 = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "getLabel(...)");
                    List b13 = aVar.b();
                    Intrinsics.checkNotNullExpressionValue(b13, "getValue(...)");
                    view.T2(b13, model.f54292b, c13, a14);
                }
                return;
            }
            return;
        }
        List g13 = jzVar.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getOptions(...)");
        int i14 = 0;
        for (Object obj2 : g13) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            jz.b bVar = (jz.b) obj2;
            boolean z13 = i14 == jzVar.g().size() - 1;
            String c14 = jzVar.c();
            Intrinsics.checkNotNullExpressionValue(c14, "getKey(...)");
            String a15 = bVar.a();
            Intrinsics.checkNotNullExpressionValue(a15, "getKey(...)");
            String b14 = bVar.b();
            Intrinsics.checkNotNullExpressionValue(b14, "getLabel(...)");
            Boolean c15 = bVar.c();
            Intrinsics.checkNotNullExpressionValue(c15, "getValue(...)");
            view.D0(c14, a15, b14, c15.booleanValue(), model.f54292b, z13);
            i14 = i15;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        db1.e model = (db1.e) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
