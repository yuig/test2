package com.bugsnag.android;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final p0 f29402j = new p0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p0 f29403k = new p0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p0 f29404l = new p0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f29405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i13) {
        super(0);
        this.f29405i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f29405i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
            case 1:
                switch (i13) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
            default:
                return Unit.f80348a;
        }
    }
}
