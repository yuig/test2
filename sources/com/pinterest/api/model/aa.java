package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public String f35671a;

    /* renamed from: b, reason: collision with root package name */
    public String f35672b;

    /* renamed from: c, reason: collision with root package name */
    public v7 f35673c;

    /* renamed from: d, reason: collision with root package name */
    public String f35674d;

    /* renamed from: e, reason: collision with root package name */
    public List f35675e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f35676f;

    /* renamed from: g, reason: collision with root package name */
    public List f35677g;

    /* renamed from: h, reason: collision with root package name */
    public lh0 f35678h;

    /* renamed from: i, reason: collision with root package name */
    public String f35679i;

    /* renamed from: j, reason: collision with root package name */
    public wy0 f35680j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f35681k;

    public /* synthetic */ aa(int i13) {
        this();
    }

    public final ba a() {
        return new ba(this.f35671a, this.f35672b, this.f35673c, this.f35674d, this.f35675e, this.f35676f, this.f35677g, this.f35678h, this.f35679i, this.f35680j, this.f35681k, 0);
    }

    public final void b(ba baVar) {
        wy0 wy0Var;
        String str;
        lh0 lh0Var;
        List list;
        Integer num;
        List list2;
        String str2;
        v7 v7Var;
        String str3;
        String str4;
        boolean[] zArr = baVar.f36034k;
        int length = zArr.length;
        boolean[] zArr2 = this.f35681k;
        if (length > 0 && zArr[0]) {
            str4 = baVar.f36024a;
            this.f35671a = str4;
            zArr2[0] = true;
        }
        boolean[] zArr3 = baVar.f36034k;
        if (zArr3.length > 1 && zArr3[1]) {
            str3 = baVar.f36025b;
            this.f35672b = str3;
            zArr2[1] = true;
        }
        if (zArr3.length > 2 && zArr3[2]) {
            v7Var = baVar.f36026c;
            this.f35673c = v7Var;
            zArr2[2] = true;
        }
        if (zArr3.length > 3 && zArr3[3]) {
            str2 = baVar.f36027d;
            this.f35674d = str2;
            zArr2[3] = true;
        }
        if (zArr3.length > 4 && zArr3[4]) {
            list2 = baVar.f36028e;
            this.f35675e = list2;
            zArr2[4] = true;
        }
        if (zArr3.length > 5 && zArr3[5]) {
            num = baVar.f36029f;
            this.f35676f = num;
            zArr2[5] = true;
        }
        if (zArr3.length > 6 && zArr3[6]) {
            list = baVar.f36030g;
            this.f35677g = list;
            zArr2[6] = true;
        }
        if (zArr3.length > 7 && zArr3[7]) {
            lh0Var = baVar.f36031h;
            this.f35678h = lh0Var;
            zArr2[7] = true;
        }
        if (zArr3.length > 8 && zArr3[8]) {
            str = baVar.f36032i;
            this.f35679i = str;
            zArr2[8] = true;
        }
        if (zArr3.length <= 9 || !zArr3[9]) {
            return;
        }
        wy0Var = baVar.f36033j;
        this.f35680j = wy0Var;
        zArr2[9] = true;
    }

    public final void c(List list) {
        this.f35677g = list;
        boolean[] zArr = this.f35681k;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void d(String str) {
        this.f35679i = str;
        boolean[] zArr = this.f35681k;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public /* synthetic */ aa(ba baVar, int i13) {
        this(baVar);
    }

    private aa() {
        this.f35681k = new boolean[10];
    }

    private aa(@NonNull ba baVar) {
        String str;
        String str2;
        v7 v7Var;
        String str3;
        List list;
        Integer num;
        List list2;
        lh0 lh0Var;
        String str4;
        wy0 wy0Var;
        str = baVar.f36024a;
        this.f35671a = str;
        str2 = baVar.f36025b;
        this.f35672b = str2;
        v7Var = baVar.f36026c;
        this.f35673c = v7Var;
        str3 = baVar.f36027d;
        this.f35674d = str3;
        list = baVar.f36028e;
        this.f35675e = list;
        num = baVar.f36029f;
        this.f35676f = num;
        list2 = baVar.f36030g;
        this.f35677g = list2;
        lh0Var = baVar.f36031h;
        this.f35678h = lh0Var;
        str4 = baVar.f36032i;
        this.f35679i = str4;
        wy0Var = baVar.f36033j;
        this.f35680j = wy0Var;
        boolean[] zArr = baVar.f36034k;
        this.f35681k = Arrays.copyOf(zArr, zArr.length);
    }
}
