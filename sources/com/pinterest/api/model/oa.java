package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    public String f40654a;

    /* renamed from: b, reason: collision with root package name */
    public String f40655b;

    /* renamed from: c, reason: collision with root package name */
    public v7 f40656c;

    /* renamed from: d, reason: collision with root package name */
    public List f40657d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f40658e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f40659f;

    /* renamed from: g, reason: collision with root package name */
    public ta f40660g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f40661h;

    public /* synthetic */ oa(int i13) {
        this();
    }

    private oa() {
        this.f40661h = new boolean[7];
    }

    private oa(@NonNull pa paVar) {
        String str;
        String str2;
        v7 v7Var;
        List list;
        Boolean bool;
        Boolean bool2;
        ta taVar;
        str = paVar.f40923a;
        this.f40654a = str;
        str2 = paVar.f40924b;
        this.f40655b = str2;
        v7Var = paVar.f40925c;
        this.f40656c = v7Var;
        list = paVar.f40926d;
        this.f40657d = list;
        bool = paVar.f40927e;
        this.f40658e = bool;
        bool2 = paVar.f40928f;
        this.f40659f = bool2;
        taVar = paVar.f40929g;
        this.f40660g = taVar;
        boolean[] zArr = paVar.f40930h;
        this.f40661h = Arrays.copyOf(zArr, zArr.length);
    }
}
