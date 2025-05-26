package sk0;

import a.cb;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f113049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113050b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113051c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f113052d;

    public d(List floatingToolDisplayStateList, boolean z13, String boardId, String str) {
        Intrinsics.checkNotNullParameter(floatingToolDisplayStateList, "floatingToolDisplayStateList");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113049a = floatingToolDisplayStateList;
        this.f113050b = boardId;
        this.f113051c = str;
        this.f113052d = z13;
    }

    public static d e(d dVar, List floatingToolDisplayStateList, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            floatingToolDisplayStateList = dVar.f113049a;
        }
        String boardId = dVar.f113050b;
        String str = dVar.f113051c;
        if ((i13 & 8) != 0) {
            z13 = dVar.f113052d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(floatingToolDisplayStateList, "floatingToolDisplayStateList");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        return new d(floatingToolDisplayStateList, z13, boardId, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f113049a, dVar.f113049a) && Intrinsics.d(this.f113050b, dVar.f113050b) && Intrinsics.d(this.f113051c, dVar.f113051c) && this.f113052d == dVar.f113052d;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f113050b, this.f113049a.hashCode() * 31, 31);
        String str = this.f113051c;
        return Boolean.hashCode(this.f113052d) + ((d2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FloatingToolbarDisplayState(floatingToolDisplayStateList=");
        sb3.append(this.f113049a);
        sb3.append(", boardId=");
        sb3.append(this.f113050b);
        sb3.append(", sectionId=");
        sb3.append(this.f113051c);
        sb3.append(", showOrganize=");
        return a.a.r(sb3, this.f113052d, ")");
    }

    public d() {
        this(q0.f80391a, false, "", null);
    }
}
