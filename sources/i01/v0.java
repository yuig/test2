package i01;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70699a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70700b;

    /* renamed from: c, reason: collision with root package name */
    public final List f70701c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70702d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f70703e;

    public v0(String str, String str2, ArrayList arrayList, String str3, Integer num) {
        this.f70699a = str;
        this.f70700b = str2;
        this.f70701c = arrayList;
        this.f70702d = str3;
        this.f70703e = num;
    }

    public final String a() {
        return this.f70699a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f70699a, v0Var.f70699a) && Intrinsics.d(this.f70700b, v0Var.f70700b) && Intrinsics.d(this.f70701c, v0Var.f70701c) && Intrinsics.d(this.f70702d, v0Var.f70702d) && Intrinsics.d(this.f70703e, v0Var.f70703e);
    }

    public final int hashCode() {
        String str = this.f70699a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70700b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f70701c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f70702d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f70703e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelatedPinsExtras(navigationSource=");
        sb3.append(this.f70699a);
        sb3.append(", searchQueryTerm=");
        sb3.append(this.f70700b);
        sb3.append(", contextPinIds=");
        sb3.append(this.f70701c);
        sb3.append(", topLevelSource=");
        sb3.append(this.f70702d);
        sb3.append(", topLevelSourceDepth=");
        return a.c.i(sb3, this.f70703e, ")");
    }
}
