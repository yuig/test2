package bq;

import androidx.annotation.NonNull;
import d70.g;
import pk.a0;

/* loaded from: classes3.dex */
public enum b {
    MOST_RECENT(g.library_board_sort_last_saved, sm1.b.ic_clock_gestalt, "last_pinned_to"),
    ALPHABETICAL(g.library_board_sort_alphabetical, sm1.b.ic_alphabetical_gestalt, "alphabetical"),
    NEWEST(g.library_board_newest, sm1.b.ic_directional_arrow_right_gestalt, "newest"),
    OLDEST(g.library_board_oldest, sm1.b.ic_directional_arrow_left_gestalt, "oldest"),
    CUSTOM(g.library_board_sort_custom, d70.c.ic_board_sort_custom_nonpds, "custom");


    @NonNull
    private final String _apiKey;
    private final int _iconId;
    private final int _titleId;

    b(int i13, int i14, @NonNull String str) {
        this._titleId = i13;
        this._iconId = i14;
        this._apiKey = str;
    }

    public static b getOptionByApiKey(@NonNull String str) {
        for (b bVar : values()) {
            if (a0.N(bVar._apiKey, str)) {
                return bVar;
            }
        }
        return null;
    }

    @NonNull
    public String getApiKey() {
        return this._apiKey;
    }

    public int getIconId() {
        return this._iconId;
    }

    public int getTitleId() {
        return this._titleId;
    }

    public boolean isSameOption(b bVar) {
        return bVar != null && getApiKey().equals(bVar.getApiKey());
    }
}
