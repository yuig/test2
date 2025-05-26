package b3;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f21321c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21322d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21323e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21324f;

    public h0(List list, long j13, long j14, int i13) {
        this.f21321c = list;
        this.f21322d = j13;
        this.f21323e = j14;
        this.f21324f = i13;
    }

    @Override // b3.v0
    public final Shader b(long j13) {
        long j14 = this.f21322d;
        float d2 = a3.c.d(j14) == Float.POSITIVE_INFINITY ? a3.f.d(j13) : a3.c.d(j14);
        float b13 = a3.c.e(j14) == Float.POSITIVE_INFINITY ? a3.f.b(j13) : a3.c.e(j14);
        long j15 = this.f21323e;
        float d13 = a3.c.d(j15) == Float.POSITIVE_INFINITY ? a3.f.d(j13) : a3.c.d(j15);
        float b14 = a3.c.e(j15) == Float.POSITIVE_INFINITY ? a3.f.b(j13) : a3.c.e(j15);
        long d14 = com.bumptech.glide.c.d(d2, b13);
        long d15 = com.bumptech.glide.c.d(d13, b14);
        List list = this.f21321c;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        float d16 = a3.c.d(d14);
        float e13 = a3.c.e(d14);
        float d17 = a3.c.d(d15);
        float e14 = a3.c.e(d15);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = androidx.compose.ui.graphics.a.u(((w) list.get(i13)).f21392a);
        }
        int i14 = this.f21324f;
        return new LinearGradient(d16, e13, d17, e14, iArr, (float[]) null, kh2.n.r(i14, 0) ? Shader.TileMode.CLAMP : kh2.n.r(i14, 1) ? Shader.TileMode.REPEAT : kh2.n.r(i14, 2) ? Shader.TileMode.MIRROR : kh2.n.r(i14, 3) ? Build.VERSION.SDK_INT >= 31 ? a1.f21302a.b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f21321c, h0Var.f21321c) && Intrinsics.d(null, null) && a3.c.b(this.f21322d, h0Var.f21322d) && a3.c.b(this.f21323e, h0Var.f21323e) && kh2.n.r(this.f21324f, h0Var.f21324f);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21324f) + a.a.c(this.f21323e, a.a.c(this.f21322d, this.f21321c.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        String str;
        long j13 = this.f21322d;
        String str2 = "";
        if (com.bumptech.glide.c.q0(j13)) {
            str = "start=" + ((Object) a3.c.j(j13)) + ", ";
        } else {
            str = "";
        }
        long j14 = this.f21323e;
        if (com.bumptech.glide.c.q0(j14)) {
            str2 = "end=" + ((Object) a3.c.j(j14)) + ", ";
        }
        StringBuilder sb3 = new StringBuilder("LinearGradient(colors=");
        sb3.append(this.f21321c);
        sb3.append(", stops=null, ");
        sb3.append(str);
        sb3.append(str2);
        sb3.append("tileMode=");
        int i13 = this.f21324f;
        sb3.append((Object) (kh2.n.r(i13, 0) ? "Clamp" : kh2.n.r(i13, 1) ? "Repeated" : kh2.n.r(i13, 2) ? "Mirror" : kh2.n.r(i13, 3) ? "Decal" : "Unknown"));
        sb3.append(')');
        return sb3.toString();
    }
}
