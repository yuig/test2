package i90;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import h90.l0;
import h90.m0;
import h90.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f71783i = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o12.b response = (o12.b) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        List<dl1.s> list = response.f92783a;
        ArrayList arrayList = new ArrayList();
        for (dl1.s sVar : list) {
            n0 m0Var = sVar instanceof vh ? new m0((vh) sVar) : sVar instanceof f30 ? new l0((f30) sVar) : null;
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return new o82.l0(arrayList, response.f92784b);
    }
}
