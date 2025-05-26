package pc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f99515a;

    /* renamed from: b, reason: collision with root package name */
    public final List f99516b;

    /* renamed from: c, reason: collision with root package name */
    public final List f99517c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f99518d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f99519e;

    public b0(String message, List list, List list2, Map map, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f99515a = message;
        this.f99516b = list;
        this.f99517c = list2;
        this.f99518d = map;
        this.f99519e = linkedHashMap;
    }

    public final String toString() {
        return "Error(message = " + this.f99515a + ", locations = " + this.f99516b + ", path=" + this.f99517c + ", extensions = " + this.f99518d + ", nonStandardFields = " + this.f99519e + ')';
    }
}
