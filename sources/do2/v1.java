package do2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f55981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.l f55982d;

    public /* synthetic */ v1(i iVar, i iVar2, kl2.l lVar, int i13) {
        this.f55979a = i13;
        this.f55980b = iVar;
        this.f55981c = iVar2;
        this.f55982d = lVar;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c frame) {
        switch (this.f55979a) {
            case 0:
                eo2.v vVar = new eo2.v(null, w1.f55991a, new fd.t(this.f55982d, null, 5), jVar, new i[]{this.f55980b, this.f55981c});
                eo2.e0 e0Var = new eo2.e0(frame, frame.getContext());
                Object i13 = com.bumptech.glide.c.i1(e0Var, e0Var, vVar);
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (i13 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (i13 != aVar) {
                    i13 = Unit.f80348a;
                }
                if (i13 != aVar) {
                    break;
                }
                break;
            default:
                Object O = dl2.b.O(new eo2.c0(this.f55980b, this.f55981c, jVar, this.f55982d, null), frame);
                if (O != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
