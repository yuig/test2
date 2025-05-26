package q90;

import com.pinterest.collage.cutoutpicker.closeup.components.CutoutEditorView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import u62.k;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends p implements Function1 {
    public i(Object obj) {
        super(1, obj, CutoutEditorView.class, "handleCutoutEditorEvent", "handleCutoutEditorEvent(Lcom/pinterest/shuffles/cutout/editor/CutoutEditorViewEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k p03 = (k) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        ((CutoutEditorView) this.receiver).f44629c.invoke(p03);
        return Unit.f80348a;
    }
}
