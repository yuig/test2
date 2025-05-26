package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.bu0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class au0 {

    /* renamed from: a, reason: collision with root package name */
    public String f35861a;

    /* renamed from: b, reason: collision with root package name */
    public String f35862b;

    /* renamed from: c, reason: collision with root package name */
    public String f35863c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f35864d;

    /* renamed from: e, reason: collision with root package name */
    public String f35865e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f35866f;

    /* renamed from: g, reason: collision with root package name */
    public String f35867g;

    /* renamed from: h, reason: collision with root package name */
    public bu0.a f35868h;

    /* renamed from: i, reason: collision with root package name */
    public String f35869i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f35870j;

    public /* synthetic */ au0(int i13) {
        this();
    }

    public final bu0 a() {
        return new bu0(this.f35861a, this.f35862b, this.f35863c, this.f35864d, this.f35865e, this.f35866f, this.f35867g, this.f35868h, this.f35869i, this.f35870j, 0);
    }

    public final void b(String str) {
        this.f35863c = str;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(Integer num) {
        this.f35864d = num;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void d(String str) {
        this.f35865e = str;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void e(Integer num) {
        this.f35866f = num;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void f(String str) {
        this.f35867g = str;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void g(String str) {
        this.f35862b = str;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void h(bu0.a aVar) {
        this.f35868h = aVar;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void i(String str) {
        this.f35869i = str;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void j(String str) {
        this.f35861a = str;
        boolean[] zArr = this.f35870j;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private au0() {
        this.f35870j = new boolean[9];
    }

    private au0(@NonNull bu0 bu0Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        Integer num2;
        String str5;
        bu0.a aVar;
        String str6;
        str = bu0Var.f36204a;
        this.f35861a = str;
        str2 = bu0Var.f36205b;
        this.f35862b = str2;
        str3 = bu0Var.f36206c;
        this.f35863c = str3;
        num = bu0Var.f36207d;
        this.f35864d = num;
        str4 = bu0Var.f36208e;
        this.f35865e = str4;
        num2 = bu0Var.f36209f;
        this.f35866f = num2;
        str5 = bu0Var.f36210g;
        this.f35867g = str5;
        aVar = bu0Var.f36211h;
        this.f35868h = aVar;
        str6 = bu0Var.f36212i;
        this.f35869i = str6;
        boolean[] zArr = bu0Var.f36213j;
        this.f35870j = Arrays.copyOf(zArr, zArr.length);
    }
}
