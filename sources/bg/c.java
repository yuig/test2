package bg;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22756b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f22755a = i13;
        this.f22756b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i13 = this.f22755a;
        Object obj2 = this.f22756b;
        switch (i13) {
            case 0:
                d dVar = (d) obj2;
                h hVar = (h) obj;
                dVar.getClass();
                StringReader stringReader = new StringReader(hVar.f22773b);
                j jVar = (j) dVar.f22761e;
                l lVar = hVar.f22772a;
                String str = lVar.f22777c;
                jVar.getClass();
                return jVar.a(stringReader, null, new AtomicInteger(0), str, lVar.f22775a, lVar.f22776b, lVar.f22779e);
            case 1:
                Function1 tmp0 = (Function1) obj2;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (xj2.b) tmp0.invoke(obj);
            case 2:
                bj2.k kVar = (bj2.k) obj2;
                zi2.a aVar = (zi2.a) obj;
                Logger logger = bj2.k.f23003e;
                kVar.getClass();
                ej2.a aVar2 = (ej2.a) kVar.f23006c.apply(aVar);
                if (aVar2 == null) {
                    aVar2 = ej2.a.f59117a;
                }
                return new bj2.i(kVar.f23004a, aVar, aVar2);
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                Logger logger2 = fj2.d.f62264h;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getValue());
                new lj2.c(new ArrayList((List) obj2));
                return new jj2.a();
            case 4:
                fj2.d dVar2 = (fj2.d) obj2;
                zi2.a aVar3 = (zi2.a) obj;
                Logger logger3 = fj2.d.f62264h;
                dVar2.getClass();
                gj2.a aVar4 = (gj2.a) dVar2.f62270f.apply(aVar3);
                if (aVar4 == null) {
                    aVar4 = gj2.a.f65200a;
                }
                return new fj2.c(aVar3, dVar2.f62266b, aVar4);
            default:
                nj2.m mVar = (nj2.m) obj2;
                zi2.a aVar5 = (zi2.a) obj;
                Logger logger4 = nj2.m.f91035d;
                mVar.getClass();
                qj2.a aVar6 = (qj2.a) mVar.f91038c.apply(aVar5);
                if (aVar6 == null) {
                    aVar6 = qj2.a.f104026a;
                }
                return new nj2.k(mVar.f91036a, aVar5, aVar6);
        }
    }
}
