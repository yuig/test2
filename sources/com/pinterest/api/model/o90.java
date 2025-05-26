package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o90 {

    /* renamed from: a, reason: collision with root package name */
    public String f40651a;

    /* renamed from: b, reason: collision with root package name */
    public String f40652b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40653c;

    public /* synthetic */ o90(int i13) {
        this();
    }

    private o90() {
        this.f40653c = new boolean[2];
    }

    private o90(@NonNull r90 r90Var) {
        String str;
        String str2;
        str = r90Var.f41521a;
        this.f40651a = str;
        str2 = r90Var.f41522b;
        this.f40652b = str2;
        boolean[] zArr = r90Var.f41523c;
        this.f40653c = Arrays.copyOf(zArr, zArr.length);
    }
}
