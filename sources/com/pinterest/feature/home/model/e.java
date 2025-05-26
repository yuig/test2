package com.pinterest.feature.home.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45783i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f45784j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f45785k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, g gVar, int i13) {
        super(1);
        this.f45783i = i13;
        this.f45784j = fVar;
        this.f45785k = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar = this.f45784j;
        g gVar = this.f45785k;
        int i13 = this.f45783i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        fVar.L("fetch()", "doOnNext", gVar);
                        break;
                    default:
                        fVar.L("getFromLocalDataSource()", "doOnNext", gVar);
                        break;
                }
                break;
            case 1:
                switch (i13) {
                    case 1:
                        fVar.L("fetch()", "doOnError", gVar);
                        break;
                    default:
                        fVar.L("getFromLocalDataSource()", "doOnError", gVar);
                        break;
                }
                break;
            case 2:
                switch (i13) {
                    case 0:
                        fVar.L("fetch()", "doOnNext", gVar);
                        break;
                    default:
                        fVar.L("getFromLocalDataSource()", "doOnNext", gVar);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 1:
                        fVar.L("fetch()", "doOnError", gVar);
                        break;
                    default:
                        fVar.L("getFromLocalDataSource()", "doOnError", gVar);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
