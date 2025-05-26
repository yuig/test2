package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public String f42386a;

    /* renamed from: b, reason: collision with root package name */
    public String f42387b;

    /* renamed from: c, reason: collision with root package name */
    public String f42388c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f42389d;

    /* renamed from: e, reason: collision with root package name */
    public String f42390e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f42391f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42392g;

    public /* synthetic */ u2(int i13) {
        this();
    }

    public final void a(String str) {
        this.f42386a = str;
        boolean[] zArr = this.f42392g;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private u2() {
        this.f42392g = new boolean[6];
    }

    private u2(@NonNull v2 v2Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        Integer num2;
        str = v2Var.f42715a;
        this.f42386a = str;
        str2 = v2Var.f42716b;
        this.f42387b = str2;
        str3 = v2Var.f42717c;
        this.f42388c = str3;
        num = v2Var.f42718d;
        this.f42389d = num;
        str4 = v2Var.f42719e;
        this.f42390e = str4;
        num2 = v2Var.f42720f;
        this.f42391f = num2;
        boolean[] zArr = v2Var.f42721g;
        this.f42392g = Arrays.copyOf(zArr, zArr.length);
    }
}
