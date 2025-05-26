package ex;

import android.view.View;
import c2.d6;
import c2.u2;
import i2.o;
import i2.u;
import kh2.a1;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60365i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f60366j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, int i14) {
        super(2);
        this.f60365i = i14;
        this.f60366j = i13;
    }

    public final Integer b(View view, int i13) {
        int i14 = this.f60365i;
        int i15 = this.f60366j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
        }
        return Integer.valueOf(i15);
    }

    public final void e(o oVar, int i13) {
        int i14 = this.f60365i;
        int i15 = this.f60366j;
        switch (i14) {
            case 4:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                d6.b(a1.D0(i15, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                break;
            case 5:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                u2.b(ph.a.B(), a1.D0(i15, oVar), oVar);
                break;
            case 6:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                d6.b(a1.D0(i15, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                break;
            case 7:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                d6.b(a1.D0(i15, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                break;
            default:
                g3.b(oVar, u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f60365i) {
            case 0:
                return b((View) obj, ((Number) obj2).intValue());
            case 1:
                return b((View) obj, ((Number) obj2).intValue());
            case 2:
                return b((View) obj, ((Number) obj2).intValue());
            case 3:
                return b((View) obj, ((Number) obj2).intValue());
            case 4:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 5:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 6:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 7:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 8:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 9:
                return b((View) obj, ((Number) obj2).intValue());
            case 10:
                return b((View) obj, ((Number) obj2).intValue());
            case 11:
                return b((View) obj, ((Number) obj2).intValue());
            case 12:
                return b((View) obj, ((Number) obj2).intValue());
            case 13:
                return b((View) obj, ((Number) obj2).intValue());
            case 14:
                return b((View) obj, ((Number) obj2).intValue());
            case 15:
                return b((View) obj, ((Number) obj2).intValue());
            case 16:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f60366j);
            default:
                return b((View) obj, ((Number) obj2).intValue());
        }
    }
}
