package f9;

import ha2.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl2.g0;

/* loaded from: classes3.dex */
public final class f implements ha2.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f61432a;

    public f(Function1 optionHandler, LinkedHashSet supportedOptions) {
        Intrinsics.checkNotNullParameter(optionHandler, "optionHandler");
        Intrinsics.checkNotNullParameter(supportedOptions, "supportedOptions");
        this.f61432a = e0.b(g0.r(supportedOptions, optionHandler, null, true, 4));
    }

    @Override // ha2.b
    public Integer a() {
        return null;
    }

    @Override // ha2.b
    public d0 b() {
        return null;
    }

    @Override // ha2.b
    public boolean c() {
        return true;
    }

    @Override // ha2.b
    public List d() {
        return this.f61432a;
    }

    public f(ArrayList arrayList) {
        this.f61432a = Collections.unmodifiableList(arrayList);
    }
}
