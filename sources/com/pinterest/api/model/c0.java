package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36256a;

    /* renamed from: b, reason: collision with root package name */
    public String f36257b;

    /* renamed from: c, reason: collision with root package name */
    public String f36258c;

    /* renamed from: d, reason: collision with root package name */
    public String f36259d;

    /* renamed from: e, reason: collision with root package name */
    public String f36260e;

    /* renamed from: f, reason: collision with root package name */
    public String f36261f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36262g;

    public /* synthetic */ c0(int i13) {
        this();
    }

    private c0() {
        this.f36262g = new boolean[6];
    }

    private c0(@NonNull d0 d0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        str = d0Var.f36589a;
        this.f36256a = str;
        str2 = d0Var.f36590b;
        this.f36257b = str2;
        str3 = d0Var.f36591c;
        this.f36258c = str3;
        str4 = d0Var.f36592d;
        this.f36259d = str4;
        str5 = d0Var.f36593e;
        this.f36260e = str5;
        str6 = d0Var.f36594f;
        this.f36261f = str6;
        boolean[] zArr = d0Var.f36595g;
        this.f36262g = Arrays.copyOf(zArr, zArr.length);
    }
}
