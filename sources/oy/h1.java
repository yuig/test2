package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98060b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98061c;

    /* renamed from: d, reason: collision with root package name */
    public final s92.o f98062d;

    public h1(String partNumber, String pageId, String str, s92.o pwtResult) {
        Intrinsics.checkNotNullParameter(partNumber, "partNumber");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98059a = partNumber;
        this.f98060b = pageId;
        this.f98061c = str;
        this.f98062d = pwtResult;
    }

    public final String a() {
        return this.f98061c;
    }

    public final String b() {
        return this.f98060b;
    }

    public final String c() {
        return this.f98059a;
    }

    public final s92.o d() {
        return this.f98062d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f98059a, h1Var.f98059a) && Intrinsics.d(this.f98060b, h1Var.f98060b) && Intrinsics.d(this.f98061c, h1Var.f98061c) && this.f98062d == h1Var.f98062d;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f98060b, this.f98059a.hashCode() * 31, 31);
        String str = this.f98061c;
        return this.f98062d.hashCode() + ((d2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "EndEvent(partNumber=" + this.f98059a + ", pageId=" + this.f98060b + ", failureMessage=" + this.f98061c + ", pwtResult=" + this.f98062d + ")";
    }
}
