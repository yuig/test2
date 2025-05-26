package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f40270a;

    /* renamed from: b, reason: collision with root package name */
    public String f40271b;

    /* renamed from: c, reason: collision with root package name */
    public k.a f40272c;

    /* renamed from: d, reason: collision with root package name */
    public k.b f40273d;

    /* renamed from: e, reason: collision with root package name */
    public k.c f40274e;

    /* renamed from: f, reason: collision with root package name */
    public k.d f40275f;

    /* renamed from: g, reason: collision with root package name */
    public String f40276g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f40277h;

    public /* synthetic */ n(int i13) {
        this();
    }

    public final void a(String str) {
        this.f40271b = str;
        boolean[] zArr = this.f40277h;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void b(String str) {
        this.f40270a = str;
        boolean[] zArr = this.f40277h;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private n() {
        this.f40277h = new boolean[7];
    }

    private n(@NonNull k kVar) {
        String str;
        String str2;
        k.a aVar;
        k.b bVar;
        k.c cVar;
        k.d dVar;
        String str3;
        str = kVar.f39190a;
        this.f40270a = str;
        str2 = kVar.f39191b;
        this.f40271b = str2;
        aVar = kVar.f39192c;
        this.f40272c = aVar;
        bVar = kVar.f39193d;
        this.f40273d = bVar;
        cVar = kVar.f39194e;
        this.f40274e = cVar;
        dVar = kVar.f39195f;
        this.f40275f = dVar;
        str3 = kVar.f39196g;
        this.f40276g = str3;
        boolean[] zArr = kVar.f39197h;
        this.f40277h = Arrays.copyOf(zArr, zArr.length);
    }
}
