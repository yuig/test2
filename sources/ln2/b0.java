package ln2;

import am2.w0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final vm2.f f84061a;

    /* renamed from: b, reason: collision with root package name */
    public final vm2.a f84062b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f84063c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f84064d;

    public b0(tm2.g0 proto, vm2.h nameResolver, um2.a metadataVersion, e82.l classSource) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        this.f84061a = nameResolver;
        this.f84062b = metadataVersion;
        this.f84063c = classSource;
        List list = proto.f118273g;
        Intrinsics.checkNotNullExpressionValue(list, "getClass_List(...)");
        List list2 = list;
        int a13 = y0.a(kotlin.collections.g0.q(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (Object obj : list2) {
            linkedHashMap.put(bs1.c.s0(this.f84061a, ((tm2.k) obj).f118351e), obj);
        }
        this.f84064d = linkedHashMap;
    }

    @Override // ln2.i
    public final h a(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        tm2.k kVar = (tm2.k) this.f84064d.get(classId);
        if (kVar == null) {
            return null;
        }
        return new h(this.f84061a, kVar, this.f84062b, (w0) this.f84063c.invoke(classId));
    }
}
