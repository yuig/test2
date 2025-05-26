package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ih0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f38785a;

    /* renamed from: b, reason: collision with root package name */
    public String f38786b;

    /* renamed from: c, reason: collision with root package name */
    public String f38787c;

    /* renamed from: d, reason: collision with root package name */
    public List f38788d;

    /* renamed from: e, reason: collision with root package name */
    public String f38789e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f38790f;

    /* renamed from: g, reason: collision with root package name */
    public String f38791g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f38792h;

    public /* synthetic */ ih0(int i13) {
        this();
    }

    private ih0() {
        this.f38792h = new boolean[7];
    }

    private ih0(@NonNull lh0 lh0Var) {
        Integer num;
        String str;
        String str2;
        List list;
        String str3;
        Integer num2;
        String str4;
        num = lh0Var.f39763a;
        this.f38785a = num;
        str = lh0Var.f39764b;
        this.f38786b = str;
        str2 = lh0Var.f39765c;
        this.f38787c = str2;
        list = lh0Var.f39766d;
        this.f38788d = list;
        str3 = lh0Var.f39767e;
        this.f38789e = str3;
        num2 = lh0Var.f39768f;
        this.f38790f = num2;
        str4 = lh0Var.f39769g;
        this.f38791g = str4;
        boolean[] zArr = lh0Var.f39770h;
        this.f38792h = Arrays.copyOf(zArr, zArr.length);
    }
}
