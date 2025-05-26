package com.pinterest.framework.multisection.datasource.pagedlist;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, int i13) {
        super(1, wVar, w.class, "shouldAddBottomSpacing", "shouldAddBottomSpacing(I)Z", 0);
        this.f49095a = i13;
        if (i13 == 1) {
            super(1, wVar, w.class, "shouldAddLeftSpacing", "shouldAddLeftSpacing(I)Z", 0);
            return;
        }
        if (i13 == 2) {
            super(1, wVar, w.class, "shouldAddRightSpacing", "shouldAddRightSpacing(I)Z", 0);
        } else if (i13 != 3) {
        } else {
            super(1, wVar, w.class, "shouldAddTopSpacing", "shouldAddTopSpacing(I)Z", 0);
        }
    }

    public final Boolean h(int i13) {
        switch (this.f49095a) {
            case 0:
                return Boolean.valueOf(((w) this.receiver).e(i13));
            case 1:
                return Boolean.valueOf(((w) this.receiver).k2(i13));
            case 2:
                return Boolean.valueOf(((w) this.receiver).f3(i13));
            default:
                return Boolean.valueOf(((w) this.receiver).h(i13));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f49095a) {
        }
        return h(((Number) obj).intValue());
    }
}
