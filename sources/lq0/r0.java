package lq0;

import kotlin.jvm.internal.Intrinsics;
import ni1.t2;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final qa2.j0 f84412a;

    /* renamed from: b, reason: collision with root package name */
    public final ni1.d0 f84413b;

    /* renamed from: c, reason: collision with root package name */
    public final t2 f84414c;

    public r0(qa2.d pinGridCellFactory, ni1.d0 vmStateConverterFactory, t2 pinRepViewModelFactory) {
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        this.f84412a = pinGridCellFactory;
        this.f84413b = vmStateConverterFactory;
        this.f84414c = pinRepViewModelFactory;
    }
}
