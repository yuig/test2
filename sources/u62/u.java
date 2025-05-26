package u62;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f120898a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f120899b;

    /* renamed from: c, reason: collision with root package name */
    public final List f120900c;

    public u(String str, i1 i1Var, List list) {
        this.f120898a = str;
        this.f120899b = i1Var;
        this.f120900c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static u a(u uVar, String str, i1 i1Var, ArrayList arrayList, int i13) {
        if ((i13 & 1) != 0) {
            str = uVar.f120898a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i13 & 4) != 0) {
            arrayList2 = uVar.f120900c;
        }
        uVar.getClass();
        return new u(str, i1Var, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f120898a, uVar.f120898a) && Intrinsics.d(this.f120899b, uVar.f120899b) && Intrinsics.d(this.f120900c, uVar.f120900c);
    }

    public final int hashCode() {
        String str = this.f120898a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i1 i1Var = this.f120899b;
        int hashCode2 = (hashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        List list = this.f120900c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MaskData(imageUri=");
        sb3.append(this.f120898a);
        sb3.append(", imageMask=");
        sb3.append(this.f120899b);
        sb3.append(", otherMasks=");
        return a.c.j(sb3, this.f120900c, ")");
    }
}
