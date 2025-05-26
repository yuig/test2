package x80;

import kotlin.jvm.internal.Intrinsics;
import nm.o;
import rg0.s;
import tb0.h;
import x02.i2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f134161a;

    /* renamed from: b, reason: collision with root package name */
    public final o f134162b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f134163c;

    /* renamed from: d, reason: collision with root package name */
    public final h f134164d;

    public c(s experiences, o gson, i2 pinRepository, h crashReporting) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f134161a = experiences;
        this.f134162b = gson;
        this.f134163c = pinRepository;
        this.f134164d = crashReporting;
    }
}
