package lv1;

import com.pinterest.nux.network.serialization.NuxUseCaseFeedDeserializer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final NuxUseCaseFeedDeserializer f85029a;

    public a(NuxUseCaseFeedDeserializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85029a = deserializer;
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
            this.f85029a.getClass();
            arrayList.add(NuxUseCaseFeedDeserializer.e(j13));
        }
        return arrayList;
    }
}
