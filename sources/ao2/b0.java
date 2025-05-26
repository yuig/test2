package ao2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20114a;

    public /* synthetic */ b0(int i13) {
        this.f20114a = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z13 = true;
        switch (this.f20114a) {
            case 0:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!((Boolean) obj).booleanValue() && !(element instanceof a0)) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 1:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                return element2 instanceof a0 ? coroutineContext.plus(((a0) element2).copyForChild()) : coroutineContext.plus(element2);
            case 2:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                fi.b bVar = ho2.y.f69792a;
                if (!(element3 instanceof n2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element3 : Integer.valueOf(intValue + 1);
            case 5:
                n2 n2Var = (n2) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                fi.b bVar2 = ho2.y.f69792a;
                if (n2Var != null) {
                    return n2Var;
                }
                return element4 instanceof n2 ? (n2) element4 : null;
            default:
                ho2.a0 a0Var = (ho2.a0) obj;
                CoroutineContext.Element element5 = (CoroutineContext.Element) obj2;
                fi.b bVar3 = ho2.y.f69792a;
                if (element5 instanceof n2) {
                    n2 n2Var2 = (n2) element5;
                    a0Var.a(n2Var2, n2Var2.updateThreadContext(a0Var.f69744a));
                }
                return a0Var;
        }
    }
}
