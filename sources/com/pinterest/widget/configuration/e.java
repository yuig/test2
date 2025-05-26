package com.pinterest.widget.configuration;

import ao2.j0;
import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52835a;

    /* renamed from: b, reason: collision with root package name */
    public final h f52836b;

    public e(h widgetConfigurationDataSource, int i13) {
        this.f52835a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(widgetConfigurationDataSource, "widgetConfigurationDataSource");
            this.f52836b = widgetConfigurationDataSource;
        } else {
            Intrinsics.checkNotNullParameter(widgetConfigurationDataSource, "widgetConfigurationDataSource");
            this.f52836b = widgetConfigurationDataSource;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        switch (this.f52835a) {
            case 0:
                o request = (o) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                kotlin.jvm.internal.j.z(scope, null, null, new d(this, request, null), 3);
                break;
            default:
                ad2.m request2 = (ad2.m) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                int i13 = request2.f2107a;
                h hVar2 = this.f52836b;
                hVar2.getClass();
                String boardId = request2.f2108b;
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                String boardName = request2.f2109c;
                Intrinsics.checkNotNullParameter(boardName, "boardName");
                hVar2.f52837a.b(boardName);
                ((lb0.b) lb0.n.f82725d.a()).n(j1.U("widget_board_id_%d", new Object[]{Integer.valueOf(i13)}), boardId);
                break;
        }
    }
}
