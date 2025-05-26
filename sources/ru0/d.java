package ru0;

import com.pinterest.api.model.tq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f109978i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f109979j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j13, long j14) {
        super(1);
        this.f109978i = j13;
        this.f109979j = j14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tq durationConfig = (tq) obj;
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        return tq.b(durationConfig, this.f109978i, this.f109979j, null, null, 12);
    }
}
