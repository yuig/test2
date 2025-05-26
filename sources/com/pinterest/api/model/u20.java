package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u20 {

    /* renamed from: a, reason: collision with root package name */
    public String f42393a;

    /* renamed from: b, reason: collision with root package name */
    public String f42394b;

    /* renamed from: c, reason: collision with root package name */
    public String f42395c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42396d;

    public /* synthetic */ u20(int i13) {
        this();
    }

    public final void a(String str) {
        this.f42394b = str;
        boolean[] zArr = this.f42396d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private u20() {
        this.f42396d = new boolean[3];
    }

    private u20(@NonNull x20 x20Var) {
        String str;
        String str2;
        String str3;
        str = x20Var.f43540a;
        this.f42393a = str;
        str2 = x20Var.f43541b;
        this.f42394b = str2;
        str3 = x20Var.f43542c;
        this.f42395c = str3;
        boolean[] zArr = x20Var.f43543d;
        this.f42396d = Arrays.copyOf(zArr, zArr.length);
    }
}
