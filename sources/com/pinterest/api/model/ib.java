package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public Integer f38719a;

    /* renamed from: b, reason: collision with root package name */
    public String f38720b;

    /* renamed from: c, reason: collision with root package name */
    public String f38721c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f38722d;

    /* renamed from: e, reason: collision with root package name */
    public Double f38723e;

    /* renamed from: f, reason: collision with root package name */
    public String f38724f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38725g;

    public /* synthetic */ ib(int i13) {
        this();
    }

    private ib() {
        this.f38725g = new boolean[6];
    }

    private ib(@NonNull lb lbVar) {
        Integer num;
        String str;
        String str2;
        Boolean bool;
        Double d2;
        String str3;
        num = lbVar.f39686a;
        this.f38719a = num;
        str = lbVar.f39687b;
        this.f38720b = str;
        str2 = lbVar.f39688c;
        this.f38721c = str2;
        bool = lbVar.f39689d;
        this.f38722d = bool;
        d2 = lbVar.f39690e;
        this.f38723e = d2;
        str3 = lbVar.f39691f;
        this.f38724f = str3;
        boolean[] zArr = lbVar.f39692g;
        this.f38725g = Arrays.copyOf(zArr, zArr.length);
    }
}
