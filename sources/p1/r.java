package p1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98578i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f98579j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f98580k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q3.r0 f98581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f98582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f98583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f98584o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q3.c1 c1Var, q3.o0 o0Var, q3.r0 r0Var, int i13, int i14, t tVar) {
        super(1);
        this.f98578i = 0;
        this.f98582m = c1Var;
        this.f98583n = o0Var;
        this.f98581l = r0Var;
        this.f98579j = i13;
        this.f98580k = i14;
        this.f98584o = tVar;
    }

    public final void b(q3.b1 b1Var) {
        int i13 = this.f98578i;
        q3.r0 r0Var = this.f98581l;
        Object obj = this.f98584o;
        Object obj2 = this.f98583n;
        Object obj3 = this.f98582m;
        switch (i13) {
            case 0:
                q.b(b1Var, (q3.c1) obj3, (q3.o0) obj2, r0Var.getLayoutDirection(), this.f98579j, this.f98580k, ((t) obj).f98595a);
                break;
            default:
                q3.c1[] c1VarArr = (q3.c1[]) obj3;
                y yVar = (y) obj2;
                int[] iArr = (int[]) obj;
                int length = c1VarArr.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    q3.c1 c1Var = c1VarArr[i14];
                    int i16 = i15 + 1;
                    Intrinsics.f(c1Var);
                    Object a13 = c1Var.a();
                    b1 b1Var2 = a13 instanceof b1 ? (b1) a13 : null;
                    n4.k layoutDirection = r0Var.getLayoutDirection();
                    yVar.getClass();
                    d dVar = b1Var2 != null ? b1Var2.f98488c : null;
                    int i17 = this.f98579j;
                    q3.b1.d(b1Var, c1Var, dVar != null ? dVar.e(i17 - c1Var.f102178a, layoutDirection) : ((u2.g) yVar.f98618b).a(0, i17 - c1Var.f102178a, layoutDirection), iArr[i15]);
                    i14++;
                    i15 = i16;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f98578i) {
            case 0:
                b((q3.b1) obj);
                break;
            default:
                b((q3.b1) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q3.c1[] c1VarArr, y yVar, int i13, q3.r0 r0Var, int[] iArr) {
        super(1);
        this.f98578i = 1;
        this.f98582m = c1VarArr;
        this.f98583n = yVar;
        this.f98579j = i13;
        this.f98580k = 0;
        this.f98581l = r0Var;
        this.f98584o = iArr;
    }
}
