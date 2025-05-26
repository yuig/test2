package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    public String f37794a;

    /* renamed from: b, reason: collision with root package name */
    public String f37795b;

    /* renamed from: c, reason: collision with root package name */
    public List f37796c;

    /* renamed from: d, reason: collision with root package name */
    public String f37797d;

    /* renamed from: e, reason: collision with root package name */
    public String f37798e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f37799f;

    public /* synthetic */ ft(int i13) {
        this();
    }

    private ft() {
        this.f37799f = new boolean[5];
    }

    private ft(@NonNull jt jtVar) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        str = jtVar.f39141a;
        this.f37794a = str;
        str2 = jtVar.f39142b;
        this.f37795b = str2;
        list = jtVar.f39143c;
        this.f37796c = list;
        str3 = jtVar.f39144d;
        this.f37797d = str3;
        str4 = jtVar.f39145e;
        this.f37798e = str4;
        boolean[] zArr = jtVar.f39146f;
        this.f37799f = Arrays.copyOf(zArr, zArr.length);
    }
}
