package ev0;

import android.widget.ProgressBar;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataEditText;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60270i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f60271j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i13) {
        super(0);
        this.f60270i = i13;
        this.f60271j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f60270i;
        s sVar = this.f60271j;
        switch (i13) {
            case 0:
                return (MetadataEditText) sVar.findViewById(aq1.d.idea_pin_link_creation);
            case 1:
                switch (i13) {
                    case 1:
                        return (GestaltText) sVar.findViewById(aq1.d.link_error_message);
                    default:
                        return (GestaltText) sVar.findViewById(aq1.d.link_preview);
                }
            case 2:
                switch (i13) {
                    case 1:
                        return (GestaltText) sVar.findViewById(aq1.d.link_error_message);
                    default:
                        return (GestaltText) sVar.findViewById(aq1.d.link_preview);
                }
            default:
                return (ProgressBar) sVar.findViewById(aq1.d.progress_bar);
        }
    }
}
