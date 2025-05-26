package com.pinterest.api.model;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fl0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f37721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl0(List<mp0> list, Unit unit) {
        super(unit);
        this.f37721b = list;
    }

    @Override // com.pinterest.api.model.vg
    public final Object h(mp0 value9) {
        Intrinsics.checkNotNullParameter(value9, "value9");
        if (!value9.k().booleanValue()) {
            this.f37721b.add(value9);
        }
        return Unit.f80348a;
    }
}
