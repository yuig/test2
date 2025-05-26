package jv;

import com.pinterest.api.model.f30;
import es.c;
import j80.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f77619a;

    /* renamed from: b, reason: collision with root package name */
    public final j80.a f77620b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f77621c;

    public a(j experiments, b carouselIndexLookup, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(carouselIndexLookup, "carouselIndexLookup");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f77619a = experiments;
        this.f77620b = carouselIndexLookup;
        this.f77621c = adFormats;
    }

    public final boolean a(f30 pin, boolean z13, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        c cVar = (c) this.f77621c;
        if (pin == null) {
            cVar.getClass();
        } else if (cVar.W(pin) && cVar.B(((b) this.f77620b).a(pin), pin)) {
            activateExperiment.invoke();
            if (z13) {
                return true;
            }
        }
        return false;
    }
}
