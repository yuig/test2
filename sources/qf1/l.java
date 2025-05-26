package qf1;

import a.cb;
import com.pinterest.api.model.wo0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends o {

    /* renamed from: b, reason: collision with root package name */
    public final m f103734b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103735c;

    /* renamed from: d, reason: collision with root package name */
    public final wo0 f103736d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f103737e;

    /* renamed from: f, reason: collision with root package name */
    public final String f103738f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f103739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m preview, String id3, wo0 page, LinkedHashMap linkedHashMap, String str, boolean z13) {
        super(linkedHashMap, 4);
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f103734b = preview;
        this.f103735c = id3;
        this.f103736d = page;
        this.f103737e = linkedHashMap;
        this.f103738f = str;
        this.f103739g = z13;
    }

    @Override // qf1.o
    public final String a() {
        return this.f103735c;
    }

    @Override // qf1.o
    public final Map b() {
        return this.f103737e;
    }

    @Override // qf1.o
    public final boolean c() {
        return this.f103739g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f103734b, lVar.f103734b) && Intrinsics.d(this.f103735c, lVar.f103735c) && Intrinsics.d(this.f103736d, lVar.f103736d) && Intrinsics.d(this.f103737e, lVar.f103737e) && Intrinsics.d(this.f103738f, lVar.f103738f) && this.f103739g == lVar.f103739g;
    }

    public final int hashCode() {
        int hashCode = (this.f103736d.hashCode() + cb.d(this.f103735c, this.f103734b.hashCode() * 31, 31)) * 31;
        Map map = this.f103737e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f103738f;
        return Boolean.hashCode(this.f103739g) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PageBased(preview=" + this.f103734b + ", id=" + this.f103735c + ", page=" + this.f103736d + ", musicAttributionMap=" + this.f103737e + ", link=" + this.f103738f + ", isStoryAd=" + this.f103739g + ")";
    }
}
