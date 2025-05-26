package q90;

import i2.o;
import i2.u;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103034i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f103035j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f103036k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f103037l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f103038m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, Function0 function0, int i13, int i14, int i15) {
        super(2);
        this.f103034i = i15;
        this.f103035j = qVar;
        this.f103036k = function0;
        this.f103037l = i13;
        this.f103038m = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f103034i;
        Function0 function0 = this.f103036k;
        q qVar = this.f103035j;
        int i15 = this.f103038m;
        int i16 = this.f103037l;
        switch (i14) {
            case 0:
                u2.b(qVar, function0, oVar, u.p(i16 | 1), i15);
                break;
            default:
                el.a.b(qVar, function0, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f103034i) {
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
