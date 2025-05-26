package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24934i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24935j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f24936k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(q3.c1 c1Var, int i13, int i14) {
        super(1);
        this.f24934i = i14;
        this.f24935j = c1Var;
        this.f24936k = i13;
    }

    public final void b(q3.b1 b1Var) {
        int i13 = this.f24934i;
        q3.c1 c1Var = this.f24935j;
        int i14 = this.f24936k;
        switch (i13) {
            case 0:
                q3.b1.f(b1Var, c1Var, 0, i14);
                break;
            default:
                q3.b1.d(b1Var, c1Var, -i14, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24934i) {
            case 0:
                b((q3.b1) obj);
                break;
            default:
                b((q3.b1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
