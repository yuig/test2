package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mh0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40108a;

    /* renamed from: b, reason: collision with root package name */
    public String f40109b;

    /* renamed from: c, reason: collision with root package name */
    public String f40110c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f40111d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40112e;

    public /* synthetic */ mh0(int i13) {
        this();
    }

    private mh0() {
        this.f40112e = new boolean[4];
    }

    private mh0(@NonNull ph0 ph0Var) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        str = ph0Var.f40986a;
        this.f40108a = str;
        str2 = ph0Var.f40987b;
        this.f40109b = str2;
        str3 = ph0Var.f40988c;
        this.f40110c = str3;
        bool = ph0Var.f40989d;
        this.f40111d = bool;
        boolean[] zArr = ph0Var.f40990e;
        this.f40112e = Arrays.copyOf(zArr, zArr.length);
    }
}
