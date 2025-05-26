package ac2;

import android.net.Uri;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.r f1953a;

    public f1(lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f1953a = prefsManagerUser;
    }

    public static boolean a(bc2.q qVar, bc2.m surface, boolean z13) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return qVar != null && b(qVar, surface) && c(qVar.f22673b.f22665b, z13);
    }

    public static boolean b(bc2.q qVar, bc2.m mVar) {
        return mVar.isCloseup() && !qVar.f22679h.isPromoted() && qVar.b();
    }

    public static boolean c(String str, boolean z13) {
        return z13 ? !r1.a() : (d7.b.f0(str) && r1.a()) ? false : true;
    }

    public static a7.g1 e(a7.g1 trackSelectorParams, bc2.q qVar, bc2.m surface) {
        Intrinsics.checkNotNullParameter(trackSelectorParams, "trackSelectorParams");
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!a(qVar, surface, false)) {
            return trackSelectorParams;
        }
        a7.g1 a13 = trackSelectorParams.a().c(3, true).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static a7.g1 f(a7.g1 trackSelectorParams, bc2.q qVar, bc2.m surface) {
        Intrinsics.checkNotNullParameter(trackSelectorParams, "trackSelectorParams");
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!a(qVar, surface, false)) {
            return trackSelectorParams;
        }
        a7.g1 a13 = trackSelectorParams.a().c(3, false).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final a7.v d(a7.v mediaItemBuilder, bc2.q qVar, bc2.m surface) {
        String str;
        Intrinsics.checkNotNullParameter(mediaItemBuilder, "mediaItemBuilder");
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!a(qVar, surface, false)) {
            return mediaItemBuilder;
        }
        if ((this.f1953a.f("PREF_ENABLE_CLOSED_CAPTIONS", false) || !a(qVar, surface, true)) && qVar != null && (str = (String) CollectionsKt.T(qVar.f22676e.values())) != null) {
            Uri parse = Uri.parse(str);
            a7.g0 g0Var = new a7.g0();
            g0Var.f1022c = parse;
            g0Var.c();
            g0Var.f1020a = 1;
            a7.h0 b13 = g0Var.b();
            Intrinsics.checkNotNullExpressionValue(b13, "build(...)");
            mediaItemBuilder.c(kotlin.collections.e0.b(b13));
            Intrinsics.checkNotNullExpressionValue(mediaItemBuilder, "setSubtitleConfigurations(...)");
        }
        return mediaItemBuilder;
    }
}
