package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qh0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41298a;

    /* renamed from: b, reason: collision with root package name */
    public String f41299b;

    /* renamed from: c, reason: collision with root package name */
    public String f41300c;

    /* renamed from: d, reason: collision with root package name */
    public String f41301d;

    /* renamed from: e, reason: collision with root package name */
    public String f41302e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41303f;

    public /* synthetic */ qh0(int i13) {
        this();
    }

    private qh0() {
        this.f41303f = new boolean[5];
    }

    private qh0(@NonNull th0 th0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = th0Var.f42212a;
        this.f41298a = str;
        str2 = th0Var.f42213b;
        this.f41299b = str2;
        str3 = th0Var.f42214c;
        this.f41300c = str3;
        str4 = th0Var.f42215d;
        this.f41301d = str4;
        str5 = th0Var.f42216e;
        this.f41302e = str5;
        boolean[] zArr = th0Var.f42217f;
        this.f41303f = Arrays.copyOf(zArr, zArr.length);
    }
}
