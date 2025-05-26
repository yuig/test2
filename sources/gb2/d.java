package gb2;

import java.util.LinkedHashMap;
import java.util.Map;
import kg.p;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f64745a;

    public /* synthetic */ d(String str) {
        this.f64745a = str;
    }

    public static LinkedHashMap a(String id3, nh2.c cVar) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair(sh2.h.f112972u, id3);
        pairArr[1] = new Pair(sh2.h.f112973v, cVar != null ? cVar.name() : null);
        return p.e0(z0.g(pairArr));
    }

    public abstract Map b();

    public abstract nh2.c c();
}
