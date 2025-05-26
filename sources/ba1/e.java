package ba1;

import com.pinterest.feature.settings.claimedaccount.handshake.listaccounts.ClaimedAccountItemView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ClaimedAccountItemView f22356j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ClaimedAccountItemView claimedAccountItemView, int i13) {
        super(0);
        this.f22355i = i13;
        this.f22356j = claimedAccountItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f22355i;
        ClaimedAccountItemView claimedAccountItemView = this.f22356j;
        switch (i13) {
            case 0:
                return (GestaltIconButton) claimedAccountItemView.findViewById(b52.a.account_next);
            case 1:
                switch (i13) {
                    case 1:
                        return (GestaltText) claimedAccountItemView.findViewById(b52.a.account_description);
                    default:
                        return (GestaltText) claimedAccountItemView.findViewById(b52.a.account_title);
                }
            case 2:
                return (GestaltIcon) claimedAccountItemView.findViewById(b52.a.error_icon);
            default:
                switch (i13) {
                    case 1:
                        return (GestaltText) claimedAccountItemView.findViewById(b52.a.account_description);
                    default:
                        return (GestaltText) claimedAccountItemView.findViewById(b52.a.account_title);
                }
        }
    }
}
