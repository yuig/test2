package hn0;

import android.os.Bundle;
import do2.j;
import info.mqtt.android.service.MqttService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements j, m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69611b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f69610a = i13;
        this.f69611b = obj;
    }

    public final Object a(bn0.h hVar, bl2.c cVar) {
        int i13 = this.f69610a;
        Object obj = this.f69611b;
        switch (i13) {
            case 0:
                Object b13 = ((g) obj).b(hVar, cVar);
                if (b13 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object b14 = ((in0.g) obj).b(hVar, cVar);
                if (b14 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        int i13 = this.f69610a;
        Object obj = this.f69611b;
        switch (i13) {
            case 0:
                return new p(2, (g) obj, g.class, "onEvent", "onEvent(Lcom/pinterest/feature/boardpreview/export/MediaCodecResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 1:
                return new p(2, (in0.g) obj, in0.g.class, "onEvent", "onEvent(Lcom/pinterest/feature/boardpreview/export/MediaCodecResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            default:
                return new p(2, (Function1) obj, r.class, "suspendConversion0", "collect$suspendConversion0(Lkotlin/jvm/functions/Function1;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        switch (this.f69610a) {
            case 0:
                return a((bn0.h) obj, cVar);
            case 1:
                return a((bn0.h) obj, cVar);
            default:
                Function1 function1 = (Function1) this.f69611b;
                int i13 = MqttService.f72891j;
                function1.invoke((Bundle) obj);
                Unit unit = Unit.f80348a;
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                return unit;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f69610a) {
            case 0:
                if ((obj instanceof j) && (obj instanceof m)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof j) && (obj instanceof m)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof j) && (obj instanceof m)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(c(), ((m) obj).c());
    }

    public final int hashCode() {
        switch (this.f69610a) {
        }
        return c().hashCode();
    }
}
