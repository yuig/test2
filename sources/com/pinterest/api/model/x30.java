package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x30 {

    /* renamed from: a, reason: collision with root package name */
    public String f43570a;

    /* renamed from: b, reason: collision with root package name */
    public String f43571b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f43572c;

    /* renamed from: d, reason: collision with root package name */
    public Double f43573d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43574e;

    public /* synthetic */ x30(int i13) {
        this();
    }

    private x30() {
        this.f43574e = new boolean[4];
    }

    private x30(@NonNull a40 a40Var) {
        String str;
        String str2;
        Boolean bool;
        Double d2;
        str = a40Var.f35646a;
        this.f43570a = str;
        str2 = a40Var.f35647b;
        this.f43571b = str2;
        bool = a40Var.f35648c;
        this.f43572c = bool;
        d2 = a40Var.f35649d;
        this.f43573d = d2;
        boolean[] zArr = a40Var.f35650e;
        this.f43574e = Arrays.copyOf(zArr, zArr.length);
    }
}
