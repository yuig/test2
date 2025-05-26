package xn1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135453b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135454c;

    /* renamed from: d, reason: collision with root package name */
    public final int f135455d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135456e;

    /* renamed from: f, reason: collision with root package name */
    public final int f135457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i13, int i14, int i15, int i16, String updatedText) {
        super(i13);
        Intrinsics.checkNotNullParameter(updatedText, "updatedText");
        this.f135453b = i13;
        this.f135454c = updatedText;
        this.f135455d = i14;
        this.f135456e = i15;
        this.f135457f = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f135453b == iVar.f135453b && Intrinsics.d(this.f135454c, iVar.f135454c) && this.f135455d == iVar.f135455d && this.f135456e == iVar.f135456e && this.f135457f == iVar.f135457f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135457f) + ep.b.b(this.f135456e, ep.b.b(this.f135455d, cb.d(this.f135454c, Integer.hashCode(this.f135453b) * 31, 31), 31), 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135453b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextChanged(id=");
        sb3.append(this.f135453b);
        sb3.append(", updatedText=");
        sb3.append(this.f135454c);
        sb3.append(", start=");
        sb3.append(this.f135455d);
        sb3.append(", before=");
        sb3.append(this.f135456e);
        sb3.append(", count=");
        return a.a.n(sb3, this.f135457f, ")");
    }
}
