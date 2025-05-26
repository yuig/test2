package xz0;

import com.pinterest.api.model.h20;
import com.pinterest.api.model.l20;
import com.pinterest.api.model.m20;
import com.pinterest.api.model.p20;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import zz0.d;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136237i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f136238j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f136237i = i13;
        this.f136238j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 0;
        int i14 = this.f136237i;
        b bVar = this.f136238j;
        switch (i14) {
            case 0:
                Function1 function1 = bVar.f136242n;
                Object c13 = ((tt1.a) obj).c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                function1.invoke(c13);
                return Unit.f80348a;
            default:
                tt1.a response = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                Object c14 = response.c();
                Intrinsics.checkNotNullExpressionValue(c14, "getData(...)");
                h20 h20Var = (h20) c14;
                bVar.getClass();
                ArrayList l13 = f0.l(new zz0.b(h20Var));
                List I = h20Var.I();
                if (I != null) {
                    int i15 = 0;
                    for (Object obj2 : I) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            f0.p();
                            throw null;
                        }
                        p20 p20Var = (p20) obj2;
                        String uid = h20Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        Intrinsics.f(p20Var);
                        l13.add(new zz0.c(uid, i15, p20Var));
                        i15 = i16;
                    }
                }
                List H = h20Var.H();
                if (H != null) {
                    int i17 = 0;
                    for (Object obj3 : H) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            f0.p();
                            throw null;
                        }
                        l20 l20Var = (l20) obj3;
                        String uid2 = h20Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        m20 m20Var = new m20(new p20(), i13);
                        boolean[] zArr = m20Var.f39987k;
                        m20Var.f39977a = l20Var.k();
                        if (zArr.length > 0) {
                            zArr[i13] = true;
                        }
                        m20Var.f39985i = l20Var.j();
                        if (zArr.length > 8) {
                            zArr[8] = true;
                        }
                        m20Var.f39982f = l20Var.h();
                        if (zArr.length > 5) {
                            zArr[5] = true;
                        }
                        m20Var.f39980d = l20Var.g();
                        if (zArr.length > 3) {
                            zArr[3] = true;
                        }
                        m20Var.f39984h = l20Var.i();
                        if (zArr.length > 7) {
                            zArr[7] = true;
                        }
                        Unit unit = Unit.f80348a;
                        p20 a13 = m20Var.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        l13.add(new zz0.c(uid2, i17, a13));
                        i17 = i18;
                        i13 = 0;
                    }
                }
                l13.add(new zz0.a(h20Var.E(), h20Var.B()));
                if (!((lb0.b) bVar.f136241m).e("SHARED_PREF_KEY_PEAR_SURVEY_" + bVar.f136239k, false)) {
                    l13.add(new d());
                }
                return Util.A(l13);
        }
    }
}
