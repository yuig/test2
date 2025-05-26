package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s10 {

    /* renamed from: a, reason: collision with root package name */
    public String f41756a;

    /* renamed from: b, reason: collision with root package name */
    public String f41757b;

    /* renamed from: c, reason: collision with root package name */
    public String f41758c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f41759d;

    /* renamed from: e, reason: collision with root package name */
    public String f41760e;

    /* renamed from: f, reason: collision with root package name */
    public String f41761f;

    /* renamed from: g, reason: collision with root package name */
    public String f41762g;

    /* renamed from: h, reason: collision with root package name */
    public String f41763h;

    /* renamed from: i, reason: collision with root package name */
    public String f41764i;

    /* renamed from: j, reason: collision with root package name */
    public b30 f41765j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f41766k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f41767l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f41768m;

    /* renamed from: n, reason: collision with root package name */
    public k60 f41769n;

    /* renamed from: o, reason: collision with root package name */
    public String f41770o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f41771p;

    public /* synthetic */ s10(int i13) {
        this();
    }

    public final v10 a() {
        return new v10(this.f41756a, this.f41757b, this.f41758c, this.f41759d, this.f41760e, this.f41761f, this.f41762g, this.f41763h, this.f41764i, this.f41765j, this.f41766k, this.f41767l, this.f41768m, this.f41769n, this.f41770o, this.f41771p, 0);
    }

    public final void b(String str) {
        this.f41760e = str;
        boolean[] zArr = this.f41771p;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void c(String str) {
        this.f41762g = str;
        boolean[] zArr = this.f41771p;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void d(String str) {
        this.f41763h = str;
        boolean[] zArr = this.f41771p;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void e(String str) {
        this.f41764i = str;
        boolean[] zArr = this.f41771p;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void f(b30 b30Var) {
        this.f41765j = b30Var;
        boolean[] zArr = this.f41771p;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void g(k60 k60Var) {
        this.f41769n = k60Var;
        boolean[] zArr = this.f41771p;
        if (zArr.length > 13) {
            zArr[13] = true;
        }
    }

    public /* synthetic */ s10(v10 v10Var, int i13) {
        this(v10Var);
    }

    private s10() {
        this.f41771p = new boolean[15];
    }

    private s10(@NonNull v10 v10Var) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        b30 b30Var;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        k60 k60Var;
        String str9;
        str = v10Var.f42699a;
        this.f41756a = str;
        str2 = v10Var.f42700b;
        this.f41757b = str2;
        str3 = v10Var.f42701c;
        this.f41758c = str3;
        bool = v10Var.f42702d;
        this.f41759d = bool;
        str4 = v10Var.f42703e;
        this.f41760e = str4;
        str5 = v10Var.f42704f;
        this.f41761f = str5;
        str6 = v10Var.f42705g;
        this.f41762g = str6;
        str7 = v10Var.f42706h;
        this.f41763h = str7;
        str8 = v10Var.f42707i;
        this.f41764i = str8;
        b30Var = v10Var.f42708j;
        this.f41765j = b30Var;
        bool2 = v10Var.f42709k;
        this.f41766k = bool2;
        bool3 = v10Var.f42710l;
        this.f41767l = bool3;
        bool4 = v10Var.f42711m;
        this.f41768m = bool4;
        k60Var = v10Var.f42712n;
        this.f41769n = k60Var;
        str9 = v10Var.f42713o;
        this.f41770o = str9;
        boolean[] zArr = v10Var.f42714p;
        this.f41771p = Arrays.copyOf(zArr, zArr.length);
    }
}
