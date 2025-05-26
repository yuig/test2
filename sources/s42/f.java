package s42;

import dl1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public String f111143a;

    /* renamed from: b, reason: collision with root package name */
    public String f111144b;

    public f(@NotNull String headerText, String str) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        this.f111143a = headerText;
        this.f111144b = str;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return "SelectPinsHeaderModel";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f111143a, fVar.f111143a) && Intrinsics.d(this.f111144b, fVar.f111144b);
    }

    public final int hashCode() {
        int hashCode = this.f111143a.hashCode() * 31;
        String str = this.f111144b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.a.m("SelectPinsHeaderModel(headerText=", this.f111143a, ", subheadingText=", this.f111144b, ")");
    }

    public /* synthetic */ f(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }
}
