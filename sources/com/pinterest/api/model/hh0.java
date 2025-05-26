package com.pinterest.api.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hh0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f38440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38441b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f38442c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38443d;

    static {
        new gh0(null);
    }

    public hh0(int i13, String str, @NotNull Function0<Unit> onActionListener) {
        Intrinsics.checkNotNullParameter(onActionListener, "onActionListener");
        this.f38440a = i13;
        this.f38441b = str;
        this.f38442c = onActionListener;
        this.f38443d = String.valueOf(hashCode());
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return this.f38443d;
    }

    public /* synthetic */ hh0(int i13, String str, Function0 function0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? fh0.f37672i : function0);
    }
}
