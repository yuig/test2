package zz;

import com.pinterest.api.model.vh;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f143145a;

    public a(ModelDeserializerWithSaveAndMerge dynamicStoryDeserializer) {
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f143145a = dynamicStoryDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        vh vhVar;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 == null || (vhVar = (vh) this.f143145a.d(m13)) == null) {
            throw new UnsupportedOperationException("Unsupported JSON Schema");
        }
        return vhVar;
    }
}
