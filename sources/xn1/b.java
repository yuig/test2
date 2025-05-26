package xn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135437b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f135438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f135439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135440e;

    /* renamed from: f, reason: collision with root package name */
    public final int f135441f;

    public b(int i13, int i14, String str, int i15, int i16) {
        super(i13);
        this.f135437b = i13;
        this.f135438c = str;
        this.f135439d = i14;
        this.f135440e = i15;
        this.f135441f = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f135437b == bVar.f135437b && Intrinsics.d(this.f135438c, bVar.f135438c) && this.f135439d == bVar.f135439d && this.f135440e == bVar.f135440e && this.f135441f == bVar.f135441f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f135437b) * 31;
        CharSequence charSequence = this.f135438c;
        return Integer.hashCode(this.f135441f) + ep.b.b(this.f135440e, ep.b.b(this.f135439d, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135437b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BeforeTextChanged(id=");
        sb3.append(this.f135437b);
        sb3.append(", text=");
        sb3.append((Object) this.f135438c);
        sb3.append(", start=");
        sb3.append(this.f135439d);
        sb3.append(", count=");
        sb3.append(this.f135440e);
        sb3.append(", after=");
        return a.a.n(sb3, this.f135441f, ")");
    }
}
