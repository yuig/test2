package aj2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.List;
import kv0.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f15444a;

    public /* synthetic */ i(p pVar) {
        this.f15444a = pVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        p pVar = this.f15444a;
        Object apply = ((h) pVar.f80994a).apply((zi2.a) obj);
        if (apply != null) {
            return apply;
        }
        Iterator it = ((List) pVar.f80996c).iterator();
        if (!it.hasNext()) {
            return pVar.f80995b;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        throw null;
    }
}
