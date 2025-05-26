package nu0;

import com.pinterest.feature.ideaPinCreation.drafts.view.StorageStateView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92332i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ StorageStateView f92333j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(StorageStateView storageStateView, int i13) {
        super(0);
        this.f92332i = i13;
        this.f92333j = storageStateView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f92332i;
        StorageStateView storageStateView = this.f92333j;
        switch (i13) {
            case 0:
                return storageStateView.findViewById(aq1.d.background);
            case 1:
                return (GestaltIcon) storageStateView.findViewById(aq1.d.icon);
            default:
                return (GestaltText) storageStateView.findViewById(aq1.d.message);
        }
    }
}
