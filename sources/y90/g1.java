package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138179i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f138180j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m62.k f138181k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(h1 h1Var, m62.k kVar, int i13) {
        super(1);
        this.f138179i = i13;
        this.f138180j = h1Var;
        this.f138181k = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f138179i;
        m62.k kVar = this.f138181k;
        h1 h1Var = this.f138180j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                int i14 = h1.f138184y;
                h1Var.getClass();
                int i15 = kVar.f86022b.f78427b;
                standard.a(i15 == h62.m.ic_effects_opacity_24dp ? rm1.q.FADE : i15 == h62.m.ic_effects_blur_24dp ? rm1.q.SATURATION : i15 == h62.m.ic_effects_white_background_24dp ? rm1.q.COLOR : i15 == h62.m.ic_effects_brush_24dp ? rm1.q.DRAW : rm1.q.REPORT);
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new g1(h1Var, kVar, 0));
                break;
        }
        return Unit.f80348a;
    }
}
