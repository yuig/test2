package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class al0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f35791a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f35792b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f35793c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f35794d;

    /* renamed from: e, reason: collision with root package name */
    public List f35795e;

    /* renamed from: f, reason: collision with root package name */
    public jo0 f35796f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f35797g;

    /* renamed from: h, reason: collision with root package name */
    public List f35798h;

    /* renamed from: i, reason: collision with root package name */
    public List f35799i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f35800j;

    /* renamed from: k, reason: collision with root package name */
    public String f35801k;

    /* renamed from: l, reason: collision with root package name */
    public String f35802l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f35803m;

    public /* synthetic */ al0(int i13) {
        this();
    }

    public final dl0 a() {
        return new dl0(this.f35791a, this.f35792b, this.f35793c, this.f35794d, this.f35795e, this.f35796f, this.f35797g, this.f35798h, this.f35799i, this.f35800j, this.f35801k, this.f35802l, this.f35803m, 0);
    }

    public final void b(dl0 dl0Var) {
        String str;
        String str2;
        Integer num;
        List list;
        List list2;
        Integer num2;
        jo0 jo0Var;
        List list3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        boolean[] zArr = dl0Var.f36889m;
        int length = zArr.length;
        boolean[] zArr2 = this.f35803m;
        if (length > 0 && zArr[0]) {
            bool4 = dl0Var.f36877a;
            this.f35791a = bool4;
            zArr2[0] = true;
        }
        boolean[] zArr3 = dl0Var.f36889m;
        if (zArr3.length > 1 && zArr3[1]) {
            bool3 = dl0Var.f36878b;
            this.f35792b = bool3;
            zArr2[1] = true;
        }
        if (zArr3.length > 2 && zArr3[2]) {
            bool2 = dl0Var.f36879c;
            this.f35793c = bool2;
            zArr2[2] = true;
        }
        if (zArr3.length > 3 && zArr3[3]) {
            bool = dl0Var.f36880d;
            this.f35794d = bool;
            zArr2[3] = true;
        }
        if (zArr3.length > 4 && zArr3[4]) {
            list3 = dl0Var.f36881e;
            this.f35795e = list3;
            zArr2[4] = true;
        }
        if (zArr3.length > 5 && zArr3[5]) {
            jo0Var = dl0Var.f36882f;
            this.f35796f = jo0Var;
            zArr2[5] = true;
        }
        if (zArr3.length > 6 && zArr3[6]) {
            num2 = dl0Var.f36883g;
            this.f35797g = num2;
            zArr2[6] = true;
        }
        if (zArr3.length > 7 && zArr3[7]) {
            list2 = dl0Var.f36884h;
            this.f35798h = list2;
            zArr2[7] = true;
        }
        if (zArr3.length > 8 && zArr3[8]) {
            list = dl0Var.f36885i;
            this.f35799i = list;
            zArr2[8] = true;
        }
        if (zArr3.length > 9 && zArr3[9]) {
            num = dl0Var.f36886j;
            this.f35800j = num;
            zArr2[9] = true;
        }
        if (zArr3.length > 10 && zArr3[10]) {
            str2 = dl0Var.f36887k;
            this.f35801k = str2;
            zArr2[10] = true;
        }
        if (zArr3.length <= 11 || !zArr3[11]) {
            return;
        }
        str = dl0Var.f36888l;
        this.f35802l = str;
        zArr2[11] = true;
    }

    public final void c(Boolean bool) {
        this.f35791a = bool;
        boolean[] zArr = this.f35803m;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void d(Boolean bool) {
        this.f35794d = bool;
        boolean[] zArr = this.f35803m;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void e(List list) {
        this.f35795e = list;
        boolean[] zArr = this.f35803m;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void f(jo0 jo0Var) {
        this.f35796f = jo0Var;
        boolean[] zArr = this.f35803m;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void g(List list) {
        this.f35798h = list;
        boolean[] zArr = this.f35803m;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void h(String str) {
        this.f35802l = str;
        boolean[] zArr = this.f35803m;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public /* synthetic */ al0(dl0 dl0Var, int i13) {
        this(dl0Var);
    }

    private al0() {
        this.f35803m = new boolean[12];
    }

    private al0(@NonNull dl0 dl0Var) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        List list;
        jo0 jo0Var;
        Integer num;
        List list2;
        List list3;
        Integer num2;
        String str;
        String str2;
        bool = dl0Var.f36877a;
        this.f35791a = bool;
        bool2 = dl0Var.f36878b;
        this.f35792b = bool2;
        bool3 = dl0Var.f36879c;
        this.f35793c = bool3;
        bool4 = dl0Var.f36880d;
        this.f35794d = bool4;
        list = dl0Var.f36881e;
        this.f35795e = list;
        jo0Var = dl0Var.f36882f;
        this.f35796f = jo0Var;
        num = dl0Var.f36883g;
        this.f35797g = num;
        list2 = dl0Var.f36884h;
        this.f35798h = list2;
        list3 = dl0Var.f36885i;
        this.f35799i = list3;
        num2 = dl0Var.f36886j;
        this.f35800j = num2;
        str = dl0Var.f36887k;
        this.f35801k = str;
        str2 = dl0Var.f36888l;
        this.f35802l = str2;
        boolean[] zArr = dl0Var.f36889m;
        this.f35803m = Arrays.copyOf(zArr, zArr.length);
    }
}
