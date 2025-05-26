package com.pinterest.api.model;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ef0 {

    /* renamed from: a */
    public final eg0 f37260a;

    /* renamed from: b */
    public final wf0 f37261b;

    /* renamed from: c */
    public final ag0 f37262c;

    public /* synthetic */ ef0(int i13) {
        this();
    }

    public final dl1.s a() {
        eg0 value0 = this.f37260a;
        if (value0 != null) {
            Intrinsics.checkNotNullParameter(value0, "value0");
            return value0;
        }
        wf0 value1 = this.f37261b;
        if (value1 != null) {
            Intrinsics.checkNotNullParameter(value1, "value1");
            return value1;
        }
        ag0 value2 = this.f37262c;
        if (value2 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(value2, "value2");
        return value2;
    }

    private ef0() {
    }

    public ef0(@NonNull eg0 eg0Var) {
        this.f37260a = eg0Var;
    }

    public ef0(@NonNull wf0 wf0Var) {
        this.f37261b = wf0Var;
    }

    public ef0(@NonNull ag0 ag0Var) {
        this.f37262c = ag0Var;
    }
}
