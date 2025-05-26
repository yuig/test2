package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class gv0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38158a;

    /* renamed from: b, reason: collision with root package name */
    public String f38159b;

    /* renamed from: c, reason: collision with root package name */
    public String f38160c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38161d;

    public /* synthetic */ gv0(int i13) {
        this();
    }

    public /* synthetic */ gv0(jv0 jv0Var, int i13) {
        this(jv0Var);
    }

    private gv0() {
        this.f38161d = new boolean[3];
    }

    private gv0(@NonNull jv0 jv0Var) {
        String str;
        String str2;
        String str3;
        str = jv0Var.f39156a;
        this.f38158a = str;
        str2 = jv0Var.f39157b;
        this.f38159b = str2;
        str3 = jv0Var.f39158c;
        this.f38160c = str3;
        boolean[] zArr = jv0Var.f39159d;
        this.f38161d = Arrays.copyOf(zArr, zArr.length);
    }
}
