package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class j10 {

    /* renamed from: a, reason: collision with root package name */
    public String f38922a;

    /* renamed from: b, reason: collision with root package name */
    public String f38923b;

    /* renamed from: c, reason: collision with root package name */
    public List f38924c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38925d;

    public /* synthetic */ j10(int i13) {
        this();
    }

    private j10() {
        this.f38925d = new boolean[3];
    }

    private j10(@NonNull m10 m10Var) {
        String str;
        String str2;
        List list;
        str = m10Var.f39964a;
        this.f38922a = str;
        str2 = m10Var.f39965b;
        this.f38923b = str2;
        list = m10Var.f39966c;
        this.f38924c = list;
        boolean[] zArr = m10Var.f39967d;
        this.f38925d = Arrays.copyOf(zArr, zArr.length);
    }
}
