package com.pinterest.api.model;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class il0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f38812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il0(List<String> list) {
        super(null);
        this.f38812b = list;
    }

    @Override // com.pinterest.api.model.vg
    public final Object h(mp0 value9) {
        Intrinsics.checkNotNullParameter(value9, "value9");
        Iterator it = this.f38812b.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), value9.l()) && kh2.k3.p1(value9)) {
                return value9;
            }
        }
        return null;
    }
}
