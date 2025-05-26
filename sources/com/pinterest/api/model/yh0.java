package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.zh0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yh0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44051a;

    /* renamed from: b, reason: collision with root package name */
    public String f44052b;

    /* renamed from: c, reason: collision with root package name */
    public zh0.a f44053c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f44054d;

    public /* synthetic */ yh0(int i13) {
        this();
    }

    private yh0() {
        this.f44054d = new boolean[3];
    }

    private yh0(@NonNull zh0 zh0Var) {
        String str;
        String str2;
        zh0.a aVar;
        str = zh0Var.f44329a;
        this.f44051a = str;
        str2 = zh0Var.f44330b;
        this.f44052b = str2;
        aVar = zh0Var.f44331c;
        this.f44053c = aVar;
        boolean[] zArr = zh0Var.f44332d;
        this.f44054d = Arrays.copyOf(zArr, zArr.length);
    }
}
