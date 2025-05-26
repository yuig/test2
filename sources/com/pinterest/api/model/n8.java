package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public static final n8 f40341a = new n8();

    /* renamed from: b, reason: collision with root package name */
    public static final m8 f40342b = new m8();

    private n8() {
    }

    public static Boolean a(wy0 wy0Var, String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        if (wy0Var != null) {
            String str = (String) f40342b.get(boardId);
            if (str == null) {
                str = "";
            }
            if (dl2.b.S1(wy0Var, str)) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public static void b(String boardId, String ownerId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        f40342b.put(boardId, ownerId);
    }
}
