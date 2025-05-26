package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58040b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58041c;

    public c1(String str, String str2, boolean z13) {
        this.f58039a = str;
        this.f58040b = str2;
        this.f58041c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.f58039a, c1Var.f58039a) && Intrinsics.d(this.f58040b, c1Var.f58040b) && this.f58041c == c1Var.f58041c;
    }

    public final int hashCode() {
        String str = this.f58039a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58040b;
        return Boolean.hashCode(this.f58041c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadBoardAndSection(boardId=");
        sb3.append(this.f58039a);
        sb3.append(", sectionId=");
        sb3.append(this.f58040b);
        sb3.append(", shouldShowBoardError=");
        return a.a.r(sb3, this.f58041c, ")");
    }
}
