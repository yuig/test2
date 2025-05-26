package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vd0 {

    /* renamed from: a, reason: collision with root package name */
    public ud0 f42827a;

    /* renamed from: b, reason: collision with root package name */
    public ce0 f42828b;

    /* renamed from: c, reason: collision with root package name */
    public String f42829c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f42830d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42831e;

    public /* synthetic */ vd0(int i13) {
        this();
    }

    private vd0() {
        this.f42831e = new boolean[4];
    }

    private vd0(@NonNull yd0 yd0Var) {
        ud0 ud0Var;
        ce0 ce0Var;
        String str;
        Integer num;
        ud0Var = yd0Var.f44013a;
        this.f42827a = ud0Var;
        ce0Var = yd0Var.f44014b;
        this.f42828b = ce0Var;
        str = yd0Var.f44015c;
        this.f42829c = str;
        num = yd0Var.f44016d;
        this.f42830d = num;
        boolean[] zArr = yd0Var.f44017e;
        this.f42831e = Arrays.copyOf(zArr, zArr.length);
    }
}
