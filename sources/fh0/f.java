package fh0;

import a.cb;
import i32.j0;
import i32.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements hh0.b {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f62158a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f62159b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62160c;

    /* renamed from: d, reason: collision with root package name */
    public final String f62161d;

    /* renamed from: e, reason: collision with root package name */
    public final gh0.a f62162e;

    /* renamed from: f, reason: collision with root package name */
    public final gh0.a f62163f;

    public f(j0 j0Var, m0 m0Var, String str, String message, gh0.a aVar, gh0.a aVar2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f62158a = j0Var;
        this.f62159b = m0Var;
        this.f62160c = str;
        this.f62161d = message;
        this.f62162e = aVar;
        this.f62163f = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f62158a == fVar.f62158a && this.f62159b == fVar.f62159b && Intrinsics.d(this.f62160c, fVar.f62160c) && Intrinsics.d(this.f62161d, fVar.f62161d) && Intrinsics.d(this.f62162e, fVar.f62162e) && Intrinsics.d(this.f62163f, fVar.f62163f);
    }

    public final int hashCode() {
        j0 j0Var = this.f62158a;
        int hashCode = (j0Var == null ? 0 : j0Var.hashCode()) * 31;
        m0 m0Var = this.f62159b;
        int hashCode2 = (hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str = this.f62160c;
        int d2 = cb.d(this.f62161d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        gh0.a aVar = this.f62162e;
        int hashCode3 = (d2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        gh0.a aVar2 = this.f62163f;
        return hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "UpsellDisplayData(icon=" + this.f62158a + ", iconColor=" + this.f62159b + ", title=" + this.f62160c + ", message=" + this.f62161d + ", completeButton=" + this.f62162e + ", dismissButton=" + this.f62163f + ")";
    }
}
