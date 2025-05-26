package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ex {

    /* renamed from: a, reason: collision with root package name */
    public String f37389a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f37390b;

    /* renamed from: c, reason: collision with root package name */
    public String f37391c;

    /* renamed from: d, reason: collision with root package name */
    public String f37392d;

    /* renamed from: e, reason: collision with root package name */
    public String f37393e;

    /* renamed from: f, reason: collision with root package name */
    public String f37394f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37395g;

    public /* synthetic */ ex(int i13) {
        this();
    }

    public final hx a() {
        return new hx(this.f37389a, this.f37390b, this.f37391c, this.f37392d, this.f37393e, this.f37394f, this.f37395g, 0);
    }

    public final void b(String str) {
        this.f37389a = str;
        boolean[] zArr = this.f37395g;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f37390b = bool;
        boolean[] zArr = this.f37395g;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f37391c = str;
        boolean[] zArr = this.f37395g;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f37392d = str;
        boolean[] zArr = this.f37395g;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void f(String str) {
        this.f37393e = str;
        boolean[] zArr = this.f37395g;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void g(String str) {
        this.f37394f = str;
        boolean[] zArr = this.f37395g;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    private ex() {
        this.f37395g = new boolean[6];
    }

    private ex(@NonNull hx hxVar) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        str = hxVar.f38554a;
        this.f37389a = str;
        bool = hxVar.f38555b;
        this.f37390b = bool;
        str2 = hxVar.f38556c;
        this.f37391c = str2;
        str3 = hxVar.f38557d;
        this.f37392d = str3;
        str4 = hxVar.f38558e;
        this.f37393e = str4;
        str5 = hxVar.f38559f;
        this.f37394f = str5;
        boolean[] zArr = hxVar.f38560g;
        this.f37395g = Arrays.copyOf(zArr, zArr.length);
    }
}
