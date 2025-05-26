package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class c90 {

    /* renamed from: a, reason: collision with root package name */
    public String f36325a;

    /* renamed from: b, reason: collision with root package name */
    public String f36326b;

    /* renamed from: c, reason: collision with root package name */
    public String f36327c;

    /* renamed from: d, reason: collision with root package name */
    public Date f36328d;

    /* renamed from: e, reason: collision with root package name */
    public List f36329e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f36330f;

    /* renamed from: g, reason: collision with root package name */
    public String f36331g;

    /* renamed from: h, reason: collision with root package name */
    public Date f36332h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f36333i;

    public /* synthetic */ c90(int i13) {
        this();
    }

    private c90() {
        this.f36333i = new boolean[8];
    }

    private c90(@NonNull f90 f90Var) {
        String str;
        String str2;
        String str3;
        Date date;
        List list;
        Integer num;
        String str4;
        Date date2;
        str = f90Var.f37616a;
        this.f36325a = str;
        str2 = f90Var.f37617b;
        this.f36326b = str2;
        str3 = f90Var.f37618c;
        this.f36327c = str3;
        date = f90Var.f37619d;
        this.f36328d = date;
        list = f90Var.f37620e;
        this.f36329e = list;
        num = f90Var.f37621f;
        this.f36330f = num;
        str4 = f90Var.f37622g;
        this.f36331g = str4;
        date2 = f90Var.f37623h;
        this.f36332h = date2;
        boolean[] zArr = f90Var.f37624i;
        this.f36333i = Arrays.copyOf(zArr, zArr.length);
    }
}
