package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aw0 {

    /* renamed from: a, reason: collision with root package name */
    public String f35878a;

    /* renamed from: b, reason: collision with root package name */
    public String f35879b;

    /* renamed from: c, reason: collision with root package name */
    public String f35880c;

    /* renamed from: d, reason: collision with root package name */
    public String f35881d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f35882e;

    public /* synthetic */ aw0(int i13) {
        this();
    }

    private aw0() {
        this.f35882e = new boolean[4];
    }

    private aw0(@NonNull dw0 dw0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = dw0Var.f36978a;
        this.f35878a = str;
        str2 = dw0Var.f36979b;
        this.f35879b = str2;
        str3 = dw0Var.f36980c;
        this.f35880c = str3;
        str4 = dw0Var.f36981d;
        this.f35881d = str4;
        boolean[] zArr = dw0Var.f36982e;
        this.f35882e = Arrays.copyOf(zArr, zArr.length);
    }
}
