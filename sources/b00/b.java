package b00;

import com.pinterest.api.model.kv;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20720a = new b();

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        HashMap l13 = pinterestJsonObject.l();
        Intrinsics.checkNotNullExpressionValue(l13, "optJsonMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(l13.size()));
        for (Map.Entry entry : l13.entrySet()) {
            Object key = entry.getKey();
            Object e13 = vd0.c.f125622b.e(((vd0.c) entry.getValue()).f125623a, kv.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.MediaUploadStatus");
            linkedHashMap.put(key, (kv) e13);
        }
        return linkedHashMap;
    }
}
