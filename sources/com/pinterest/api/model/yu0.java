package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yu0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44127a;

    /* renamed from: b, reason: collision with root package name */
    public String f44128b;

    /* renamed from: c, reason: collision with root package name */
    public Double f44129c;

    /* renamed from: d, reason: collision with root package name */
    public Double f44130d;

    /* renamed from: e, reason: collision with root package name */
    public Double f44131e;

    /* renamed from: f, reason: collision with root package name */
    public Double f44132f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44133g;

    public /* synthetic */ yu0(int i13) {
        this();
    }

    private yu0() {
        this.f44133g = new boolean[6];
    }

    private yu0(@NonNull bv0 bv0Var) {
        String str;
        String str2;
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        str = bv0Var.f36214a;
        this.f44127a = str;
        str2 = bv0Var.f36215b;
        this.f44128b = str2;
        d2 = bv0Var.f36216c;
        this.f44129c = d2;
        d13 = bv0Var.f36217d;
        this.f44130d = d13;
        d14 = bv0Var.f36218e;
        this.f44131e = d14;
        d15 = bv0Var.f36219f;
        this.f44132f = d15;
        boolean[] zArr = bv0Var.f36220g;
        this.f44133g = Arrays.copyOf(zArr, zArr.length);
    }
}
