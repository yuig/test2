package k1;

import c2.d6;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f78104k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f78105l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i13, androidx.compose.foundation.lazy.layout.y yVar, Object obj) {
        super(2);
        this.f78102i = 2;
        this.f78104k = yVar;
        this.f78103j = i13;
        this.f78105l = obj;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f78102i;
        int i15 = this.f78103j;
        Object obj = this.f78105l;
        Object obj2 = this.f78104k;
        switch (i14) {
            case 0:
                androidx.compose.foundation.a.a((u2.q) obj2, (Function1) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                ((l1.j) obj2).a((l1.c) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 2:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                ((androidx.compose.foundation.lazy.layout.y) obj2).e(i15, obj, oVar, 0);
                break;
            case 3:
                w1.i.a((b4.g) obj2, (List) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 4:
                w1.g1.c((b2.t0) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 5:
                d6.a((b4.q0) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 6:
                i2.d2[] d2VarArr = (i2.d2[]) obj2;
                com.bumptech.glide.d.b((i2.d2[]) Arrays.copyOf(d2VarArr, d2VarArr.length), (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 7:
                com.bumptech.glide.d.a((i2.d2) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 8:
                kh2.m0.c((List) obj2, (Collection) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 9:
                kh2.s0.m((Function2) obj2, (kl2.l) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 10:
                kh2.d.e((uc0.x) obj2, (Function1) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 11:
                kh2.d.a((List) obj2, (Function1) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 12:
                kh2.n.l((uc0.a1) obj2, (Function1) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 13:
                dn.c.e((p1.u) obj2, (yy0.f0) obj, oVar, i2.u.p(i15 | 1));
                break;
            default:
                dn.c.f((yy0.d) obj2, (Function1) obj, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f78102i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 8:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 9:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 10:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 11:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 12:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 13:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, int i13, int i14) {
        super(2);
        this.f78102i = i14;
        this.f78104k = obj;
        this.f78105l = obj2;
        this.f78103j = i13;
    }
}
