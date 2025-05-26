package e72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* renamed from: a, reason: collision with root package name */
    public final String f57654a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57655b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57656c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57657d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57658e;

    /* renamed from: f, reason: collision with root package name */
    public final String f57659f;

    /* renamed from: g, reason: collision with root package name */
    public final String f57660g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57661h;

    public i(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, g.f57653b);
            throw null;
        }
        this.f57654a = str;
        if ((i13 & 2) == 0) {
            this.f57655b = null;
        } else {
            this.f57655b = str2;
        }
        if ((i13 & 4) == 0) {
            this.f57656c = null;
        } else {
            this.f57656c = str3;
        }
        if ((i13 & 8) == 0) {
            this.f57657d = null;
        } else {
            this.f57657d = str4;
        }
        if ((i13 & 16) == 0) {
            this.f57658e = null;
        } else {
            this.f57658e = str5;
        }
        if ((i13 & 32) == 0) {
            this.f57659f = null;
        } else {
            this.f57659f = str6;
        }
        if ((i13 & 64) == 0) {
            this.f57660g = null;
        } else {
            this.f57660g = str7;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f57661h = null;
        } else {
            this.f57661h = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f57654a, iVar.f57654a) && Intrinsics.d(this.f57655b, iVar.f57655b) && Intrinsics.d(this.f57656c, iVar.f57656c) && Intrinsics.d(this.f57657d, iVar.f57657d) && Intrinsics.d(this.f57658e, iVar.f57658e) && Intrinsics.d(this.f57659f, iVar.f57659f) && Intrinsics.d(this.f57660g, iVar.f57660g) && Intrinsics.d(this.f57661h, iVar.f57661h);
    }

    public final int hashCode() {
        int hashCode = this.f57654a.hashCode() * 31;
        String str = this.f57655b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57656c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57657d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57658e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57659f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57660g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57661h;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinnerEntity(id=");
        sb3.append(this.f57654a);
        sb3.append(", username=");
        sb3.append(this.f57655b);
        sb3.append(", first_name=");
        sb3.append(this.f57656c);
        sb3.append(", last_name=");
        sb3.append(this.f57657d);
        sb3.append(", full_name=");
        sb3.append(this.f57658e);
        sb3.append(", image_medium_url=");
        sb3.append(this.f57659f);
        sb3.append(", image_large_url=");
        sb3.append(this.f57660g);
        sb3.append(", image_xlarge_url=");
        return a.a.p(sb3, this.f57661h, ")");
    }
}
