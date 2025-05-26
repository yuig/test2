package hh1;

import android.text.SpannableStringBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends l {

    /* renamed from: f, reason: collision with root package name */
    public final String f69203f;

    /* renamed from: g, reason: collision with root package name */
    public final SpannableStringBuilder f69204g;

    /* renamed from: h, reason: collision with root package name */
    public final String f69205h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f69206i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f69207j;

    public p(String str, SpannableStringBuilder spannableStringBuilder, String str2, rf1.k kVar, rf1.k kVar2) {
        this.f69203f = str;
        this.f69204g = spannableStringBuilder;
        this.f69205h = str2;
        this.f69206i = kVar;
        this.f69207j = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f69203f, pVar.f69203f) && Intrinsics.d(this.f69204g, pVar.f69204g) && Intrinsics.d(this.f69205h, pVar.f69205h) && Intrinsics.d(this.f69206i, pVar.f69206i) && Intrinsics.d(this.f69207j, pVar.f69207j);
    }

    public final int hashCode() {
        String str = this.f69203f;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SpannableStringBuilder spannableStringBuilder = this.f69204g;
        int hashCode2 = (hashCode + (spannableStringBuilder == null ? 0 : spannableStringBuilder.hashCode())) * 31;
        String str2 = this.f69205h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0 function0 = this.f69206i;
        int hashCode4 = (hashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function02 = this.f69207j;
        return hashCode4 + (function02 != null ? function02.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExpandedProductTagData(title=");
        sb3.append(this.f69203f);
        sb3.append(", price=");
        sb3.append((Object) this.f69204g);
        sb3.append(", productImageUrl=");
        sb3.append(this.f69205h);
        sb3.append(", launchDestinationUrl=");
        sb3.append(this.f69206i);
        sb3.append(", launchOverflowMenu=");
        return pk2.f.i(sb3, this.f69207j, ")");
    }
}
