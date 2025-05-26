package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class gr0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f38117a;

    /* renamed from: b, reason: collision with root package name */
    public String f38118b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f38119c;

    /* renamed from: d, reason: collision with root package name */
    public String f38120d;

    /* renamed from: e, reason: collision with root package name */
    public String f38121e;

    /* renamed from: f, reason: collision with root package name */
    public Double f38122f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38123g;

    public /* synthetic */ gr0(int i13) {
        this();
    }

    private gr0() {
        this.f38123g = new boolean[6];
    }

    private gr0(@NonNull jr0 jr0Var) {
        Boolean bool;
        String str;
        Boolean bool2;
        String str2;
        String str3;
        Double d2;
        bool = jr0Var.f39127a;
        this.f38117a = bool;
        str = jr0Var.f39128b;
        this.f38118b = str;
        bool2 = jr0Var.f39129c;
        this.f38119c = bool2;
        str2 = jr0Var.f39130d;
        this.f38120d = str2;
        str3 = jr0Var.f39131e;
        this.f38121e = str3;
        d2 = jr0Var.f39132f;
        this.f38122f = d2;
        boolean[] zArr = jr0Var.f39133g;
        this.f38123g = Arrays.copyOf(zArr, zArr.length);
    }
}
