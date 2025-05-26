package d22;

import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.yc0;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final PinDeserializer f53643a;

    public a(PinDeserializer pinDeserializer) {
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        this.f53643a = pinDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return new yc0(pinterestJsonObject, pinterestJsonObject.d("url"), this.f53643a);
    }
}
