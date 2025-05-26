package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k72 {

    /* renamed from: a, reason: collision with root package name */
    public String f7149a;

    /* renamed from: b, reason: collision with root package name */
    public int f7150b;

    /* renamed from: c, reason: collision with root package name */
    public String f7151c;

    /* renamed from: d, reason: collision with root package name */
    public String f7152d;

    /* renamed from: e, reason: collision with root package name */
    public String f7153e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f7154f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7155g;

    public /* synthetic */ k72() {
        this("", 0, "", "", "", null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k72)) {
            return false;
        }
        k72 k72Var = (k72) obj;
        return Intrinsics.d(this.f7149a, k72Var.f7149a) && this.f7150b == k72Var.f7150b && Intrinsics.d(this.f7151c, k72Var.f7151c) && Intrinsics.d(this.f7152d, k72Var.f7152d) && Intrinsics.d(this.f7153e, k72Var.f7153e) && Intrinsics.d(this.f7154f, k72Var.f7154f) && this.f7155g == k72Var.f7155g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int t13 = kh2.j1.t(kh2.j1.t(kh2.j1.t(kh2.n3.f(this.f7150b, this.f7149a.hashCode() * 31), this.f7151c), this.f7152d), this.f7153e);
        Boolean bool = this.f7154f;
        int hashCode = (t13 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z13 = this.f7155g;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        String str = this.f7149a;
        int i13 = this.f7150b;
        String str2 = this.f7151c;
        String str3 = this.f7152d;
        String str4 = this.f7153e;
        Boolean bool = this.f7154f;
        boolean z13 = this.f7155g;
        StringBuilder v13 = a.a.v("RenderTraceMeta(renderId=", str, ", adConfigIndex=", i13, ", renderer=");
        a.a.B(v13, str2, ", adapterName=", str3, ", adapterVersion=");
        v13.append(str4);
        v13.append(", winningAd=");
        v13.append(bool);
        v13.append(", isOfflineAd=");
        return a.a.r(v13, z13, ")");
    }

    public k72(String renderId, int i13, String renderer, String adapterName, String adapterVersion, Boolean bool, boolean z13) {
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.f7149a = renderId;
        this.f7150b = i13;
        this.f7151c = renderer;
        this.f7152d = adapterName;
        this.f7153e = adapterVersion;
        this.f7154f = bool;
        this.f7155g = z13;
    }
}
