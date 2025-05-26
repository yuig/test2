package qo2;

import kh2.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104606c;

    /* renamed from: d, reason: collision with root package name */
    public final oo2.h f104607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(no2.b keySerializer, no2.b valueSerializer, int i13) {
        super(keySerializer, valueSerializer);
        this.f104606c = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
            this.f104607d = n3.o("kotlin.collections.Map.Entry", oo2.o.f96905c, new oo2.g[0], new o0(keySerializer, valueSerializer, 0));
            return;
        }
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        super(keySerializer, valueSerializer);
        this.f104607d = n3.n("kotlin.Pair", new oo2.g[0], new o0(keySerializer, valueSerializer, 1));
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104607d;
    }
}
