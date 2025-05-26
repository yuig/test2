package ph1;

import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import rg0.s;
import x02.i2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s f100158a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f100159b;

    /* renamed from: c, reason: collision with root package name */
    public final r f100160c;

    public a(s experiences, i2 pinRepository, r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f100158a = experiences;
        this.f100159b = pinRepository;
        this.f100160c = prefsManagerUser;
    }
}
