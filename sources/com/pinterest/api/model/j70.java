package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class j70 {

    /* renamed from: a, reason: collision with root package name */
    public String f38993a;

    /* renamed from: b, reason: collision with root package name */
    public String f38994b;

    /* renamed from: c, reason: collision with root package name */
    public List f38995c;

    /* renamed from: d, reason: collision with root package name */
    public String f38996d;

    /* renamed from: e, reason: collision with root package name */
    public String f38997e;

    /* renamed from: f, reason: collision with root package name */
    public List f38998f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38999g;

    public /* synthetic */ j70(int i13) {
        this();
    }

    private j70() {
        this.f38999g = new boolean[6];
    }

    private j70(@NonNull m70 m70Var) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        List list2;
        str = m70Var.f40014a;
        this.f38993a = str;
        str2 = m70Var.f40015b;
        this.f38994b = str2;
        list = m70Var.f40016c;
        this.f38995c = list;
        str3 = m70Var.f40017d;
        this.f38996d = str3;
        str4 = m70Var.f40018e;
        this.f38997e = str4;
        list2 = m70Var.f40019f;
        this.f38998f = list2;
        boolean[] zArr = m70Var.f40020g;
        this.f38999g = Arrays.copyOf(zArr, zArr.length);
    }
}
