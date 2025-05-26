package com.pinterest.feature.board.permissions;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import y22.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DO_EVERYTHING = new d("DO_EVERYTHING", 0, f.ALL, j70.c.board_permissions_do_everything_title, j70.c.board_permissions_do_everything_subtitle);
    public static final d SAVE_AND_COMMENT = new d("SAVE_AND_COMMENT", 1, f.SAVE_ONLY, j70.c.board_permissions_save_and_comment_title, j70.c.board_permissions_save_and_comment_subtitle);

    @NotNull
    private final f boardCollaboratorPermission;
    private final int permissionSubtitleResId;
    private final int permissionTitleResId;

    private static final /* synthetic */ d[] $values() {
        return new d[]{DO_EVERYTHING, SAVE_AND_COMMENT};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, f fVar, int i14, int i15) {
        this.boardCollaboratorPermission = fVar;
        this.permissionTitleResId = i14;
        this.permissionSubtitleResId = i15;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final f getBoardCollaboratorPermission() {
        return this.boardCollaboratorPermission;
    }

    public final int getPermissionSubtitleResId() {
        return this.permissionSubtitleResId;
    }

    public final int getPermissionTitleResId() {
        return this.permissionTitleResId;
    }
}
