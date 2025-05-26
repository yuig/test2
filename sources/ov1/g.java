package ov1;

import de1.h0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements de1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f97728a;

    public g(k kVar) {
        this.f97728a = kVar;
    }

    @Override // de1.c0
    public final void w0(q42.f searchOneBarModuleType, h0 unifiedInlineFilterDataModel) {
        Intrinsics.checkNotNullParameter(searchOneBarModuleType, "searchOneBarModuleType");
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        this.f97728a.w0(searchOneBarModuleType, unifiedInlineFilterDataModel);
    }

    @Override // de1.c0
    public final void w1(String productFilterType, boolean z13, h0 unifiedInlineFilterDataModel) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        k kVar = this.f97728a;
        kVar.w1(productFilterType, z13, unifiedInlineFilterDataModel);
        if (z13) {
            t32.d dVar = t32.f.Companion;
            int parseInt = Integer.parseInt(productFilterType);
            dVar.getClass();
            t32.f a13 = t32.d.a(parseInt);
            if (unifiedInlineFilterDataModel.f54579h) {
                kVar.f97747o.G3(a13);
            } else {
                kVar.f97747o.Q3(a13, unifiedInlineFilterDataModel.f54578g);
            }
        }
    }
}
