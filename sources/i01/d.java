package i01;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f70656a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70657b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f70658c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70659d;

    public /* synthetic */ d(String str, String str2, ArrayList arrayList) {
        this(str, str2, arrayList, null);
    }

    @Override // i01.e
    public final String e() {
        return this.f70659d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f70656a, dVar.f70656a) && Intrinsics.d(this.f70657b, dVar.f70657b) && Intrinsics.d(this.f70658c, dVar.f70658c) && Intrinsics.d(this.f70659d, dVar.f70659d);
    }

    @Override // i01.e
    public final String f() {
        return this.f70656a;
    }

    public final int hashCode() {
        String str = this.f70656a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70657b;
        int b13 = ep.b.b(0, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ArrayList arrayList = this.f70658c;
        int hashCode2 = (b13 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.f70659d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CloseupNavigationMetadata(searchQuery=");
        sb3.append(this.f70656a);
        sb3.append(", navigationTopLevelSource=");
        sb3.append(this.f70657b);
        sb3.append(", navigationTopLevelSourceDepth=0, contextPinIds=");
        sb3.append(this.f70658c);
        sb3.append(", closeupModuleSource=");
        return a.a.p(sb3, this.f70659d, ")");
    }

    @Override // i01.e
    public final ArrayList w() {
        return this.f70658c;
    }

    @Override // i01.e
    public final int y() {
        return 0;
    }

    @Override // i01.e
    public final String z() {
        return this.f70657b;
    }

    public d(String str, String str2, ArrayList arrayList, String str3) {
        this.f70656a = str;
        this.f70657b = str2;
        this.f70658c = arrayList;
        this.f70659d = str3;
    }
}
