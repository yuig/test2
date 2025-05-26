package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class yz0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44159a;

    /* renamed from: b, reason: collision with root package name */
    public String f44160b;

    /* renamed from: c, reason: collision with root package name */
    public String f44161c;

    /* renamed from: d, reason: collision with root package name */
    public Map f44162d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44163e;

    public /* synthetic */ yz0(int i13) {
        this();
    }

    public final void a(String str) {
        this.f44161c = str;
        boolean[] zArr = this.f44163e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    private yz0() {
        this.f44163e = new boolean[4];
    }

    private yz0(@NonNull b01 b01Var) {
        String str;
        String str2;
        String str3;
        Map map;
        str = b01Var.f35931a;
        this.f44159a = str;
        str2 = b01Var.f35932b;
        this.f44160b = str2;
        str3 = b01Var.f35933c;
        this.f44161c = str3;
        map = b01Var.f35934d;
        this.f44162d = map;
        boolean[] zArr = b01Var.f35935e;
        this.f44163e = Arrays.copyOf(zArr, zArr.length);
    }
}
