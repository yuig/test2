package q90;

import i2.o;
import i2.u;
import kh2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103026i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f103027j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f103028k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f103029l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f103030m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, q qVar, int i13, int i14, int i15) {
        super(2);
        this.f103026i = i15;
        this.f103027j = bVar;
        this.f103028k = qVar;
        this.f103029l = i13;
        this.f103030m = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f103026i;
        q qVar = this.f103028k;
        b bVar = this.f103027j;
        int i15 = this.f103030m;
        int i16 = this.f103029l;
        switch (i14) {
            case 0:
                b0.c(bVar, qVar, oVar, u.p(i16 | 1), i15);
                break;
            default:
                b0.d(bVar, qVar, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f103026i) {
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
