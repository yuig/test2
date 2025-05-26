package tt0;

import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinDraftsButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119228i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinDraftsButton f119229j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(IdeaPinDraftsButton ideaPinDraftsButton, int i13) {
        super(0);
        this.f119228i = i13;
        this.f119229j = ideaPinDraftsButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119228i;
        IdeaPinDraftsButton ideaPinDraftsButton = this.f119229j;
        switch (i13) {
            case 0:
                return (WebImageView) ideaPinDraftsButton.findViewById(dq1.c.drafts_background);
            default:
                return (GestaltText) ideaPinDraftsButton.findViewById(dq1.c.drafts_count);
        }
    }
}
