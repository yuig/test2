package t7;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f116603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f116604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116605c;

    /* renamed from: d, reason: collision with root package name */
    public final String f116606d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116607e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116608f;

    public u(int i13, int i14, String str, String str2, String str3, String str4) {
        this.f116603a = i13;
        this.f116604b = i14;
        this.f116605c = str;
        this.f116606d = str2;
        this.f116607e = str3;
        this.f116608f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f116603a == uVar.f116603a && this.f116604b == uVar.f116604b && TextUtils.equals(this.f116605c, uVar.f116605c) && TextUtils.equals(this.f116606d, uVar.f116606d) && TextUtils.equals(this.f116607e, uVar.f116607e) && TextUtils.equals(this.f116608f, uVar.f116608f);
    }

    public final int hashCode() {
        int i13 = ((this.f116603a * 31) + this.f116604b) * 31;
        String str = this.f116605c;
        int hashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f116606d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f116607e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f116608f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
