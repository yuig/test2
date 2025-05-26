package hd0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f68878a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f68879b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f68880c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f68881d;

    public /* synthetic */ k(int i13, CharSequence charSequence, kd0.a aVar) {
        this(i13, charSequence, aVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f68878a == kVar.f68878a && Intrinsics.d(this.f68879b, kVar.f68879b) && Intrinsics.d(this.f68880c, kVar.f68880c) && Intrinsics.d(this.f68881d, kVar.f68881d);
    }

    public final int hashCode() {
        int hashCode = (this.f68879b.hashCode() + (Integer.hashCode(this.f68878a) * 31)) * 31;
        Function0 function0 = this.f68880c;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Integer num = this.f68881d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ToolButtonState(buttonIconResource=" + this.f68878a + ", labelText=" + ((Object) this.f68879b) + ", tapAction=" + this.f68880c + ", buttonIconTintResource=" + this.f68881d + ")";
    }

    public k(int i13, CharSequence labelText, Function0 function0, Integer num) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        this.f68878a = i13;
        this.f68879b = labelText;
        this.f68880c = function0;
        this.f68881d = num;
    }
}
