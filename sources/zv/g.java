package zv;

import android.view.View;
import com.pinterest.api.model.f30;
import ew.m;
import kotlin.jvm.internal.Intrinsics;
import vq0.h;
import yk1.j;
import yk1.n;

/* loaded from: classes3.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142838a;

    /* renamed from: b, reason: collision with root package name */
    public final m f142839b;

    /* renamed from: c, reason: collision with root package name */
    public final lh0.h f142840c;

    /* renamed from: d, reason: collision with root package name */
    public final dw.b f142841d;

    /* renamed from: e, reason: collision with root package name */
    public final tb0.h f142842e;

    /* renamed from: f, reason: collision with root package name */
    public final es.a f142843f;

    public g(m adsGmaManager, lh0.h adsGmaExperiments, dw.b adsGmaAnalytics, tb0.h crashReporting, es.a adFormats, int i13) {
        this.f142838a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
            Intrinsics.checkNotNullParameter(adsGmaExperiments, "adsGmaExperiments");
            Intrinsics.checkNotNullParameter(adsGmaAnalytics, "adsGmaAnalytics");
            Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
            Intrinsics.checkNotNullParameter(adFormats, "adFormats");
            this.f142839b = adsGmaManager;
            this.f142840c = adsGmaExperiments;
            this.f142841d = adsGmaAnalytics;
            this.f142842e = crashReporting;
            this.f142843f = adFormats;
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
            Intrinsics.checkNotNullParameter(adsGmaExperiments, "adsGmaExperiments");
            Intrinsics.checkNotNullParameter(adsGmaAnalytics, "adsGmaAnalytics");
            Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
            Intrinsics.checkNotNullParameter(adFormats, "adFormats");
            this.f142839b = adsGmaManager;
            this.f142840c = adsGmaExperiments;
            this.f142841d = adsGmaAnalytics;
            this.f142842e = crashReporting;
            this.f142843f = adFormats;
            return;
        }
        if (i13 != 3) {
            Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
            Intrinsics.checkNotNullParameter(adsGmaExperiments, "adsGmaExperiments");
            Intrinsics.checkNotNullParameter(adsGmaAnalytics, "adsGmaAnalytics");
            Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
            Intrinsics.checkNotNullParameter(adFormats, "adFormats");
            this.f142839b = adsGmaManager;
            this.f142840c = adsGmaExperiments;
            this.f142841d = adsGmaAnalytics;
            this.f142842e = crashReporting;
            this.f142843f = adFormats;
            return;
        }
        Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
        Intrinsics.checkNotNullParameter(adsGmaExperiments, "adsGmaExperiments");
        Intrinsics.checkNotNullParameter(adsGmaAnalytics, "adsGmaAnalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f142839b = adsGmaManager;
        this.f142840c = adsGmaExperiments;
        this.f142841d = adsGmaAnalytics;
        this.f142842e = crashReporting;
        this.f142843f = adFormats;
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ void c(n nVar, Object obj, int i13) {
        switch (this.f142838a) {
            case 0:
                h((yv.g) nVar, (f30) obj, i13);
                break;
            case 1:
                h((yv.g) nVar, (f30) obj, i13);
                break;
            case 2:
                h((yv.g) nVar, (f30) obj, i13);
                break;
            default:
                h((yv.g) nVar, (f30) obj, i13);
                break;
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        switch (this.f142838a) {
            case 0:
                return new yv.f(this.f142839b, this.f142840c, this.f142841d, this.f142842e, this.f142843f);
            case 1:
                return new yv.f(this.f142839b, this.f142840c, this.f142841d, this.f142842e, this.f142843f);
            case 2:
                return new yv.f(this.f142839b, this.f142840c, this.f142841d, this.f142842e, this.f142843f);
            default:
                return new yv.f(this.f142839b, this.f142840c, this.f142841d, this.f142842e, this.f142843f);
        }
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ String g(int i13, Object obj) {
        switch (this.f142838a) {
            case 0:
                i((f30) obj);
                break;
            case 1:
                i((f30) obj);
                break;
            case 2:
                i((f30) obj);
                break;
            default:
                i((f30) obj);
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v19, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v4, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v9, types: [yk1.m] */
    public final void h(yv.g view, f30 pin, int i13) {
        switch (this.f142838a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "model");
                yv.g gVar = view instanceof View ? view : null;
                if (gVar != null) {
                    j.a().getClass();
                    ?? b13 = j.b(gVar);
                    r2 = b13 instanceof yv.f ? b13 : null;
                }
                if (r2 != null) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    r2.f140173f = pin;
                    r2.f140174g = i13;
                    view.e(r2);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "model");
                yv.g gVar2 = view instanceof View ? view : null;
                if (gVar2 != null) {
                    j.a().getClass();
                    ?? b14 = j.b(gVar2);
                    r2 = b14 instanceof yv.f ? b14 : null;
                }
                if (r2 != null) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    r2.f140173f = pin;
                    r2.f140174g = i13;
                    view.e(r2);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "model");
                yv.g gVar3 = view instanceof View ? view : null;
                if (gVar3 != null) {
                    j.a().getClass();
                    ?? b15 = j.b(gVar3);
                    r2 = b15 instanceof yv.f ? b15 : null;
                }
                if (r2 != null) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    r2.f140173f = pin;
                    r2.f140174g = i13;
                    view.e(r2);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "model");
                yv.g gVar4 = view instanceof View ? view : null;
                if (gVar4 != null) {
                    j.a().getClass();
                    ?? b16 = j.b(gVar4);
                    r2 = b16 instanceof yv.f ? b16 : null;
                }
                if (r2 != null) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    r2.f140173f = pin;
                    r2.f140174g = i13;
                    view.e(r2);
                    break;
                }
                break;
        }
    }

    public final String i(f30 model) {
        switch (this.f142838a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return null;
    }
}
