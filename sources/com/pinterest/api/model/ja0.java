package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ja0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39018a;

    /* renamed from: b, reason: collision with root package name */
    public String f39019b;

    /* renamed from: c, reason: collision with root package name */
    public String f39020c;

    /* renamed from: d, reason: collision with root package name */
    public List f39021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39022e;

    public /* synthetic */ ja0(int i13) {
        this();
    }

    private ja0() {
        this.f39022e = new boolean[4];
    }

    private ja0(@NonNull ma0 ma0Var) {
        String str;
        String str2;
        String str3;
        List list;
        str = ma0Var.f40043a;
        this.f39018a = str;
        str2 = ma0Var.f40044b;
        this.f39019b = str2;
        str3 = ma0Var.f40045c;
        this.f39020c = str3;
        list = ma0Var.f40046d;
        this.f39021d = list;
        boolean[] zArr = ma0Var.f40047e;
        this.f39022e = Arrays.copyOf(zArr, zArr.length);
    }
}
