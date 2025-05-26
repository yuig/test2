package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class mx0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40248a;

    /* renamed from: b, reason: collision with root package name */
    public String f40249b;

    /* renamed from: c, reason: collision with root package name */
    public List f40250c;

    /* renamed from: d, reason: collision with root package name */
    public String f40251d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40252e;

    /* renamed from: f, reason: collision with root package name */
    public List f40253f;

    /* renamed from: g, reason: collision with root package name */
    public String f40254g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f40255h;

    /* renamed from: i, reason: collision with root package name */
    public String f40256i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f40257j;

    public /* synthetic */ mx0(int i13) {
        this();
    }

    public final px0 a() {
        return new px0(this.f40248a, this.f40249b, this.f40250c, this.f40251d, this.f40252e, this.f40253f, this.f40254g, this.f40255h, this.f40256i, this.f40257j, 0);
    }

    public final void b(List list) {
        this.f40250c = list;
        boolean[] zArr = this.f40257j;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(List list) {
        this.f40253f = list;
        boolean[] zArr = this.f40257j;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public /* synthetic */ mx0(px0 px0Var, int i13) {
        this(px0Var);
    }

    private mx0() {
        this.f40257j = new boolean[9];
    }

    private mx0(@NonNull px0 px0Var) {
        String str;
        String str2;
        List list;
        String str3;
        Integer num;
        List list2;
        String str4;
        Integer num2;
        String str5;
        str = px0Var.f41132a;
        this.f40248a = str;
        str2 = px0Var.f41133b;
        this.f40249b = str2;
        list = px0Var.f41134c;
        this.f40250c = list;
        str3 = px0Var.f41135d;
        this.f40251d = str3;
        num = px0Var.f41136e;
        this.f40252e = num;
        list2 = px0Var.f41137f;
        this.f40253f = list2;
        str4 = px0Var.f41138g;
        this.f40254g = str4;
        num2 = px0Var.f41139h;
        this.f40255h = num2;
        str5 = px0Var.f41140i;
        this.f40256i = str5;
        boolean[] zArr = px0Var.f41141j;
        this.f40257j = Arrays.copyOf(zArr, zArr.length);
    }
}
