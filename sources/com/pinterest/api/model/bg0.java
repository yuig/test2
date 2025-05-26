package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class bg0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36094a;

    /* renamed from: b, reason: collision with root package name */
    public String f36095b;

    /* renamed from: c, reason: collision with root package name */
    public String f36096c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f36097d;

    /* renamed from: e, reason: collision with root package name */
    public String f36098e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f36099f;

    /* renamed from: g, reason: collision with root package name */
    public String f36100g;

    /* renamed from: h, reason: collision with root package name */
    public List f36101h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f36102i;

    public /* synthetic */ bg0(int i13) {
        this();
    }

    private bg0() {
        this.f36102i = new boolean[8];
    }

    private bg0(@NonNull eg0 eg0Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        Integer num2;
        String str5;
        List list;
        str = eg0Var.f37263a;
        this.f36094a = str;
        str2 = eg0Var.f37264b;
        this.f36095b = str2;
        str3 = eg0Var.f37265c;
        this.f36096c = str3;
        num = eg0Var.f37266d;
        this.f36097d = num;
        str4 = eg0Var.f37267e;
        this.f36098e = str4;
        num2 = eg0Var.f37268f;
        this.f36099f = num2;
        str5 = eg0Var.f37269g;
        this.f36100g = str5;
        list = eg0Var.f37270h;
        this.f36101h = list;
        boolean[] zArr = eg0Var.f37271i;
        this.f36102i = Arrays.copyOf(zArr, zArr.length);
    }
}
