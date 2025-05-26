package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class du {

    /* renamed from: a, reason: collision with root package name */
    public String f36959a;

    /* renamed from: b, reason: collision with root package name */
    public String f36960b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f36961c;

    /* renamed from: d, reason: collision with root package name */
    public String f36962d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f36963e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f36964f;

    /* renamed from: g, reason: collision with root package name */
    public String f36965g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36966h;

    public /* synthetic */ du(int i13) {
        this();
    }

    private du() {
        this.f36966h = new boolean[7];
    }

    private du(@NonNull gu guVar) {
        String str;
        String str2;
        Integer num;
        String str3;
        Integer num2;
        Integer num3;
        String str4;
        str = guVar.f38143a;
        this.f36959a = str;
        str2 = guVar.f38144b;
        this.f36960b = str2;
        num = guVar.f38145c;
        this.f36961c = num;
        str3 = guVar.f38146d;
        this.f36962d = str3;
        num2 = guVar.f38147e;
        this.f36963e = num2;
        num3 = guVar.f38148f;
        this.f36964f = num3;
        str4 = guVar.f38149g;
        this.f36965g = str4;
        boolean[] zArr = guVar.f38150h;
        this.f36966h = Arrays.copyOf(zArr, zArr.length);
    }
}
