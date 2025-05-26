package com.pinterest.pushnotification;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl2.g0;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f50249j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f50250k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f50251l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f50252m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50253i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f50253i = i13;
    }

    public final void b(Throwable error) {
        switch (this.f50253i) {
            case 0:
                Intrinsics.checkNotNullParameter(error, "error");
                if (!g0.X(error)) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.A("PushTokenResponseHandler", error);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(error, "it");
                if (!g0.X(error)) {
                    HashSet hashSet2 = tb0.h.f117076w;
                    tb0.g.f117075a.A("PushTokenResponseHandler", error);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f50253i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
