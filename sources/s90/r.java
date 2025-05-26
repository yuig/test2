package s90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.p implements Function1 {
    public r(Object obj) {
        super(1, obj, v.class, "handleCutoutEditorViewEvent", "handleCutoutEditorViewEvent(Lcom/pinterest/shuffles/cutout/editor/CutoutEditorViewEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u62.k p03 = (u62.k) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        v vVar = (v) this.receiver;
        int i13 = v.f112028l0;
        vVar.getClass();
        vVar.b8(new h(new sa0.b(p03)));
        return Unit.f80348a;
    }
}
