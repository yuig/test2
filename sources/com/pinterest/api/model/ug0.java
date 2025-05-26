package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ug0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42555a;

    /* renamed from: b, reason: collision with root package name */
    public String f42556b;

    /* renamed from: c, reason: collision with root package name */
    public String f42557c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42558d;

    public /* synthetic */ ug0(int i13) {
        this();
    }

    private ug0() {
        this.f42558d = new boolean[3];
    }

    private ug0(@NonNull xg0 xg0Var) {
        String str;
        String str2;
        String str3;
        str = xg0Var.f43682a;
        this.f42555a = str;
        str2 = xg0Var.f43683b;
        this.f42556b = str2;
        str3 = xg0Var.f43684c;
        this.f42557c = str3;
        boolean[] zArr = xg0Var.f43685d;
        this.f42558d = Arrays.copyOf(zArr, zArr.length);
    }
}
