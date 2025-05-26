package sc0;

import c2.r2;
import ex.d;
import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import oe.f;
import q2.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112279i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f112280j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f112281k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, int i14, Function0 function0) {
        super(2);
        this.f112279i = i14;
        this.f112280j = function0;
        this.f112281k = i13;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f112279i;
        int i15 = this.f112281k;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                r2.a(this.f112280j, null, false, null, i.c(92698361, new d(i15, 5), oVar), oVar, 24576, 14);
                break;
            default:
                f.e(this.f112280j, oVar, u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f112279i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
