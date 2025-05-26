package r1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i implements androidx.compose.foundation.lazy.layout.q {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f105911a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f105912b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f105913c;

    /* renamed from: d, reason: collision with root package name */
    public final kl2.m f105914d;

    public i(Function1 function1, Function2 function2, Function1 function12, q2.h hVar) {
        this.f105911a = function1;
        this.f105912b = function2;
        this.f105913c = function12;
        this.f105914d = hVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final Function1 getKey() {
        return this.f105911a;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final Function1 getType() {
        return this.f105913c;
    }
}
