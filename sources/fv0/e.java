package fv0;

import com.pinterest.feature.ideaPinCreation.metadata.view.settings.SettingsPartnerBrandItemView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SettingsPartnerBrandItemView f63021j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SettingsPartnerBrandItemView settingsPartnerBrandItemView, int i13) {
        super(0);
        this.f63020i = i13;
        this.f63021j = settingsPartnerBrandItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f63020i;
        SettingsPartnerBrandItemView settingsPartnerBrandItemView = this.f63021j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (GestaltText) settingsPartnerBrandItemView.findViewById(aq1.d.approval_status);
                    default:
                        return (GestaltText) settingsPartnerBrandItemView.findViewById(aq1.d.title);
                }
            case 1:
                return (GestaltAvatar) settingsPartnerBrandItemView.findViewById(aq1.d.icon);
            case 2:
                return (GestaltIconButton) settingsPartnerBrandItemView.findViewById(aq1.d.cancel_button);
            default:
                switch (i13) {
                    case 0:
                        return (GestaltText) settingsPartnerBrandItemView.findViewById(aq1.d.approval_status);
                    default:
                        return (GestaltText) settingsPartnerBrandItemView.findViewById(aq1.d.title);
                }
        }
    }
}
