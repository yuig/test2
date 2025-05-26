package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public String f43962a;

    /* renamed from: b, reason: collision with root package name */
    public String f43963b;

    /* renamed from: c, reason: collision with root package name */
    public mv f43964c;

    /* renamed from: d, reason: collision with root package name */
    public String f43965d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f43966e;

    /* renamed from: f, reason: collision with root package name */
    public mv f43967f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f43968g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f43969h;

    public /* synthetic */ y7(int i13) {
        this();
    }

    private y7() {
        this.f43969h = new boolean[7];
    }

    private y7(@NonNull z7 z7Var) {
        String str;
        String str2;
        mv mvVar;
        String str3;
        Boolean bool;
        mv mvVar2;
        Integer num;
        str = z7Var.f44232a;
        this.f43962a = str;
        str2 = z7Var.f44233b;
        this.f43963b = str2;
        mvVar = z7Var.f44234c;
        this.f43964c = mvVar;
        str3 = z7Var.f44235d;
        this.f43965d = str3;
        bool = z7Var.f44236e;
        this.f43966e = bool;
        mvVar2 = z7Var.f44237f;
        this.f43967f = mvVar2;
        num = z7Var.f44238g;
        this.f43968g = num;
        boolean[] zArr = z7Var.f44239h;
        this.f43969h = Arrays.copyOf(zArr, zArr.length);
    }
}
