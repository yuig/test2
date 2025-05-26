package jb2;

import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.blurView.BlurView;
import com.pinterest.ui.view.descriptors.VisualSearchPill;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75368i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ VisualSearchPill f75369j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(VisualSearchPill visualSearchPill, int i13) {
        super(0);
        this.f75368i = i13;
        this.f75369j = visualSearchPill;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f75368i;
        VisualSearchPill visualSearchPill = this.f75369j;
        switch (i13) {
            case 0:
                return (BlurView) visualSearchPill.findViewById(vc2.c.blur_view);
            default:
                return (GestaltText) visualSearchPill.findViewById(vc2.c.search_guide_text);
        }
    }
}
