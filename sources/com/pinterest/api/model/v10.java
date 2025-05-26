package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class v10 implements fl1.d, dl1.s {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f42699a;

    /* renamed from: b */
    @om.b("node_id")
    private String f42700b;

    /* renamed from: c */
    @om.b("account_type")
    private String f42701c;

    /* renamed from: d */
    @om.b("auto_follow_allowed")
    private Boolean f42702d;

    /* renamed from: e */
    @om.b("biz_ownership_email")
    private String f42703e;

    /* renamed from: f */
    @om.b("business_name")
    private String f42704f;

    /* renamed from: g */
    @om.b("contact_email")
    private String f42705g;

    /* renamed from: h */
    @om.b("contact_name")
    private String f42706h;

    /* renamed from: i */
    @om.b("contact_phone")
    private String f42707i;

    /* renamed from: j */
    @om.b("contact_phone_country")
    private b30 f42708j;

    /* renamed from: k */
    @om.b("enable_profile_address")
    private Boolean f42709k;

    /* renamed from: l */
    @om.b("enable_profile_message")
    private Boolean f42710l;

    /* renamed from: m */
    @om.b("is_linked_business")
    private Boolean f42711m;

    /* renamed from: n */
    @om.b("profile_place")
    private k60 f42712n;

    /* renamed from: o */
    @om.b("type")
    private String f42713o;

    /* renamed from: p */
    public final boolean[] f42714p;

    public /* synthetic */ v10(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, b30 b30Var, Boolean bool2, Boolean bool3, Boolean bool4, k60 k60Var, String str9, boolean[] zArr, int i13) {
        this(str, str2, str3, bool, str4, str5, str6, str7, str8, b30Var, bool2, bool3, bool4, k60Var, str9, zArr);
    }

    public final String A() {
        return this.f42703e;
    }

    public final String B() {
        return this.f42704f;
    }

    public final String C() {
        return this.f42705g;
    }

    public final String D() {
        return this.f42706h;
    }

    public final String E() {
        return this.f42707i;
    }

    public final b30 F() {
        return this.f42708j;
    }

    public final Boolean G() {
        Boolean bool = this.f42709k;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean H() {
        Boolean bool = this.f42710l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean I() {
        Boolean bool = this.f42711m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final k60 J() {
        return this.f42712n;
    }

    @Override // fl1.d
    public final dl1.s a(dl1.s sVar) {
        v10 v10Var = (v10) sVar;
        if (this == v10Var) {
            return this;
        }
        s10 s10Var = new s10(this, 0);
        boolean[] zArr = v10Var.f42714p;
        int length = zArr.length;
        boolean[] zArr2 = s10Var.f41771p;
        if (length > 0 && zArr[0]) {
            s10Var.f41756a = v10Var.f42699a;
            zArr2[0] = true;
        }
        if (zArr.length > 1 && zArr[1]) {
            s10Var.f41757b = v10Var.f42700b;
            zArr2[1] = true;
        }
        if (zArr.length > 2 && zArr[2]) {
            s10Var.f41758c = v10Var.f42701c;
            zArr2[2] = true;
        }
        if (zArr.length > 3 && zArr[3]) {
            s10Var.f41759d = v10Var.f42702d;
            zArr2[3] = true;
        }
        if (zArr.length > 4 && zArr[4]) {
            s10Var.f41760e = v10Var.f42703e;
            zArr2[4] = true;
        }
        if (zArr.length > 5 && zArr[5]) {
            s10Var.f41761f = v10Var.f42704f;
            zArr2[5] = true;
        }
        if (zArr.length > 6 && zArr[6]) {
            s10Var.f41762g = v10Var.f42705g;
            zArr2[6] = true;
        }
        if (zArr.length > 7 && zArr[7]) {
            s10Var.f41763h = v10Var.f42706h;
            zArr2[7] = true;
        }
        if (zArr.length > 8 && zArr[8]) {
            s10Var.f41764i = v10Var.f42707i;
            zArr2[8] = true;
        }
        if (zArr.length > 9 && zArr[9]) {
            s10Var.f41765j = v10Var.f42708j;
            zArr2[9] = true;
        }
        if (zArr.length > 10 && zArr[10]) {
            s10Var.f41766k = v10Var.f42709k;
            zArr2[10] = true;
        }
        if (zArr.length > 11 && zArr[11]) {
            s10Var.f41767l = v10Var.f42710l;
            zArr2[11] = true;
        }
        if (zArr.length > 12 && zArr[12]) {
            s10Var.f41768m = v10Var.f42711m;
            zArr2[12] = true;
        }
        if (zArr.length > 13 && zArr[13]) {
            s10Var.f41769n = v10Var.f42712n;
            zArr2[13] = true;
        }
        if (zArr.length > 14 && zArr[14]) {
            s10Var.f41770o = v10Var.f42713o;
            zArr2[14] = true;
        }
        return s10Var.a();
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f42699a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v10 v10Var = (v10) obj;
        return Objects.equals(this.f42711m, v10Var.f42711m) && Objects.equals(this.f42710l, v10Var.f42710l) && Objects.equals(this.f42709k, v10Var.f42709k) && Objects.equals(this.f42702d, v10Var.f42702d) && Objects.equals(this.f42699a, v10Var.f42699a) && Objects.equals(this.f42700b, v10Var.f42700b) && Objects.equals(this.f42701c, v10Var.f42701c) && Objects.equals(this.f42703e, v10Var.f42703e) && Objects.equals(this.f42704f, v10Var.f42704f) && Objects.equals(this.f42705g, v10Var.f42705g) && Objects.equals(this.f42706h, v10Var.f42706h) && Objects.equals(this.f42707i, v10Var.f42707i) && Objects.equals(this.f42708j, v10Var.f42708j) && Objects.equals(this.f42712n, v10Var.f42712n) && Objects.equals(this.f42713o, v10Var.f42713o);
    }

    public final int hashCode() {
        return Objects.hash(this.f42699a, this.f42700b, this.f42701c, this.f42702d, this.f42703e, this.f42704f, this.f42705g, this.f42706h, this.f42707i, this.f42708j, this.f42709k, this.f42710l, this.f42711m, this.f42712n, this.f42713o);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42700b;
    }

    public final String z() {
        return this.f42701c;
    }

    public v10() {
        this.f42714p = new boolean[15];
    }

    private v10(@NonNull String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, b30 b30Var, Boolean bool2, Boolean bool3, Boolean bool4, k60 k60Var, String str9, boolean[] zArr) {
        this.f42699a = str;
        this.f42700b = str2;
        this.f42701c = str3;
        this.f42702d = bool;
        this.f42703e = str4;
        this.f42704f = str5;
        this.f42705g = str6;
        this.f42706h = str7;
        this.f42707i = str8;
        this.f42708j = b30Var;
        this.f42709k = bool2;
        this.f42710l = bool3;
        this.f42711m = bool4;
        this.f42712n = k60Var;
        this.f42713o = str9;
        this.f42714p = zArr;
    }
}
