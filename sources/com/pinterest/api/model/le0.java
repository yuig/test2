package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class le0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39722a;

    /* renamed from: b, reason: collision with root package name */
    public String f39723b;

    /* renamed from: c, reason: collision with root package name */
    public String f39724c;

    /* renamed from: d, reason: collision with root package name */
    public t6 f39725d;

    /* renamed from: e, reason: collision with root package name */
    public String f39726e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f39727f;

    /* renamed from: g, reason: collision with root package name */
    public String f39728g;

    /* renamed from: h, reason: collision with root package name */
    public zv f39729h;

    /* renamed from: i, reason: collision with root package name */
    public List f39730i;

    /* renamed from: j, reason: collision with root package name */
    public kc0 f39731j;

    /* renamed from: k, reason: collision with root package name */
    public String f39732k;

    /* renamed from: l, reason: collision with root package name */
    public String f39733l;

    /* renamed from: m, reason: collision with root package name */
    public String f39734m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f39735n;

    public /* synthetic */ le0(int i13) {
        this();
    }

    public final oe0 a() {
        return new oe0(this.f39722a, this.f39723b, this.f39724c, this.f39725d, this.f39726e, this.f39727f, this.f39728g, this.f39729h, this.f39730i, this.f39731j, this.f39732k, this.f39733l, this.f39734m, this.f39735n, 0);
    }

    public final void b(Boolean bool) {
        this.f39727f = bool;
        boolean[] zArr = this.f39735n;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void c(String str) {
        this.f39723b = str;
        boolean[] zArr = this.f39735n;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(List list) {
        this.f39730i = list;
        boolean[] zArr = this.f39735n;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void e(kc0 kc0Var) {
        this.f39731j = kc0Var;
        boolean[] zArr = this.f39735n;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    private le0() {
        this.f39735n = new boolean[13];
    }

    private le0(@NonNull oe0 oe0Var) {
        String str;
        String str2;
        String str3;
        t6 t6Var;
        String str4;
        Boolean bool;
        String str5;
        zv zvVar;
        List list;
        kc0 kc0Var;
        String str6;
        String str7;
        String str8;
        str = oe0Var.f40684a;
        this.f39722a = str;
        str2 = oe0Var.f40685b;
        this.f39723b = str2;
        str3 = oe0Var.f40686c;
        this.f39724c = str3;
        t6Var = oe0Var.f40687d;
        this.f39725d = t6Var;
        str4 = oe0Var.f40688e;
        this.f39726e = str4;
        bool = oe0Var.f40689f;
        this.f39727f = bool;
        str5 = oe0Var.f40690g;
        this.f39728g = str5;
        zvVar = oe0Var.f40691h;
        this.f39729h = zvVar;
        list = oe0Var.f40692i;
        this.f39730i = list;
        kc0Var = oe0Var.f40693j;
        this.f39731j = kc0Var;
        str6 = oe0Var.f40694k;
        this.f39732k = str6;
        str7 = oe0Var.f40695l;
        this.f39733l = str7;
        str8 = oe0Var.f40696m;
        this.f39734m = str8;
        boolean[] zArr = oe0Var.f40697n;
        this.f39735n = Arrays.copyOf(zArr, zArr.length);
    }
}
