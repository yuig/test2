package i01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;

/* loaded from: classes5.dex */
public interface e1 {
    static void a(e1 e1Var, f30 f30Var, f30 f30Var2, String str, int i13, boolean z13, List list, String str2, String str3, int i14) {
        e1Var.b(f30Var, f30Var2, str, (i14 & 8) != 0 ? -1 : i13, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? kotlin.collections.q0.f80391a : list, (i14 & 64) != 0 ? null : str2, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str3);
    }

    void b(f30 f30Var, f30 f30Var2, String str, int i13, boolean z13, List list, String str2, String str3);
}
