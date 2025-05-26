package q90;

import i2.o;
import i2.u;
import kg.t;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103042i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f103043j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f103044k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f103045l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f103046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yl1.d f103047n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f103048o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f103049p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, Function0 function0, q qVar, boolean z13, yl1.d dVar, int i13, int i14, int i15) {
        super(2);
        this.f103042i = i15;
        this.f103043j = str;
        this.f103044k = function0;
        this.f103045l = qVar;
        this.f103046m = z13;
        this.f103047n = dVar;
        this.f103048o = i13;
        this.f103049p = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f103042i;
        int i15 = this.f103048o;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                u2.i(this.f103043j, this.f103044k, this.f103045l, this.f103046m, this.f103047n, oVar, p13, this.f103049p);
                break;
            default:
                int p14 = u.p(i15 | 1);
                t.d(this.f103043j, this.f103044k, this.f103045l, this.f103046m, this.f103047n, oVar, p14, this.f103049p);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f103042i) {
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
