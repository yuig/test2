package s1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110562i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f110563j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f110564k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(o0 o0Var, ao2.j0 j0Var, int i13) {
        super(0);
        this.f110562i = i13;
        this.f110563j = o0Var;
        this.f110564k = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = false;
        int i13 = this.f110562i;
        ao2.j0 j0Var = this.f110564k;
        o0 o0Var = this.f110563j;
        switch (i13) {
            case 0:
                if (o0Var.d()) {
                    kotlin.jvm.internal.j.z(j0Var, null, null, new x(o0Var, null), 3);
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 1:
                if (o0Var.e()) {
                    kotlin.jvm.internal.j.z(j0Var, null, null, new y(o0Var, null), 3);
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 2:
                if (o0Var.d()) {
                    kotlin.jvm.internal.j.z(j0Var, null, null, new x(o0Var, null), 3);
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                if (o0Var.e()) {
                    kotlin.jvm.internal.j.z(j0Var, null, null, new y(o0Var, null), 3);
                    z13 = true;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f110562i) {
        }
        return invoke();
    }
}
