package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123310b;

    public p(ArrayList bitmaps, String pinCountPerBoardCapped) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(pinCountPerBoardCapped, "pinCountPerBoardCapped");
        this.f123309a = bitmaps;
        this.f123310b = pinCountPerBoardCapped;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f123309a, pVar.f123309a) && Intrinsics.d(this.f123310b, pVar.f123310b);
    }

    public final int hashCode() {
        return this.f123310b.hashCode() + (this.f123309a.hashCode() * 31);
    }

    public final String toString() {
        return "OneBoardGridExpandedView(bitmaps=" + this.f123309a + ", pinCountPerBoardCapped=" + this.f123310b + ")";
    }
}
