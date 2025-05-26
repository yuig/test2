package qf1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f103730b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f103731c;

    /* renamed from: d, reason: collision with root package name */
    public final String f103732d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String id3, Map map, String str, boolean z13) {
        super(map, 4);
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f103730b = id3;
        this.f103731c = map;
        this.f103732d = str;
        this.f103733e = z13;
    }

    @Override // qf1.o
    public final String a() {
        return this.f103730b;
    }

    @Override // qf1.o
    public final Map b() {
        return this.f103731c;
    }

    @Override // qf1.o
    public final boolean c() {
        return this.f103733e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f103730b, kVar.f103730b) && Intrinsics.d(this.f103731c, kVar.f103731c) && Intrinsics.d(this.f103732d, kVar.f103732d) && this.f103733e == kVar.f103733e;
    }

    public final int hashCode() {
        int hashCode = this.f103730b.hashCode() * 31;
        Map map = this.f103731c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f103732d;
        return Boolean.hashCode(this.f103733e) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "NoList(id=" + this.f103730b + ", musicAttributionMap=" + this.f103731c + ", link=" + this.f103732d + ", isStoryAd=" + this.f103733e + ")";
    }
}
