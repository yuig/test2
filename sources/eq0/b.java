package eq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import x40.j5;
import x40.k5;
import xk2.w;
import z40.u;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59911i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f59912j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f59913k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f59914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, k kVar, int i13) {
        super(1);
        this.f59911i = i13;
        this.f59912j = str;
        this.f59913k = str2;
        this.f59914l = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59911i;
        String str = this.f59912j;
        k kVar = this.f59914l;
        String str2 = this.f59913k;
        switch (i13) {
            case 0:
                j5 j5Var = ((k5) ((u) obj)).f132664d;
                c.b(str, str2, kVar, j5Var != null ? j5Var.f132591d : null);
                break;
            default:
                c.b(str, str2, kVar, (String) ((w) obj).f135234a);
                break;
        }
        return Unit.f80348a;
    }
}
