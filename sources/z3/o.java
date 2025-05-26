package z3;

import kotlin.jvm.functions.Function1;
import s3.k0;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f140707j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f140708k = new o(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f140709i = i13;
    }

    public final Boolean b(k0 k0Var) {
        switch (this.f140709i) {
            case 0:
                j p13 = k0Var.p();
                return Boolean.valueOf(p13 != null && p13.f140701b);
            default:
                j p14 = k0Var.p();
                return Boolean.valueOf(p14 != null && p14.f140701b);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f140709i) {
        }
        return b((k0) obj);
    }
}
