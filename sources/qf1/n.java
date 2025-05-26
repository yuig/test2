package qf1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f103753b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f103754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f103755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f103756e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f103757f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String id3, LinkedHashMap linkedHashMap, String str, String str2) {
        super(linkedHashMap, 4);
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f103753b = id3;
        this.f103754c = linkedHashMap;
        this.f103755d = str;
        this.f103756e = str2;
        this.f103757f = false;
    }

    @Override // qf1.o
    public final String a() {
        return this.f103753b;
    }

    @Override // qf1.o
    public final Map b() {
        return this.f103754c;
    }

    @Override // qf1.o
    public final boolean c() {
        return this.f103757f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f103753b, nVar.f103753b) && Intrinsics.d(this.f103754c, nVar.f103754c) && Intrinsics.d(this.f103755d, nVar.f103755d) && Intrinsics.d(this.f103756e, nVar.f103756e) && this.f103757f == nVar.f103757f;
    }

    public final int hashCode() {
        int hashCode = this.f103753b.hashCode() * 31;
        Map map = this.f103754c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f103755d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f103756e;
        return Boolean.hashCode(this.f103757f) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoBasics(id=");
        sb3.append(this.f103753b);
        sb3.append(", musicAttributionMap=");
        sb3.append(this.f103754c);
        sb3.append(", videoPinTitle=");
        sb3.append(this.f103755d);
        sb3.append(", videoPinDescription=");
        sb3.append(this.f103756e);
        sb3.append(", isStoryAd=");
        return a.a.r(sb3, this.f103757f, ")");
    }
}
