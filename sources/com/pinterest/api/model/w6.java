package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public String f43176a;

    /* renamed from: b, reason: collision with root package name */
    public String f43177b;

    /* renamed from: c, reason: collision with root package name */
    public String f43178c;

    /* renamed from: d, reason: collision with root package name */
    public String f43179d;

    /* renamed from: e, reason: collision with root package name */
    public String f43180e;

    /* renamed from: f, reason: collision with root package name */
    public String f43181f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43182g;

    public /* synthetic */ w6(int i13) {
        this();
    }

    public final x6 a() {
        return new x6(this.f43176a, this.f43177b, this.f43178c, this.f43179d, this.f43180e, this.f43181f, this.f43182g, 0);
    }

    public final void b(String str) {
        this.f43176a = str;
        boolean[] zArr = this.f43182g;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(String str) {
        this.f43177b = str;
        boolean[] zArr = this.f43182g;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f43178c = str;
        boolean[] zArr = this.f43182g;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f43179d = str;
        boolean[] zArr = this.f43182g;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void f(String str) {
        this.f43180e = str;
        boolean[] zArr = this.f43182g;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void g(String str) {
        this.f43181f = str;
        boolean[] zArr = this.f43182g;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    private w6() {
        this.f43182g = new boolean[6];
    }

    private w6(@NonNull x6 x6Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        str = x6Var.f43599a;
        this.f43176a = str;
        str2 = x6Var.f43600b;
        this.f43177b = str2;
        str3 = x6Var.f43601c;
        this.f43178c = str3;
        str4 = x6Var.f43602d;
        this.f43179d = str4;
        str5 = x6Var.f43603e;
        this.f43180e = str5;
        str6 = x6Var.f43604f;
        this.f43181f = str6;
        boolean[] zArr = x6Var.f43605g;
        this.f43182g = Arrays.copyOf(zArr, zArr.length);
    }
}
