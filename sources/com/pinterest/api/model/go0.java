package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class go0 {

    /* renamed from: a, reason: collision with root package name */
    public qk0 f38098a;

    /* renamed from: b, reason: collision with root package name */
    public Double f38099b;

    /* renamed from: c, reason: collision with root package name */
    public String f38100c;

    /* renamed from: d, reason: collision with root package name */
    public ql0 f38101d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f38102e;

    /* renamed from: f, reason: collision with root package name */
    public String f38103f;

    /* renamed from: g, reason: collision with root package name */
    public String f38104g;

    /* renamed from: h, reason: collision with root package name */
    public sp0 f38105h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f38106i;

    /* renamed from: j, reason: collision with root package name */
    public String f38107j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f38108k;

    public /* synthetic */ go0(int i13) {
        this();
    }

    public final jo0 a() {
        return new jo0(this.f38098a, this.f38099b, this.f38100c, this.f38101d, this.f38102e, this.f38103f, this.f38104g, this.f38105h, this.f38106i, this.f38107j, this.f38108k, 0);
    }

    public final void b(jo0 jo0Var) {
        String str;
        Integer num;
        sp0 sp0Var;
        String str2;
        String str3;
        Boolean bool;
        ql0 ql0Var;
        String str4;
        Double d2;
        qk0 qk0Var;
        boolean[] zArr = jo0Var.f39113k;
        int length = zArr.length;
        boolean[] zArr2 = this.f38108k;
        if (length > 0 && zArr[0]) {
            qk0Var = jo0Var.f39103a;
            this.f38098a = qk0Var;
            zArr2[0] = true;
        }
        boolean[] zArr3 = jo0Var.f39113k;
        if (zArr3.length > 1 && zArr3[1]) {
            d2 = jo0Var.f39104b;
            this.f38099b = d2;
            zArr2[1] = true;
        }
        if (zArr3.length > 2 && zArr3[2]) {
            str4 = jo0Var.f39105c;
            this.f38100c = str4;
            zArr2[2] = true;
        }
        if (zArr3.length > 3 && zArr3[3]) {
            ql0Var = jo0Var.f39106d;
            this.f38101d = ql0Var;
            zArr2[3] = true;
        }
        if (zArr3.length > 4 && zArr3[4]) {
            bool = jo0Var.f39107e;
            this.f38102e = bool;
            zArr2[4] = true;
        }
        if (zArr3.length > 5 && zArr3[5]) {
            str3 = jo0Var.f39108f;
            this.f38103f = str3;
            zArr2[5] = true;
        }
        if (zArr3.length > 6 && zArr3[6]) {
            str2 = jo0Var.f39109g;
            this.f38104g = str2;
            zArr2[6] = true;
        }
        if (zArr3.length > 7 && zArr3[7]) {
            sp0Var = jo0Var.f39110h;
            this.f38105h = sp0Var;
            zArr2[7] = true;
        }
        if (zArr3.length > 8 && zArr3[8]) {
            num = jo0Var.f39111i;
            this.f38106i = num;
            zArr2[8] = true;
        }
        if (zArr3.length <= 9 || !zArr3[9]) {
            return;
        }
        str = jo0Var.f39112j;
        this.f38107j = str;
        zArr2[9] = true;
    }

    public /* synthetic */ go0(jo0 jo0Var, int i13) {
        this(jo0Var);
    }

    private go0() {
        this.f38108k = new boolean[10];
    }

    private go0(@NonNull jo0 jo0Var) {
        qk0 qk0Var;
        Double d2;
        String str;
        ql0 ql0Var;
        Boolean bool;
        String str2;
        String str3;
        sp0 sp0Var;
        Integer num;
        String str4;
        qk0Var = jo0Var.f39103a;
        this.f38098a = qk0Var;
        d2 = jo0Var.f39104b;
        this.f38099b = d2;
        str = jo0Var.f39105c;
        this.f38100c = str;
        ql0Var = jo0Var.f39106d;
        this.f38101d = ql0Var;
        bool = jo0Var.f39107e;
        this.f38102e = bool;
        str2 = jo0Var.f39108f;
        this.f38103f = str2;
        str3 = jo0Var.f39109g;
        this.f38104g = str3;
        sp0Var = jo0Var.f39110h;
        this.f38105h = sp0Var;
        num = jo0Var.f39111i;
        this.f38106i = num;
        str4 = jo0Var.f39112j;
        this.f38107j = str4;
        boolean[] zArr = jo0Var.f39113k;
        this.f38108k = Arrays.copyOf(zArr, zArr.length);
    }
}
