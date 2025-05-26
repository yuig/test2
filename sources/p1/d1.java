package p1;

import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98494i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f98495j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f98496k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f98497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f98498m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f98499n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(q1 q1Var, int i13, q3.c1 c1Var, int i14, q3.r0 r0Var) {
        super(1);
        this.f98494i = 1;
        this.f98497l = q1Var;
        this.f98495j = i13;
        this.f98498m = c1Var;
        this.f98496k = i14;
        this.f98499n = r0Var;
    }

    public final void b(q3.b1 b1Var) {
        int i13 = this.f98494i;
        Object obj = this.f98499n;
        int i14 = this.f98495j;
        Object obj2 = this.f98498m;
        Object obj3 = this.f98497l;
        switch (i13) {
            case 0:
                q3.c1[] c1VarArr = (q3.c1[]) obj3;
                e1 e1Var = (e1) obj2;
                int[] iArr = (int[]) obj;
                int length = c1VarArr.length;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length) {
                    q3.c1 c1Var = c1VarArr[i15];
                    int i17 = i16 + 1;
                    Intrinsics.f(c1Var);
                    Object a13 = c1Var.a();
                    b1 b1Var2 = a13 instanceof b1 ? (b1) a13 : null;
                    e1Var.getClass();
                    d dVar = b1Var2 != null ? b1Var2.f98488c : null;
                    q3.b1.d(b1Var, c1Var, iArr[i16], dVar != null ? dVar.e(i14 - c1Var.f102179b, n4.k.Ltr) : ((u2.h) e1Var.f98504b).a(0, i14 - c1Var.f102179b));
                    i15++;
                    i16 = i17;
                }
                break;
            default:
                q3.c1 c1Var2 = (q3.c1) obj2;
                q3.b1.e(b1Var, c1Var2, ((n4.h) ((q1) obj3).f98577p.invoke(new n4.j(lb.l0.d(i14 - c1Var2.f102178a, this.f98496k - c1Var2.f102179b)), ((q3.r0) obj).getLayoutDirection())).f89180a);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f98494i) {
            case 0:
                b((q3.b1) obj);
                break;
            case 1:
                b((q3.b1) obj);
                break;
            default:
                PinnableImageFeed pinnableImageFeed = new PinnableImageFeed();
                pinnableImageFeed.H((List) obj);
                qp.k kVar = (qp.k) this.f98497l;
                if (kVar != null) {
                    kVar.f8(pinnableImageFeed, ((((List) this.f98499n).size() + ((vd0.a) this.f98498m).d()) - this.f98495j) - this.f98496k);
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(qp.k kVar, vd0.a aVar, List list, int i13, int i14) {
        super(1);
        this.f98494i = 2;
        this.f98497l = kVar;
        this.f98498m = aVar;
        this.f98499n = list;
        this.f98495j = i13;
        this.f98496k = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(q3.c1[] c1VarArr, e1 e1Var, int i13, int[] iArr) {
        super(1);
        this.f98494i = 0;
        this.f98497l = c1VarArr;
        this.f98498m = e1Var;
        this.f98495j = i13;
        this.f98496k = 0;
        this.f98499n = iArr;
    }
}
