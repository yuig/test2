package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x60 {

    /* renamed from: a, reason: collision with root package name */
    public String f43606a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f43607b;

    /* renamed from: c, reason: collision with root package name */
    public String f43608c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f43609d;

    /* renamed from: e, reason: collision with root package name */
    public String f43610e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f43611f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43612g;

    public /* synthetic */ x60(int i13) {
        this();
    }

    private x60() {
        this.f43612g = new boolean[6];
    }

    private x60(@NonNull a70 a70Var) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        Integer num3;
        str = a70Var.f35657a;
        this.f43606a = str;
        num = a70Var.f35658b;
        this.f43607b = num;
        str2 = a70Var.f35659c;
        this.f43608c = str2;
        num2 = a70Var.f35660d;
        this.f43609d = num2;
        str3 = a70Var.f35661e;
        this.f43610e = str3;
        num3 = a70Var.f35662f;
        this.f43611f = num3;
        boolean[] zArr = a70Var.f35663g;
        this.f43612g = Arrays.copyOf(zArr, zArr.length);
    }
}
