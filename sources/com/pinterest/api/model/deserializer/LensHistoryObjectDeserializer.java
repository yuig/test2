package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.xt;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/api/model/deserializer/LensHistoryObjectDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/xt;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LensHistoryObjectDeserializer extends a {
    public LensHistoryObjectDeserializer() {
        super("lens_image");
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        xt xtVar = new xt();
        xtVar.f43789c = json.o("id", "");
        c m13 = json.m("image_urls");
        if (m13 != null) {
            m13.o("236x236", "");
            xtVar.f44120a = m13.o("474x474", "");
            m13.o("736x", "");
            xtVar.f44121b = m13.o("1200x", "");
        }
        return xtVar;
    }
}
