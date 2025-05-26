package cl0;

import a41.q0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import n41.h;
import qf1.k0;
import qf1.l0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27974i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f27975j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f27976k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(HashMap hashMap, Function1 function1, int i13) {
        super(1);
        this.f27974i = i13;
        this.f27975j = hashMap;
        this.f27976k = function1;
    }

    public final void b(int i13) {
        int i14 = this.f27974i;
        Function1 function1 = this.f27976k;
        Map map = this.f27975j;
        switch (i14) {
            case 0:
                a aVar = (a) map.get(Integer.valueOf(i13));
                if (aVar != null) {
                    function1.invoke(aVar);
                    break;
                }
                break;
            case 1:
                q0 q0Var = (q0) map.get(Integer.valueOf(i13));
                if (q0Var != null) {
                    function1.invoke(q0Var);
                    break;
                }
                break;
            case 2:
                h hVar = (h) map.get(Integer.valueOf(i13));
                if (hVar != null) {
                    function1.invoke(hVar);
                    break;
                }
                break;
            case 3:
                Integer num = (Integer) map.get(k0.ALLOW_COMMENTS);
                boolean z13 = false;
                if (num != null && ((i13 >> num.intValue()) & 1) != 0) {
                    z13 = true;
                }
                function1.invoke(Boolean.valueOf(z13));
                break;
            default:
                l0 l0Var = (l0) map.get(Integer.valueOf(i13));
                if (l0Var != null) {
                    function1.invoke(l0Var.f103740a);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27974i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            case 1:
                b(((Number) obj).intValue());
                break;
            case 2:
                b(((Number) obj).intValue());
                break;
            case 3:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
