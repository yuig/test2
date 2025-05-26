package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public String f39960a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f39961b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f39962c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39963d;

    public /* synthetic */ m1(int i13) {
        this();
    }

    private m1() {
        this.f39963d = new boolean[3];
    }

    private m1(@NonNull n1 n1Var) {
        String str;
        Integer num;
        Boolean bool;
        str = n1Var.f40278a;
        this.f39960a = str;
        num = n1Var.f40279b;
        this.f39961b = num;
        bool = n1Var.f40280c;
        this.f39962c = bool;
        boolean[] zArr = n1Var.f40281d;
        this.f39963d = Arrays.copyOf(zArr, zArr.length);
    }
}
