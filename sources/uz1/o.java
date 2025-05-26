package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123307a;

    /* renamed from: b, reason: collision with root package name */
    public final List f123308b;

    public o(ArrayList bitmaps, List pinCountPerBoardsCapped) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(pinCountPerBoardsCapped, "pinCountPerBoardsCapped");
        this.f123307a = bitmaps;
        this.f123308b = pinCountPerBoardsCapped;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123307a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f123307a, oVar.f123307a) && Intrinsics.d(this.f123308b, oVar.f123308b);
    }

    public final int hashCode() {
        return this.f123308b.hashCode() + (this.f123307a.hashCode() * 31);
    }

    public final String toString() {
        return "MiniBoardGridExpandedView(bitmaps=" + this.f123307a + ", pinCountPerBoardsCapped=" + this.f123308b + ")";
    }
}
