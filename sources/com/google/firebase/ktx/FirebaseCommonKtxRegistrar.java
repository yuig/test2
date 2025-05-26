package com.google.firebase.ktx;

import androidx.annotation.Keep;
import ao2.f0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl.c;
import sl.a;
import sl.b;
import sl.k;
import sl.q;
import xk2.d;

@d
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lsl/b;", "getComponents", "()Ljava/util/List;", "<init>", "()V", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        a b13 = b.b(new q(rl.a.class, f0.class));
        b13.a(new k(new q(rl.a.class, Executor.class), 1, 0));
        b13.f113125f = hm.a.f69554b;
        b b14 = b13.b();
        Intrinsics.checkNotNullExpressionValue(b14, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a b15 = b.b(new q(c.class, f0.class));
        b15.a(new k(new q(c.class, Executor.class), 1, 0));
        b15.f113125f = hm.a.f69555c;
        b b16 = b15.b();
        Intrinsics.checkNotNullExpressionValue(b16, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a b17 = b.b(new q(rl.b.class, f0.class));
        b17.a(new k(new q(rl.b.class, Executor.class), 1, 0));
        b17.f113125f = hm.a.f69556d;
        b b18 = b17.b();
        Intrinsics.checkNotNullExpressionValue(b18, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a b19 = b.b(new q(rl.d.class, f0.class));
        b19.a(new k(new q(rl.d.class, Executor.class), 1, 0));
        b19.f113125f = hm.a.f69557e;
        b b23 = b19.b();
        Intrinsics.checkNotNullExpressionValue(b23, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return kotlin.collections.f0.j(b14, b16, b18, b23);
    }
}
