package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.qe;
import com.pinterest.api.model.tf;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/api/model/deserializer/ContextualSearchObjectDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/qe;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/f30;", "pinDeserializer", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContextualSearchObjectDeserializer extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualSearchObjectDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<f30> pinDeserializer) {
        super("contextual_search");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        this.f36752b = pinDeserializer;
    }

    @Override // ke0.a
    public final s d(c json) {
        c m13;
        Intrinsics.checkNotNullParameter(json, "json");
        qe qeVar = new qe();
        qeVar.c(json.o("term", ""));
        qeVar.a(json.o("display", ""));
        c m14 = json.m("pin");
        if (m14 != null) {
        }
        c m15 = json.m("cover_image");
        if (m15 != null) {
            tf.a(m15);
        }
        c m16 = json.m("images");
        if (m16 != null && (m13 = m16.m("474x")) != null) {
            m13.o("url", "");
        }
        return qeVar;
    }
}
