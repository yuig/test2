package bc1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m40.e;
import m40.f;
import m40.g;
import nm.u;
import pc.h;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f22636j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f22637k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22638i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f22638i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m40.d dVar;
        List<e> list;
        switch (this.f22638i) {
            case 0:
                return Unit.f80348a;
            default:
                h response = (h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                vd0.c cVar = new vd0.c(new u());
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
                return cVar;
        }
    }
}
