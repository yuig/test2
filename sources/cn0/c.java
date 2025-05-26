package cn0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements do2.j, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bn0.a f28048b;

    public /* synthetic */ c(bn0.a aVar, int i13) {
        this.f28047a = i13;
        this.f28048b = aVar;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        switch (this.f28047a) {
        }
        return new kotlin.jvm.internal.p(2, this.f28048b, bn0.a.class, "onEvent", "onEvent(Lcom/pinterest/feature/boardpreview/export/MediaCodecResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        bn0.a aVar = this.f28048b;
        int i13 = this.f28047a;
        switch (i13) {
            case 0:
                bn0.h hVar = (bn0.h) obj;
                switch (i13) {
                    case 0:
                        Object f13 = aVar.f(hVar, cVar);
                        if (f13 != cl2.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object f14 = aVar.f(hVar, cVar);
                        if (f14 != cl2.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
            default:
                bn0.h hVar2 = (bn0.h) obj;
                switch (i13) {
                    case 0:
                        Object f15 = aVar.f(hVar2, cVar);
                        if (f15 != cl2.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object f16 = aVar.f(hVar2, cVar);
                        if (f16 != cl2.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
        }
        return Unit.f80348a;
    }

    public final boolean equals(Object obj) {
        switch (this.f28047a) {
            case 0:
                if ((obj instanceof do2.j) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof do2.j) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
    }

    public final int hashCode() {
        switch (this.f28047a) {
        }
        return c().hashCode();
    }
}
