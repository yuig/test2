package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aj0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f35765a;

    /* renamed from: b, reason: collision with root package name */
    public String f35766b;

    /* renamed from: c, reason: collision with root package name */
    public String f35767c;

    /* renamed from: d, reason: collision with root package name */
    public Double f35768d;

    /* renamed from: e, reason: collision with root package name */
    public Double f35769e;

    /* renamed from: f, reason: collision with root package name */
    public String f35770f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35771g;

    public /* synthetic */ aj0(int i13) {
        this();
    }

    private aj0() {
        this.f35771g = new boolean[6];
    }

    private aj0(@NonNull dj0 dj0Var) {
        Double d2;
        String str;
        String str2;
        Double d13;
        Double d14;
        String str3;
        d2 = dj0Var.f36855a;
        this.f35765a = d2;
        str = dj0Var.f36856b;
        this.f35766b = str;
        str2 = dj0Var.f36857c;
        this.f35767c = str2;
        d13 = dj0Var.f36858d;
        this.f35768d = d13;
        d14 = dj0Var.f36859e;
        this.f35769e = d14;
        str3 = dj0Var.f36860f;
        this.f35770f = str3;
        boolean[] zArr = dj0Var.f36861g;
        this.f35771g = Arrays.copyOf(zArr, zArr.length);
    }
}
