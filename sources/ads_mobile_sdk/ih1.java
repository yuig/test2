package ads_mobile_sdk;

import a.j9;
import aj.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ih1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6404a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6405b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6406c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f6407d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6408e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f6409f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f6410g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f6411h;

    /* renamed from: i, reason: collision with root package name */
    public final wi.e0 f6412i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f6413j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f6414k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f6415l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f6416m;

    public ih1(Integer num, List list, List list2, Boolean bool, String str, Boolean bool2, Integer num2, Boolean bool3, wi.e0 e0Var, Boolean bool4, Integer num3, Boolean bool5, Integer num4) {
        this.f6404a = num;
        this.f6405b = list;
        this.f6406c = list2;
        this.f6407d = bool;
        this.f6408e = str;
        this.f6409f = bool2;
        this.f6410g = num2;
        this.f6411h = bool3;
        this.f6412i = e0Var;
        this.f6413j = bool4;
        this.f6414k = num3;
        this.f6415l = bool5;
        this.f6416m = num4;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.nativeVersion = this.f6404a;
        List<String> list = this.f6405b;
        if (list != null) {
            signals.nativeTemplates = list;
        }
        signals.nativeCustomTemplates = this.f6406c;
        signals.enableNativeMediaOrientation = this.f6407d;
        signals.nativeMediaOrientation = this.f6408e;
        signals.customMuteThisAdRequested = this.f6409f;
        signals.customClickGestureDirection = this.f6410g;
        signals.customClickGestureAllowTaps = this.f6411h;
        wi.e0 e0Var = this.f6412i;
        signals.videoOptionsSignal = e0Var != null ? new s(e0Var.f129936a, e0Var.f129937b, e0Var.f129938c) : null;
        signals.isImageLoadingDisabled = this.f6413j;
        signals.adChoicesPlacement = this.f6414k;
        signals.usesMediaView = this.f6415l;
        signals.numberOfAdsRequested = this.f6416m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1)) {
            return false;
        }
        ih1 ih1Var = (ih1) obj;
        return Intrinsics.d(this.f6404a, ih1Var.f6404a) && Intrinsics.d(this.f6405b, ih1Var.f6405b) && Intrinsics.d(this.f6406c, ih1Var.f6406c) && Intrinsics.d(this.f6407d, ih1Var.f6407d) && Intrinsics.d(this.f6408e, ih1Var.f6408e) && Intrinsics.d(this.f6409f, ih1Var.f6409f) && Intrinsics.d(this.f6410g, ih1Var.f6410g) && Intrinsics.d(this.f6411h, ih1Var.f6411h) && Intrinsics.d(this.f6412i, ih1Var.f6412i) && Intrinsics.d(this.f6413j, ih1Var.f6413j) && Intrinsics.d(this.f6414k, ih1Var.f6414k) && Intrinsics.d(this.f6415l, ih1Var.f6415l) && Intrinsics.d(this.f6416m, ih1Var.f6416m);
    }

    public final int hashCode() {
        Integer num = this.f6404a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f6405b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f6406c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f6407d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f6408e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f6409f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.f6410g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.f6411h;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        wi.e0 e0Var = this.f6412i;
        int hashCode9 = (hashCode8 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Boolean bool4 = this.f6413j;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.f6414k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.f6415l;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.f6416m;
        return hashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f6404a;
        List list = this.f6405b;
        List list2 = this.f6406c;
        Boolean bool = this.f6407d;
        String str = this.f6408e;
        Boolean bool2 = this.f6409f;
        Integer num2 = this.f6410g;
        Boolean bool3 = this.f6411h;
        wi.e0 e0Var = this.f6412i;
        Boolean bool4 = this.f6413j;
        Integer num3 = this.f6414k;
        Boolean bool5 = this.f6415l;
        Integer num4 = this.f6416m;
        StringBuilder sb3 = new StringBuilder("NativeAdSignal(nativeVersion=");
        sb3.append(num);
        sb3.append(", nativeTemplateIds=");
        sb3.append(list);
        sb3.append(", nativeCustomTemplates=");
        sb3.append(list2);
        sb3.append(", enableNativeMediaOrientation=");
        sb3.append(bool);
        sb3.append(", nativeMediaOrientation=");
        sb3.append(str);
        sb3.append(", customMuteThisAdRequested=");
        sb3.append(bool2);
        sb3.append(", customClickGestureDirection=");
        sb3.append(num2);
        sb3.append(", customClickGestureAllowTaps=");
        sb3.append(bool3);
        sb3.append(", videoOptions=");
        sb3.append(e0Var);
        sb3.append(", isImageLoadingDisabled=");
        sb3.append(bool4);
        sb3.append(", adChoicesPlacement=");
        sb3.append(num3);
        sb3.append(", usesMediaView=");
        sb3.append(bool5);
        sb3.append(", numberOfAdsRequested=");
        return a.c.i(sb3, num4, ")");
    }
}
