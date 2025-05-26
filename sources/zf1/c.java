package zf1;

import a.g0;
import com.pinterest.api.model.cm0;
import com.pinterest.api.model.yl0;
import ja.f0;
import ja.j0;
import java.util.List;
import kk2.k;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.OkHttpClient;
import rf1.v;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141917i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f141918j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f141917i = i13;
        this.f141918j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f141917i;
        e eVar = this.f141918j;
        switch (i13) {
            case 0:
                cm0 cm0Var = (cm0) obj;
                ee0.b bVar = eVar.f141927c;
                if (bVar == null) {
                    Intrinsics.r("ideaPinFontDataProvider");
                    throw null;
                }
                cw0.c type = cw0.c.Creation;
                Intrinsics.checkNotNullParameter(type, "type");
                t r13 = new k(new g0(9, bVar, type), 1).r(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                r13.l(wj2.c.a()).o(new v(17, d.f141920k), new v(18, d.f141921l));
                OkHttpClient okHttpClient = new OkHttpClient();
                List<yl0> c13 = cm0Var.c();
                if (c13 != null) {
                    for (yl0 yl0Var : c13) {
                        Intrinsics.f(yl0Var);
                        eVar.a(yl0Var, cw0.c.Creation, okHttpClient);
                    }
                }
                List<yl0> d2 = cm0Var.d();
                if (d2 != null) {
                    for (yl0 yl0Var2 : d2) {
                        Intrinsics.f(yl0Var2);
                        eVar.a(yl0Var2, cw0.c.Tag, okHttpClient);
                    }
                }
                return Unit.f80348a;
            case 1:
                ee0.b bVar2 = eVar.f141927c;
                if (bVar2 == null) {
                    Intrinsics.r("ideaPinFontDataProvider");
                    throw null;
                }
                zd0.d dVar = bVar2.f58779a;
                dVar.getClass();
                t r14 = j0.b(new zd0.c(dVar, f0.d(0, "SELECT * FROM idea_pin_font"), 0)).k(new lb0.c(16, new ee0.a(bVar2, 1))).r(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(r14, "subscribeOn(...)");
                r14.l(wj2.c.a()).o(new v(15, new c(eVar, 2)), new v(16, d.f141919j));
                return Unit.f80348a;
            default:
                List<cw0.a> list = (List) obj;
                Intrinsics.f(list);
                for (cw0.a aVar : list) {
                    eVar.f141931g.put(aVar.f53326a, aVar);
                }
                return Unit.f80348a;
        }
    }
}
