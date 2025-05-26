package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    public String f37272a;

    /* renamed from: b, reason: collision with root package name */
    public String f37273b;

    /* renamed from: c, reason: collision with root package name */
    public wy0 f37274c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f37275d;

    public /* synthetic */ eh(int i13) {
        this();
    }

    public final hh a() {
        return new hh(this.f37272a, this.f37273b, this.f37274c, this.f37275d, 0);
    }

    public final void b(String str) {
        this.f37273b = str;
        boolean[] zArr = this.f37275d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(wy0 wy0Var) {
        this.f37274c = wy0Var;
        boolean[] zArr = this.f37275d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void d(String str) {
        this.f37272a = str;
        boolean[] zArr = this.f37275d;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public /* synthetic */ eh(hh hhVar, int i13) {
        this(hhVar);
    }

    private eh() {
        this.f37275d = new boolean[3];
    }

    private eh(@NonNull hh hhVar) {
        String str;
        String str2;
        wy0 wy0Var;
        str = hhVar.f38436a;
        this.f37272a = str;
        str2 = hhVar.f38437b;
        this.f37273b = str2;
        wy0Var = hhVar.f38438c;
        this.f37274c = wy0Var;
        boolean[] zArr = hhVar.f38439d;
        this.f37275d = Arrays.copyOf(zArr, zArr.length);
    }
}
