package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public String f36653a;

    /* renamed from: b, reason: collision with root package name */
    public String f36654b;

    /* renamed from: c, reason: collision with root package name */
    public q3 f36655c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36656d;

    public /* synthetic */ d5(int i13) {
        this();
    }

    private d5() {
        this.f36656d = new boolean[3];
    }

    private d5(@NonNull e5 e5Var) {
        String str;
        String str2;
        q3 q3Var;
        str = e5Var.f37178a;
        this.f36653a = str;
        str2 = e5Var.f37179b;
        this.f36654b = str2;
        q3Var = e5Var.f37180c;
        this.f36655c = q3Var;
        boolean[] zArr = e5Var.f37181d;
        this.f36656d = Arrays.copyOf(zArr, zArr.length);
    }
}
