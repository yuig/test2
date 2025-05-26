package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public String f39255a;

    /* renamed from: b, reason: collision with root package name */
    public String f39256b;

    /* renamed from: c, reason: collision with root package name */
    public v7 f39257c;

    /* renamed from: d, reason: collision with root package name */
    public Map f39258d;

    /* renamed from: e, reason: collision with root package name */
    public Map f39259e;

    /* renamed from: f, reason: collision with root package name */
    public String f39260f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39261g;

    public /* synthetic */ k2(int i13) {
        this();
    }

    private k2() {
        this.f39261g = new boolean[6];
    }

    private k2(@NonNull l2 l2Var) {
        String str;
        String str2;
        v7 v7Var;
        Map map;
        Map map2;
        String str3;
        str = l2Var.f39620a;
        this.f39255a = str;
        str2 = l2Var.f39621b;
        this.f39256b = str2;
        v7Var = l2Var.f39622c;
        this.f39257c = v7Var;
        map = l2Var.f39623d;
        this.f39258d = map;
        map2 = l2Var.f39624e;
        this.f39259e = map2;
        str3 = l2Var.f39625f;
        this.f39260f = str3;
        boolean[] zArr = l2Var.f39626g;
        this.f39261g = Arrays.copyOf(zArr, zArr.length);
    }
}
