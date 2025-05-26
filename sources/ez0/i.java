package ez0;

import kotlin.jvm.internal.Intrinsics;
import ni1.d0;
import ni1.t2;
import qa2.j0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f60687a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f60688b;

    /* renamed from: c, reason: collision with root package name */
    public final t2 f60689c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f60690d;

    public i(qa2.d pinGridCellFactory, d0 vmStateConverterFactory, t2 pinRepViewModelFactory, es.a adFormats) {
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f60687a = pinGridCellFactory;
        this.f60688b = vmStateConverterFactory;
        this.f60689c = pinRepViewModelFactory;
        this.f60690d = adFormats;
    }
}
