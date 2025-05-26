package xd0;

import androidx.recyclerview.widget.c3;
import ja.d0;

/* loaded from: classes.dex */
public final class d extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(d0 d0Var, int i13) {
        super(d0Var);
        this.f134604d = i13;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f134604d) {
            case 0:
                return "DELETE FROM idea_pin_drafts WHERE id = ?";
            case 1:
                return "DELETE FROM idea_pin_drafts WHERE page_count = 0";
            case 2:
                return "DELETE FROM idea_pin_drafts WHERE created_at < ?";
            case 3:
                return "DELETE FROM idea_pin_drafts";
            case 4:
                return "UPDATE idea_pin_drafts SET is_expiration_supported = 1, created_at = ? WHERE is_expiration_supported = 0";
            default:
                return "DELETE FROM SearchTypeaheadSuggestionRoom";
        }
    }
}
