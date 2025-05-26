package qf1;

import a.cb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends o {

    /* renamed from: b, reason: collision with root package name */
    public final m f103680b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103681c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f103682d;

    /* renamed from: e, reason: collision with root package name */
    public final String f103683e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f103684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m preview, String id3, LinkedHashMap linkedHashMap, String str, boolean z13) {
        super(linkedHashMap, 4);
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f103680b = preview;
        this.f103681c = id3;
        this.f103682d = linkedHashMap;
        this.f103683e = str;
        this.f103684f = z13;
    }

    @Override // qf1.o
    public final String a() {
        return this.f103681c;
    }

    @Override // qf1.o
    public final Map b() {
        return this.f103682d;
    }

    @Override // qf1.o
    public final boolean c() {
        return this.f103684f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f103680b, hVar.f103680b) && Intrinsics.d(this.f103681c, hVar.f103681c) && Intrinsics.d(this.f103682d, hVar.f103682d) && Intrinsics.d(this.f103683e, hVar.f103683e) && this.f103684f == hVar.f103684f;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f103681c, this.f103680b.hashCode() * 31, 31);
        Map map = this.f103682d;
        int hashCode = (d2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f103683e;
        return Boolean.hashCode(this.f103684f) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Link(preview=");
        sb3.append(this.f103680b);
        sb3.append(", id=");
        sb3.append(this.f103681c);
        sb3.append(", musicAttributionMap=");
        sb3.append(this.f103682d);
        sb3.append(", link=");
        sb3.append(this.f103683e);
        sb3.append(", isStoryAd=");
        return a.a.r(sb3, this.f103684f, ")");
    }
}
