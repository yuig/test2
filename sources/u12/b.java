package u12;

import com.pinterest.api.model.zs;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f120006a;

    public b(ModelDeserializerWithSaveAndMerge interestDeserializer) {
        Intrinsics.checkNotNullParameter(interestDeserializer, "interestDeserializer");
        this.f120006a = interestDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return (zs) this.f120006a.e(new vd0.c(pinterestJsonObject.f125623a.v("data").i()), true, true);
    }
}
