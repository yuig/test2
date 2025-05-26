package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class fg0 {

    /* renamed from: a, reason: collision with root package name */
    public String f37662a;

    /* renamed from: b, reason: collision with root package name */
    public String f37663b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f37664c;

    /* renamed from: d, reason: collision with root package name */
    public String f37665d;

    /* renamed from: e, reason: collision with root package name */
    public String f37666e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f37667f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37668g;

    public /* synthetic */ fg0(int i13) {
        this();
    }

    private fg0() {
        this.f37668g = new boolean[6];
    }

    private fg0(@NonNull ig0 ig0Var) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        Integer num2;
        str = ig0Var.f38765a;
        this.f37662a = str;
        str2 = ig0Var.f38766b;
        this.f37663b = str2;
        num = ig0Var.f38767c;
        this.f37664c = num;
        str3 = ig0Var.f38768d;
        this.f37665d = str3;
        str4 = ig0Var.f38769e;
        this.f37666e = str4;
        num2 = ig0Var.f38770f;
        this.f37667f = num2;
        boolean[] zArr = ig0Var.f38771g;
        this.f37668g = Arrays.copyOf(zArr, zArr.length);
    }
}
