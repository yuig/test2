package wn1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130590c;

    /* renamed from: d, reason: collision with root package name */
    public final int f130591d;

    /* renamed from: e, reason: collision with root package name */
    public final int f130592e;

    /* renamed from: f, reason: collision with root package name */
    public final int f130593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i13, int i14, int i15, int i16, String updatedText) {
        super(i13);
        Intrinsics.checkNotNullParameter(updatedText, "updatedText");
        this.f130589b = i13;
        this.f130590c = updatedText;
        this.f130591d = i14;
        this.f130592e = i15;
        this.f130593f = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f130589b == yVar.f130589b && Intrinsics.d(this.f130590c, yVar.f130590c) && this.f130591d == yVar.f130591d && this.f130592e == yVar.f130592e && this.f130593f == yVar.f130593f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130593f) + ep.b.b(this.f130592e, ep.b.b(this.f130591d, cb.d(this.f130590c, Integer.hashCode(this.f130589b) * 31, 31), 31), 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130589b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextChanged(id=");
        sb3.append(this.f130589b);
        sb3.append(", updatedText=");
        sb3.append(this.f130590c);
        sb3.append(", start=");
        sb3.append(this.f130591d);
        sb3.append(", before=");
        sb3.append(this.f130592e);
        sb3.append(", count=");
        return a.a.n(sb3, this.f130593f, ")");
    }
}
