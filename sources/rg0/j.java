package rg0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l f108031a;

    /* renamed from: b, reason: collision with root package name */
    public final l f108032b;

    /* renamed from: c, reason: collision with root package name */
    public final List f108033c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108034d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108035e;

    /* renamed from: f, reason: collision with root package name */
    public final List f108036f;

    /* renamed from: g, reason: collision with root package name */
    public final List f108037g;

    public j(l lVar, l lVar2, ArrayList arrayList, String str, String str2, ArrayList arrayList2, ArrayList arrayList3) {
        this.f108031a = lVar;
        this.f108032b = lVar2;
        this.f108033c = arrayList;
        this.f108034d = str;
        this.f108035e = str2;
        this.f108036f = arrayList2;
        this.f108037g = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f108031a, jVar.f108031a) && Intrinsics.d(this.f108032b, jVar.f108032b) && Intrinsics.d(this.f108033c, jVar.f108033c) && Intrinsics.d(this.f108034d, jVar.f108034d) && Intrinsics.d(this.f108035e, jVar.f108035e) && Intrinsics.d(this.f108036f, jVar.f108036f) && Intrinsics.d(this.f108037g, jVar.f108037g);
    }

    public final int hashCode() {
        l lVar = this.f108031a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f108032b;
        int hashCode2 = (hashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        List list = this.f108033c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f108034d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108035e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.f108036f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f108037g;
        return hashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Page(title=");
        sb3.append(this.f108031a);
        sb3.append(", subtitle=");
        sb3.append(this.f108032b);
        sb3.append(", additionalInformationStrings=");
        sb3.append(this.f108033c);
        sb3.append(", mobileBannerImageUrl=");
        sb3.append(this.f108034d);
        sb3.append(", button=");
        sb3.append(this.f108035e);
        sb3.append(", informationList=");
        sb3.append(this.f108036f);
        sb3.append(", selectionList=");
        return a.c.j(sb3, this.f108037g, ")");
    }
}
