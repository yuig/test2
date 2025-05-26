package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zb0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44274a;

    /* renamed from: b, reason: collision with root package name */
    public String f44275b;

    /* renamed from: c, reason: collision with root package name */
    public List f44276c;

    /* renamed from: d, reason: collision with root package name */
    public List f44277d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f44278e;

    /* renamed from: f, reason: collision with root package name */
    public String f44279f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44280g;

    public /* synthetic */ zb0(int i13) {
        this();
    }

    private zb0() {
        this.f44280g = new boolean[6];
    }

    private zb0(@NonNull cc0 cc0Var) {
        String str;
        String str2;
        List list;
        List list2;
        Integer num;
        String str3;
        str = cc0Var.f36360a;
        this.f44274a = str;
        str2 = cc0Var.f36361b;
        this.f44275b = str2;
        list = cc0Var.f36362c;
        this.f44276c = list;
        list2 = cc0Var.f36363d;
        this.f44277d = list2;
        num = cc0Var.f36364e;
        this.f44278e = num;
        str3 = cc0Var.f36365f;
        this.f44279f = str3;
        boolean[] zArr = cc0Var.f36366g;
        this.f44280g = Arrays.copyOf(zArr, zArr.length);
    }
}
