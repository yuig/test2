package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.tf;
import com.pinterest.api.model.yk;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/api/model/deserializer/ExploreSearchObjectDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/yk;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/f30;", "pinDeserializer", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ExploreSearchObjectDeserializer extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreSearchObjectDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<f30> pinDeserializer) {
        super("exploresearch");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        this.f36774b = pinDeserializer;
    }

    @Override // ke0.a
    public final s d(c json) {
        c b13;
        c m13;
        Intrinsics.checkNotNullParameter(json, "json");
        yk ykVar = new yk();
        ykVar.c(json.o("text", ""));
        ykVar.a(json.o("display", ""));
        c m14 = json.m("pin");
        if (m14 != null) {
        }
        c m15 = json.m("cover_image");
        if (m15 != null) {
            tf.a(m15);
        }
        vd0.a k13 = json.k("cover_images");
        if (k13.d() > 0 && (b13 = k13.b(0)) != null && (m13 = b13.m("474x")) != null) {
            m13.o("url", "");
        }
        return ykVar;
    }
}
