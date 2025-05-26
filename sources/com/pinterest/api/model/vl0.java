package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vl0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42917a;

    /* renamed from: b, reason: collision with root package name */
    public String f42918b;

    /* renamed from: c, reason: collision with root package name */
    public Double f42919c;

    /* renamed from: d, reason: collision with root package name */
    public String f42920d;

    /* renamed from: e, reason: collision with root package name */
    public String f42921e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42922f;

    public /* synthetic */ vl0(int i13) {
        this();
    }

    private vl0() {
        this.f42922f = new boolean[5];
    }

    private vl0(@NonNull yl0 yl0Var) {
        String str;
        String str2;
        Double d2;
        String str3;
        String str4;
        str = yl0Var.f44072a;
        this.f42917a = str;
        str2 = yl0Var.f44073b;
        this.f42918b = str2;
        d2 = yl0Var.f44074c;
        this.f42919c = d2;
        str3 = yl0Var.f44075d;
        this.f42920d = str3;
        str4 = yl0Var.f44076e;
        this.f42921e = str4;
        boolean[] zArr = yl0Var.f44077f;
        this.f42922f = Arrays.copyOf(zArr, zArr.length);
    }
}
