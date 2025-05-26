package zc1;

import com.pinterest.feature.settings.shared.view.UnsavedChangesModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141607i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UnsavedChangesModalView f141608j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(UnsavedChangesModalView unsavedChangesModalView, int i13) {
        super(0);
        this.f141607i = i13;
        this.f141608j = unsavedChangesModalView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UnsavedChangesModalView unsavedChangesModalView = this.f141608j;
        int i13 = this.f141607i;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return (GestaltButton) unsavedChangesModalView.findViewById(c52.c.modal_edit_profile_leave);
    }
}
