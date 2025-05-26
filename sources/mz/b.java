package mz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends ag2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String searchQuery, int i13) {
        super("parent_pin_id", searchQuery);
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(searchQuery, "parentPinId");
        } else {
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            super("query_text", searchQuery);
        }
    }

    public b() {
        super("", "");
    }
}
