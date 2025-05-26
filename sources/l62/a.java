package l62;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import r72.b2;
import r72.e2;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f81609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81610b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81611c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81612d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81613e;

    /* renamed from: f, reason: collision with root package name */
    public final e2 f81614f;

    public a(List items, boolean z13, boolean z14, String str, boolean z15, e2 shuffleOverlay) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shuffleOverlay, "shuffleOverlay");
        this.f81609a = items;
        this.f81610b = z13;
        this.f81611c = z14;
        this.f81612d = str;
        this.f81613e = z15;
        this.f81614f = shuffleOverlay;
    }

    public static a a(a aVar, List list, boolean z13, boolean z14, String str, boolean z15, e2 e2Var, int i13) {
        if ((i13 & 1) != 0) {
            list = aVar.f81609a;
        }
        List items = list;
        if ((i13 & 2) != 0) {
            z13 = aVar.f81610b;
        }
        boolean z16 = z13;
        if ((i13 & 4) != 0) {
            z14 = aVar.f81611c;
        }
        boolean z17 = z14;
        if ((i13 & 8) != 0) {
            str = aVar.f81612d;
        }
        String str2 = str;
        if ((i13 & 16) != 0) {
            z15 = aVar.f81613e;
        }
        boolean z18 = z15;
        if ((i13 & 32) != 0) {
            e2Var = aVar.f81614f;
        }
        e2 shuffleOverlay = e2Var;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shuffleOverlay, "shuffleOverlay");
        return new a(items, z16, z17, str2, z18, shuffleOverlay);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f81609a, aVar.f81609a) && this.f81610b == aVar.f81610b && this.f81611c == aVar.f81611c && Intrinsics.d(this.f81612d, aVar.f81612d) && this.f81613e == aVar.f81613e && Intrinsics.d(this.f81614f, aVar.f81614f);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f81611c, ep.b.e(this.f81610b, this.f81609a.hashCode() * 31, 31), 31);
        String str = this.f81612d;
        return this.f81614f.hashCode() + ep.b.e(this.f81613e, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ComposerModel(items=" + this.f81609a + ", zOrderingEnabled=" + this.f81610b + ", layerActionsEnabled=" + this.f81611c + ", backgroundColor=" + this.f81612d + ", generateThumbnail=" + this.f81613e + ", shuffleOverlay=" + this.f81614f + ")";
    }

    public a(String str, int i13) {
        this(q0.f80391a, true, true, (i13 & 8) != 0 ? null : str, false, b2.f106444a);
    }
}
