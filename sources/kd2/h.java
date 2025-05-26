package kd2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f79271i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j13) {
        super(0);
        this.f79271i = j13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Released renderer handle: " + this.f79271i;
    }
}
