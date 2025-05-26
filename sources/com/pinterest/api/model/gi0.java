package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.hi0;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gi0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38071a;

    /* renamed from: b, reason: collision with root package name */
    public String f38072b;

    /* renamed from: c, reason: collision with root package name */
    public Map f38073c;

    /* renamed from: d, reason: collision with root package name */
    public Map f38074d;

    /* renamed from: e, reason: collision with root package name */
    public hi0.a f38075e;

    /* renamed from: f, reason: collision with root package name */
    public String f38076f;

    /* renamed from: g, reason: collision with root package name */
    public f30 f38077g;

    /* renamed from: h, reason: collision with root package name */
    public String f38078h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f38079i;

    public /* synthetic */ gi0(int i13) {
        this();
    }

    private gi0() {
        this.f38079i = new boolean[8];
    }

    private gi0(@NonNull hi0 hi0Var) {
        String str;
        String str2;
        Map map;
        Map map2;
        hi0.a aVar;
        String str3;
        f30 f30Var;
        String str4;
        str = hi0Var.f38448a;
        this.f38071a = str;
        str2 = hi0Var.f38449b;
        this.f38072b = str2;
        map = hi0Var.f38450c;
        this.f38073c = map;
        map2 = hi0Var.f38451d;
        this.f38074d = map2;
        aVar = hi0Var.f38452e;
        this.f38075e = aVar;
        str3 = hi0Var.f38453f;
        this.f38076f = str3;
        f30Var = hi0Var.f38454g;
        this.f38077g = f30Var;
        str4 = hi0Var.f38455h;
        this.f38078h = str4;
        boolean[] zArr = hi0Var.f38456i;
        this.f38079i = Arrays.copyOf(zArr, zArr.length);
    }
}
