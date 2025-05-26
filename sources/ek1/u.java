package ek1;

import com.pinterest.api.model.sr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f59378a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59379b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59380c;

    /* renamed from: d, reason: collision with root package name */
    public final sr f59381d;

    public u(int i13, String str, String str2, sr srVar) {
        this.f59378a = i13;
        this.f59379b = str;
        this.f59380c = str2;
        this.f59381d = srVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f59378a == uVar.f59378a && Intrinsics.d(this.f59379b, uVar.f59379b) && Intrinsics.d(this.f59380c, uVar.f59380c) && Intrinsics.d(this.f59381d, uVar.f59381d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f59378a) * 31;
        String str = this.f59379b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59380c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        sr srVar = this.f59381d;
        return hashCode3 + (srVar != null ? srVar.hashCode() : 0);
    }

    public final String j() {
        return this.f59380c;
    }

    public final sr k() {
        return this.f59381d;
    }

    public final String l() {
        return this.f59379b;
    }

    public final int m() {
        return this.f59378a;
    }

    public final String toString() {
        return "OnAdvanceToNextSlide(pinChipIndex=" + this.f59378a + ", mediumUrl=" + this.f59379b + ", largeUrl=" + this.f59380c + ", mediumImage=" + this.f59381d + ")";
    }
}
