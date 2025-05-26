package com.pinterest.api.model;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bm {

    /* renamed from: a */
    public final gm f36127a;

    /* renamed from: b */
    public final fm f36128b;

    /* renamed from: c */
    public final jm f36129c;

    /* renamed from: d */
    public final pm f36130d;

    /* renamed from: e */
    public final mm f36131e;

    public /* synthetic */ bm(int i13) {
        this();
    }

    public final gp0.a a(g4.u uVar) {
        gm value0 = this.f36127a;
        if (value0 != null) {
            uVar.getClass();
            Intrinsics.checkNotNullParameter(value0, "value0");
            return value0;
        }
        fm value1 = this.f36128b;
        if (value1 != null) {
            uVar.getClass();
            Intrinsics.checkNotNullParameter(value1, "value1");
            return value1;
        }
        jm value2 = this.f36129c;
        if (value2 != null) {
            uVar.getClass();
            Intrinsics.checkNotNullParameter(value2, "value2");
            return value2;
        }
        pm value3 = this.f36130d;
        if (value3 != null) {
            uVar.getClass();
            Intrinsics.checkNotNullParameter(value3, "value3");
            return value3;
        }
        mm value4 = this.f36131e;
        if (value4 == null) {
            return null;
        }
        uVar.getClass();
        Intrinsics.checkNotNullParameter(value4, "value4");
        return value4;
    }

    private bm() {
    }

    public bm(@NonNull gm gmVar) {
        this.f36127a = gmVar;
    }

    public bm(@NonNull fm fmVar) {
        this.f36128b = fmVar;
    }

    public bm(@NonNull jm jmVar) {
        this.f36129c = jmVar;
    }

    public bm(@NonNull pm pmVar) {
        this.f36130d = pmVar;
    }

    public bm(@NonNull mm mmVar) {
        this.f36131e = mmVar;
    }
}
