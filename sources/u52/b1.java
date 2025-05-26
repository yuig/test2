package u52;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f120664c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120665d;

    /* renamed from: e, reason: collision with root package name */
    public final List f120666e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120667f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120668g;

    /* renamed from: h, reason: collision with root package name */
    public final List f120669h;

    /* renamed from: i, reason: collision with root package name */
    public final List f120670i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.l0 f120671j;

    public b1(String boardId, String boardName, int i13, String userName, List allTemplates, String selectedTemplateId, String initialTemplateId, List initialSelectedPinIds, List selectedPins, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(allTemplates, "allTemplates");
        Intrinsics.checkNotNullParameter(selectedTemplateId, "selectedTemplateId");
        Intrinsics.checkNotNullParameter(initialTemplateId, "initialTemplateId");
        Intrinsics.checkNotNullParameter(initialSelectedPinIds, "initialSelectedPinIds");
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f120662a = boardId;
        this.f120663b = boardName;
        this.f120664c = i13;
        this.f120665d = userName;
        this.f120666e = allTemplates;
        this.f120667f = selectedTemplateId;
        this.f120668g = initialTemplateId;
        this.f120669h = initialSelectedPinIds;
        this.f120670i = selectedPins;
        this.f120671j = pinalyticsVMState;
    }

    public static b1 b(b1 b1Var, List list, String str, ArrayList arrayList, List list2, int i13) {
        String boardId = b1Var.f120662a;
        String boardName = b1Var.f120663b;
        int i14 = b1Var.f120664c;
        String userName = b1Var.f120665d;
        List allTemplates = (i13 & 16) != 0 ? b1Var.f120666e : list;
        String selectedTemplateId = (i13 & 32) != 0 ? b1Var.f120667f : str;
        String initialTemplateId = b1Var.f120668g;
        List initialSelectedPinIds = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? b1Var.f120669h : arrayList;
        List selectedPins = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? b1Var.f120670i : list2;
        zy.l0 pinalyticsVMState = b1Var.f120671j;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(allTemplates, "allTemplates");
        Intrinsics.checkNotNullParameter(selectedTemplateId, "selectedTemplateId");
        Intrinsics.checkNotNullParameter(initialTemplateId, "initialTemplateId");
        Intrinsics.checkNotNullParameter(initialSelectedPinIds, "initialSelectedPinIds");
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new b1(boardId, boardName, i14, userName, allTemplates, selectedTemplateId, initialTemplateId, initialSelectedPinIds, selectedPins, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f120662a, b1Var.f120662a) && Intrinsics.d(this.f120663b, b1Var.f120663b) && this.f120664c == b1Var.f120664c && Intrinsics.d(this.f120665d, b1Var.f120665d) && Intrinsics.d(this.f120666e, b1Var.f120666e) && Intrinsics.d(this.f120667f, b1Var.f120667f) && Intrinsics.d(this.f120668g, b1Var.f120668g) && Intrinsics.d(this.f120669h, b1Var.f120669h) && Intrinsics.d(this.f120670i, b1Var.f120670i) && Intrinsics.d(this.f120671j, b1Var.f120671j);
    }

    public final int hashCode() {
        return this.f120671j.hashCode() + ep.b.c(this.f120670i, ep.b.c(this.f120669h, cb.d(this.f120668g, cb.d(this.f120667f, ep.b.c(this.f120666e, cb.d(this.f120665d, ep.b.b(this.f120664c, cb.d(this.f120663b, this.f120662a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TemplateGalleryVMState(boardId=" + this.f120662a + ", boardName=" + this.f120663b + ", boardPinsCount=" + this.f120664c + ", userName=" + this.f120665d + ", allTemplates=" + this.f120666e + ", selectedTemplateId=" + this.f120667f + ", initialTemplateId=" + this.f120668g + ", initialSelectedPinIds=" + this.f120669h + ", selectedPins=" + this.f120670i + ", pinalyticsVMState=" + this.f120671j + ")";
    }
}
