package com.pinterest.creatorHub.feature.creatorpathways;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44780i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f44781j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(0);
        this.f44780i = i13;
        this.f44781j = fVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m116invoke() {
        int i13 = this.f44780i;
        f fVar = this.f44781j;
        switch (i13) {
            case 0:
                j jVar = fVar.f44787l0;
                if (jVar != null) {
                    jVar.p3(a.GoToIdeaPinCreation);
                    return;
                } else {
                    Intrinsics.r("creatorPathwaysModalViewListener");
                    throw null;
                }
            case 1:
                j jVar2 = fVar.f44787l0;
                if (jVar2 != null) {
                    jVar2.p3(a.GoToPlaysHelpPage);
                    return;
                } else {
                    Intrinsics.r("creatorPathwaysModalViewListener");
                    throw null;
                }
            default:
                j jVar3 = fVar.f44787l0;
                if (jVar3 != null) {
                    jVar3.p3(a.Dismiss);
                    return;
                } else {
                    Intrinsics.r("creatorPathwaysModalViewListener");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f44780i;
        f fVar = this.f44781j;
        switch (i13) {
            case 0:
                m116invoke();
                return Unit.f80348a;
            case 1:
                m116invoke();
                return Unit.f80348a;
            case 2:
                m116invoke();
                return Unit.f80348a;
            case 3:
                return fVar.generateLoggingContext();
            default:
                return new ca2.e(false, null, 0, 0, null, 0, null, new bh.b(fVar.s7(), new d(fVar, 3)), false, false, 894);
        }
    }
}
