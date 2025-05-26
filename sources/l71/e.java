package l71;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81934i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f81935j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f81934i = i13;
        this.f81935j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f81934i;
        f fVar = this.f81935j;
        switch (i13) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fVar.f81941p = null;
                fVar.f81942q = null;
                return it;
            case 1:
                String query = (String) obj;
                Intrinsics.checkNotNullParameter(query, "query");
                fVar.I(query);
                return uj2.q.y(query);
            default:
                String str = (String) obj;
                Intrinsics.f(str);
                if (fVar.D(str)) {
                    fVar.F(str);
                } else {
                    fVar.f81939n.c(q0.f80391a);
                }
                return Unit.f80348a;
        }
    }
}
