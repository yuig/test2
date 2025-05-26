package ru0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import su0.t;
import su0.u;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109975i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f109976j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, int i13) {
        super(0);
        this.f109975i = i13;
        this.f109976j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f109975i;
        f fVar = this.f109976j;
        switch (i13) {
            case 0:
                return new t(pu0.h.f101389a, new a(fVar, 0));
            default:
                return new u(pu0.h.f101390b, new a(fVar, 1));
        }
    }
}
