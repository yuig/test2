package qf1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f103716b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f103717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f103718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String id3, LinkedHashMap linkedHashMap, boolean z13) {
        super(null, 6);
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f103716b = id3;
        this.f103717c = linkedHashMap;
        this.f103718d = z13;
    }

    @Override // qf1.o
    public final String a() {
        return this.f103716b;
    }

    @Override // qf1.o
    public final Map b() {
        return this.f103717c;
    }

    @Override // qf1.o
    public final boolean c() {
        return this.f103718d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f103716b, jVar.f103716b) && Intrinsics.d(this.f103717c, jVar.f103717c) && this.f103718d == jVar.f103718d;
    }

    public final int hashCode() {
        int hashCode = this.f103716b.hashCode() * 31;
        Map map = this.f103717c;
        return Boolean.hashCode(this.f103718d) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NoBasics(id=");
        sb3.append(this.f103716b);
        sb3.append(", musicAttributionMap=");
        sb3.append(this.f103717c);
        sb3.append(", isStoryAd=");
        return a.a.r(sb3, this.f103718d, ")");
    }
}
