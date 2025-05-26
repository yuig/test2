package hu1;

import ao2.j0;
import dl1.t;
import iu1.q;
import iu1.s;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes4.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70425a;

    /* renamed from: b, reason: collision with root package name */
    public final t f70426b;

    public j(t userRepository, int i13) {
        this.f70425a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            this.f70426b = userRepository;
        } else {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            this.f70426b = userRepository;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        switch (this.f70425a) {
            case 0:
                k request = (k) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request instanceof k) {
                    kotlin.jvm.internal.j.z(scope, null, null, new i(this, request, eventIntake, null), 3);
                    break;
                }
                break;
            default:
                s request2 = (s) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof q) {
                    kotlin.jvm.internal.j.z(scope, null, null, new ju1.b(this, request2, eventIntake, null), 3);
                    break;
                }
                break;
        }
    }
}
