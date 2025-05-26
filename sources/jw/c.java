package jw;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f77654a;

    public c(Map valueMap) {
        Intrinsics.checkNotNullParameter(valueMap, "valueMap");
        this.f77654a = valueMap;
    }

    public final Integer a() {
        List list = (List) this.f77654a.get("agod");
        if (list != null) {
            return (Integer) CollectionsKt.U(1, list);
        }
        return null;
    }

    public final Integer b() {
        List list = (List) this.f77654a.get("agod");
        if (list != null) {
            return (Integer) CollectionsKt.U(0, list);
        }
        return null;
    }

    public final Integer c() {
        List list = (List) this.f77654a.get("block");
        if (list != null) {
            return (Integer) CollectionsKt.U(0, list);
        }
        return null;
    }

    public final Integer d() {
        List list = (List) this.f77654a.get("dblock");
        if (list != null) {
            return (Integer) CollectionsKt.U(1, list);
        }
        return null;
    }

    public final Integer e() {
        List list = (List) this.f77654a.get("dblock");
        if (list != null) {
            return (Integer) CollectionsKt.U(0, list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f77654a, ((c) obj).f77654a);
    }

    public final Integer f() {
        List list = (List) this.f77654a.get("init");
        if (list != null) {
            return (Integer) CollectionsKt.U(0, list);
        }
        return null;
    }

    public final int hashCode() {
        return this.f77654a.hashCode();
    }

    public final String toString() {
        return "PowerscoreExperimentValues(valueMap=" + this.f77654a + ")";
    }
}
