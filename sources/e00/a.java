package e00;

import com.pinterest.api.model.f30;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f56756a;

    public a(ModelDeserializerWithSaveAndMerge pinDeserializer) {
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        this.f56756a = pinDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return (f30) this.f56756a.e(new c(pinterestJsonObject.f125623a.v("data").i()), true, true);
    }
}
