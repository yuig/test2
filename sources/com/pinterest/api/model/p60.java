package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p60 {

    /* renamed from: a, reason: collision with root package name */
    public String f40891a;

    /* renamed from: b, reason: collision with root package name */
    public String f40892b;

    /* renamed from: c, reason: collision with root package name */
    public Map f40893c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40894d;

    public /* synthetic */ p60(int i13) {
        this();
    }

    private p60() {
        this.f40894d = new boolean[3];
    }

    private p60(@NonNull s60 s60Var) {
        String str;
        String str2;
        Map map;
        str = s60Var.f41798a;
        this.f40891a = str;
        str2 = s60Var.f41799b;
        this.f40892b = str2;
        map = s60Var.f41800c;
        this.f40893c = map;
        boolean[] zArr = s60Var.f41801d;
        this.f40894d = Arrays.copyOf(zArr, zArr.length);
    }
}
