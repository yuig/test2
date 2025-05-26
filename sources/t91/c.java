package t91;

import com.pinterest.api.model.wy0;
import i92.f;
import i92.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lr.a0;
import m60.w;
import m60.x0;
import mf0.l;
import mr1.h;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f116832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f116831i = i13;
        this.f116832j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f116831i;
        e eVar = this.f116832j;
        switch (i13) {
            case 0:
                eVar.f116835b.d(new of0.a(new l()));
                return Unit.f80348a;
            case 1:
                wy0 wy0Var = eVar.f116841h;
                if (wy0Var == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                h V = com.bumptech.glide.c.V(wy0Var, eVar.f116836c);
                if (V != null) {
                    int i14 = x0.unlink_ba_modal_description;
                    Object[] objArr = new Object[1];
                    String N2 = V.f88089b.N2();
                    if (N2 == null) {
                        N2 = "";
                    }
                    objArr[0] = N2;
                    String string = eVar.f116837d.f139224a.getString(i14, objArr);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    eVar.f116835b.d(new i(new a0(string, null, null, 6, 14)));
                }
                return Unit.f80348a;
            case 2:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                u91.h hVar = (u91.h) ((r91.c) eVar.getView());
                w f73 = hVar.f7();
                String string2 = hVar.getString(x0.generic_error);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                f73.f(new i(new f(string2)));
                return Unit.f80348a;
            default:
                wy0 wy0Var2 = (wy0) obj;
                Intrinsics.f(wy0Var2);
                eVar.f116841h = wy0Var2;
                eVar.f116835b.h(eVar.f116844k);
                eVar.loadData();
                return Unit.f80348a;
        }
    }
}
