package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qu0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41379a;

    /* renamed from: b, reason: collision with root package name */
    public String f41380b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41381c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41382d;

    /* renamed from: e, reason: collision with root package name */
    public lu0 f41383e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f41384f;

    /* renamed from: g, reason: collision with root package name */
    public xu0 f41385g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f41386h;

    public /* synthetic */ qu0(int i13) {
        this();
    }

    private qu0() {
        this.f41386h = new boolean[7];
    }

    private qu0(@NonNull tu0 tu0Var) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        lu0 lu0Var;
        Integer num3;
        xu0 xu0Var;
        str = tu0Var.f42303a;
        this.f41379a = str;
        str2 = tu0Var.f42304b;
        this.f41380b = str2;
        num = tu0Var.f42305c;
        this.f41381c = num;
        num2 = tu0Var.f42306d;
        this.f41382d = num2;
        lu0Var = tu0Var.f42307e;
        this.f41383e = lu0Var;
        num3 = tu0Var.f42308f;
        this.f41384f = num3;
        xu0Var = tu0Var.f42309g;
        this.f41385g = xu0Var;
        boolean[] zArr = tu0Var.f42310h;
        this.f41386h = Arrays.copyOf(zArr, zArr.length);
    }
}
