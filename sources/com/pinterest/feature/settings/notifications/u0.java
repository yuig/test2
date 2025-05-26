package com.pinterest.feature.settings.notifications;

import com.pinterest.api.model.mz;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class u0 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f48272b;

    public /* synthetic */ u0(z0 z0Var, int i13) {
        this.f48271a = i13;
        this.f48272b = z0Var;
    }

    public final Unit a(String str) {
        int i13 = this.f48271a;
        z0 z0Var = this.f48272b;
        switch (i13) {
            case 0:
                z0Var.f48291d.e().a(new l(str));
                break;
            default:
                z0Var.f48291d.e().a(new n(new o82.f0(0, new o82.b1(str, false)), kotlin.collections.y0.b(new Pair("expandableSectionId", str))));
                z0Var.f48291d.e().a(new n(o82.d0.f93560a, kotlin.collections.y0.b(new Pair("expandableSectionId", str))));
                break;
        }
        return Unit.f80348a;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        switch (this.f48271a) {
            case 0:
                return a((String) obj);
            case 1:
                Pair pair = (Pair) obj;
                this.f48272b.f48291d.e().a(new m((String) pair.f80346a, (mz) pair.f80347b));
                return Unit.f80348a;
            default:
                return a((String) obj);
        }
    }
}
