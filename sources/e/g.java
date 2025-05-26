package e;

import i2.o;
import i2.u;
import kh2.j1;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes2.dex */
public final class g extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56681i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f56682j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f56683k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f56684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f56685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i13, boolean z13, Function0 function0, int i14) {
        super(2);
        this.f56682j = i13;
        this.f56683k = z13;
        this.f56684l = function0;
        this.f56685m = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f56681i;
        boolean z13 = this.f56683k;
        int i15 = this.f56685m;
        int i16 = this.f56682j;
        Object obj = this.f56684l;
        switch (i14) {
            case 0:
                ig1.b.a(i16 | 1, i15, oVar, (Function0) obj, z13);
                break;
            case 1:
                j1.y(i16, u.p(i15 | 1), oVar, (Function0) obj, z13);
                break;
            default:
                k3.i((q) obj, z13, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f56681i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, boolean z13, int i13, int i14) {
        super(2);
        this.f56684l = qVar;
        this.f56683k = z13;
        this.f56682j = i13;
        this.f56685m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z13, Function0 function0, int i13, int i14) {
        super(2);
        this.f56683k = z13;
        this.f56684l = function0;
        this.f56682j = i13;
        this.f56685m = i14;
    }
}
