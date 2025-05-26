package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.k9;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/api/model/deserializer/BoardNoteListDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/k9;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BoardNoteListDeserializer extends a {
    public BoardNoteListDeserializer() {
        super("boardnotelist");
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, k9.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardNoteList");
        return (k9) e13;
    }
}
