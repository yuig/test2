package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class te0 {

    /* renamed from: a, reason: collision with root package name */
    public List f42177a;

    /* renamed from: b, reason: collision with root package name */
    public cb f42178b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f42179c;

    /* renamed from: d, reason: collision with root package name */
    public String f42180d;

    /* renamed from: e, reason: collision with root package name */
    public String f42181e;

    /* renamed from: f, reason: collision with root package name */
    public String f42182f;

    /* renamed from: g, reason: collision with root package name */
    public wt f42183g;

    /* renamed from: h, reason: collision with root package name */
    public String f42184h;

    /* renamed from: i, reason: collision with root package name */
    public wz f42185i;

    /* renamed from: j, reason: collision with root package name */
    public List f42186j;

    /* renamed from: k, reason: collision with root package name */
    public String f42187k;

    /* renamed from: l, reason: collision with root package name */
    public xh0 f42188l;

    /* renamed from: m, reason: collision with root package name */
    public String f42189m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f42190n;

    public /* synthetic */ te0(int i13) {
        this();
    }

    public final we0 a() {
        return new we0(this.f42177a, this.f42178b, this.f42179c, this.f42180d, this.f42181e, this.f42182f, this.f42183g, this.f42184h, this.f42185i, this.f42186j, this.f42187k, this.f42188l, this.f42189m, this.f42190n, 0);
    }

    public final void b(cb cbVar) {
        this.f42178b = cbVar;
        boolean[] zArr = this.f42190n;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(String str) {
        this.f42187k = str;
        boolean[] zArr = this.f42190n;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    private te0() {
        this.f42190n = new boolean[13];
    }

    private te0(@NonNull we0 we0Var) {
        List list;
        cb cbVar;
        Boolean bool;
        String str;
        String str2;
        String str3;
        wt wtVar;
        String str4;
        wz wzVar;
        List list2;
        String str5;
        xh0 xh0Var;
        String str6;
        list = we0Var.f43235a;
        this.f42177a = list;
        cbVar = we0Var.f43236b;
        this.f42178b = cbVar;
        bool = we0Var.f43237c;
        this.f42179c = bool;
        str = we0Var.f43238d;
        this.f42180d = str;
        str2 = we0Var.f43239e;
        this.f42181e = str2;
        str3 = we0Var.f43240f;
        this.f42182f = str3;
        wtVar = we0Var.f43241g;
        this.f42183g = wtVar;
        str4 = we0Var.f43242h;
        this.f42184h = str4;
        wzVar = we0Var.f43243i;
        this.f42185i = wzVar;
        list2 = we0Var.f43244j;
        this.f42186j = list2;
        str5 = we0Var.f43245k;
        this.f42187k = str5;
        xh0Var = we0Var.f43246l;
        this.f42188l = xh0Var;
        str6 = we0Var.f43247m;
        this.f42189m = str6;
        boolean[] zArr = we0Var.f43248n;
        this.f42190n = Arrays.copyOf(zArr, zArr.length);
    }
}
