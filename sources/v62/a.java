package v62;

import com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import com.pinterest.shuffles.cutout.editor.ui.widget.ShimmerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import u62.w;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CutoutEditorView f124227j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(CutoutEditorView cutoutEditorView, int i13) {
        super(0);
        this.f124226i = i13;
        this.f124227j = cutoutEditorView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f124226i;
        CutoutEditorView cutoutEditorView = this.f124227j;
        switch (i13) {
            case 0:
                return (MaskedImageView) cutoutEditorView.findViewById(w.cutout_editor_mask_image_view);
            default:
                return (ShimmerView) cutoutEditorView.findViewById(w.cutout_editor_loading_shimmer);
        }
    }
}
