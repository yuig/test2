package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.gb;
import com.pinterest.api.model.ih;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/api/model/deserializer/BubbleSeparatorDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/gb;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BubbleSeparatorDeserializer extends a {
    public BubbleSeparatorDeserializer() {
        super("exploreseparator");
    }

    @Override // ke0.a
    public final s d(c json) {
        c m13;
        Intrinsics.checkNotNullParameter(json, "json");
        gb gbVar = new gb();
        gbVar.h(json.o("text", ""));
        json.o("type", "");
        gbVar.e(json.o("id", ""));
        gbVar.g(json.o("separator_type", ""));
        c m14 = json.m("aux_fields");
        if (m14 != null && (m13 = m14.m("action")) != null) {
            gbVar.c(ih.w(m13));
        }
        return gbVar;
    }
}
