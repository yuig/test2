package wn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130570b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f130571c;

    /* renamed from: d, reason: collision with root package name */
    public final int f130572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f130573e;

    /* renamed from: f, reason: collision with root package name */
    public final int f130574f;

    public o(int i13, int i14, String str, int i15, int i16) {
        super(i13);
        this.f130570b = i13;
        this.f130571c = str;
        this.f130572d = i14;
        this.f130573e = i15;
        this.f130574f = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f130570b == oVar.f130570b && Intrinsics.d(this.f130571c, oVar.f130571c) && this.f130572d == oVar.f130572d && this.f130573e == oVar.f130573e && this.f130574f == oVar.f130574f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f130570b) * 31;
        CharSequence charSequence = this.f130571c;
        return Integer.hashCode(this.f130574f) + ep.b.b(this.f130573e, ep.b.b(this.f130572d, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130570b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BeforeTextChanged(id=");
        sb3.append(this.f130570b);
        sb3.append(", text=");
        sb3.append((Object) this.f130571c);
        sb3.append(", start=");
        sb3.append(this.f130572d);
        sb3.append(", count=");
        sb3.append(this.f130573e);
        sb3.append(", after=");
        return a.a.n(sb3, this.f130574f, ")");
    }
}
