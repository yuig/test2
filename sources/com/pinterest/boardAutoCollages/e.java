package com.pinterest.boardAutoCollages;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final Set f44551a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f44552b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.a0 f44553c;

    public e(Set availableOptions, boolean z13, o82.a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f44551a = availableOptions;
        this.f44552b = z13;
        this.f44553c = multiSectionDisplayState;
    }

    public static e e(e eVar, boolean z13, o82.a0 multiSectionDisplayState, int i13) {
        Set availableOptions = eVar.f44551a;
        if ((i13 & 2) != 0) {
            z13 = eVar.f44552b;
        }
        if ((i13 & 4) != 0) {
            multiSectionDisplayState = eVar.f44553c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        return new e(availableOptions, z13, multiSectionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f44551a, eVar.f44551a) && this.f44552b == eVar.f44552b && Intrinsics.d(this.f44553c, eVar.f44553c);
    }

    public final int hashCode() {
        return this.f44553c.f93524a.hashCode() + ep.b.e(this.f44552b, this.f44551a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoardAutoCollagesDisplayState(availableOptions=" + this.f44551a + ", isProgressOverlayVisible=" + this.f44552b + ", multiSectionDisplayState=" + this.f44553c + ")";
    }
}
