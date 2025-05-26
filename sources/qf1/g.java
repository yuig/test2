package qf1;

import a.cb;
import com.pinterest.api.model.qk0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends o {

    /* renamed from: b, reason: collision with root package name */
    public final m f103672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103673c;

    /* renamed from: d, reason: collision with root package name */
    public final qk0 f103674d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f103675e;

    /* renamed from: f, reason: collision with root package name */
    public final String f103676f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f103677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m preview, String id3, qk0 basics, LinkedHashMap linkedHashMap, String str, boolean z13) {
        super(linkedHashMap, 4);
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(basics, "basics");
        this.f103672b = preview;
        this.f103673c = id3;
        this.f103674d = basics;
        this.f103675e = linkedHashMap;
        this.f103676f = str;
        this.f103677g = z13;
    }

    @Override // qf1.o
    public final String a() {
        return this.f103673c;
    }

    @Override // qf1.o
    public final Map b() {
        return this.f103675e;
    }

    @Override // qf1.o
    public final boolean c() {
        return this.f103677g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f103672b, gVar.f103672b) && Intrinsics.d(this.f103673c, gVar.f103673c) && Intrinsics.d(this.f103674d, gVar.f103674d) && Intrinsics.d(this.f103675e, gVar.f103675e) && Intrinsics.d(this.f103676f, gVar.f103676f) && this.f103677g == gVar.f103677g;
    }

    public final int hashCode() {
        int hashCode = (this.f103674d.hashCode() + cb.d(this.f103673c, this.f103672b.hashCode() * 31, 31)) * 31;
        Map map = this.f103675e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f103676f;
        return Boolean.hashCode(this.f103677g) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Basics(preview=" + this.f103672b + ", id=" + this.f103673c + ", basics=" + this.f103674d + ", musicAttributionMap=" + this.f103675e + ", link=" + this.f103676f + ", isStoryAd=" + this.f103677g + ")";
    }
}
