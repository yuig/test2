package t3;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final w f116244j = new w(0);

    /* renamed from: k, reason: collision with root package name */
    public static final w f116245k = new w(1);

    /* renamed from: l, reason: collision with root package name */
    public static final w f116246l = new w(2);

    /* renamed from: m, reason: collision with root package name */
    public static final w f116247m = new w(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13) {
        super(1);
        this.f116248i = i13;
    }

    public final Boolean b(s3.k0 k0Var) {
        boolean z13 = false;
        switch (this.f116248i) {
            case 1:
                z3.j p13 = k0Var.p();
                if (p13 != null && p13.f140701b) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 2:
                return Boolean.valueOf(k0Var.f110837y.d(8));
            default:
                z3.j p14 = k0Var.p();
                if (p14 != null && p14.f140701b) {
                    if (p14.f140700a.containsKey(z3.t.f140756y)) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f116248i) {
            case 0:
                break;
        }
        return b((s3.k0) obj);
    }
}
