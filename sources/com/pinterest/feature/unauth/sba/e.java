package com.pinterest.feature.unauth.sba;

import android.os.Bundle;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48803i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f48804j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f48803i = i13;
        this.f48804j = fVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f48803i;
        f fVar = this.f48804j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = fVar.f48805a.getString(vq1.d.preload_modal_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = fVar.f48805a.getString(vq1.d.preload_modal_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final void e(xl1.a it) {
        int i13 = this.f48803i;
        f fVar = this.f48804j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                a.c.y(fVar.f48810f);
                int i14 = vq1.b.fragment_wrapper;
                nl1.d dVar = (nl1.d) fVar.f48806b.e(UnauthPreloadExperienceLocation.UNAUTH_PRELOAD_EXPERIENCE_LANDING_SCREEN);
                dVar.setArguments(new Bundle());
                mo1.c.c(fVar.f48807c, i14, dVar, true, mo1.a.DEFAULT, 32);
                fVar.f48808d.k("unauth_preload_modal_confirmation", z0.d());
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                fVar.f48810f.d(new jc0.s());
                fVar.f48808d.k("unauth_preload_modal_cancel", z0.d());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f48803i) {
            case 0:
                e((xl1.a) obj);
                break;
            case 1:
                e((xl1.a) obj);
                break;
        }
        return b((rn1.a) obj);
    }
}
