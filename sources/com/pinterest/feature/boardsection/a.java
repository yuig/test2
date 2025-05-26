package com.pinterest.feature.boardsection;

import pk.a0;
import vb0.j;

/* loaded from: classes5.dex */
public enum a {
    BOARD_ADD_SECTION("BOARD_ADD_SECTION"),
    BOARD_ORGANIZE_PINS("BOARD_ORGANIZE_PINS"),
    BOARD_SECTION_ORGANIZE_PINS("BOARD_SECTION_ORGANIZE_PINS"),
    REPIN("REPIN"),
    REORDER_BOARD_PINS("REORDER_BOARD_PINS"),
    REORDER_BOARD_SECTION_PINS("REORDER_BOARD_SECTION_PINS"),
    MOVE_PROFILE_PINS("MOVE_PROFILE_PINS");

    private static final a[] values = values();
    private final String _actionMode;

    a(String str) {
        this._actionMode = str;
    }

    public static a findByValue(String str) {
        if (a0.x0(str)) {
            return null;
        }
        for (a aVar : values) {
            if (aVar.getValue().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static a getEnumFromValue(String str) {
        j.f125466a.N(findByValue(str), "Invalid BoardSectionActionMode", new Object[0]);
        return findByValue(str);
    }

    public String getValue() {
        return this._actionMode;
    }
}
