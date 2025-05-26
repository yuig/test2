package rq;

import com.pinterest.api.model.az0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b4 extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        i01.q qVar = ((j4) this.receiver).f109319s;
        if (qVar != null) {
            w01.m0 m0Var = (w01.m0) qVar;
            az0 az0Var = (az0) CollectionsKt.U(intValue, m0Var.f127078r);
            String uid = az0Var != null ? az0Var.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            w01.m0.v3(m0Var, uid, "userdiditdata", 28);
        }
        return Unit.f80348a;
    }
}
