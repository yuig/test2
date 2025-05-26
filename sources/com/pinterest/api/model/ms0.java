package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ms0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40199a;

    /* renamed from: b, reason: collision with root package name */
    public String f40200b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40201c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f40202d;

    /* renamed from: e, reason: collision with root package name */
    public List f40203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40204f;

    public /* synthetic */ ms0(int i13) {
        this();
    }

    public final ps0 a() {
        return new ps0(this.f40199a, this.f40200b, this.f40201c, this.f40202d, this.f40203e, this.f40204f, 0);
    }

    public final void b(List list) {
        this.f40203e = list;
        boolean[] zArr = this.f40204f;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public /* synthetic */ ms0(ps0 ps0Var, int i13) {
        this(ps0Var);
    }

    private ms0() {
        this.f40204f = new boolean[5];
    }

    private ms0(@NonNull ps0 ps0Var) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        List list;
        str = ps0Var.f41078a;
        this.f40199a = str;
        str2 = ps0Var.f41079b;
        this.f40200b = str2;
        num = ps0Var.f41080c;
        this.f40201c = num;
        num2 = ps0Var.f41081d;
        this.f40202d = num2;
        list = ps0Var.f41082e;
        this.f40203e = list;
        boolean[] zArr = ps0Var.f41083f;
        this.f40204f = Arrays.copyOf(zArr, zArr.length);
    }
}
