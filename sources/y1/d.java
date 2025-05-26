package y1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f136541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b0 b0Var) {
        super(1, kotlin.jvm.internal.r.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f136541a = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((b3.i0) obj).f21330a;
        q3.x xVar = (q3.x) ((z) this.f136541a).f136613q.getValue();
        if (xVar != null) {
            if (!xVar.h()) {
                xVar = null;
            }
            if (xVar != null) {
                xVar.L(fArr);
            }
        }
        return Unit.f80348a;
    }
}
