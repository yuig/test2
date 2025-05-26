package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class gg {

    /* renamed from: a, reason: collision with root package name */
    public String f38059a;

    /* renamed from: b, reason: collision with root package name */
    public String f38060b;

    /* renamed from: c, reason: collision with root package name */
    public zs f38061c;

    /* renamed from: d, reason: collision with root package name */
    public List f38062d;

    /* renamed from: e, reason: collision with root package name */
    public String f38063e;

    /* renamed from: f, reason: collision with root package name */
    public String f38064f;

    /* renamed from: g, reason: collision with root package name */
    public wy0 f38065g;

    /* renamed from: h, reason: collision with root package name */
    public kz0 f38066h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f38067i;

    public /* synthetic */ gg(int i13) {
        this();
    }

    private gg() {
        this.f38067i = new boolean[8];
    }

    private gg(@NonNull jg jgVar) {
        String str;
        String str2;
        zs zsVar;
        List list;
        String str3;
        String str4;
        wy0 wy0Var;
        kz0 kz0Var;
        str = jgVar.f39031a;
        this.f38059a = str;
        str2 = jgVar.f39032b;
        this.f38060b = str2;
        zsVar = jgVar.f39033c;
        this.f38061c = zsVar;
        list = jgVar.f39034d;
        this.f38062d = list;
        str3 = jgVar.f39035e;
        this.f38063e = str3;
        str4 = jgVar.f39036f;
        this.f38064f = str4;
        wy0Var = jgVar.f39037g;
        this.f38065g = wy0Var;
        kz0Var = jgVar.f39038h;
        this.f38066h = kz0Var;
        boolean[] zArr = jgVar.f39039i;
        this.f38067i = Arrays.copyOf(zArr, zArr.length);
    }
}
