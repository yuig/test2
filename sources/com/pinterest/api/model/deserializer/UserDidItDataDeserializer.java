package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.az0;
import dl1.s;
import j10.m;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;
import yn2.c0;
import yn2.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/api/model/deserializer/UserDidItDataDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/az0;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserDidItDataDeserializer extends a implements b {
    public UserDidItDataDeserializer() {
        super("userdiditdata");
    }

    public static az0 e(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("user_did_it_data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, az0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.UserDidItData");
        return (az0) e13;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c0.u(q.b(new m(arr, this, null)));
    }

    @Override // ke0.a
    public final /* bridge */ /* synthetic */ s d(c cVar) {
        return e(cVar);
    }
}
