package com.pinterest.feature.pin.closeup.datasource;

import i2.o;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.c1;

/* loaded from: classes5.dex */
public final class g extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f46939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i13) {
        super(2);
        this.f46938i = i13;
        this.f46939j = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = this.f46939j;
        int i13 = this.f46938i;
        switch (i13) {
            case 0:
                dl1.s model = (dl1.s) obj;
                ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 1:
                dl1.s model2 = (dl1.s) obj;
                ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
            case 2:
                o oVar = (o) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                dl2.b.h(this.f46939j, null, null, null, oVar, 0, 14);
            default:
                String collageId = (String) obj;
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                t.L0(c1.a(), collageId, null, d32.c.COLLAGES_TAB, this.f46939j, 4);
                break;
        }
        return Unit.f80348a;
    }
}
