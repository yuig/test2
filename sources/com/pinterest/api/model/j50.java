package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class j50 {

    /* renamed from: a, reason: collision with root package name */
    public String f38982a;

    /* renamed from: b, reason: collision with root package name */
    public String f38983b;

    /* renamed from: c, reason: collision with root package name */
    public List f38984c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38985d;

    public /* synthetic */ j50(int i13) {
        this();
    }

    private j50() {
        this.f38985d = new boolean[3];
    }

    private j50(@NonNull m50 m50Var) {
        String str;
        String str2;
        List list;
        str = m50Var.f40005a;
        this.f38982a = str;
        str2 = m50Var.f40006b;
        this.f38983b = str2;
        list = m50Var.f40007c;
        this.f38984c = list;
        boolean[] zArr = m50Var.f40008d;
        this.f38985d = Arrays.copyOf(zArr, zArr.length);
    }
}
