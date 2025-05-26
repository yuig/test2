package su0;

import android.widget.FrameLayout;
import com.pinterest.feature.ideaPinCreation.duration.view.IdeaPinDurationDragger;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115187i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinDurationDragger f115188j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IdeaPinDurationDragger ideaPinDurationDragger, int i13) {
        super(0);
        this.f115187i = i13;
        this.f115188j = ideaPinDurationDragger;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f115187i;
        IdeaPinDurationDragger ideaPinDurationDragger = this.f115188j;
        switch (i13) {
            case 0:
                return (GestaltText) ideaPinDurationDragger.a().findViewById(aq1.d.label_view);
            default:
                return (FrameLayout) ideaPinDurationDragger.a().findViewById(aq1.d.label_view_container);
        }
    }
}
