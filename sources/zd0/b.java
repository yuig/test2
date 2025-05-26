package zd0;

import androidx.recyclerview.widget.c3;
import ja.d0;

/* loaded from: classes5.dex */
public final class b extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d0 d0Var, int i13) {
        super(d0Var);
        this.f141662d = i13;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f141662d) {
            case 0:
                return "DELETE FROM idea_pin_font WHERE type = ?";
            case 1:
                return "DELETE FROM idea_pin_font";
            case 2:
                return "DELETE FROM idea_pin_font WHERE id = ?";
            case 3:
                return "DELETE FROM idea_pin_recently_used_content WHERE content_id NOT IN (SELECT content_id FROM idea_pin_recently_used_content WHERE content_type =? AND user_id = ? ORDER BY last_used_timestamp DESC LIMIT ?) AND user_id = ? AND content_type = ?";
            case 4:
                return "UPDATE network_speed SET status = ? WHERE ideaPinPageId = ?";
            case 5:
                return "DELETE FROM network_speed WHERE timestamp <= ?";
            case 6:
                return "DELETE FROM collage_drafts WHERE id = ?";
            case 7:
                return "DELETE FROM collage_drafts";
            default:
                return "DELETE FROM collage_item WHERE id = ?";
        }
    }
}
