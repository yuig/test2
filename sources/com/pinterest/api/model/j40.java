package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class j40 {

    /* renamed from: a, reason: collision with root package name */
    public List f38970a;

    /* renamed from: b, reason: collision with root package name */
    public String f38971b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f38972c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f38973d;

    /* renamed from: e, reason: collision with root package name */
    public String f38974e;

    /* renamed from: f, reason: collision with root package name */
    public String f38975f;

    /* renamed from: g, reason: collision with root package name */
    public String f38976g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f38977h;

    public /* synthetic */ j40(int i13) {
        this();
    }

    public final m40 a() {
        return new m40(this.f38970a, this.f38971b, this.f38972c, this.f38973d, this.f38974e, this.f38975f, this.f38976g, this.f38977h, 0);
    }

    public final void b(Boolean bool) {
        this.f38972c = bool;
        boolean[] zArr = this.f38977h;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(String str) {
        this.f38976g = str;
        boolean[] zArr = this.f38977h;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    private j40() {
        this.f38977h = new boolean[7];
    }

    private j40(@NonNull m40 m40Var) {
        List list;
        String str;
        Boolean bool;
        Integer num;
        String str2;
        String str3;
        String str4;
        list = m40Var.f39991a;
        this.f38970a = list;
        str = m40Var.f39992b;
        this.f38971b = str;
        bool = m40Var.f39993c;
        this.f38972c = bool;
        num = m40Var.f39994d;
        this.f38973d = num;
        str2 = m40Var.f39995e;
        this.f38974e = str2;
        str3 = m40Var.f39996f;
        this.f38975f = str3;
        str4 = m40Var.f39997g;
        this.f38976g = str4;
        boolean[] zArr = m40Var.f39998h;
        this.f38977h = Arrays.copyOf(zArr, zArr.length);
    }
}
