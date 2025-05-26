package ads_mobile_sdk;

import a.j9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s4 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10931a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10934d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10935e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10936f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10937g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f10938h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10939i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10940j;

    /* renamed from: k, reason: collision with root package name */
    public final List f10941k;

    public s4(String formatString, float f13, int i13, int i14, int i15, int i16, String str, Boolean bool, String str2, String str3, ArrayList supportedAdSizes) {
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        Intrinsics.checkNotNullParameter(supportedAdSizes, "supportedAdSizes");
        this.f10931a = formatString;
        this.f10932b = f13;
        this.f10933c = i13;
        this.f10934d = i14;
        this.f10935e = i15;
        this.f10936f = i16;
        this.f10937g = str;
        this.f10938h = bool;
        this.f10939i = str2;
        this.f10940j = str3;
        this.f10941k = supportedAdSizes;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.format = this.f10931a;
        signals.screenDensity = this.f10932b;
        signals.screenHeight = this.f10934d;
        signals.screenWidth = this.f10933c;
        signals.screenHeightDip = this.f10936f;
        signals.screenWidthDip = this.f10935e;
        signals.responsiveAutoFormat = this.f10937g;
        signals.adaptiveSlot = this.f10938h;
        signals.fluidType = this.f10939i;
        signals.multipleAdSizeString = this.f10940j;
        signals.adSizeArray.addAll(this.f10941k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return Intrinsics.d(this.f10931a, s4Var.f10931a) && Float.compare(this.f10932b, s4Var.f10932b) == 0 && this.f10933c == s4Var.f10933c && this.f10934d == s4Var.f10934d && this.f10935e == s4Var.f10935e && this.f10936f == s4Var.f10936f && Intrinsics.d(this.f10937g, s4Var.f10937g) && Intrinsics.d(this.f10938h, s4Var.f10938h) && Intrinsics.d(this.f10939i, s4Var.f10939i) && Intrinsics.d(this.f10940j, s4Var.f10940j) && Intrinsics.d(this.f10941k, s4Var.f10941k);
    }

    public final int hashCode() {
        int f13 = kh2.n3.f(this.f10936f, kh2.n3.f(this.f10935e, kh2.n3.f(this.f10934d, kh2.n3.f(this.f10933c, a.a.a(this.f10932b, this.f10931a.hashCode() * 31, 31)))));
        String str = this.f10937g;
        int hashCode = (f13 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f10938h;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f10939i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10940j;
        return this.f10941k.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f10931a;
        float f13 = this.f10932b;
        int i13 = this.f10933c;
        int i14 = this.f10934d;
        int i15 = this.f10935e;
        int i16 = this.f10936f;
        String str2 = this.f10937g;
        Boolean bool = this.f10938h;
        String str3 = this.f10939i;
        String str4 = this.f10940j;
        List list = this.f10941k;
        StringBuilder sb3 = new StringBuilder("AdSizeSignal(formatString=");
        sb3.append(str);
        sb3.append(", screenDensity=");
        sb3.append(f13);
        sb3.append(", screenWidth=");
        a.a.z(sb3, i13, ", screenHeight=", i14, ", screenWidthDip=");
        a.a.z(sb3, i15, ", screenHeightDip=", i16, ", responsiveAutoFormat=");
        sb3.append(str2);
        sb3.append(", isInlineAdaptive=");
        sb3.append(bool);
        sb3.append(", fluidType=");
        a.a.B(sb3, str3, ", multipleAdSizeString=", str4, ", supportedAdSizes=");
        return a.c.j(sb3, list, ")");
    }
}
