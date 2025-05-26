package v12;

import com.pinterest.api.model.deserializer.IdeaPinMusicMetadataDeserializer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final IdeaPinMusicMetadataDeserializer f123844a;

    public a(IdeaPinMusicMetadataDeserializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f123844a = deserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        ArrayList arrayList = new ArrayList();
        vd0.a k13 = pinterestJsonObject.k("data");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        int d2 = k13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            c j13 = k13.j(i13);
            Intrinsics.checkNotNullExpressionValue(j13, "optJsonObject(...)");
            this.f123844a.getClass();
            arrayList.add(IdeaPinMusicMetadataDeserializer.e(j13));
        }
        return arrayList;
    }
}
