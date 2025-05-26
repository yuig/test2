package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.d20;
import dl1.s;
import j10.h;
import java.util.ArrayList;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v10.d;
import vd0.c;
import yn2.c0;
import yn2.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/api/model/deserializer/PayoutsDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/d20;", "Lke0/b;", "Lv10/d;", "modelSync", "<init>", "(Lv10/d;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PayoutsDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final d f36809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayoutsDeserializer(@NotNull d modelSync) {
        super("payee");
        Intrinsics.checkNotNullParameter(modelSync, "modelSync");
        this.f36809b = modelSync;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList u13 = c0.u(q.b(new h(arr, this, null)));
        if (z13) {
            this.f36809b.a(u13);
        }
        return u13;
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return a(arr, true);
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, d20.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Payee");
        d20 d20Var = (d20) e13;
        this.f36809b.a(e0.b(d20Var));
        return d20Var;
    }
}
