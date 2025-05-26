package y42;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f137710a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f137711b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f137712c;

    public /* synthetic */ d(f30 f30Var, boolean z13, int i13) {
        this(f30Var, true, (i13 & 4) != 0 ? false : z13);
    }

    public d(f30 pin, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f137710a = pin;
        this.f137711b = z13;
        this.f137712c = z14;
    }
}
