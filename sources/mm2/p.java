package mm2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87719i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f87720j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i13) {
        super(0);
        this.f87719i = i13;
        this.f87720j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f87719i;
        r rVar = this.f87720j;
        switch (i13) {
            case 0:
                rm2.k0 k0Var = ((lm2.a) rVar.f87724h.f107929a).f83942l;
                String packageFqName = rVar.f55454e.b();
                Intrinsics.checkNotNullExpressionValue(packageFqName, "asString(...)");
                ((rm2.t) k0Var).getClass();
                Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
                q0 q0Var = q0.f80391a;
                ArrayList arrayList = new ArrayList();
                q0Var.getClass();
                p0.f80390a.getClass();
                return z0.m(arrayList);
            case 1:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) l0.B0(rVar.f87725i, r.f87722m[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    rm2.f0 f0Var = (rm2.f0) entry.getValue();
                    gn2.b d2 = gn2.b.d(str);
                    Intrinsics.checkNotNullExpressionValue(d2, "byInternalName(...)");
                    sm2.c cVar = ((fm2.c) f0Var).f62577b;
                    int i14 = q.f87721a[cVar.f113274a.ordinal()];
                    if (i14 == 1) {
                        String str2 = cVar.f113274a == sm2.b.MULTIFILE_CLASS_PART ? cVar.f113279f : null;
                        if (str2 != null) {
                            gn2.b d13 = gn2.b.d(str2);
                            Intrinsics.checkNotNullExpressionValue(d13, "byInternalName(...)");
                            hashMap.put(d2, d13);
                        }
                    } else if (i14 == 2) {
                        hashMap.put(d2, d2);
                    }
                }
                return hashMap;
            default:
                rVar.f87723g.getClass();
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(q0.f80391a, 10));
                p0.f80390a.getClass();
                return arrayList2;
        }
    }
}
