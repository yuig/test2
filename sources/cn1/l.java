package cn1;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchField f28207j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(GestaltSearchField gestaltSearchField, int i13) {
        super(0);
        this.f28206i = i13;
        this.f28207j = gestaltSearchField;
    }

    public final ImageView b() {
        int i13 = this.f28206i;
        GestaltSearchField gestaltSearchField = this.f28207j;
        switch (i13) {
            case 0:
                rm1.i iVar = GestaltSearchField.f49499t;
                return (ImageView) gestaltSearchField.S0().findViewById(i.f.search_close_btn);
            default:
                rm1.i iVar2 = GestaltSearchField.f49499t;
                return (ImageView) gestaltSearchField.S0().findViewById(i.f.search_mag_icon);
        }
    }

    public final LinearLayout e() {
        int i13 = this.f28206i;
        GestaltSearchField gestaltSearchField = this.f28207j;
        switch (i13) {
            case 2:
                rm1.i iVar = GestaltSearchField.f49499t;
                return (LinearLayout) gestaltSearchField.S0().findViewById(i.f.search_edit_frame);
            default:
                rm1.i iVar2 = GestaltSearchField.f49499t;
                return (LinearLayout) gestaltSearchField.S0().findViewById(i.f.search_plate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28206i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return e();
            case 3:
                return e();
            default:
                return (SearchView) this.f28207j.findViewById(f0.gestalt_search_field);
        }
    }
}
