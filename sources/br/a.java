package br;

import androidx.annotation.NonNull;
import nm.v;
import pk.a0;

/* loaded from: classes3.dex */
public enum a {
    TYPED("typed"),
    RECENT_HISTORY("rs"),
    AUTO_COMPLETE("autocomplete"),
    AUTO_COMPLETE_CLIENT_CACHE("cc_autocomplete"),
    AUTO_COMPLETE_APPENDED("cc_autocomplete_append"),
    TAB_CHANGE("tab_change"),
    EDUCATION("education"),
    FILTER("guide"),
    HASHTAG("hashtag"),
    MODE("mode"),
    ACTION_FILTER("filter"),
    TRENDING("trending"),
    TYPO_SUGGESTION("typo_suggestion"),
    TYPO_AUTO_ORGINAL("typo_auto_original"),
    TYPO_AUTO_CORRECTED("typo_auto_corrected"),
    REMOVE("remove"),
    CONTEXTUAL("contextual"),
    RELATED_SEARCH_STORY("related_search_story"),
    RELATED_SEARCH_STORY_HF("related_search_story_hf"),
    DINNER_TIME_STORY("dinner_time_story"),
    LENS("lens");

    private final v _json;
    private final String _value;

    a(@NonNull String str) {
        this._value = str;
        this._json = new v(str);
    }

    public static a findByValue(String str) {
        if (a0.x0(str)) {
            return null;
        }
        for (a aVar : values()) {
            if (aVar.getValue().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public v getJson() {
        return this._json;
    }

    public String getValue() {
        return this._value;
    }
}
